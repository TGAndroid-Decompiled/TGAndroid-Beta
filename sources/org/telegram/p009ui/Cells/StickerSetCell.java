package org.telegram.p009ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Build;
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
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CheckBox2;
import org.telegram.p009ui.Components.Easings;
import org.telegram.p009ui.Components.ForegroundColorSpanThemable;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Premium.PremiumButtonView;
import org.telegram.p009ui.Components.RadialProgressView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;

public class StickerSetCell extends FrameLayout {
    private TextView addButtonView;
    private CheckBox2 checkBox;
    private boolean emojis;
    private BackupImageView imageView;
    private boolean needDivider;
    private final int option;
    private ImageView optionsButton;
    private PremiumButtonView premiumButtonView;
    private RadialProgressView progressView;
    private Rect rect;
    private TextView removeButtonView;
    private ImageView reorderButton;
    private FrameLayout sideButtons;
    private AnimatorSet stateAnimator;
    private TLRPC$TL_messages_stickerSet stickersSet;
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
        if (i == 2) {
            RadialProgressView radialProgressView = new RadialProgressView(getContext());
            this.progressView = radialProgressView;
            radialProgressView.setProgressColor(Theme.getColor("dialogProgressCircle"));
            this.progressView.setSize(AndroidUtilities.m35dp(30.0f));
            RadialProgressView radialProgressView2 = this.progressView;
            boolean z2 = LocaleController.isRTL;
            addView(radialProgressView2, LayoutHelper.createFrame(48, 48.0f, (z2 ? 5 : 3) | 48, z2 ? 0.0f : 12.0f, 5.0f, z2 ? 12.0f : 0.0f, 0.0f));
        } else if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setFocusable(false);
            this.optionsButton.setScaleType(ImageView.ScaleType.CENTER);
            if (i != 3) {
                this.optionsButton.setBackground(Theme.createSelectorDrawable(Theme.getColor("stickers_menuSelector")));
            }
            if (i == 1) {
                this.optionsButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("stickers_menu"), PorterDuff.Mode.MULTIPLY));
                this.optionsButton.setImageResource(C1010R.C1011drawable.msg_actions);
                this.optionsButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C1010R.string.AccDescrMoreOptions));
                addView(this.optionsButton, LayoutHelper.createFrame(40, 40, (LocaleController.isRTL ? 3 : 5) | 16));
                ImageView imageView2 = new ImageView(context);
                this.reorderButton = imageView2;
                imageView2.setAlpha(0.0f);
                this.reorderButton.setVisibility(8);
                this.reorderButton.setScaleType(ImageView.ScaleType.CENTER);
                this.reorderButton.setImageResource(C1010R.C1011drawable.list_reorder);
                this.reorderButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("stickers_menu"), PorterDuff.Mode.MULTIPLY));
                addView(this.reorderButton, LayoutHelper.createFrameRelatively(58.0f, 58.0f, 8388613));
                CheckBox2 checkBox2 = new CheckBox2(context, 21);
                this.checkBox = checkBox2;
                checkBox2.setColor(null, "windowBackgroundWhite", "checkboxCheck");
                this.checkBox.setDrawUnchecked(false);
                this.checkBox.setDrawBackgroundAsArc(3);
                addView(this.checkBox, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388611, 34.0f, 30.0f, 0.0f, 0.0f));
            } else if (i == 3) {
                this.optionsButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("featuredStickers_addedIcon"), PorterDuff.Mode.MULTIPLY));
                this.optionsButton.setImageResource(C1010R.C1011drawable.floating_check);
                ImageView imageView3 = this.optionsButton;
                boolean z3 = LocaleController.isRTL;
                addView(imageView3, LayoutHelper.createFrame(40, 40.0f, (z3 ? 3 : 5) | 48, z3 ? 10 : 0, 9.0f, z3 ? 0 : 10, 0.0f));
            }
        }
        this.sideButtons = new FrameLayout(getContext());
        TextView textView = new TextView(context);
        this.addButtonView = textView;
        textView.setTextSize(1, 14.0f);
        this.addButtonView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.addButtonView.setText(LocaleController.getString("Add", C1010R.string.Add));
        this.addButtonView.setTextColor(Theme.getColor("featuredStickers_buttonText", resourcesProvider));
        this.addButtonView.setBackground(Theme.AdaptiveRipple.createRect(Theme.getColor("featuredStickers_addButton", resourcesProvider), Theme.getColor("featuredStickers_addButtonPressed", resourcesProvider), 4.0f));
        this.addButtonView.setPadding(AndroidUtilities.m35dp(14.0f), 0, AndroidUtilities.m35dp(14.0f), 0);
        this.addButtonView.setGravity(17);
        this.addButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickerSetCell.this.lambda$new$0(view);
            }
        });
        this.sideButtons.addView(this.addButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        TextView textView2 = new TextView(context);
        this.removeButtonView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.removeButtonView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.removeButtonView.setText(LocaleController.getString("StickersRemove", C1010R.string.StickersRemove));
        this.removeButtonView.setTextColor(Theme.getColor("featuredStickers_removeButtonText", resourcesProvider));
        this.removeButtonView.setBackground(Theme.AdaptiveRipple.createRect(0, Theme.getColor("featuredStickers_addButton", resourcesProvider) & 452984831, 4.0f));
        this.removeButtonView.setPadding(AndroidUtilities.m35dp(12.0f), 0, AndroidUtilities.m35dp(12.0f), 0);
        this.removeButtonView.setGravity(17);
        this.removeButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickerSetCell.this.lambda$new$1(view);
            }
        });
        this.sideButtons.addView(this.removeButtonView, LayoutHelper.createFrameRelatively(-2.0f, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 0.0f, -2.0f, 0.0f, 0.0f));
        PremiumButtonView premiumButtonView = new PremiumButtonView(context, AndroidUtilities.m35dp(4.0f), false);
        this.premiumButtonView = premiumButtonView;
        premiumButtonView.setIcon(C1010R.raw.unlock_icon);
        this.premiumButtonView.setButton(LocaleController.getString("Unlock", C1010R.string.Unlock), new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickerSetCell.this.lambda$new$2(view);
            }
        });
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.premiumButtonView.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = AndroidUtilities.m35dp(1.0f);
            marginLayoutParams.topMargin = AndroidUtilities.m35dp(1.0f);
            int m35dp = AndroidUtilities.m35dp(20.0f);
            marginLayoutParams.height = m35dp;
            marginLayoutParams.width = m35dp;
            ((ViewGroup.MarginLayoutParams) this.premiumButtonView.getTextView().getLayoutParams()).leftMargin = AndroidUtilities.m35dp(3.0f);
            this.premiumButtonView.getChildAt(0).setPadding(AndroidUtilities.m35dp(8.0f), 0, AndroidUtilities.m35dp(8.0f), 0);
        } catch (Exception unused) {
        }
        this.sideButtons.addView(this.premiumButtonView, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, (LocaleController.isRTL ? 3 : 5) | 16));
        this.sideButtons.setPadding(AndroidUtilities.m35dp(10.0f), 0, AndroidUtilities.m35dp(10.0f), 0);
        addView(this.sideButtons, LayoutHelper.createFrame(-2, -1.0f, LocaleController.isRTL ? 3 : 5, 0.0f, 0.0f, 0.0f, 0.0f));
        this.sideButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickerSetCell.this.lambda$new$3(view);
            }
        });
        TextView textView3 = new TextView(this, context) {
            @Override
            public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(14.0f), false), bufferType);
            }
        };
        this.textView = textView3;
        NotificationCenter.listenEmojiLoading(textView3);
        this.textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(this.textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 9.0f, 70.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.valueTextView = textView4;
        textView4.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
        this.valueTextView.setTextSize(1, 13.0f);
        this.valueTextView.setLines(1);
        this.valueTextView.setMaxLines(1);
        this.valueTextView.setSingleLine(true);
        this.valueTextView.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(this.valueTextView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 32.0f, 70.0f, 0.0f));
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
        } else if (this.addButtonView.getVisibility() == 0 && this.addButtonView.isEnabled()) {
            this.addButtonView.performClick();
        } else if (this.removeButtonView.getVisibility() == 0 && this.removeButtonView.isEnabled()) {
            this.removeButtonView.performClick();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(58.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setNeedDivider(boolean z) {
        this.needDivider = z;
    }

    public void setStickersSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, boolean z) {
        setStickersSet(tLRPC$TL_messages_stickerSet, z, false);
    }

    public void setSearchQuery(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, String str, Theme.ResourcesProvider resourcesProvider) {
        TLRPC$StickerSet tLRPC$StickerSet = tLRPC$TL_messages_stickerSet.set;
        String str2 = tLRPC$StickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(tLRPC$StickerSet.title);
            spannableString.setSpan(new ForegroundColorSpanThemable("windowBackgroundWhiteBlueText4", resourcesProvider), indexOf, str.length() + indexOf, 0);
            this.textView.setText(spannableString);
        }
        int indexOf2 = tLRPC$StickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            String str3 = tLRPC$StickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = indexOf2 + str3.length();
            SpannableString spannableString2 = new SpannableString(str3 + tLRPC$StickerSet.short_name);
            spannableString2.setSpan(new ForegroundColorSpanThemable("windowBackgroundWhiteBlueText4", resourcesProvider), length, str.length() + length, 0);
            this.valueTextView.setText(spannableString2);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public void setStickersSet(TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet, boolean z, boolean z2) {
        ImageLocation forSticker;
        this.needDivider = z;
        this.stickersSet = tLRPC$TL_messages_stickerSet;
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
        boolean z3 = tLRPC$TL_messages_stickerSet.set.emojis;
        this.emojis = z3;
        this.sideButtons.setVisibility(z3 ? 0 : 8);
        this.optionsButton.setVisibility(this.emojis ? 8 : 0);
        TLRPC$Document tLRPC$Document = null;
        this.imageView.setColorFilter(null);
        ArrayList<TLRPC$Document> arrayList = tLRPC$TL_messages_stickerSet.documents;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.valueTextView.setText(LocaleController.formatPluralString(this.emojis ? "EmojiCount" : "Stickers", arrayList.size(), new Object[0]));
            int i = 0;
            while (true) {
                if (i < arrayList.size()) {
                    TLRPC$Document tLRPC$Document2 = arrayList.get(i);
                    if (tLRPC$Document2 != null && tLRPC$Document2.f856id == tLRPC$TL_messages_stickerSet.set.thumb_document_id) {
                        tLRPC$Document = tLRPC$Document2;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            if (tLRPC$Document == null) {
                tLRPC$Document = arrayList.get(0);
            }
            TLRPC$Document tLRPC$Document3 = tLRPC$Document;
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_messages_stickerSet.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = tLRPC$Document3;
            }
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$TL_messages_stickerSet.set.thumbs, "windowBackgroundGray", 1.0f);
            boolean z4 = closestPhotoSizeWithSize instanceof TLRPC$Document;
            if (z4) {
                forSticker = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Document3.thumbs, 90), tLRPC$Document3);
            } else {
                forSticker = ImageLocation.getForSticker((TLRPC$PhotoSize) closestPhotoSizeWithSize, tLRPC$Document3, tLRPC$TL_messages_stickerSet.set.thumb_version);
            }
            ImageLocation imageLocation = forSticker;
            if ((z4 && MessageObject.isAnimatedStickerDocument(tLRPC$Document3, true)) || MessageObject.isVideoSticker(tLRPC$Document3)) {
                if (svgThumb != null) {
                    this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document3), "50_50", svgThumb, 0, tLRPC$TL_messages_stickerSet);
                } else {
                    this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document3), "50_50", imageLocation, (String) null, 0, tLRPC$TL_messages_stickerSet);
                }
                if (MessageObject.isTextColorEmoji(tLRPC$Document3)) {
                    this.imageView.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
                }
            } else if (imageLocation != null && imageLocation.imageType == 1) {
                this.imageView.setImage(imageLocation, "50_50", "tgs", svgThumb, tLRPC$TL_messages_stickerSet);
            } else {
                this.imageView.setImage(imageLocation, "50_50", "webp", svgThumb, tLRPC$TL_messages_stickerSet);
            }
        } else {
            this.valueTextView.setText(LocaleController.formatPluralString(tLRPC$TL_messages_stickerSet.set.emojis ? "EmojiCount" : "Stickers", 0, new Object[0]));
            this.imageView.setImageDrawable(null);
        }
        if (z2) {
            TextView textView = this.valueTextView;
            StringBuilder sb = new StringBuilder();
            sb.append(tLRPC$TL_messages_stickerSet.set.emojis ? "t.me/addemoji/" : "t.me/addstickers/");
            sb.append(tLRPC$TL_messages_stickerSet.set.short_name);
            textView.setText(sb.toString());
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

    public void setChecked(final boolean z, boolean z2) {
        int i = this.option;
        if (i == 1) {
            this.checkBox.setChecked(z, z2);
            return;
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
            if (z) {
                return;
            }
            this.sideButtons.setScaleX(0.1f);
            this.sideButtons.setScaleY(0.1f);
        } else if (i == 3) {
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
            if (z) {
                return;
            }
            this.optionsButton.setScaleX(0.1f);
            this.optionsButton.setScaleY(0.1f);
        }
    }

    public void setReorderable(boolean z) {
        setReorderable(z, true);
    }

    public void setReorderable(final boolean z, boolean z2) {
        if (this.option == 1) {
            float[] fArr = new float[2];
            fArr[0] = z ? 1.0f : 0.0f;
            fArr[1] = z ? 0.0f : 1.0f;
            float[] fArr2 = new float[2];
            fArr2[0] = z ? 1.0f : 0.66f;
            fArr2[1] = z ? 0.66f : 1.0f;
            if (z2) {
                this.reorderButton.setVisibility(0);
                ViewPropertyAnimator duration = this.reorderButton.animate().alpha(fArr[0]).scaleX(fArr2[0]).scaleY(fArr2[0]).setDuration(200L);
                Interpolator interpolator = Easings.easeOutSine;
                duration.setInterpolator(interpolator).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        StickerSetCell.this.lambda$setReorderable$4(z);
                    }
                }).start();
                if (this.emojis) {
                    this.sideButtons.setVisibility(0);
                    this.sideButtons.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(interpolator).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            StickerSetCell.this.lambda$setReorderable$5(z);
                        }
                    }).start();
                    return;
                }
                this.optionsButton.setVisibility(0);
                this.optionsButton.animate().alpha(fArr[1]).scaleX(fArr2[1]).scaleY(fArr2[1]).setDuration(200L).setInterpolator(interpolator).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        StickerSetCell.this.lambda$setReorderable$6(z);
                    }
                }).start();
                return;
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

    public void lambda$setReorderable$4(boolean z) {
        if (z) {
            return;
        }
        this.reorderButton.setVisibility(8);
    }

    public void lambda$setReorderable$5(boolean z) {
        if (z) {
            this.sideButtons.setVisibility(8);
        }
    }

    public void lambda$setReorderable$6(boolean z) {
        if (z) {
            this.optionsButton.setVisibility(8);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
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

    public TLRPC$TL_messages_stickerSet getStickersSet() {
        return this.stickersSet;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout;
        ImageView imageView;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && getBackground() != null && (imageView = this.optionsButton) != null) {
            imageView.getHitRect(this.rect);
            if (this.rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        if (i >= 21 && getBackground() != null && this.emojis && (frameLayout = this.sideButtons) != null) {
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.m35dp(71.0f), getHeight() - 1, (getWidth() - getPaddingRight()) - (LocaleController.isRTL ? AndroidUtilities.m35dp(71.0f) : 0), getHeight() - 1, Theme.dividerPaint);
        }
    }

    public void updateRightMargin() {
        this.sideButtons.measure(View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(58.0f), 1073741824));
        int measuredWidth = this.sideButtons.getMeasuredWidth();
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).leftMargin = measuredWidth;
            ((ViewGroup.MarginLayoutParams) this.valueTextView.getLayoutParams()).leftMargin = measuredWidth;
            return;
        }
        ((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams()).rightMargin = measuredWidth;
        ((ViewGroup.MarginLayoutParams) this.valueTextView.getLayoutParams()).rightMargin = measuredWidth;
    }

    public void updateButtonState(final int i, boolean z) {
        AnimatorSet animatorSet = this.stateAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.stateAnimator = null;
        }
        if (i == 1) {
            this.premiumButtonView.setButton(LocaleController.getString("Unlock", C1010R.string.Unlock), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StickerSetCell.this.lambda$updateButtonState$7(view);
                }
            });
        } else if (i == 2) {
            this.premiumButtonView.setButton(LocaleController.getString("Restore", C1010R.string.Restore), new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StickerSetCell.this.lambda$updateButtonState$8(view);
                }
            });
        }
        this.premiumButtonView.setEnabled(i == 1 || i == 2);
        this.addButtonView.setEnabled(i == 3);
        this.removeButtonView.setEnabled(i == 4);
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.stateAnimator = animatorSet2;
            Animator[] animatorArr = new Animator[9];
            PremiumButtonView premiumButtonView = this.premiumButtonView;
            Property property = FrameLayout.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = (i == 1 || i == 2) ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(premiumButtonView, property, fArr);
            PremiumButtonView premiumButtonView2 = this.premiumButtonView;
            Property property2 = FrameLayout.SCALE_X;
            float[] fArr2 = new float[1];
            fArr2[0] = (i == 1 || i == 2) ? 1.0f : 0.6f;
            animatorArr[1] = ObjectAnimator.ofFloat(premiumButtonView2, property2, fArr2);
            PremiumButtonView premiumButtonView3 = this.premiumButtonView;
            Property property3 = FrameLayout.SCALE_Y;
            float[] fArr3 = new float[1];
            fArr3[0] = (i == 1 || i == 2) ? 1.0f : 0.6f;
            animatorArr[2] = ObjectAnimator.ofFloat(premiumButtonView3, property3, fArr3);
            TextView textView = this.addButtonView;
            Property property4 = FrameLayout.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = i == 3 ? 1.0f : 0.0f;
            animatorArr[3] = ObjectAnimator.ofFloat(textView, property4, fArr4);
            TextView textView2 = this.addButtonView;
            Property property5 = FrameLayout.SCALE_X;
            float[] fArr5 = new float[1];
            fArr5[0] = i == 3 ? 1.0f : 0.6f;
            animatorArr[4] = ObjectAnimator.ofFloat(textView2, property5, fArr5);
            TextView textView3 = this.addButtonView;
            Property property6 = FrameLayout.SCALE_Y;
            float[] fArr6 = new float[1];
            fArr6[0] = i == 3 ? 1.0f : 0.6f;
            animatorArr[5] = ObjectAnimator.ofFloat(textView3, property6, fArr6);
            TextView textView4 = this.removeButtonView;
            Property property7 = FrameLayout.ALPHA;
            float[] fArr7 = new float[1];
            fArr7[0] = i == 4 ? 1.0f : 0.0f;
            animatorArr[6] = ObjectAnimator.ofFloat(textView4, property7, fArr7);
            TextView textView5 = this.removeButtonView;
            Property property8 = FrameLayout.SCALE_X;
            float[] fArr8 = new float[1];
            fArr8[0] = i == 4 ? 1.0f : 0.6f;
            animatorArr[7] = ObjectAnimator.ofFloat(textView5, property8, fArr8);
            TextView textView6 = this.removeButtonView;
            Property property9 = FrameLayout.SCALE_Y;
            float[] fArr9 = new float[1];
            fArr9[0] = i == 4 ? 1.0f : 0.6f;
            animatorArr[8] = ObjectAnimator.ofFloat(textView6, property9, fArr9);
            animatorSet2.playTogether(animatorArr);
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
                    StickerSetCell.this.removeButtonView.setVisibility(i == 4 ? 0 : 8);
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
        this.removeButtonView.setVisibility(i != 4 ? 8 : 0);
        updateRightMargin();
    }

    public void lambda$updateButtonState$7(View view) {
        onPremiumButtonClick();
    }

    public void lambda$updateButtonState$8(View view) {
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
}
