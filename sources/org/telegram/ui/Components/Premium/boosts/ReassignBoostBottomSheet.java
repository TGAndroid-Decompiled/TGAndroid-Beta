package org.telegram.ui.Components.Premium.boosts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
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
import org.telegram.tgnet.tl.TL_stories$TL_premium_myBoosts;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorBtnCell;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
public class ReassignBoostBottomSheet extends BottomSheetWithRecyclerListView {
    private final ButtonWithCounterView actionButton;
    private final List<TL_stories$TL_myBoost> allUsedBoosts;
    private final SelectorBtnCell buttonContainer;
    private final TLRPC$Chat currentChat;
    private final List<TL_stories$TL_myBoost> selectedBoosts;
    private TopCell topCell;
    private UndoView undoView;

    public static void show(BaseFragment baseFragment, TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts, TLRPC$Chat tLRPC$Chat) {
        new ReassignBoostBottomSheet(baseFragment, tL_stories$TL_premium_myBoosts, tLRPC$Chat).show();
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
                super.onDraw(canvas);
            }
        };
        this.actionButton = buttonWithCounterView;
        buttonWithCounterView.withCounterIcon();
        buttonWithCounterView.setCounterColor(-6785796);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ReassignBoostBottomSheet.this.lambda$new$2(tLRPC$Chat, view);
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
                ReassignBoostBottomSheet.this.lambda$new$3(tLRPC$Chat, view, i3);
            }
        });
        UndoView undoView = new UndoView(getContext(), getBaseFragment(), true, this.resourcesProvider);
        this.undoView = undoView;
        this.container.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 51, 10.0f, 42.0f, 10.0f, 8.0f));
        fixNavigationBar();
        updateTitle();
        updateActionButton(false);
    }

    public void lambda$new$2(TLRPC$Chat tLRPC$Chat, View view) {
        if (this.selectedBoosts.isEmpty() || this.actionButton.isLoading()) {
            return;
        }
        this.actionButton.setLoading(true);
        final ArrayList arrayList = new ArrayList();
        for (TL_stories$TL_myBoost tL_stories$TL_myBoost : this.selectedBoosts) {
            arrayList.add(Integer.valueOf(tL_stories$TL_myBoost.slot));
        }
        BoostRepository.applyBoost(tLRPC$Chat.id, arrayList, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ReassignBoostBottomSheet.this.lambda$new$0(arrayList, (TL_stories$TL_premium_myBoosts) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ReassignBoostBottomSheet.this.lambda$new$1((TLRPC$TL_error) obj);
            }
        });
    }

    public void lambda$new$0(List list, TL_stories$TL_premium_myBoosts tL_stories$TL_premium_myBoosts) {
        dismiss();
        NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, tL_stories$TL_premium_myBoosts, Integer.valueOf(list.size()));
    }

    public void lambda$new$1(TLRPC$TL_error tLRPC$TL_error) {
        this.actionButton.setLoading(false);
        BoostDialogs.showToastError(getContext(), tLRPC$TL_error);
    }

    public void lambda$new$3(TLRPC$Chat tLRPC$Chat, View view, int i) {
        if (view instanceof SelectorUserCell) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            if (selectorUserCell.getBoost().cooldown_until_date > 0) {
                this.undoView.showWithAction(0L, 93, null, null);
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
        private final ArrowView arrowView;
        private final FrameLayout avatarsContainer;
        private final BoostIconView boostIconView;
        private final TextView description;
        private final AvatarHolderView fromAvatar1;
        private final AvatarHolderView fromAvatar2;
        private final AvatarHolderView fromAvatar3;
        private final AvatarHolderView toAvatar;

        public TopCell(Context context) {
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.avatarsContainer = frameLayout;
            frameLayout.setClipChildren(false);
            AvatarHolderView avatarHolderView = new AvatarHolderView(context);
            this.fromAvatar1 = avatarHolderView;
            AvatarHolderView avatarHolderView2 = new AvatarHolderView(context);
            this.fromAvatar2 = avatarHolderView2;
            AvatarHolderView avatarHolderView3 = new AvatarHolderView(context);
            this.fromAvatar3 = avatarHolderView3;
            frameLayout.addView(avatarHolderView3, LayoutHelper.createFrame(60, 60, 17));
            frameLayout.addView(avatarHolderView2, LayoutHelper.createFrame(60, 60, 17));
            frameLayout.addView(avatarHolderView, LayoutHelper.createFrame(60, 60, 17));
            BoostIconView boostIconView = new BoostIconView(context);
            this.boostIconView = boostIconView;
            frameLayout.addView(boostIconView, LayoutHelper.createFrame(28, 28, 17));
            ArrowView arrowView = new ArrowView(context);
            this.arrowView = arrowView;
            frameLayout.addView(arrowView, LayoutHelper.createFrame(24, 24, 17));
            AvatarHolderView avatarHolderView4 = new AvatarHolderView(context);
            this.toAvatar = avatarHolderView4;
            frameLayout.addView(avatarHolderView4, LayoutHelper.createFrame(60, 60, 17));
            addView(frameLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 20.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setText(LocaleController.getString("BoostingReassignBoost", R.string.BoostingReassignBoost));
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 20, 0, 7));
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
            Object[] objArr = new Object[1];
            objArr[0] = tLRPC$Chat == null ? "" : tLRPC$Chat.title;
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
            int size = list.size();
            if (size == 0) {
                this.fromAvatar1.animate().translationX(0.0f).start();
                this.fromAvatar2.animate().translationX(0.0f).start();
                this.fromAvatar3.animate().translationX(0.0f).start();
                this.boostIconView.animate().translationX(0.0f).translationY(AndroidUtilities.dp(17.0f)).start();
                this.toAvatar.animate().translationX(0.0f).start();
                this.avatarsContainer.animate().translationX(0.0f).start();
            } else if (size == 1) {
                this.fromAvatar1.setChat(list.get(0));
                this.fromAvatar1.animate().translationX(-AndroidUtilities.dp(48.0f)).start();
                this.fromAvatar2.animate().translationX(-AndroidUtilities.dp(48.0f)).start();
                this.fromAvatar3.animate().translationX(-AndroidUtilities.dp(48.0f)).start();
                this.boostIconView.animate().translationX(-AndroidUtilities.dp(26.0f)).translationY(AndroidUtilities.dp(17.0f)).start();
                this.toAvatar.animate().translationX(AndroidUtilities.dp(48.0f)).start();
                this.avatarsContainer.animate().translationX(0.0f).start();
            } else if (size == 2) {
                this.fromAvatar1.setChat(list.get(0));
                this.fromAvatar2.setChat(list.get(1));
                this.fromAvatar1.animate().translationX(-AndroidUtilities.dp(48.0f)).start();
                this.fromAvatar2.animate().translationX(-AndroidUtilities.dp(70.0f)).start();
                this.fromAvatar3.animate().translationX(-AndroidUtilities.dp(70.0f)).start();
                this.boostIconView.animate().translationX(-AndroidUtilities.dp(26.0f)).translationY(AndroidUtilities.dp(17.0f)).start();
                this.toAvatar.animate().translationX(AndroidUtilities.dp(48.0f)).start();
                this.avatarsContainer.animate().translationX(AndroidUtilities.dp(11.0f)).start();
            } else {
                this.fromAvatar1.setChat(list.get(0));
                this.fromAvatar2.setChat(list.get(1));
                this.fromAvatar3.setChat(list.get(2));
                this.fromAvatar1.animate().translationX(-AndroidUtilities.dp(48.0f)).start();
                this.fromAvatar2.animate().translationX(-AndroidUtilities.dp(70.0f)).start();
                this.fromAvatar3.animate().translationX(-AndroidUtilities.dp(92.0f)).start();
                this.boostIconView.animate().translationX(-AndroidUtilities.dp(26.0f)).translationY(AndroidUtilities.dp(17.0f)).start();
                this.toAvatar.animate().translationX(AndroidUtilities.dp(48.0f)).start();
                this.avatarsContainer.animate().translationX(AndroidUtilities.dp(22.0f)).start();
            }
            this.toAvatar.setChat(tLRPC$Chat);
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
        private final BackupImageView imageView;

        public AvatarHolderView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
            addView(backupImageView);
            paint.setColor(Theme.getColor(Theme.key_dialogBackground));
        }

        public void setChat(TLRPC$Chat tLRPC$Chat) {
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(tLRPC$Chat);
            this.imageView.setForUserOrChat(tLRPC$Chat, avatarDrawable);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(3.0f), this.bgPaint);
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
