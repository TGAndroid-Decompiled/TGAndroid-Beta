package org.telegram.ui.Components.Premium.boosts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.tl.TL_stories$TL_myBoost;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.tgnet.tl.TL_stories$TL_premium_myBoosts;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
public class ReassignBoostBottomSheet extends BottomSheetWithRecyclerListView {
    private final ButtonWithCounterView actionButton;
    private final List<TL_stories$TL_myBoost> allUsedBoosts;
    private final SelectorBtnCell buttonContainer;
    private final TLRPC$Chat currentChat;
    private final List<TL_stories$TL_myBoost> selectedBoosts;
    private CountDownTimer timer;
    private TopCell topCell;

    public static ReassignBoostBottomSheet show(BaseFragment baseFragment, TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts, TLRPC$Chat tLRPC$Chat) {
        ReassignBoostBottomSheet reassignBoostBottomSheet = new ReassignBoostBottomSheet(baseFragment, tL_stories$TL_premium_myBoosts, tLRPC$Chat);
        reassignBoostBottomSheet.show();
        return reassignBoostBottomSheet;
    }

    public ReassignBoostBottomSheet(BaseFragment baseFragment, TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts, final TLRPC$Chat tLRPC$Chat) {
        super(baseFragment, false, false);
        this.selectedBoosts = new ArrayList();
        this.allUsedBoosts = new ArrayList();
        this.topPadding = 0.3f;
        this.currentChat = tLRPC$Chat;
        Iterator<TL_stories$TL_myBoost> it = tL_stories$TL_premium_myBoosts.my_boosts.iterator();
        while (it.hasNext()) {
            TL_stories$TL_myBoost next = it.next();
            TLRPC$Peer tLRPC$Peer = next.peer;
            if (tLRPC$Peer != null && DialogObject.getPeerDialogId(tLRPC$Peer) != (-tLRPC$Chat.id)) {
                this.allUsedBoosts.add(next);
            }
        }
        SelectorBtnCell selectorBtnCell = new SelectorBtnCell(getContext(), this.resourcesProvider, this.recyclerListView);
        this.buttonContainer = selectorBtnCell;
        selectorBtnCell.setClickable(true);
        selectorBtnCell.setOrientation(1);
        selectorBtnCell.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        selectorBtnCell.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(this, getContext(), true, this.resourcesProvider) {
            private boolean incGradient;
            private float progress;
            private final RectF rect = new RectF();

            @Override
            public void onDraw(Canvas canvas) {
                if (this.incGradient) {
                    float f = this.progress + 0.016f;
                    this.progress = f;
                    if (f > 3.0f) {
                        this.incGradient = false;
                    }
                } else {
                    float f2 = this.progress - 0.016f;
                    this.progress = f2;
                    if (f2 < 1.0f) {
                        this.incGradient = true;
                    }
                }
                this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), (-getMeasuredWidth()) * 0.1f * this.progress, 0.0f);
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), PremiumGradient.getInstance().getMainGradientPaint());
                invalidate();
                super.onDraw(canvas);
            }
        };
        this.actionButton = buttonWithCounterView;
        buttonWithCounterView.withCounterIcon();
        buttonWithCounterView.setCounterColor(-6785796);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ReassignBoostBottomSheet.this.lambda$new$3(tLRPC$Chat, view);
            }
        });
        selectorBtnCell.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i = this.backgroundPaddingLeft;
        viewGroup.addView(selectorBtnCell, LayoutHelper.createFrameMarginPx(-1, -2.0f, 87, i, 0, i, 0));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i2 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i2, 0, i2, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                ReassignBoostBottomSheet.this.lambda$new$4(tLRPC$Chat, view, i3);
            }
        });
        fixNavigationBar();
        updateTitle();
        updateActionButton(false);
        Bulletin.addDelegate(this.container, new Bulletin.Delegate(this) {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean clipWithGradient(int i3) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
            }

            @Override
            public int getBottomOffset(int i3) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i3);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getTopOffset(int i3) {
                return AndroidUtilities.statusBarHeight;
            }
        });
    }

    public void lambda$new$3(final TLRPC$Chat tLRPC$Chat, View view) {
        if (this.selectedBoosts.isEmpty() || this.actionButton.isLoading()) {
            return;
        }
        this.actionButton.setLoading(true);
        final ArrayList arrayList = new ArrayList();
        final HashSet hashSet = new HashSet();
        for (TL_stories$TL_myBoost tL_stories$TL_myBoost : this.selectedBoosts) {
            arrayList.add(Integer.valueOf(tL_stories$TL_myBoost.slot));
            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_stories$TL_myBoost.peer)));
        }
        BoostRepository.applyBoost(tLRPC$Chat.id, arrayList, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ReassignBoostBottomSheet.this.lambda$new$1(tLRPC$Chat, arrayList, hashSet, (TL_stories$TL_premium_myBoosts) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ReassignBoostBottomSheet.this.lambda$new$2((TLRPC$TL_error) obj);
            }
        });
    }

    public void lambda$new$1(TLRPC$Chat tLRPC$Chat, final List list, final HashSet hashSet, final TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts) {
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(-tLRPC$Chat.id, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ReassignBoostBottomSheet.this.lambda$new$0(tL_stories$TL_premium_myBoosts, list, hashSet, (TL_stories$TL_premium_boostsStatus) obj);
            }
        });
    }

    public void lambda$new$0(TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts, List list, HashSet hashSet, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        dismiss();
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, tL_stories$TL_premium_myBoosts, Integer.valueOf(list.size()), Integer.valueOf(hashSet.size()), tL_stories$TL_premium_boostsStatus);
    }

    public void lambda$new$2(TLRPC$TL_error tLRPC$TL_error) {
        this.actionButton.setLoading(false);
        BoostDialogs.showToastError(getContext(), tLRPC$TL_error);
    }

    public void lambda$new$4(TLRPC$Chat tLRPC$Chat, View view, int i) {
        if (view instanceof SelectorUserCell) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            if (selectorUserCell.getBoost().cooldown_until_date > 0) {
                BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatString("BoostingWaitWarning", R.string.BoostingWaitWarning, Integer.valueOf(BoostRepository.boostsPerSentGift()))), 5).show(true);
                return;
            }
            if (this.selectedBoosts.contains(selectorUserCell.getBoost())) {
                this.selectedBoosts.remove(selectorUserCell.getBoost());
            } else {
                this.selectedBoosts.add(selectorUserCell.getBoost());
            }
            selectorUserCell.setChecked(this.selectedBoosts.contains(selectorUserCell.getBoost()), true);
            updateActionButton(true);
            this.topCell.showBoosts(this.selectedBoosts, tLRPC$Chat);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.timer = new CountDownTimer(Long.MAX_VALUE, 1000L) {
            @Override
            public void onFinish() {
            }

            @Override
            public void onTick(long j) {
                int i;
                ArrayList arrayList = new ArrayList(ReassignBoostBottomSheet.this.allUsedBoosts.size());
                Iterator it = ReassignBoostBottomSheet.this.allUsedBoosts.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TL_stories$TL_myBoost tL_stories$TL_myBoost = (TL_stories$TL_myBoost) it.next();
                    if (tL_stories$TL_myBoost.cooldown_until_date > 0) {
                        arrayList.add(tL_stories$TL_myBoost);
                    }
                    if (tL_stories$TL_myBoost.cooldown_until_date * 1000 < System.currentTimeMillis()) {
                        tL_stories$TL_myBoost.cooldown_until_date = 0;
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (i = 0; i < ((BottomSheetWithRecyclerListView) ReassignBoostBottomSheet.this).recyclerListView.getChildCount(); i++) {
                    View childAt = ((BottomSheetWithRecyclerListView) ReassignBoostBottomSheet.this).recyclerListView.getChildAt(i);
                    if (childAt instanceof SelectorUserCell) {
                        SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                        if (arrayList.contains(selectorUserCell.getBoost())) {
                            selectorUserCell.updateTimer();
                        }
                    }
                }
            }
        };
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.timer.cancel();
    }

    @Override
    public void onOpenAnimationEnd() {
        this.timer.start();
    }

    private void updateActionButton(boolean z) {
        this.actionButton.setShowZero(false);
        if (this.selectedBoosts.size() > 1) {
            this.actionButton.setText(LocaleController.getString("BoostingReassignBoosts", R.string.BoostingReassignBoosts), z);
        } else {
            this.actionButton.setText(LocaleController.getString("BoostingReassignBoost", R.string.BoostingReassignBoost), z);
        }
        this.actionButton.setCount(this.selectedBoosts.size(), z);
        this.actionButton.setEnabled(this.selectedBoosts.size() > 0);
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString("BoostingReassignBoost", R.string.BoostingReassignBoost);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter() {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public int getItemViewType(int i) {
                if (i != 0) {
                    int i2 = 1;
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            return 3;
                        }
                    }
                    return i2;
                }
                return 0;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 3;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                Context context = viewGroup.getContext();
                if (i == 0) {
                    TopCell topCell = new TopCell(context);
                    topCell.showBoosts(ReassignBoostBottomSheet.this.selectedBoosts, ReassignBoostBottomSheet.this.currentChat);
                    view = topCell;
                } else if (i == 1) {
                    view = new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray));
                } else if (i == 2) {
                    view = new HeaderCell(context, 22);
                } else if (i == 3) {
                    view = new SelectorUserCell(context, ((BottomSheet) ReassignBoostBottomSheet.this).resourcesProvider, true);
                } else {
                    view = new View(context);
                }
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(view);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (viewHolder.getItemViewType() == 3) {
                    TL_stories$TL_myBoost tL_stories$TL_myBoost = (TL_stories$TL_myBoost) ReassignBoostBottomSheet.this.allUsedBoosts.get(i - 3);
                    SelectorUserCell selectorUserCell = (SelectorUserCell) viewHolder.itemView;
                    selectorUserCell.setBoost(tL_stories$TL_myBoost);
                    selectorUserCell.setChecked(ReassignBoostBottomSheet.this.selectedBoosts.contains(tL_stories$TL_myBoost), false);
                } else if (viewHolder.getItemViewType() == 2) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    headerCell.setTextSize(15.0f);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                    headerCell.setText(LocaleController.getString("BoostingRemoveBoostFrom", R.string.BoostingRemoveBoostFrom));
                } else if (viewHolder.getItemViewType() == 0) {
                    ReassignBoostBottomSheet.this.topCell = (TopCell) viewHolder.itemView;
                    ReassignBoostBottomSheet.this.topCell.setData(ReassignBoostBottomSheet.this.currentChat);
                }
            }

            @Override
            public int getItemCount() {
                return ReassignBoostBottomSheet.this.allUsedBoosts.size() + 3;
            }
        };
    }

    public static class TopCell extends LinearLayout {
        private final List<TLRPC$Chat> addedChats;
        private final ArrowView arrowView;
        private final FrameLayout avatarsContainer;
        private final FrameLayout avatarsWrapper;
        private final TextView description;
        private final AvatarHolderView toAvatar;

        public TopCell(Context context) {
            super(context);
            this.addedChats = new ArrayList();
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.avatarsContainer = frameLayout;
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.avatarsWrapper = frameLayout2;
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            ArrowView arrowView = new ArrowView(context);
            this.arrowView = arrowView;
            frameLayout.addView(arrowView, LayoutHelper.createFrame(24, 24, 17));
            AvatarHolderView avatarHolderView = new AvatarHolderView(context);
            this.toAvatar = avatarHolderView;
            avatarHolderView.setLayerType(2, null);
            frameLayout.addView(avatarHolderView, LayoutHelper.createFrame(70, 70, 17));
            addView(frameLayout, LayoutHelper.createLinear(-1, 70, 0.0f, 15.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setText(LocaleController.getString("BoostingReassignBoost", R.string.BoostingReassignBoost));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 15, 0, 7));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 28, 0, 28, 18));
        }

        public void setData(TLRPC$Chat tLRPC$Chat) {
            TextView textView = this.description;
            int i = R.string.BoostingReassignBoostText;
            Object[] objArr = new Object[2];
            objArr[0] = tLRPC$Chat == null ? "" : tLRPC$Chat.title;
            objArr[1] = Integer.valueOf(BoostRepository.boostsPerSentGift());
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BoostingReassignBoostText", i, objArr)));
        }

        public void showBoosts(List<TL_stories$TL_myBoost> list, TLRPC$Chat tLRPC$Chat) {
            ArrayList arrayList = new ArrayList(list.size());
            for (TL_stories$TL_myBoost tL_stories$TL_myBoost : list) {
                arrayList.add(MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_stories$TL_myBoost.peer))));
            }
            showChats(arrayList, tLRPC$Chat);
        }

        public void showChats(List<TLRPC$Chat> list, TLRPC$Chat tLRPC$Chat) {
            float f;
            float f2;
            final AvatarHolderView avatarHolderView;
            ArrayList<TLRPC$Chat> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            for (TLRPC$Chat tLRPC$Chat2 : list) {
                if (!this.addedChats.contains(tLRPC$Chat2)) {
                    arrayList2.add(tLRPC$Chat2);
                }
            }
            for (TLRPC$Chat tLRPC$Chat3 : this.addedChats) {
                if (!list.contains(tLRPC$Chat3)) {
                    arrayList.add(tLRPC$Chat3);
                }
            }
            ArrayList<AvatarHolderView> arrayList3 = new ArrayList();
            for (int i = 0; i < this.avatarsWrapper.getChildCount(); i++) {
                AvatarHolderView avatarHolderView2 = (AvatarHolderView) this.avatarsWrapper.getChildAt(i);
                if (avatarHolderView2.getTag() == null) {
                    arrayList3.add(avatarHolderView2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                f = 0.0f;
                f2 = 0.1f;
                if (!it.hasNext()) {
                    break;
                }
                AvatarHolderView avatarHolderView3 = new AvatarHolderView(getContext());
                avatarHolderView3.setLayerType(2, null);
                avatarHolderView3.setChat((TLRPC$Chat) it.next());
                int size = arrayList3.size();
                this.avatarsWrapper.addView(avatarHolderView3, 0, LayoutHelper.createFrame(70, 70, 17));
                avatarHolderView3.setTranslationX((-size) * 70);
                avatarHolderView3.setAlpha(0.0f);
                avatarHolderView3.setScaleX(0.1f);
                avatarHolderView3.setScaleY(0.1f);
                avatarHolderView3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(cubicBezierInterpolator).setDuration(200).start();
                if (size == 0) {
                    avatarHolderView3.boostIconView.setScaleY(1.0f);
                    avatarHolderView3.boostIconView.setScaleX(1.0f);
                    avatarHolderView3.boostIconView.setAlpha(1.0f);
                }
            }
            for (TLRPC$Chat tLRPC$Chat4 : arrayList) {
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        avatarHolderView = null;
                        break;
                    }
                    avatarHolderView = (AvatarHolderView) it2.next();
                    if (avatarHolderView.chat == tLRPC$Chat4) {
                        break;
                    }
                }
                if (avatarHolderView != null) {
                    avatarHolderView.setTag("REMOVED");
                    long j = 200;
                    avatarHolderView.animate().alpha(f).translationXBy(70.0f).scaleX(f2).scaleY(f2).setInterpolator(cubicBezierInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            avatarHolderView.setLayerType(0, null);
                            TopCell.this.avatarsWrapper.removeView(avatarHolderView);
                        }
                    }).start();
                    int i2 = 0;
                    for (AvatarHolderView avatarHolderView4 : arrayList3) {
                        int size2 = arrayList3.size() - 1;
                        if (avatarHolderView4 != avatarHolderView) {
                            i2++;
                            avatarHolderView4.animate().translationX((-(size2 - i2)) * 70).setInterpolator(cubicBezierInterpolator).setDuration(j).start();
                        }
                    }
                    if (arrayList3.get(arrayList3.size() - 1) == avatarHolderView && arrayList3.size() > 1) {
                        ((AvatarHolderView) arrayList3.get(arrayList3.size() - 2)).boostIconView.setScaleY(0.1f);
                        ((AvatarHolderView) arrayList3.get(arrayList3.size() - 2)).boostIconView.setScaleX(0.1f);
                        ((AvatarHolderView) arrayList3.get(arrayList3.size() - 2)).boostIconView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j).setInterpolator(cubicBezierInterpolator).start();
                        f = 0.0f;
                        f2 = 0.1f;
                    }
                }
                f = 0.0f;
                f2 = 0.1f;
            }
            AvatarHolderView avatarHolderView5 = this.toAvatar;
            if (avatarHolderView5.chat == null) {
                avatarHolderView5.setChat(tLRPC$Chat);
            }
            this.addedChats.removeAll(arrayList);
            this.addedChats.addAll(arrayList2);
            this.avatarsContainer.animate().cancel();
            if (this.addedChats.isEmpty() || this.addedChats.size() == 1) {
                this.avatarsContainer.animate().setInterpolator(cubicBezierInterpolator).translationX(0.0f).setDuration(200).start();
            } else {
                this.avatarsContainer.animate().setInterpolator(cubicBezierInterpolator).translationX(AndroidUtilities.dp(11.0f) * (this.addedChats.size() - 1)).setDuration(200).start();
            }
            this.toAvatar.animate().cancel();
            this.avatarsWrapper.animate().cancel();
            if (this.addedChats.isEmpty()) {
                long j2 = 200;
                this.avatarsWrapper.animate().setInterpolator(cubicBezierInterpolator).translationX(0.0f).setDuration(j2).start();
                this.toAvatar.animate().setInterpolator(cubicBezierInterpolator).translationX(0.0f).setDuration(j2).start();
                return;
            }
            long j3 = 200;
            this.avatarsWrapper.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j3).start();
            this.toAvatar.animate().setInterpolator(cubicBezierInterpolator).translationX(AndroidUtilities.dp(48.0f)).setDuration(j3).start();
        }
    }

    private static class ArrowView extends FrameLayout {
        public ArrowView(Context context) {
            super(context);
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_arrow_avatar);
            imageView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText7));
            addView(imageView);
        }
    }

    public static class AvatarHolderView extends FrameLayout {
        private final Paint bgPaint;
        private final BoostIconView boostIconView;
        public TLRPC$Chat chat;
        AvatarDrawable fromAvatarDrawable;
        private final BackupImageView imageView;

        public AvatarHolderView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.fromAvatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
            BoostIconView boostIconView = new BoostIconView(context);
            this.boostIconView = boostIconView;
            boostIconView.setAlpha(0.0f);
            addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
            addView(boostIconView, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
            paint.setColor(Theme.getColor(Theme.key_dialogBackground));
        }

        public void setChat(TLRPC$Chat tLRPC$Chat) {
            this.chat = tLRPC$Chat;
            this.fromAvatarDrawable.setInfo(tLRPC$Chat);
            this.imageView.setForUserOrChat(tLRPC$Chat, this.fromAvatarDrawable);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.bgPaint);
            super.dispatchDraw(canvas);
        }
    }

    public static class BoostIconView extends View {
        Drawable boostDrawable;
        Paint paint;

        public BoostIconView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.boostDrawable = ContextCompat.getDrawable(getContext(), R.drawable.mini_boost_remove);
            this.paint.setColor(Theme.getColor(Theme.key_dialogBackground));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, this.paint);
            PremiumGradient.getInstance().updateMainGradientMatrix(0, 0, getMeasuredWidth(), getMeasuredHeight(), -AndroidUtilities.dp(10.0f), 0.0f);
            canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), PremiumGradient.getInstance().getMainGradientPaint());
            float dp = AndroidUtilities.dp(18.0f) / 2.0f;
            this.boostDrawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
            this.boostDrawable.draw(canvas);
        }
    }
}
