package org.telegram.ui.Components.Premium.boosts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CreateBotAlert$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorUserCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.GradientHeaderActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.PeerStoriesView$5$$ExternalSyntheticLambda3;

public final class ReassignBoostBottomSheet extends BottomSheetWithRecyclerListView {
    public final GradientButtonWithCounterView actionButton;
    public final ArrayList allUsedBoosts;
    public final TLRPC.Chat currentChat;
    public final ArrayList selectedBoosts;
    public AnonymousClass2 timer;
    public TopCell topCell;

    public final class AnonymousClass1 implements Bulletin.Delegate {
        @Override
        public final boolean allowLayoutChanges() {
            return true;
        }

        @Override
        public final boolean bottomOffsetAnimated() {
            return true;
        }

        @Override
        public final boolean clipWithGradient(int i) {
            return false;
        }

        @Override
        public final int getBottomOffset(int i) {
            return 0;
        }

        @Override
        public final int getTopOffset() {
            return AndroidUtilities.statusBarHeight;
        }

        @Override
        public final void onBottomOffsetChange(float f) {
        }

        @Override
        public final void onHide(Bulletin bulletin) {
        }

        @Override
        public final void onShow(Bulletin bulletin) {
        }
    }

    public final class ArrowView extends FrameLayout {
    }

    public final class AvatarHolderView extends FrameLayout {
        public final Paint bgPaint;
        public final BoostIconView boostIconView;
        public TLRPC.Chat chat;
        public final AvatarDrawable fromAvatarDrawable;
        public final BackupImageView imageView;

        public AvatarHolderView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.fromAvatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView = new BackupImageView(getContext());
            this.imageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
            BoostIconView boostIconView = new BoostIconView(context);
            this.boostIconView = boostIconView;
            boostIconView.setAlpha(0.0f);
            addView(backupImageView, LayoutHelper.createFrame(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
            addView(boostIconView, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
            paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.bgPaint);
            super.dispatchDraw(canvas);
        }
    }

    public final class BoostIconView extends View {
        public final Drawable boostDrawable;
        public final Paint paint;

