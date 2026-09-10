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
public final class pd0 extends FrameLayout {
    public Bitmap f26103a;
    public HashMap f26104b;
    public boolean f26105c;
    public BitmapDrawable d;
    public boolean e;

    public pd0(Context context) {
        super(context);
        this.e = true;
    }

    public final void a() {
        this.f26103a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.f26104b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    public final void b(ArrayList arrayList, boolean z10, boolean z11, boolean z12) {
        w9 w9Var;
        int i10;
        int i11;
        int i12;
        setClipChildren(z12);
        a();
        this.f26104b = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i13);
                byte b10 = mediaEntity.type;
                if (b10 == 0) {
                    w9 w9Var2 = new w9(getContext());
                    w9Var2.setLayerNum(12);
                    w9Var2.setAspectFit(true);
                    ImageReceiver imageReceiver = w9Var2.getImageReceiver();
                    if (z10) {
                        imageReceiver.setAllowDecodeSingleFrame(true);
                        imageReceiver.setAllowStartLottieAnimation(false);
                        if (z11) {
                            imageReceiver.setDelegate(new q2(21));
                        }
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(mediaEntity.document), null, null, null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(mediaEntity.document.thumbs, 90), mediaEntity.document), null, null, 0L, "webp", mediaEntity.parentObject, 1);
                    if ((2 & mediaEntity.subType) != 0) {
                        w9Var2.setScaleX(-1.0f);
                    }
                    mediaEntity.view = w9Var2;
                    w9Var = w9Var2;
                } else if (b10 == 1) {
                    pg.b bVar = new pg.b(getContext());
                    bVar.setBackgroundColor(0);
                    bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
                    bVar.setTextSize(0, mediaEntity.fontSize);
                    bVar.setTypeface(mediaEntity.textTypeface.d());
                    SpannableString spannableString = new SpannableString(Emoji.replaceEmoji(mediaEntity.text, bVar.getPaint().getFontMetricsInt(), false));
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i14);
                        i14++;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        y5 y5Var = new y5(emojiEntity2.document_id, bVar.getPaint().getFontMetricsInt());
                        int i15 = emojiEntity2.offset;
                        spannableString.setSpan(y5Var, i15, emojiEntity2.length + i15, 33);
                    }
                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannableString.getSpans(0, spannableString.length(), Emoji.EmojiSpan.class);
                    if (emojiSpanArr != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    bVar.setText(spannableString);
                    int i16 = 17;
                    bVar.setGravity(17);
                    int i17 = mediaEntity.textAlign;
                    if (i17 != 1) {
                        i10 = 2;
                        if (i17 != 2) {
                            i16 = 19;
                        } else {
                            i16 = 21;
                        }
                    } else {
                        i10 = 2;
                    }
                    bVar.setGravity(i16);
                    int i18 = Build.VERSION.SDK_INT;
                    int i19 = mediaEntity.textAlign;
                    if (i19 != 1) {
                        int i20 = 3;
                        if (i19 == i10 ? LocaleController.isRTL : !LocaleController.isRTL) {
                            i20 = 2;
                        }
                        i11 = i20;
                    } else {
                        i11 = 4;
                    }
                    bVar.setTextAlignment(i11);
                    bVar.setHorizontallyScrolling(false);
                    bVar.setImeOptions(268435456);
                    bVar.setFocusableInTouchMode(true);
                    bVar.setEnabled(false);
                    bVar.setInputType(bVar.getInputType() | 16384);
                    if (i18 >= 23) {
                        bVar.setBreakStrategy(0);
                    }
                    bVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i21 = mediaEntity.color;
                    byte b11 = mediaEntity.subType;
                    int i22 = -1;
                    if (b11 == 0) {
                        bVar.setFrameColor(i21);
                        i21 = AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1;
                    } else if (b11 == 1) {
                        if (AndroidUtilities.computePerceivedBrightness(i21) >= 0.25f) {
                            i12 = -1728053248;
                        } else {
                            i12 = -1711276033;
                        }
                        bVar.setFrameColor(i12);
                    } else if (b11 == 2) {
                        if (AndroidUtilities.computePerceivedBrightness(i21) >= 0.25f) {
                            i22 = -16777216;
                        }
                        bVar.setFrameColor(i22);
                    } else {
                        bVar.setFrameColor(0);
                    }
                    bVar.setTextColor(i21);
                    bVar.setCursorColor(i21);
                    bVar.setHandlesColor(i21);
                    bVar.setHighlightColor(org.telegram.ui.ActionBar.j6.l1(0.4f, i21));
                    mediaEntity.view = bVar;
                    w9Var = bVar;
                } else {
                    w9Var = null;
                }
                if (w9Var != null) {
                    addView(w9Var);
                    w9Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                    this.f26104b.put(w9Var, mediaEntity);
                }
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.e) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public Bitmap getBitmap() {
        return this.f26103a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / AndroidUtilities.dp(120.0f), measuredHeight / AndroidUtilities.dp(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f7 = 1.0f / max;
        canvas.scale(f7, f7);
        draw(canvas);
        return createBitmap;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int measuredHeight;
        if (this.f26104b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.f26104b.get(childAt);
                if (mediaEntity != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof pg.b) {
                        if (mediaEntity.customTextView) {
                            i14 = ((int) (((mediaEntity.width / 2.0f) + mediaEntity.f14669x) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (((mediaEntity.height / 2.0f) + mediaEntity.f14670y) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i14 = ((int) (measuredWidth * mediaEntity.textViewX)) - (childAt.getMeasuredWidth() / 2);
                            i16 = (int) (measuredHeight2 * mediaEntity.textViewY);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i15 = i16 - measuredHeight;
                    } else {
                        i14 = (int) (measuredWidth * mediaEntity.f14669x);
                        i15 = (int) (measuredHeight2 * mediaEntity.f14670y);
                    }
                    childAt.layout(i14, i15, measuredWidth2 + i14, measuredHeight3 + i15);
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.f26105c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        if (this.f26104b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.f26104b.get(childAt);
                if (mediaEntity != null) {
                    if (childAt instanceof pg.b) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        if (mediaEntity.customTextView) {
                            f7 = (mediaEntity.width * getMeasuredWidth()) / mediaEntity.viewWidth;
                        } else {
                            f7 = mediaEntity.scale * ((mediaEntity.textViewWidth * measuredWidth) / mediaEntity.viewWidth);
                        }
                        childAt.setScaleX(f7);
                        childAt.setScaleY(f7);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mediaEntity.width), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mediaEntity.height), 1073741824));
                    }
                }
            }
        }
        this.f26105c = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f26105c) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f7));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f7);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.f26103a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }
}
