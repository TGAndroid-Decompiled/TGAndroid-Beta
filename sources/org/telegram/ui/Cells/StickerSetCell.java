package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda22;

public final class StickerSetCell extends FrameLayout {
    public final TextView addButtonView;
    public final CheckBox2 checkBox;
    public final ImageView deleteView;
    public boolean emojis;
    public boolean groupSearch;
    public final BackupImageView imageView;
    public boolean needDivider;
    public final int option;
    public final ImageView optionsButton;
    public final PremiumButtonView premiumButtonView;
    public final Rect rect;
    public final TextView removeButtonView;
    public final ImageView reorderButton;
    public final FrameLayout sideButtons;
    public TLRPC.TL_messages_stickerSet stickersSet;
    public final ArticleViewer.AnonymousClass9 textView;
    public final TextView valueTextView;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void attachedView(RecyclerListView recyclerListView, View view, UItem uItem) {
            StickerSetCell stickerSetCell = (StickerSetCell) view;
            stickerSetCell.setChecked(uItem.checked, true);
            stickerSetCell.setReorderable$1(recyclerListView instanceof UniversalRecyclerView ? ((UniversalRecyclerView) recyclerListView).reorderingAllowed : false);
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            StickerSetCell stickerSetCell = (StickerSetCell) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) uItem.object;
            boolean z2 = false;
            stickerSetCell.setStickersSet(tL_messages_stickerSet, z, false);
            stickerSetCell.setChecked(uItem.checked, false);
            stickerSetCell.setReorderable$1(universalRecyclerView.reorderingAllowed);
            stickerSetCell.setOnOptionsClick(uItem.clickCallback);
            stickerSetCell.addButtonView.setOnClickListener(uItem.clickCallback2);
            stickerSetCell.removeButtonView.setOnClickListener(uItem.clickCallback2);
            stickerSetCell.premiumButtonView.setOnClickListener(uItem.clickCallback2);
            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
            if (stickerSet == null || !stickerSet.emojis) {
                return;
            }
            int i = universalAdapter.currentAccount;
            boolean zIsStickerPackInstalled = MediaDataController.getInstance(i).isStickerPackInstalled(tL_messages_stickerSet.set.id);
            boolean zIsPremium = UserConfig.getInstance(i).isPremium();
            boolean z3 = !zIsPremium;
            if (zIsPremium) {
                z2 = z3;
                break;
            }
            for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
                if (!MessageObject.isFreeEmoji(tL_messages_stickerSet.documents.get(i2))) {
                    z2 = z3;
                    break;
                }
            }
            stickerSetCell.updateButtonState(z2 ? (!zIsStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : zIsStickerPackInstalled ? 4 : 3);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            StickerSetCell stickerSetCell = new StickerSetCell(context, 1);
            if (recyclerListView instanceof UniversalRecyclerView) {
                stickerSetCell.setOnReorderButtonTouchListener(new PassportActivity$$ExternalSyntheticLambda22(2, (UniversalRecyclerView) recyclerListView, stickerSetCell));
            }
            return stickerSetCell;
        }
    }

    public StickerSetCell(Context context, int i) {
        super(context);
        int i2 = 0;
        this.rect = new Rect();
        this.option = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        int i3 = 1;
        backupImageView.setAspectFit(true);
        backupImageView.setLayerNum(1);
        boolean z = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(40, 40.0f, (z ? 5 : 3) | 48, z ? 0.0f : 13.0f, 9.0f, z ? 13.0f : 0.0f, 0.0f));
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            if (i != 3) {
                imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_stickers_menuSelector, false), 1, -1));
            }
            if (i == 1) {
                int i4 = Theme.key_stickers_menu;
                int color = Theme.getColor(null, i4, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                imageView.setImageResource(R.drawable.msg_actions);
                imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                addView(imageView, LayoutHelper.createFrame(40, 40, (LocaleController.isRTL ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.reorderButton = imageView2;
                imageView2.setAlpha(0.0f);
                imageView2.setVisibility(8);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.list_reorder);
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i4, false), mode));
                addView(imageView2, LayoutHelper.createFrameRelatively(58.0f, 58.0f, 8388613));
                CheckBox2 checkBox2 = new CheckBox2(context, 21);
                this.checkBox = checkBox2;
                checkBox2.checkBoxBase.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                checkBox2.setDrawUnchecked(false);
                checkBox2.setDrawBackgroundAsArc(3);
                addView(checkBox2, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i == 3) {
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_addedIcon, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.floating_check);
                boolean z2 = LocaleController.isRTL;
                addView(imageView, LayoutHelper.createFrame(40, 40.0f, (z2 ? 3 : 5) | 48, z2 ? 10 : 0, 9.0f, z2 ? 0 : 10, 0.0f));
            }
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.sideButtons = frameLayout;
        TextView textView = new TextView(context);
        this.addButtonView = textView;
        zzkk.m(14.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.Add));
        textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        int i5 = Theme.key_featuredStickers_addButton;
        textView.setBackground(Theme.AdaptiveRipple.createRect(new float[]{14.0f}, Theme.getColor(null, i5, false), Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false)));
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setGravity(17);
        textView.setOnClickListener(new StickerSetCell$$ExternalSyntheticLambda0(this, i2));
        frameLayout.addView(textView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
        TextView textView2 = new TextView(context);
        this.removeButtonView = textView2;
        zzkk.m(14.0f, 1, textView2);
        textView2.setText(LocaleController.getString(R.string.StickersRemove));
        textView2.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_removeButtonText, false));
        textView2.setBackground(Theme.AdaptiveRipple.createRect(new float[]{14.0f}, 0, Theme.getColor(null, i5, false) & 452984831));
        textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new StickerSetCell$$ExternalSyntheticLambda0(this, i2));
        frameLayout.addView(textView2, LayoutHelper.createFrameRelatively(-2.0f, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(textView2, 0.1f, 1.5f);
        PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(4.0f), context, null, false);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setIcon(R.raw.unlock_icon);
        premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new StickerSetCell$$ExternalSyntheticLambda0(this, i2), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) premiumButtonView.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int iDp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = iDp;
            marginLayoutParams.width = iDp;
            ((ViewGroup.MarginLayoutParams) premiumButtonView.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.sideButtons.addView(this.premiumButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        ScaleStateListAnimator.apply(this.premiumButtonView, 0.1f, 1.5f);
        this.sideButtons.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        addView(this.sideButtons, LayoutHelper.createFrame(-2, -1.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.sideButtons.setOnClickListener(new StickerSetCell$$ExternalSyntheticLambda0(this, i3));
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 5);
        this.textView = anonymousClass9;
        NotificationCenter.listenEmojiLoading(anonymousClass9);
        anonymousClass9.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        anonymousClass9.setTextSize(1, 16.0f);
        anonymousClass9.setTypeface(AndroidUtilities.bold());
        anonymousClass9.setLines(1);
        anonymousClass9.setMaxLines(1);
        anonymousClass9.setSingleLine(true);
        anonymousClass9.setEllipsize(TextUtils.TruncateAt.END);
        anonymousClass9.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(anonymousClass9, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.valueTextView = textView3;
        zzkp.m(13.0f, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), textView3);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(textView3, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i == 3) {
            ImageView imageView3 = new ImageView(context);
            this.deleteView = imageView3;
            imageView3.setImageResource(R.drawable.msg_close);
            imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            imageView3.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false), PorterDuff.Mode.SRC_IN);
            imageView3.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            imageView3.setVisibility(8);
            boolean z3 = LocaleController.isRTL;
            addView(imageView3, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 3 : 5) | 16, z3 ? 4.0f : 0.0f, 0.0f, z3 ? 0.0f : 4.0f, 0.0f));
        }
        updateButtonState(0);
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.stickersSet;
    }

    public final boolean isChecked() {
        int i = this.option;
        if (i == 1) {
            return this.checkBox.checkBoxBase.isChecked;
        }
        if (i == 3) {
            if (this.optionsButton.getVisibility() != 0) {
                return false;
            }
        } else if (!this.emojis || this.sideButtons.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null || !checkBox2.checkBoxBase.isChecked) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        Drawable background = getBackground();
        Rect rect = this.rect;
        if (background != null && (imageView = this.optionsButton) != null) {
            imageView.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.emojis && (frameLayout = this.sideButtons) != null) {
            frameLayout.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        setChecked(z, true);
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        ImageView imageView = this.deleteView;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setNeedDivider(boolean z) {
        this.needDivider = z;
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.optionsButton;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.reorderButton.setOnTouchListener(onTouchListener);
    }

    public void setReorderable(boolean z) {
        setReorderable$1(z);
    }

    public final void setReorderable$1(final boolean z) {
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        if (this.option == 1) {
            float[] fArr = {z ? 1.0f : 0.0f, z ? 0.0f : 1.0f};
            float[] fArr2 = {z ? 1.0f : 0.66f, z ? 0.66f : 1.0f};
            ImageView imageView = this.reorderButton;
            imageView.setVisibility(0);
            ViewPropertyAnimator duration = imageView.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
            CubicBezierInterpolator cubicBezierInterpolator = Easings.easeOutSine;
            duration.setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                public final StickerSetCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            StickerSetCell stickerSetCell = this.f$0;
                            if (!z) {
                                stickerSetCell.reorderButton.setVisibility(8);
                            } else {
                                stickerSetCell.getClass();
                            }
                            break;
                        case 1:
                            StickerSetCell stickerSetCell2 = this.f$0;
                            if (!z) {
                                stickerSetCell2.getClass();
                            } else {
                                stickerSetCell2.sideButtons.setVisibility(8);
                            }
                            break;
                        default:
                            StickerSetCell stickerSetCell3 = this.f$0;
                            if (!z) {
                                stickerSetCell3.getClass();
                            } else {
                                stickerSetCell3.optionsButton.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            if (this.emojis) {
                FrameLayout frameLayout = this.sideButtons;
                frameLayout.setVisibility(0);
                frameLayout.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                    public final StickerSetCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                StickerSetCell stickerSetCell = this.f$0;
                                if (!z) {
                                    stickerSetCell.reorderButton.setVisibility(8);
                                } else {
                                    stickerSetCell.getClass();
                                }
                                break;
                            case 1:
                                StickerSetCell stickerSetCell2 = this.f$0;
                                if (!z) {
                                    stickerSetCell2.getClass();
                                } else {
                                    stickerSetCell2.sideButtons.setVisibility(8);
                                }
                                break;
                            default:
                                StickerSetCell stickerSetCell3 = this.f$0;
                                if (!z) {
                                    stickerSetCell3.getClass();
                                } else {
                                    stickerSetCell3.optionsButton.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
            } else {
                ImageView imageView2 = this.optionsButton;
                imageView2.setVisibility(0);
                imageView2.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(cubicBezierInterpolator).withEndAction(new Runnable(this) {
                    public final StickerSetCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                StickerSetCell stickerSetCell = this.f$0;
                                if (!z) {
                                    stickerSetCell.reorderButton.setVisibility(8);
                                } else {
                                    stickerSetCell.getClass();
                                }
                                break;
                            case 1:
                                StickerSetCell stickerSetCell2 = this.f$0;
                                if (!z) {
                                    stickerSetCell2.getClass();
                                } else {
                                    stickerSetCell2.sideButtons.setVisibility(8);
                                }
                                break;
                            default:
                                StickerSetCell stickerSetCell3 = this.f$0;
                                if (!z) {
                                    stickerSetCell3.getClass();
                                } else {
                                    stickerSetCell3.optionsButton.setVisibility(8);
                                }
                                break;
                        }
                    }
                }).start();
            }
        }
    }

    public final void setStickersSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
        this.needDivider = z;
        this.stickersSet = tL_messages_stickerSet;
        this.groupSearch = z2;
        BackupImageView backupImageView = this.imageView;
        backupImageView.setVisibility(0);
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.textView;
        anonymousClass9.setTranslationY(0.0f);
        anonymousClass9.setText(this.stickersSet.set.title);
        boolean z3 = this.stickersSet.set.archived;
        TextView textView = this.valueTextView;
        if (z3) {
            anonymousClass9.setAlpha(0.5f);
            textView.setAlpha(0.5f);
            backupImageView.setAlpha(0.5f);
        } else {
            anonymousClass9.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            backupImageView.setAlpha(1.0f);
        }
        boolean z4 = tL_messages_stickerSet.set.emojis;
        this.emojis = z4;
        this.sideButtons.setVisibility(z4 ? 0 : 8);
        this.optionsButton.setVisibility(this.emojis ? 8 : 0);
        TLRPC.Document document = null;
        backupImageView.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList == null || arrayList.isEmpty()) {
            tL_messages_stickerSet2 = tL_messages_stickerSet;
            textView.setText(LocaleController.formatPluralString(tL_messages_stickerSet2.set.emojis ? "EmojiCount" : "Stickers", 0, new Object[0]));
            backupImageView.setImageDrawable(null);
            if (tL_messages_stickerSet2.set.thumb_document_id != 0) {
                AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).fetchDocument(tL_messages_stickerSet2.set.thumb_document_id, new StickerSetCell$$ExternalSyntheticLambda5(this, 0));
            }
        } else {
            textView.setText(LocaleController.formatPluralString(this.emojis ? "EmojiCount" : "Stickers", arrayList.size(), new Object[0]));
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Document document2 = arrayList.get(i);
                if (document2 != null && document2.id == tL_messages_stickerSet.set.thumb_document_id) {
                    document = document2;
                    break;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            LiteMode.isEnabled(1);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, Theme.key_windowBackgroundGray, 1.0f);
            boolean z5 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            ImageLocation forDocument = z5 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, tL_messages_stickerSet.set.thumb_version);
            String strConcat = "50_50".concat(!LiteMode.isEnabled(this.emojis ? 16388 : 1) ? "_firstframe" : "");
            if (z5 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
                if (svgThumb != null) {
                    backupImageView.setImage$1(ImageLocation.getForDocument(document), strConcat, svgThumb, tL_messages_stickerSet);
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                } else {
                    tL_messages_stickerSet2 = tL_messages_stickerSet;
                    backupImageView.setImage(ImageLocation.getForDocument(document), strConcat, forDocument, null, null, null, 0, tL_messages_stickerSet2);
                }
                if (MessageObject.isTextColorEmoji(document)) {
                    backupImageView.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
                }
            } else {
                tL_messages_stickerSet2 = tL_messages_stickerSet;
                if (forDocument == null || forDocument.imageType != 1) {
                    backupImageView.setImage(forDocument, strConcat, null, null, svgThumb, "webp", 0, tL_messages_stickerSet2);
                } else {
                    backupImageView.setImage(forDocument, strConcat, null, null, svgThumb, "tgs", 0, tL_messages_stickerSet2);
                }
            }
        }
        if (this.groupSearch) {
            StringBuilder sb = new StringBuilder();
            sb.append(tL_messages_stickerSet2.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/");
            sb.append(tL_messages_stickerSet2.set.short_name);
            textView.setText(sb.toString());
        }
    }

    public final void updateButtonState(int i) {
        PremiumButtonView premiumButtonView = this.premiumButtonView;
        if (i == 1) {
            premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new StickerSetCell$$ExternalSyntheticLambda0(this, 0), false);
        } else if (i == 2) {
            premiumButtonView.setButton(LocaleController.getString(R.string.Restore), new StickerSetCell$$ExternalSyntheticLambda0(this, 0), false);
        }
        premiumButtonView.setEnabled(i == 1 || i == 2);
        boolean z = i == 3;
        TextView textView = this.addButtonView;
        textView.setEnabled(z);
        boolean z2 = i == 4;
        TextView textView2 = this.removeButtonView;
        textView2.setEnabled(z2);
        premiumButtonView.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
        premiumButtonView.setScaleX((i == 1 || i == 2) ? 1.0f : 0.6f);
        premiumButtonView.setScaleY((i == 1 || i == 2) ? 1.0f : 0.6f);
        premiumButtonView.setVisibility((i == 1 || i == 2) ? 0 : 8);
        textView.setAlpha(i == 3 ? 1.0f : 0.0f);
        textView.setScaleX(i == 3 ? 1.0f : 0.6f);
        textView.setScaleY(i == 3 ? 1.0f : 0.6f);
        textView.setVisibility(i == 3 ? 0 : 8);
        textView2.setAlpha(i == 4 ? 1.0f : 0.0f);
        textView2.setScaleX(i == 4 ? 1.0f : 0.6f);
        textView2.setScaleY(i != 4 ? 0.6f : 1.0f);
        textView2.setVisibility(i != 4 ? 8 : 0);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824);
        FrameLayout frameLayout = this.sideButtons;
        frameLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = frameLayout.getMeasuredWidth() + AndroidUtilities.dp(26.0f);
        boolean z3 = LocaleController.isRTL;
        TextView textView3 = this.valueTextView;
        ArticleViewer.AnonymousClass9 anonymousClass9 = this.textView;
        if (z3) {
            ((ViewGroup.MarginLayoutParams) anonymousClass9.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).leftMargin = measuredWidth;
        } else {
            ((ViewGroup.MarginLayoutParams) anonymousClass9.getLayoutParams()).rightMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) textView3.getLayoutParams()).rightMargin = measuredWidth;
        }
    }

    public final void setChecked(final boolean z, boolean z2) {
        int i = this.option;
        if (i == 1) {
            this.checkBox.checkBoxBase.setChecked(-1, z, z2);
            return;
        }
        if (i == 3) {
            ImageView imageView = this.optionsButton;
            if (z2) {
                imageView.animate().cancel();
                final int i2 = 0;
                imageView.animate().setListener(new AnimatorListenerAdapter(this) {
                    public final StickerSetCell this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                if (!z) {
                                    this.this$0.optionsButton.setVisibility(4);
                                }
                                break;
                            default:
                                if (!z) {
                                    this.this$0.sideButtons.setVisibility(4);
                                }
                                break;
                        }
                    }

                    @Override
                    public final void onAnimationStart(Animator animator) {
                        switch (i2) {
                            case 0:
                                if (z) {
                                    this.this$0.optionsButton.setVisibility(0);
                                }
                                break;
                            default:
                                if (z) {
                                    this.this$0.sideButtons.setVisibility(0);
                                }
                                break;
                        }
                    }
                }).alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            imageView.setVisibility(z ? 0 : 4);
            if (z) {
                imageView.setAlpha(1.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                return;
            } else {
                imageView.setAlpha(0.0f);
                imageView.setScaleX(0.1f);
                imageView.setScaleY(0.1f);
                return;
            }
        }
        if (this.emojis) {
            FrameLayout frameLayout = this.sideButtons;
            if (z2) {
                frameLayout.animate().cancel();
                final int i3 = 1;
                frameLayout.animate().setListener(new AnimatorListenerAdapter(this) {
                    public final StickerSetCell this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i3) {
                            case 0:
                                if (!z) {
                                    this.this$0.optionsButton.setVisibility(4);
                                }
                                break;
                            default:
                                if (!z) {
                                    this.this$0.sideButtons.setVisibility(4);
                                }
                                break;
                        }
                    }

                    @Override
                    public final void onAnimationStart(Animator animator) {
                        switch (i3) {
                            case 0:
                                if (z) {
                                    this.this$0.optionsButton.setVisibility(0);
                                }
                                break;
                            default:
                                if (z) {
                                    this.this$0.sideButtons.setVisibility(0);
                                }
                                break;
                        }
                    }
                }).alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            frameLayout.setVisibility(z ? 0 : 4);
            if (z) {
                frameLayout.setAlpha(1.0f);
                frameLayout.setScaleX(1.0f);
                frameLayout.setScaleY(1.0f);
            } else {
                frameLayout.setAlpha(0.0f);
                frameLayout.setScaleX(0.1f);
                frameLayout.setScaleY(0.1f);
            }
        }
    }
}