        public BoostIconView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.paint = paint;
            this.boostDrawable = getContext().getDrawable(R.drawable.mini_boost_remove);
            paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, this.paint);
            PremiumGradient premiumGradient = PremiumGradient.getInstance();
            premiumGradient.mainGradient.gradientMatrix(0, -AndroidUtilities.dp(10.0f), 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
            canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), PremiumGradient.getInstance().getMainGradientPaint());
            float fDp = AndroidUtilities.dp(18.0f) / 2.0f;
            int i = (int) (measuredWidth - fDp);
            int i2 = (int) (measuredHeight - fDp);
            int i3 = (int) (measuredWidth + fDp);
            int i4 = (int) (measuredHeight + fDp);
            Drawable drawable = this.boostDrawable;
            drawable.setBounds(i, i2, i3, i4);
            drawable.draw(canvas);
        }
    }

    public final class TopCell extends LinearLayout {
        public final ArrayList addedChats;
        public final FrameLayout avatarsContainer;
        public final FrameLayout avatarsWrapper;
        public final LinkSpanDrawable.LinksTextView description;
        public final AvatarHolderView toAvatar;

        public TopCell(Context context) {
            super(context);
            this.addedChats = new ArrayList();
            setOrientation(1);
            setClipChildren(false);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.avatarsContainer = frameLayout;
            frameLayout.setClipChildren(false);
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.avatarsWrapper = frameLayout2;
            frameLayout2.setClipChildren(false);
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
            ArrowView arrowView = new ArrowView(context);
            ImageView imageView = new ImageView(arrowView.getContext());
            imageView.setImageResource(R.drawable.msg_arrow_avatar);
            imageView.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText7, false));
            arrowView.addView(imageView);
            frameLayout.addView(arrowView, LayoutHelper.createFrame(24, 24, 17));
            AvatarHolderView avatarHolderView = new AvatarHolderView(context);
            this.toAvatar = avatarHolderView;
            avatarHolderView.setLayerType(2, null);
            frameLayout.addView(avatarHolderView, LayoutHelper.createFrame(70, 70, 17));
            addView(frameLayout, LayoutHelper.createLinear(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            zzkq.m(20.0f, R.string.BoostingReassignBoost, textView);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 15, 0, 7));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext(), null);
            this.description = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setGravity(1);
            linksTextView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            linksTextView.setLineSpacing(linksTextView.getLineSpacingExtra(), linksTextView.getLineSpacingMultiplier() * 1.1f);
            addView(linksTextView, LayoutHelper.createLinear(-2, -2, 1, 28, 0, 28, 18));
        }

        public final void showBoosts(ArrayList arrayList, TLRPC.Chat chat) {
            ArrayList arrayList2;
            FrameLayout frameLayout;
            final AvatarHolderView avatarHolderView;
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList3.add(MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(((TL_stories.TL_myBoost) obj).peer))));
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (true) {
                arrayList2 = this.addedChats;
                if (i3 >= size2) {
                    break;
                }
                Object obj2 = arrayList3.get(i3);
                i3++;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                if (!arrayList2.contains(chat2)) {
                    arrayList5.add(chat2);
                }
            }
            int size3 = arrayList2.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
                if (!arrayList3.contains(chat3)) {
                    arrayList4.add(chat3);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            int i5 = 0;
            while (true) {
                frameLayout = this.avatarsWrapper;
                if (i5 >= frameLayout.getChildCount()) {
                    break;
                }
                AvatarHolderView avatarHolderView2 = (AvatarHolderView) frameLayout.getChildAt(i5);
                if (avatarHolderView2.getTag() == null) {
                    arrayList6.add(avatarHolderView2);
                }
                i5++;
            }
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
                AvatarHolderView avatarHolderView3 = new AvatarHolderView(getContext());
                avatarHolderView3.setLayerType(2, null);
                avatarHolderView3.chat = chat4;
                AvatarDrawable avatarDrawable = avatarHolderView3.fromAvatarDrawable;
                avatarDrawable.setInfo(UserConfig.selectedAccount, chat4);
                BackupImageView backupImageView = avatarHolderView3.imageView;
                backupImageView.imageReceiver.setForUserOrChat(chat4, avatarDrawable);
                backupImageView.onNewImageSet();
                int size5 = arrayList6.size();
                frameLayout.addView(avatarHolderView3, i, LayoutHelper.createFrame(70, 70, 17));
                avatarHolderView3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
                avatarHolderView3.setAlpha(0.0f);
                avatarHolderView3.setScaleX(0.1f);
                avatarHolderView3.setScaleY(0.1f);
                ArrayList arrayList7 = arrayList5;
                avatarHolderView3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(cubicBezierInterpolator).setDuration(200).start();
                if (size5 == 0) {
                    BoostIconView boostIconView = avatarHolderView3.boostIconView;
                    boostIconView.setScaleY(1.0f);
                    boostIconView.setScaleX(1.0f);
                    boostIconView.setAlpha(1.0f);
                }
                arrayList5 = arrayList7;
                i = 0;
            }
            ArrayList arrayList8 = arrayList5;
            int size6 = arrayList4.size();
            int i7 = 0;
            while (true) {
                int i8 = 1;
                if (i7 >= size6) {
                    break;
                }
                Object obj5 = arrayList4.get(i7);
                i7++;
                TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
                int size7 = arrayList6.size();
                int i9 = 0;
                do {
                    if (i9 >= size7) {
                        avatarHolderView = null;
                        break;
                    } else {
                        Object obj6 = arrayList6.get(i9);
                        i9++;
                        avatarHolderView = (AvatarHolderView) obj6;
                    }
                } while (avatarHolderView.chat != chat5);
                if (avatarHolderView != null) {
                    avatarHolderView.setTag("REMOVED");
                    long j = 200;
                    avatarHolderView.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(cubicBezierInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            AvatarHolderView avatarHolderView4 = avatarHolderView;
                            avatarHolderView4.setLayerType(0, null);
                            TopCell.this.avatarsWrapper.removeView(avatarHolderView4);
                        }
                    }).start();
                    int size8 = arrayList6.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size8) {
                        Object obj7 = arrayList6.get(i10);
                        i10++;
                        AvatarHolderView avatarHolderView4 = (AvatarHolderView) obj7;
                        int size9 = arrayList6.size() - 1;
                        if (avatarHolderView4 != avatarHolderView) {
                            i11++;
                            avatarHolderView4.animate().translationX((-(size9 - i11)) * AndroidUtilities.dp(23.0f)).setInterpolator(cubicBezierInterpolator).setDuration(j).start();
                            i8 = 1;
                        }
                    }
                    if (SurfaceContainer$$ExternalSyntheticOutline0.m(i8, arrayList6) == avatarHolderView && arrayList6.size() > i8) {
                        ((AvatarHolderView) SurfaceContainer$$ExternalSyntheticOutline0.m(2, arrayList6)).boostIconView.setScaleY(0.1f);
                        ((AvatarHolderView) arrayList6.get(arrayList6.size() - 2)).boostIconView.setScaleX(0.1f);
                        ((AvatarHolderView) arrayList6.get(arrayList6.size() - 2)).boostIconView.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j).setInterpolator(cubicBezierInterpolator).start();
                    }
                }
            }
            AvatarHolderView avatarHolderView5 = this.toAvatar;
            if (avatarHolderView5.chat == null) {
                avatarHolderView5.chat = chat;
                AvatarDrawable avatarDrawable2 = avatarHolderView5.fromAvatarDrawable;
                avatarDrawable2.setInfo(UserConfig.selectedAccount, chat);
                BackupImageView backupImageView2 = avatarHolderView5.imageView;
                backupImageView2.imageReceiver.setForUserOrChat(chat, avatarDrawable2);
                backupImageView2.onNewImageSet();
            }
            arrayList2.removeAll(arrayList4);
            arrayList2.addAll(arrayList8);
            FrameLayout frameLayout2 = this.avatarsContainer;
            frameLayout2.animate().cancel();
            if (arrayList2.isEmpty() || arrayList2.size() == 1) {
                frameLayout2.animate().setInterpolator(cubicBezierInterpolator).translationX(0.0f).setDuration(200).start();
            } else {
                frameLayout2.animate().setInterpolator(cubicBezierInterpolator).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
            }
            avatarHolderView5.animate().cancel();
            frameLayout.animate().cancel();
            if (arrayList2.isEmpty()) {
                long j2 = 200;
                frameLayout.animate().setInterpolator(cubicBezierInterpolator).translationX(0.0f).setDuration(j2).start();
                avatarHolderView5.animate().setInterpolator(cubicBezierInterpolator).translationX(0.0f).setDuration(j2).start();
            } else {
                long j3 = 200;
                frameLayout.animate().setInterpolator(cubicBezierInterpolator).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j3).start();
                avatarHolderView5.animate().setInterpolator(cubicBezierInterpolator).translationX(AndroidUtilities.dp(48.0f)).setDuration(j3).start();
            }
        }
    }

    public ReassignBoostBottomSheet(BaseFragment baseFragment, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(baseFragment, false);
        this.selectedBoosts = new ArrayList();
        this.allUsedBoosts = new ArrayList();
        this.topPadding = 0.3f;
        this.currentChat = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i);
            i++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && DialogObject.getPeerDialogId(peer) != (-chat.id)) {
                this.allUsedBoosts.add(tL_myBoost2);
            }
        }
        GradientHeaderActivity.AnonymousClass5 anonymousClass5 = new GradientHeaderActivity.AnonymousClass5(getContext(), this.resourcesProvider, this.recyclerListView);
        anonymousClass5.setClickable(true);
        anonymousClass5.setOrientation(1);
        anonymousClass5.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        anonymousClass5.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        GradientButtonWithCounterView gradientButtonWithCounterView = new GradientButtonWithCounterView(getContext(), this.resourcesProvider);
        this.actionButton = gradientButtonWithCounterView;
        gradientButtonWithCounterView.withCounterIcon();
        gradientButtonWithCounterView.setCounterColor(-6785796);
        gradientButtonWithCounterView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(6, this, chat));
        anonymousClass5.addView(gradientButtonWithCounterView, LayoutHelper.createLinear(-1, 48, 87));
        ViewGroup viewGroup = this.containerView;
        int i2 = this.backgroundPaddingLeft;
        viewGroup.addView(anonymousClass5, LayoutHelper.createFrameMarginPx(-2.0f, 87, i2, 0, i2, 0));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i3 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i3, 0, i3, AndroidUtilities.dp(64.0f));
        this.recyclerListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(12, this, chat));
        fixNavigationBar();
        updateTitle$1();
        updateActionButton$2(false);
        Bulletin.addDelegate(this.container, new AnonymousClass1());
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public final int getItemCount() {
                return ReassignBoostBottomSheet.this.allUsedBoosts.size() + 3;
            }

            @Override
            public final int getItemViewType(int i) {
                if (i == 0) {
                    return 0;
                }
                int i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        return 3;
                    }
                }
                return i2;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.mItemViewType == 3;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int i2 = 1;
                int i3 = 2;
                int i4 = viewHolder.mItemViewType;
                ReassignBoostBottomSheet reassignBoostBottomSheet = ReassignBoostBottomSheet.this;
                View view = viewHolder.itemView;
                if (i4 == 3) {
                    TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) reassignBoostBottomSheet.allUsedBoosts.get(i - 3);
                    SelectorUserCell selectorUserCell = (SelectorUserCell) view;
                    selectorUserCell.setBoost(tL_myBoost);
                    selectorUserCell.setChecked(reassignBoostBottomSheet.selectedBoosts.contains(tL_myBoost), false);
                    return;
                }
                if (i4 == 2) {
                    HeaderCell headerCell = (HeaderCell) view;
                    headerCell.setTextSize(15.0f);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
                    headerCell.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
                    return;
                }
                if (i4 == 0) {
                    TopCell topCell = (TopCell) view;
                    reassignBoostBottomSheet.topCell = topCell;
                    topCell.getClass();
                    try {
                        int i5 = (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift;
                        TLRPC.Chat chat = reassignBoostBottomSheet.currentChat;
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", i5, chat == null ? "" : chat.title, "%3$s"));
                        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), Theme.key_chat_messageLinkIn, 2, new CreateBotAlert$$ExternalSyntheticLambda9(reassignBoostBottomSheet, i3));
                        int iIndexOf = TextUtils.indexOf(spannableStringBuilderReplaceTags, "%3$s");
                        spannableStringBuilderReplaceTags.replace(iIndexOf, iIndexOf + 4, (CharSequence) spannableStringBuilderReplaceSingleTag);
                        LinkSpanDrawable.LinksTextView linksTextView = topCell.description;
                        linksTextView.setText(spannableStringBuilderReplaceTags, TextView.BufferType.EDITABLE);
                        linksTextView.post(new OAuthSheet$$ExternalSyntheticLambda17(topCell, iIndexOf, i2));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View shadowSectionCell;
                Context context = viewGroup.getContext();
                ReassignBoostBottomSheet reassignBoostBottomSheet = ReassignBoostBottomSheet.this;
                if (i == 0) {
                    TopCell topCell = new TopCell(context);
                    topCell.showBoosts(reassignBoostBottomSheet.selectedBoosts, reassignBoostBottomSheet.currentChat);
                    shadowSectionCell = topCell;
                } else if (i == 1) {
                    shadowSectionCell = new ShadowSectionCell(context, Theme.getColor(null, Theme.key_windowBackgroundGray, false), 0);
                } else if (i != 2) {
                    shadowSectionCell = i != 3 ? new View(context) : new SelectorUserCell(context, true, false, ((BottomSheet) reassignBoostBottomSheet).resourcesProvider, true);
                } else {
                    shadowSectionCell = new HeaderCell(context, 22);
                }
                return zzkl.m(shadowSectionCell, shadowSectionCell);
            }
        };
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.BoostingReassignBoost);
    }

    public final void lambda$new$1(TLRPC.Chat chat, ArrayList arrayList, HashSet hashSet, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(-chat.id, new PeerStoriesView$5$$ExternalSyntheticLambda3(this, tL_premium_myBoosts, arrayList, hashSet, 1));
    }

    public final void lambda$new$4(TLRPC.Chat chat, View view) {
        if (view instanceof SelectorUserCell) {
            SelectorUserCell selectorUserCell = (SelectorUserCell) view;
            if (selectorUserCell.getBoost().cooldown_until_date > 0) {
                new BulletinFactory(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, 5, AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, new Object[0]))).show(true);
                return;
            }
            ArrayList arrayList = this.selectedBoosts;
            if (arrayList.contains(selectorUserCell.getBoost())) {
                arrayList.remove(selectorUserCell.getBoost());
            } else {
                arrayList.add(selectorUserCell.getBoost());
            }
            selectorUserCell.setChecked(arrayList.contains(selectorUserCell.getBoost()), true);
            updateActionButton$2(true);
            this.topCell.showBoosts(arrayList, chat);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.timer = new CountDownTimer() {
            @Override
            public final void onFinish() {
            }

            @Override
            public final void onTick(long j) {
                ReassignBoostBottomSheet reassignBoostBottomSheet = ReassignBoostBottomSheet.this;
                ArrayList arrayList = new ArrayList(reassignBoostBottomSheet.allUsedBoosts.size());
                ArrayList arrayList2 = reassignBoostBottomSheet.allUsedBoosts;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                    if (tL_myBoost.cooldown_until_date > 0) {
                        arrayList.add(tL_myBoost);
                    }
                    if (((long) tL_myBoost.cooldown_until_date) * 1000 < System.currentTimeMillis()) {
                        tL_myBoost.cooldown_until_date = 0;
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                for (int i2 = 0; i2 < reassignBoostBottomSheet.recyclerListView.getChildCount(); i2++) {
                    View childAt = reassignBoostBottomSheet.recyclerListView.getChildAt(i2);
                    if (childAt instanceof SelectorUserCell) {
                        SelectorUserCell selectorUserCell = (SelectorUserCell) childAt;
                        if (arrayList.contains(selectorUserCell.getBoost())) {
                            int i3 = selectorUserCell.boost.cooldown_until_date;
                            SimpleTextView simpleTextView = selectorUserCell.subtitleTextView;
                            UserCell2.AnonymousClass1 anonymousClass1 = selectorUserCell.titleTextView;
                            if (i3 > 0) {
                                selectorUserCell.setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, SelectorUserCell.buildCountDownTime((((long) i3) * 1000) - System.currentTimeMillis())));
                                anonymousClass1.setAlpha(0.65f);
                                simpleTextView.setAlpha(0.65f);
                                selectorUserCell.setCheckboxAlpha(0.3f, false);
                            } else {
                                selectorUserCell.setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(((long) selectorUserCell.boost.expires) * 1000))));
                                if (anonymousClass1.getAlpha() < 1.0f) {
                                    anonymousClass1.animate().alpha(1.0f).start();
                                    simpleTextView.animate().alpha(1.0f).start();
                                    selectorUserCell.setCheckboxAlpha(1.0f, true);
                                } else {
                                    anonymousClass1.setAlpha(1.0f);
                                    simpleTextView.setAlpha(1.0f);
                                    selectorUserCell.setCheckboxAlpha(1.0f, false);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancel();
    }

    @Override
    public final void onOpenAnimationEnd() {
        start();
    }

    public final void updateActionButton$2(boolean z) {
        GradientButtonWithCounterView gradientButtonWithCounterView = this.actionButton;
        gradientButtonWithCounterView.setShowZero(false);
        ArrayList arrayList = this.selectedBoosts;
        if (arrayList.size() > 1) {
            gradientButtonWithCounterView.setText(LocaleController.getString(R.string.BoostingReassignBoosts), z, true);
        } else {
            gradientButtonWithCounterView.setText(LocaleController.getString(R.string.BoostingReassignBoost), z, true);
        }
        gradientButtonWithCounterView.setCount(arrayList.size(), z);
        gradientButtonWithCounterView.setEnabled(arrayList.size() > 0);
    }
}
