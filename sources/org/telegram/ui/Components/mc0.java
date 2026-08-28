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
public final class mc0 extends FrameLayout {
    public Bitmap f30791a;
    public HashMap f30792b;
    public boolean f30793c;
    public BitmapDrawable d;
    public boolean f30794e;

    public mc0(Context context) {
        super(context);
        this.f30794e = true;
    }

    public final void a() {
        this.f30791a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.f30792b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        o9 o9Var;
        int i9;
        int i10;
        int i11;
        setClipChildren(z12);
        a();
        this.f30792b = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i12);
                byte b10 = mediaEntity.type;
                if (b10 == 0) {
                    o9 o9Var2 = new o9(getContext());
                    o9Var2.setLayerNum(12);
                    o9Var2.setAspectFit(true);
                    ImageReceiver imageReceiver = o9Var2.getImageReceiver();
                    if (z10) {
                        imageReceiver.setAllowDecodeSingleFrame(true);
                        imageReceiver.setAllowStartLottieAnimation(false);
                        if (z11) {
                            imageReceiver.setDelegate(new g2(25));
                        }
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), null, null, null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), null, null, 0L, "webp", mediaEntity.parentObject, 1);
                    if ((2 & mediaEntity.subType) != 0) {
                        o9Var2.setScaleX(-1.0f);
                    }
                    mediaEntity.view = o9Var2;
                    o9Var = o9Var2;
                } else if (b10 == 1) {
                    yf.b bVar = new yf.b(getContext());
                    bVar.setBackgroundColor(0);
                    bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                    bVar.setTextSize(0, mediaEntity.fontSize);
                    bVar.setTypeface(mediaEntity.textTypeface.d());
                    SpannableString spannableString = new SpannableString(Emoji.replaceEmoji(mediaEntity.text, bVar.getPaint().getFontMetricsInt(), false));
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i13);
                        i13++;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        t5 t5Var = new t5(emojiEntity2.document_id, bVar.getPaint().getFontMetricsInt());
                        int i14 = emojiEntity2.offset;
                        spannableString.setSpan(t5Var, i14, emojiEntity2.length + i14, 33);
                    }
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
                    if (emojiSpanArr != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    bVar.setText(spannableString);
                    int i15 = 17;
                    bVar.setGravity(17);
                    int i16 = mediaEntity.textAlign;
                    if (i16 != 1) {
                        i9 = 2;
                        if (i16 != 2) {
                            i15 = 19;
                        } else {
                            i15 = 21;
                        }
                    } else {
                        i9 = 2;
                    }
                    bVar.setGravity(i15);
                    int i17 = Build.VERSION.SDK_INT;
                    int i18 = mediaEntity.textAlign;
                    if (i18 != 1) {
                        int i19 = 3;
                        if (i18 == i9 ? LocaleController.isRTL : !LocaleController.isRTL) {
                            i19 = 2;
                        }
                        i10 = i19;
                    } else {
                        i10 = 4;
                    }
                    bVar.setTextAlignment(i10);
                    bVar.setHorizontallyScrolling(false);
                    bVar.setImeOptions(268435456);
                    bVar.setFocusableInTouchMode(true);
                    bVar.setEnabled(false);
                    bVar.setInputType(bVar.getInputType() | 16384);
                    if (i17 >= 23) {
                        bVar.setBreakStrategy(0);
                    }
                    bVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i20 = mediaEntity.color;
                    byte b11 = mediaEntity.subType;
                    int i21 = -1;
                    if (b11 == 0) {
                        bVar.setFrameColor(i20);
                        i20 = AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1;
                    } else if (b11 == 1) {
                        if (AndroidUtilities.computePerceivedBrightness(i20) >= 0.25f) {
                            i11 = -1728053248;
                        } else {
                            i11 = -1711276033;
                        }
                        bVar.setFrameColor(i11);
                    } else if (b11 == 2) {
                        if (AndroidUtilities.computePerceivedBrightness(i20) >= 0.25f) {
                            i21 = -16777216;
                        }
                        bVar.setFrameColor(i21);
                    } else {
                        bVar.setFrameColor(0);
                    }
                    bVar.setTextColor(i20);
                    bVar.setCursorColor(i20);
                    bVar.setHandlesColor(i20);
                    bVar.setHighlightColor(org.telegram.ui.ActionBar.f6.l1(0.4f, i20));
                    mediaEntity.view = bVar;
                    o9Var = bVar;
                } else {
                    o9Var = null;
                }
                if (o9Var != null) {
                    addView(o9Var);
                    o9Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    this.f30792b.put(o9Var, mediaEntity);
                }
            }
        }
    }

    public final void c() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setVisibility(0);
        }
        setBackground(this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.f30794e) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public Bitmap getBitmap() {
        return this.f30791a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / AndroidUtilities.dp(120.0f), measuredHeight / AndroidUtilities.dp(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = 1.0f / max;
        canvas.scale(f10, f10);
        draw(canvas);
        return createBitmap;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int measuredHeight;
        if (this.f30792b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.f30792b.get(childAt);
                if (mediaEntity != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof yf.b) {
                        if (mediaEntity.customTextView) {
                            i13 = ((int) (((mediaEntity.width / 2.0f) + mediaEntity.f19673x) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (((mediaEntity.height / 2.0f) + mediaEntity.f19674y) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i13 = ((int) (measuredWidth * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                            i15 = (int) (measuredHeight2 * mediaEntity.textViewY);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i14 = i15 - measuredHeight;
                    } else {
                        i13 = (int) (measuredWidth * mediaEntity.f19673x);
                        i14 = (int) (measuredHeight2 * mediaEntity.f19674y);
                    }
                    childAt.layout(i13, i14, measuredWidth2 + i13, measuredHeight3 + i14);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        this.f30793c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        if (this.f30792b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.f30792b.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof yf.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (mediaEntity.customTextView) {
                            f10 = (mediaEntity.width * getMeasuredWidth()) / mediaEntity.viewWidth;
                        } else {
                            f10 = mediaEntity.scale * ((mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth);
                        }
                        childAt.setScaleX(f10);
                        childAt.setScaleY(f10);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mediaEntity.width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mediaEntity.height), 1073741824));
                    }
                }
            }
        }
        this.f30793c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f30793c) {
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
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f10);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f30791a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
