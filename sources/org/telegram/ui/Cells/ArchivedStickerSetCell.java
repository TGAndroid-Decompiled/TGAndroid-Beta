package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArchivedStickersActivity;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.ViewHelper;

public final class ArchivedStickerSetCell extends FrameLayout implements Checkable {
    public final ProgressButton addButton;
    public AnimatorSet animatorSet;
    public final boolean checkable;
    public boolean checked;
    public ProgressButton currentButton;
    public final ProgressButton deleteButton;
    public final BackupImageView imageView;
    public boolean needDivider;
    public OnCheckedChangeListener onCheckedChangeListener;
    public TLRPC.StickerSetCovered stickersSet;
    public final TextView textView;
    public final TextView valueTextView;

    public interface OnCheckedChangeListener {
    }

    public ArchivedStickerSetCell(Context context, boolean z) {
        super(context);
        this.checkable = z;
        if (z) {
            ProgressButton progressButton = new ProgressButton(context);
            this.addButton = progressButton;
            this.currentButton = progressButton;
            progressButton.setText(LocaleController.getString(R.string.Add));
            progressButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            progressButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
            int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
            Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            progressButton.setBackgroundRoundRect(14.0f, color);
            addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int iDp = AndroidUtilities.dp(60.0f);
            ProgressButton progressButton2 = new ProgressButton(context);
            this.deleteButton = progressButton2;
            progressButton2.setAllCaps(false);
            progressButton2.setMinWidth(iDp);
            progressButton2.setMinimumWidth(iDp);
            progressButton2.setTextSize(1, 14.0f);
            int i = Theme.key_featuredStickers_removeButtonText;
            progressButton2.setTextColor(Theme.getColor(null, i, false));
            progressButton2.setText(LocaleController.getString(R.string.StickersRemove));
            progressButton2.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(3.0f), Theme.getColor(null, i, false)));
            progressButton2.setTypeface(AndroidUtilities.bold());
            ViewHelper.setPadding(progressButton2, 8.0f, 0.0f, 8.0f, 0.0f);
            progressButton2.setOutlineProvider(null);
            addView(progressButton2, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            CallLogActivity$$ExternalSyntheticLambda38 callLogActivity$$ExternalSyntheticLambda38 = new CallLogActivity$$ExternalSyntheticLambda38(this, 20);
            progressButton.setOnClickListener(callLogActivity$$ExternalSyntheticLambda38);
            progressButton2.setOnClickListener(callLogActivity$$ExternalSyntheticLambda38);
            syncButtons(false);
        } else {
            this.addButton = null;
            this.deleteButton = null;
        }
        TextView textView = new TextView(context);
        this.textView = textView;
        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(textView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        zzkp.m(13.0f, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), textView2);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(LayoutHelper.getAbsoluteGravityStart());
        addView(textView2, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        backupImageView.setAspectFit(true);
        backupImageView.setLayerNum(1);
        addView(backupImageView, LayoutHelper.createFrameRelatively(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.stickersSet;
    }

    @Override
    public final boolean isChecked() {
        return this.checked;
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (this.checkable && view == this.textView) {
            i2 += Math.max(this.addButton.getMeasuredWidth(), this.deleteButton.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z) {
        setChecked(z, true, true);
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public final void setStickersSet(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        this.needDivider = z;
        this.stickersSet = stickerSetCovered;
        setWillNotDraw(!z);
        this.textView.setText(this.stickersSet.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z2 = stickerSet.emojis;
        TextView textView = this.valueTextView;
        if (z2) {
            textView.setText(LocaleController.formatPluralString("EmojiCount", stickerSet.count, new Object[0]));
        } else {
            textView.setText(LocaleController.formatPluralString("Stickers", stickerSet.count, new Object[0]));
        }
        TLRPC.Document document = null;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j = stickerSetCovered.set.thumb_document_id;
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Document document2 = arrayList.get(i);
                if (document2 != null && document2.id == j) {
                    document = document2;
                    break;
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        } else {
            TLRPC.Document document3 = stickerSetCovered.cover;
            if (document3 != null) {
                document = document3;
            } else if (!stickerSetCovered.covers.isEmpty()) {
                document = stickerSetCovered.covers.get(0);
            }
        }
        BackupImageView backupImageView = this.imageView;
        if (document == null) {
            backupImageView.setImage(null, null, null, null, null, "webp", 0, stickerSetCovered);
            return;
        }
        TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(stickerSetCovered.set.thumbs, 90);
        if (closestPhotoSizeWithSize == null) {
            closestPhotoSizeWithSize = document;
        }
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.set.thumbs, Theme.key_windowBackgroundGray, 1.0f);
        boolean z3 = closestPhotoSizeWithSize instanceof TLRPC.Document;
        ImageLocation forDocument = z3 ? ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document) : ImageLocation.getForSticker((TLRPC.PhotoSize) closestPhotoSizeWithSize, document, stickerSetCovered.set.thumb_version);
        if (z3 && (MessageObject.isAnimatedStickerDocument(document, true) || MessageObject.isVideoSticker(document))) {
            if (svgThumb != null) {
                backupImageView.setImage$1(ImageLocation.getForDocument(document), "50_50", svgThumb, stickerSetCovered);
                return;
            } else {
                backupImageView.setImage(ImageLocation.getForDocument(document), "50_50", forDocument, null, null, null, 0, stickerSetCovered);
                return;
            }
        }
        if (forDocument == null || forDocument.imageType != 1) {
            backupImageView.setImage(forDocument, "50_50", null, null, svgThumb, "webp", 0, stickerSetCovered);
        } else {
            backupImageView.setImage(forDocument, "50_50", null, null, svgThumb, "tgs", 0, stickerSetCovered);
        }
    }

    public final void syncButtons(boolean z) {
        if (this.checkable) {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z2 = this.checked;
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? 0.0f : 1.0f;
            ProgressButton progressButton = this.addButton;
            ProgressButton progressButton2 = this.deleteButton;
            if (!z) {
                progressButton2.setVisibility(z2 ? 0 : 4);
                progressButton2.setAlpha(f);
                progressButton2.setScaleX(f);
                progressButton2.setScaleY(f);
                progressButton.setVisibility(this.checked ? 4 : 0);
                progressButton.setAlpha(f2);
                progressButton.setScaleX(f2);
                progressButton.setScaleY(f2);
                return;
            }
            this.currentButton = z2 ? progressButton2 : progressButton;
            progressButton.setVisibility(0);
            progressButton2.setVisibility(0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.animatorSet;
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(progressButton2, (Property<ProgressButton, Float>) property, f);
            Property property2 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(progressButton2, (Property<ProgressButton, Float>) property2, f);
            float[] fArr = {f};
            Property property3 = View.SCALE_Y;
            animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(progressButton2, (Property<ProgressButton, Float>) property3, fArr), ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property, f2), ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property2, f2), ObjectAnimator.ofFloat(progressButton, (Property<ProgressButton, Float>) property3, f2));
            this.animatorSet.addListener(new ArticleViewer.AnonymousClass25(this, 11));
            this.animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
            this.animatorSet.start();
        }
    }

    @Override
    public final void toggle() {
        if (this.checkable) {
            setChecked(!this.checked);
        }
    }

    public final void setChecked(boolean z, boolean z2, boolean z3) {
        OnCheckedChangeListener onCheckedChangeListener;
        if (!this.checkable || this.checked == z) {
            return;
        }
        this.checked = z;
        syncButtons(z2);
        if (!z3 || (onCheckedChangeListener = this.onCheckedChangeListener) == null) {
            return;
        }
        ArticleViewer$$ExternalSyntheticLambda16 articleViewer$$ExternalSyntheticLambda16 = (ArticleViewer$$ExternalSyntheticLambda16) onCheckedChangeListener;
        ArchivedStickersActivity archivedStickersActivity = ArchivedStickersActivity.this;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) articleViewer$$ExternalSyntheticLambda16.f$1;
        if (z) {
            setChecked(false, false, false);
            long j = stickerSetCovered.set.id;
            LongSparseArray longSparseArray = archivedStickersActivity.installingStickerSets;
            if (longSparseArray.indexOfKey(j) >= 0) {
                return;
            }
            ProgressButton progressButton = this.addButton;
            if (progressButton != null) {
                progressButton.setDrawProgress(true, true);
            }
            longSparseArray.put(stickerSetCovered, stickerSetCovered.set.id);
        }
        MediaDataController.getInstance(((BaseFragment) archivedStickersActivity).currentAccount).toggleStickerSet(archivedStickersActivity.getParentActivity(), stickerSetCovered, !z ? 1 : 2, archivedStickersActivity, false, false);
    }
}
