package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.VideoEditedInfo;

public final class rc0 extends FrameLayout {

    public Bitmap f32128a;

    public HashMap f32129b;

    public boolean f32130c;
    public BitmapDrawable d;

    public boolean f32131e;

    public rc0(Context context) {
        super(context);
        this.f32131e = true;
    }

    public final void a() {
        this.f32128a = null;
        this.d = null;
        setBackground(null);
        HashMap map = this.f32129b;
        if (map != null) {
            map.clear();
        }
        removeAllViews();
    }

    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        View view;
        int i10;
        int i11;
        setClipChildren(z12);
        a();
        this.f32129b = new HashMap();
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i12);
            byte b10 = mediaEntity.type;
            if (b10 == 0) {
                n9 n9Var = new n9(getContext());
                n9Var.setLayerNum(12);
                n9Var.setAspectFit(true);
                ImageReceiver imageReceiver = n9Var.getImageReceiver();
                if (z10) {
                    imageReceiver.setAllowDecodeSingleFrame(true);
                    imageReceiver.setAllowStartLottieAnimation(false);
                    if (z11) {
                        imageReceiver.setDelegate(new pc0(0));
                    }
                }
                imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), null, null, null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), null, null, 0L, "webp", mediaEntity.parentObject, 1);
                if ((2 & mediaEntity.subType) != 0) {
                    n9Var.setScaleX(-1.0f);
                }
                mediaEntity.view = n9Var;
                view = n9Var;
            } else if (b10 == 1) {
                qc0 qc0Var = new qc0(getContext());
                qc0Var.setBackgroundColor(0);
                qc0Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                qc0Var.setTextSize(0, mediaEntity.fontSize);
                qc0Var.setTypeface(mediaEntity.textTypeface.d());
                SpannableString spannableString = new SpannableString(Emoji.replaceEmoji(mediaEntity.text, qc0Var.getPaint().getFontMetricsInt(), false));
                ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i13);
                    i13++;
                    VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                    t5 t5Var = new t5(emojiEntity2.document_id, qc0Var.getPaint().getFontMetricsInt());
                    int i14 = emojiEntity2.offset;
                    spannableString.setSpan(t5Var, i14, emojiEntity2.length + i14, 33);
                }
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
                if (emojiSpanArr != null) {
                    for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                        emojiSpan.scale = 0.85f;
                    }
                }
                qc0Var.setText(spannableString);
                int i15 = 17;
                qc0Var.setGravity(17);
                int i16 = mediaEntity.textAlign;
                if (i16 != 1) {
                    i10 = 2;
                    i15 = i16 != 2 ? 19 : 21;
                } else {
                    i10 = 2;
                }
                qc0Var.setGravity(i15);
                int i17 = Build.VERSION.SDK_INT;
                int i18 = mediaEntity.textAlign;
                if (i18 != 1) {
                    int i19 = 3;
                    if (i18 == i10 ? LocaleController.isRTL : !LocaleController.isRTL) {
                        i19 = 2;
                    }
                    i11 = i19;
                } else {
                    i11 = 4;
                }
                qc0Var.setTextAlignment(i11);
                qc0Var.setHorizontallyScrolling(false);
                qc0Var.setImeOptions(268435456);
                qc0Var.setFocusableInTouchMode(true);
                qc0Var.setEnabled(false);
                qc0Var.setInputType(qc0Var.getInputType() | 16384);
                if (i17 >= 23) {
                    qc0Var.setBreakStrategy(0);
                }
                qc0Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                int i20 = mediaEntity.color;
                byte b11 = mediaEntity.subType;
                if (b11 == 0) {
                    qc0Var.setFrameColor(i20);
                    i20 = AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1;
                } else if (b11 == 1) {
                    qc0Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i20) >= 0.25f ? -1728053248 : -1711276033);
                } else if (b11 == 2) {
                    qc0Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i20) >= 0.25f ? -16777216 : -1);
                } else {
                    qc0Var.setFrameColor(0);
                }
                qc0Var.setTextColor(i20);
                qc0Var.setCursorColor(i20);
                qc0Var.setHandlesColor(i20);
                qc0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.l1(0.4f, i20));
                mediaEntity.view = qc0Var;
                view = qc0Var;
            } else {
                view = null;
            }
            if (view != null) {
                addView(view);
                view.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
                this.f32129b.put(view, mediaEntity);
            }
        }
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.f32131e) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public Bitmap getBitmap() {
        return this.f32128a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float fMax = Math.max(measuredWidth / AndroidUtilities.dp(120.0f), measuredHeight / AndroidUtilities.dp(120.0f));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (measuredWidth / fMax), (int) (measuredHeight / fMax), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f10 = 1.0f / fMax;
        canvas.scale(f10, f10);
        draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int i14;
        int i15;
        int measuredHeight;
        if (this.f32129b != null) {
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.f32129b.get(childAt);
                if (mediaEntity != null) {
                    int measuredWidth3 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof zf.b) {
                        if (mediaEntity.customTextView) {
                            measuredWidth = ((int) (((mediaEntity.width / 2.0f) + mediaEntity.f19646x) * measuredWidth2)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((mediaEntity.height / 2.0f) + mediaEntity.f19647y) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            measuredWidth = ((int) (measuredWidth2 * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * mediaEntity.textViewY);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        measuredWidth = (int) (measuredWidth2 * mediaEntity.f19646x);
                        i14 = (int) (measuredHeight2 * mediaEntity.f19647y);
                    }
                    childAt.layout(measuredWidth, i14, measuredWidth3 + measuredWidth, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f32130c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        if (this.f32129b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.f32129b.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof zf.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        float measuredWidth2 = mediaEntity.customTextView ? (mediaEntity.width * getMeasuredWidth()) / mediaEntity.viewWidth : mediaEntity.scale * ((mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mediaEntity.width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mediaEntity.height), 1073741824));
                    }
                }
            }
        }
        this.f32130c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f32130c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f10));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f10);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f32128a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
