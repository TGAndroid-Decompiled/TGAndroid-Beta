package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
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
import org.telegram.ui.Cells.StickerSetCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumButtonView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class StickerSetCell extends FrameLayout {
    public TextView addButtonView;
    private CheckBox2 checkBox;
    public ImageView deleteView;
    private boolean emojis;
    private boolean groupSearch;
    private BackupImageView imageView;
    private boolean needDivider;
    private final int option;
    private ImageView optionsButton;
    public PremiumButtonView premiumButtonView;
    private RadialProgressView progressView;
    private Rect rect;
    public TextView removeButtonView;
    private ImageView reorderButton;
    private FrameLayout sideButtons;
    private AnimatorSet stateAnimator;
    private TLRPC.TL_messages_stickerSet stickersSet;
    private TextView textView;
    private TextView valueTextView;

    protected void onAddButtonClick() {
    }

    protected void onPremiumButtonClick() {
    }

    protected void onRemoveButtonClick() {
    }

    public StickerSetCell(Context context, int i) {
        this(context, null, i);
    }

    public StickerSetCell(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.rect = new Rect();
        this.option = i;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        this.imageView.setLayerNum(1);
        BackupImageView backupImageView2 = this.imageView;
        boolean z = LocaleController.isRTL;
        addView(backupImageView2, LayoutHelper.createFrame(40, 40.0f, (z ? 5 : 3) | 48, z ? 0.0f : 13.0f, 9.0f, z ? 13.0f : 0.0f, 0.0f));
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setFocusable(false);
            ImageView imageView2 = this.optionsButton;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            if (i != 3) {
                this.optionsButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_stickers_menuSelector)));
            }
            if (i == 1) {
                ImageView imageView3 = this.optionsButton;
                int i2 = Theme.key_stickers_menu;
                int color = Theme.getColor(i2);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView3.setColorFilter(new PorterDuffColorFilter(color, mode));
                this.optionsButton.setImageResource(R.drawable.msg_actions);
                this.optionsButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                addView(this.optionsButton, LayoutHelper.createFrame(40, 40, (LocaleController.isRTL ? 3 : 5) | 16));
                ImageView imageView4 = new ImageView(context);
                this.reorderButton = imageView4;
                imageView4.setAlpha(0.0f);
                this.reorderButton.setVisibility(8);
                this.reorderButton.setScaleType(scaleType);
                this.reorderButton.setImageResource(R.drawable.list_reorder);
                this.reorderButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2), mode));
                addView(this.reorderButton, LayoutHelper.createFrameRelatively(58.0f, 58.0f, 8388613));
                CheckBox2 checkBox2 = new CheckBox2(context, 21);
                this.checkBox = checkBox2;
                checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
                this.checkBox.setDrawUnchecked(false);
                this.checkBox.setDrawBackgroundAsArc(3);
                addView(this.checkBox, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i == 3) {
                this.optionsButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addedIcon), PorterDuff.Mode.MULTIPLY));
                this.optionsButton.setImageResource(R.drawable.floating_check);
                ImageView imageView5 = this.optionsButton;
                boolean z2 = LocaleController.isRTL;
                addView(imageView5, LayoutHelper.createFrame(40, 40.0f, (z2 ? 3 : 5) | 48, z2 ? 10 : 0, 9.0f, z2 ? 0 : 10, 0.0f));
            }
        }
        this.sideButtons = new FrameLayout(getContext());
        TextView textView = new TextView(context);
        this.addButtonView = textView;
        textView.setTextSize(1, 14.0f);
        this.addButtonView.setTypeface(AndroidUtilities.bold());
        this.addButtonView.setText(LocaleController.getString(R.string.Add));
        this.addButtonView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
        TextView textView2 = this.addButtonView;
        int i3 = Theme.key_featuredStickers_addButton;
        textView2.setBackground(Theme.AdaptiveRipple.createRect(Theme.getColor(i3, resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButtonPressed, resourcesProvider), 14.0f));
        this.addButtonView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.addButtonView.setGravity(17);
        this.addButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        this.sideButtons.addView(this.addButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        ScaleStateListAnimator.apply(this.addButtonView);
        TextView textView3 = new TextView(context);
        this.removeButtonView = textView3;
        textView3.setTextSize(1, 14.0f);
        this.removeButtonView.setTypeface(AndroidUtilities.bold());
        this.removeButtonView.setText(LocaleController.getString(R.string.StickersRemove));
        this.removeButtonView.setTextColor(Theme.getColor(Theme.key_featuredStickers_removeButtonText, resourcesProvider));
        this.removeButtonView.setBackground(Theme.AdaptiveRipple.createRect(0, Theme.getColor(i3, resourcesProvider) & 452984831, 14.0f));
        this.removeButtonView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        this.removeButtonView.setGravity(17);
        this.removeButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        this.sideButtons.addView(this.removeButtonView, LayoutHelper.createFrameRelatively(-2.0f, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(this.removeButtonView);
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.dp(4.0f), false, resourcesProvider);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setIcon(R.raw.unlock_icon);
        this.premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$2(view);
            }
        });
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.premiumButtonView.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.dp(1.0f);
            int iDp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.height = iDp;
            marginLayoutParams.width = iDp;
            ((ViewGroup.MarginLayoutParams) this.premiumButtonView.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.dp(3.0f);
            this.premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.sideButtons.addView(this.premiumButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        ScaleStateListAnimator.apply(this.premiumButtonView);
        this.sideButtons.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        addView(this.sideButtons, LayoutHelper.createFrame(-2, -1.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.sideButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$3(view);
            }
        });
        TextView textView4 = new TextView(context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
            }
        };
        this.textView = textView4;
        NotificationCenter.listenEmojiLoading(textView4);
        this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setTypeface(AndroidUtilities.bold());
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView5 = new TextView(context);
        this.valueTextView = textView5;
        textView5.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
        this.valueTextView.setTextSize(1, 13.0f);
        this.valueTextView.setLines(1);
        this.valueTextView.setMaxLines(1);
        this.valueTextView.setSingleLine(true);
        this.valueTextView.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(this.valueTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
        if (i == 3) {
            ImageView imageView6 = new ImageView(context);
            this.deleteView = imageView6;
            imageView6.setImageResource(R.drawable.msg_close);
            this.deleteView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            this.deleteView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText), PorterDuff.Mode.SRC_IN);
            this.deleteView.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector)));
            this.deleteView.setVisibility(8);
            ImageView imageView7 = this.deleteView;
            boolean z3 = LocaleController.isRTL;
            addView(imageView7, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 3 : 5) | 16, z3 ? 4.0f : 0.0f, 0.0f, z3 ? 0.0f : 4.0f, 0.0f));
        }
        updateButtonState(0, false);
    }

    public void lambda$new$0(View view) {
        onAddButtonClick();
    }

    public void lambda$new$1(View view) {
        onRemoveButtonClick();
    }

    public void lambda$new$2(View view) {
        onPremiumButtonClick();
    }

    public void lambda$new$3(View view) {
        if (this.premiumButtonView.getVisibility() == 0 && this.premiumButtonView.isEnabled()) {
            this.premiumButtonView.performClick();
            return;
        }
        if (this.addButtonView.getVisibility() == 0 && this.addButtonView.isEnabled()) {
            this.addButtonView.performClick();
        } else if (this.removeButtonView.getVisibility() == 0 && this.removeButtonView.isEnabled()) {
            this.removeButtonView.performClick();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setNeedDivider(boolean z) {
        this.needDivider = z;
    }

    public void setStickersSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z) {
        setStickersSet(tL_messages_stickerSet, z, false);
    }

    public void setSearchQuery(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str, Theme.ResourcesProvider resourcesProvider) {
        String str2;
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str3 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int iIndexOf = str3.toLowerCase(locale).indexOf(str);
        if (iIndexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider), iIndexOf, str.length() + iIndexOf, 0);
            this.textView.setText(spannableString);
        }
        int iIndexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (iIndexOf2 != -1) {
            if (!stickerSet.emojis) {
                str2 = "t.me/addstickers/";
            } else {
                str2 = "t.me/addemoji/";
            }
            int length = iIndexOf2 + str2.length();
            SpannableString spannableString2 = new SpannableString(str2 + stickerSet.short_name);
            spannableString2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider), length, str.length() + length, 0);
            this.valueTextView.setText(spannableString2);
        }
    }

    public void setStickersSet(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, boolean z, boolean z2) {
        TLRPC.Document document;
        ImageLocation forSticker;
        this.needDivider = z;
        this.stickersSet = tL_messages_stickerSet;
        this.groupSearch = z2;
        this.imageView.setVisibility(0);
        RadialProgressView radialProgressView = this.progressView;
        if (radialProgressView != null) {
            radialProgressView.setVisibility(4);
        }
        this.textView.setTranslationY(0.0f);
        this.textView.setText(this.stickersSet.set.title);
        if (this.stickersSet.set.archived) {
            this.textView.setAlpha(0.5f);
            this.valueTextView.setAlpha(0.5f);
            this.imageView.setAlpha(0.5f);
        } else {
            this.textView.setAlpha(1.0f);
            this.valueTextView.setAlpha(1.0f);
            this.imageView.setAlpha(1.0f);
        }
        boolean z3 = tL_messages_stickerSet.set.emojis;
        this.emojis = z3;
        this.sideButtons.setVisibility(z3 ? 0 : 8);
        this.optionsButton.setVisibility(this.emojis ? 8 : 0);
        this.imageView.setColorFilter(null);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.valueTextView.setText(LocaleController.formatPluralString(this.emojis ? "EmojiCount" : "Stickers", arrayList.size(), new Object[0]));
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    document = null;
                    break;
                }
                document = arrayList.get(i);
                if (document != null && document.id == tL_messages_stickerSet.set.thumb_document_id) {
                    break;
                } else {
                    i++;
                }
            }
            if (document == null) {
                document = arrayList.get(0);
            }
            TLRPC.Document document2 = document;
            LiteMode.isEnabled(1);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document2;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tL_messages_stickerSet.set.thumbs, Theme.key_windowBackgroundGray, 1.0f);
            boolean z4 = closestPhotoSizeWithSize instanceof TLRPC.Document;
            if (z4) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90), document2);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document2, tL_messages_stickerSet.set.thumb_version);
            }
            ImageLocation imageLocation = forSticker;
            boolean zIsEnabled = LiteMode.isEnabled(this.emojis ? 16388 : 1);
            StringBuilder sb = new StringBuilder();
            sb.append("50_50");
            sb.append(!zIsEnabled ? "_firstframe" : "");
            String string = sb.toString();
            if (z4 && (MessageObject.isAnimatedStickerDocument(document2, true) || MessageObject.isVideoSticker(document2))) {
                if (svgThumb != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(document2), string, svgThumb, 0, tL_messages_stickerSet);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(document2), string, imageLocation, (String) null, 0, tL_messages_stickerSet);
                }
                if (MessageObject.isTextColorEmoji(document2)) {
                    this.imageView.setColorFilter(Theme.getAnimatedEmojiColorFilter(null));
                }
            } else if (imageLocation != null && imageLocation.imageType == 1) {
                this.imageView.setImage(imageLocation, string, "tgs", svgThumb, tL_messages_stickerSet);
            } else {
                this.imageView.setImage(imageLocation, string, "webp", svgThumb, tL_messages_stickerSet);
            }
        } else {
            this.valueTextView.setText(LocaleController.formatPluralString(tL_messages_stickerSet.set.emojis ? "EmojiCount" : "Stickers", 0, new Object[0]));
            this.imageView.setImageDrawable(null);
            if (tL_messages_stickerSet.set.thumb_document_id != 0) {
                AnimatedEmojiDrawable.getDocumentFetcher(UserConfig.selectedAccount).fetchDocument(tL_messages_stickerSet.set.thumb_document_id, new AnimatedEmojiDrawable.ReceivedDocument() {
                    @Override
                    public final void run(TLRPC.Document document3) {
                        this.f$0.lambda$setStickersSet$5(document3);
                    }
                });
            }
        }
        if (this.groupSearch) {
            TextView textView = this.valueTextView;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_messages_stickerSet.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/");
            sb2.append(tL_messages_stickerSet.set.short_name);
            textView.setText(sb2.toString());
        }
    }

    public void lambda$setStickersSet$5(final TLRPC.Document document) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setStickersSet$4(document);
            }
        });
    }

    public void lambda$setStickersSet$4(TLRPC.Document document) {
        if (this.stickersSet.documents.isEmpty()) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.stickersSet;
            if (tL_messages_stickerSet.set.thumb_document_id == document.id) {
                tL_messages_stickerSet.documents.add(document);
                setStickersSet(this.stickersSet, this.needDivider, this.groupSearch);
            }
        }
    }

    public void setChecked(boolean z) {
        setChecked(z, true);
    }

    public boolean isChecked() {
        int i = this.option;
        if (i == 1) {
            return this.checkBox.isChecked();
        }
        return i == 3 ? this.optionsButton.getVisibility() == 0 : this.emojis && this.sideButtons.getVisibility() == 0;
    }

    public void setDeleteAction(View.OnClickListener onClickListener) {
        ImageView imageView = this.deleteView;
        if (imageView != null) {
            imageView.setVisibility(onClickListener == null ? 8 : 0);
            this.deleteView.setOnClickListener(onClickListener);
        }
    }

    public void setChecked(final boolean z, boolean z2) {
        int i = this.option;
        if (i == 1) {
            this.checkBox.setChecked(z, z2);
            return;
        }
        if (i == 3) {
            if (z2) {
                this.optionsButton.animate().cancel();
                this.optionsButton.animate().setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            return;
                        }
                        StickerSetCell.this.optionsButton.setVisibility(4);
                    }

                    @Override
                    public void onAnimationStart(Animator animator) {
                        if (z) {
                            StickerSetCell.this.optionsButton.setVisibility(0);
                        }
                    }
                }).alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            this.optionsButton.setVisibility(z ? 0 : 4);
            if (!z) {
                this.optionsButton.setAlpha(0.0f);
                this.optionsButton.setScaleX(0.1f);
                this.optionsButton.setScaleY(0.1f);
                return;
            } else {
                this.optionsButton.setAlpha(1.0f);
                this.optionsButton.setScaleX(1.0f);
                this.optionsButton.setScaleY(1.0f);
                return;
            }
        }
        if (this.emojis) {
            if (z2) {
                this.sideButtons.animate().cancel();
                this.sideButtons.animate().setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            return;
                        }
                        StickerSetCell.this.sideButtons.setVisibility(4);
                    }

                    @Override
                    public void onAnimationStart(Animator animator) {
                        if (z) {
                            StickerSetCell.this.sideButtons.setVisibility(0);
                        }
                    }
                }).alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).setDuration(150L).start();
                return;
            }
            this.sideButtons.setVisibility(z ? 0 : 4);
            if (!z) {
                this.sideButtons.setAlpha(0.0f);
                this.sideButtons.setScaleX(0.1f);
                this.sideButtons.setScaleY(0.1f);
            } else {
                this.sideButtons.setAlpha(1.0f);
                this.sideButtons.setScaleX(1.0f);
                this.sideButtons.setScaleY(1.0f);
            }
        }
    }

    public void setReorderable(boolean z) {
        setReorderable(z, true);
    }

    public void setReorderable(final boolean z, boolean z2) {
        if (this.option == 1) {
            float[] fArr = {z ? 1.0f : 0.0f, z ? 0.0f : 1.0f};
            float[] fArr2 = {z ? 1.0f : 0.66f, z ? 0.66f : 1.0f};
            if (z2) {
                this.reorderButton.setVisibility(0);
                ViewPropertyAnimator duration = this.reorderButton.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
                Interpolator interpolator = Easings.easeOutSine;
                duration.setInterpolator(interpolator).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setReorderable$6(z);
                    }
                }).start();
                if (this.emojis) {
                    this.sideButtons.setVisibility(0);
                    this.sideButtons.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(interpolator).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$setReorderable$7(z);
                        }
                    }).start();
                    return;
                } else {
                    this.optionsButton.setVisibility(0);
                    this.optionsButton.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(interpolator).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$setReorderable$8(z);
                        }
                    }).start();
                    return;
                }
            }
            this.reorderButton.setVisibility(z ? 0 : 8);
            this.reorderButton.setAlpha(fArr[0]);
            this.reorderButton.setScaleX(fArr2[0]);
            this.reorderButton.setScaleY(fArr2[0]);
            if (this.emojis) {
                this.sideButtons.setVisibility(z ? 8 : 0);
                this.sideButtons.setAlpha(fArr[1]);
                this.sideButtons.setScaleX(fArr2[1]);
                this.sideButtons.setScaleY(fArr2[1]);
                return;
            }
            this.optionsButton.setVisibility(z ? 8 : 0);
            this.optionsButton.setAlpha(fArr[1]);
            this.optionsButton.setScaleX(fArr2[1]);
            this.optionsButton.setScaleY(fArr2[1]);
        }
    }

    public void lambda$setReorderable$6(boolean z) {
        if (z) {
            return;
        }
        this.reorderButton.setVisibility(8);
    }

    public void lambda$setReorderable$7(boolean z) {
        if (z) {
            this.sideButtons.setVisibility(8);
        }
    }

    public void lambda$setReorderable$8(boolean z) {
        if (z) {
            this.optionsButton.setVisibility(8);
        }
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.reorderButton.setOnTouchListener(onTouchListener);
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        ImageView imageView = this.optionsButton;
        if (imageView == null) {
            return;
        }
        imageView.setOnClickListener(onClickListener);
    }

    public TLRPC.TL_messages_stickerSet getStickersSet() {
        return this.stickersSet;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        if (getBackground() != null && (imageView = this.optionsButton) != null) {
            imageView.getHitRect(this.rect);
            if (this.rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (getBackground() != null && this.emojis && (frameLayout = this.sideButtons) != null) {
            frameLayout.getHitRect(this.rect);
            if (this.rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : 0), getHeight() - 1, Theme.dividerPaint);
        }
    }

    public void updateRightMargin() {
        this.sideButtons.measure(View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
        int iDp = AndroidUtilities.dp(26.0f) + this.sideButtons.getMeasuredWidth();
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = iDp;
            ((ViewGroup.MarginLayoutParams) this.valueTextView.getLayoutParams()).leftMargin = iDp;
        } else {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = iDp;
            ((ViewGroup.MarginLayoutParams) this.valueTextView.getLayoutParams()).rightMargin = iDp;
        }
    }

    public void updateButtonState(final int i, boolean z) {
        AnimatorSet animatorSet = this.stateAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.stateAnimator = null;
        }
        if (i == 1) {
            this.premiumButtonView.setButton(LocaleController.getString(R.string.Unlock), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateButtonState$9(view);
                }
            });
        } else if (i == 2) {
            this.premiumButtonView.setButton(LocaleController.getString(R.string.Restore), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateButtonState$10(view);
                }
            });
        }
        this.premiumButtonView.setEnabled(i == 1 || i == 2);
        this.addButtonView.setEnabled(i == 3);
        this.removeButtonView.setEnabled(i == 4);
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.stateAnimator = animatorSet2;
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            Property property = FrameLayout.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(premiumButtonView, (Property<PremiumButtonView, Float>) property, (i == 1 || i == 2) ? 1.0f : 0.0f);
            PremiumButtonView premiumButtonView2 = this.premiumButtonView;
            Property property2 = FrameLayout.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(premiumButtonView2, (Property<PremiumButtonView, Float>) property2, (i == 1 || i == 2) ? 1.0f : 0.6f);
            PremiumButtonView premiumButtonView3 = this.premiumButtonView;
            Property property3 = FrameLayout.SCALE_Y;
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(premiumButtonView3, (Property<PremiumButtonView, Float>) property3, (i == 1 || i == 2) ? 1.0f : 0.6f), ObjectAnimator.ofFloat(this.addButtonView, (Property<TextView, Float>) property, i == 3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.addButtonView, (Property<TextView, Float>) property2, i == 3 ? 1.0f : 0.6f), ObjectAnimator.ofFloat(this.addButtonView, (Property<TextView, Float>) property3, i == 3 ? 1.0f : 0.6f), ObjectAnimator.ofFloat(this.removeButtonView, (Property<TextView, Float>) property, i == 4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.removeButtonView, (Property<TextView, Float>) property2, i == 4 ? 1.0f : 0.6f), ObjectAnimator.ofFloat(this.removeButtonView, (Property<TextView, Float>) property3, i == 4 ? 1.0f : 0.6f));
            this.stateAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    StickerSetCell.this.premiumButtonView.setVisibility(0);
                    StickerSetCell.this.addButtonView.setVisibility(0);
                    StickerSetCell.this.removeButtonView.setVisibility(0);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    PremiumButtonView premiumButtonView4 = StickerSetCell.this.premiumButtonView;
                    int i2 = i;
                    premiumButtonView4.setVisibility((i2 == 1 || i2 == 2) ? 0 : 8);
                    StickerSetCell.this.addButtonView.setVisibility(i == 3 ? 0 : 8);
                    StickerSetCell.this.removeButtonView.setVisibility(i != 4 ? 8 : 0);
                    StickerSetCell.this.updateRightMargin();
                }
            });
            this.stateAnimator.setDuration(250L);
            this.stateAnimator.setInterpolator(new OvershootInterpolator(1.02f));
            this.stateAnimator.start();
            return;
        }
        this.premiumButtonView.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
        this.premiumButtonView.setScaleX((i == 1 || i == 2) ? 1.0f : 0.6f);
        this.premiumButtonView.setScaleY((i == 1 || i == 2) ? 1.0f : 0.6f);
        this.premiumButtonView.setVisibility((i == 1 || i == 2) ? 0 : 8);
        this.addButtonView.setAlpha(i == 3 ? 1.0f : 0.0f);
        this.addButtonView.setScaleX(i == 3 ? 1.0f : 0.6f);
        this.addButtonView.setScaleY(i == 3 ? 1.0f : 0.6f);
        this.addButtonView.setVisibility(i == 3 ? 0 : 8);
        this.removeButtonView.setAlpha(i == 4 ? 1.0f : 0.0f);
        this.removeButtonView.setScaleX(i == 4 ? 1.0f : 0.6f);
        this.removeButtonView.setScaleY(i == 4 ? 1.0f : 0.6f);
        this.removeButtonView.setVisibility(i == 4 ? 0 : 8);
        updateRightMargin();
    }

    public void lambda$updateButtonState$9(View view) {
        onPremiumButtonClick();
    }

    public void lambda$updateButtonState$10(View view) {
        onPremiumButtonClick();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 == null || !checkBox2.isChecked()) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(true);
    }

    public static final class Factory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public StickerSetCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            final StickerSetCell stickerSetCell = new StickerSetCell(context, 1);
            if (recyclerListView instanceof UniversalRecyclerView) {
                final UniversalRecyclerView universalRecyclerView = (UniversalRecyclerView) recyclerListView;
                stickerSetCell.setOnReorderButtonTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return StickerSetCell.Factory.lambda$createView$0(universalRecyclerView, stickerSetCell, view, motionEvent);
                    }
                });
            }
            return stickerSetCell;
        }

        public static boolean lambda$createView$0(UniversalRecyclerView universalRecyclerView, StickerSetCell stickerSetCell, View view, MotionEvent motionEvent) {
            ItemTouchHelper itemTouchHelper;
            if (motionEvent.getAction() != 0 || (itemTouchHelper = universalRecyclerView.itemTouchHelper) == null) {
                return false;
            }
            itemTouchHelper.startDrag(universalRecyclerView.getChildViewHolder(stickerSetCell));
            return false;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            TLRPC.StickerSet stickerSet;
            StickerSetCell stickerSetCell = (StickerSetCell) view;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) uItem.object;
            stickerSetCell.setStickersSet(tL_messages_stickerSet, z);
            stickerSetCell.setChecked(uItem.checked, false);
            boolean zIsReorderAllowed = universalRecyclerView.isReorderAllowed();
            int i = 1;
            stickerSetCell.setReorderable(zIsReorderAllowed, true);
            stickerSetCell.setOnOptionsClick(uItem.clickCallback);
            stickerSetCell.addButtonView.setOnClickListener(uItem.clickCallback2);
            stickerSetCell.removeButtonView.setOnClickListener(uItem.clickCallback2);
            stickerSetCell.premiumButtonView.setOnClickListener(uItem.clickCallback2);
            if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
                return;
            }
            boolean zIsStickerPackInstalled = MediaDataController.getInstance(universalAdapter.currentAccount).isStickerPackInstalled(tL_messages_stickerSet.set.id);
            boolean zIsPremium = UserConfig.getInstance(universalAdapter.currentAccount).isPremium();
            boolean z2 = !zIsPremium;
            if (!zIsPremium) {
                int i2 = 0;
                while (true) {
                    if (i2 >= tL_messages_stickerSet.documents.size()) {
                        z2 = false;
                        break;
                    } else if (!MessageObject.isFreeEmoji(tL_messages_stickerSet.documents.get(i2))) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (!z2) {
                i = zIsStickerPackInstalled ? 4 : 3;
            } else if (zIsStickerPackInstalled && !tL_messages_stickerSet.set.official) {
                i = 2;
            }
            stickerSetCell.updateButtonState(i, false);
        }

        @Override
        public void attachedView(RecyclerListView recyclerListView, View view, UItem uItem) {
            StickerSetCell stickerSetCell = (StickerSetCell) view;
            stickerSetCell.setChecked(uItem.checked, true);
            stickerSetCell.setReorderable(recyclerListView instanceof UniversalRecyclerView ? ((UniversalRecyclerView) recyclerListView).isReorderAllowed() : false, true);
        }

        public static UItem of(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = tL_messages_stickerSet;
            return uItemOfFactory;
        }
    }
}
