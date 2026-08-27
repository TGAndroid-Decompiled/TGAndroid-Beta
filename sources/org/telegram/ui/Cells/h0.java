package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.sp;

public abstract class h0 extends View {
    public final ImageReceiver A;
    public boolean B;
    public boolean C;
    public final int D;
    public boolean E;
    public final z F;
    public int G;

    public StaticLayout f24411a;

    public String f24412b;

    public String f24413c;
    public String d;

    public int f24414e;

    public int f24415f;
    public int h;

    public int f24416n;

    public q80 f24417r;

    public final m80 f24418s;
    public f0 v;

    public final int f24419w;

    public final org.telegram.ui.ActionBar.c6 f24420x;

    public int f24421y;

    public h0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24418s = new m80(this);
        this.D = AndroidUtilities.dp(4.0f);
        this.f24419w = i10;
        this.f24420x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.G = i11;
        z zVarY = org.telegram.ui.ActionBar.g6.Y(iV0, i11, i11);
        this.F = zVarY;
        zVarY.setCallback(this);
    }

    public final void a() {
        if (this.f24417r != null) {
            this.f24417r = null;
        }
        this.f24418s.d(true);
        invalidate();
    }

    public final void b(boolean z10, long j10, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        char c10;
        float f10;
        float f11;
        int iDp;
        int iDp2;
        int iMin;
        int i10;
        int iDp3;
        String[] strArrSplit;
        SpannableStringBuilder spannableStringBuilder;
        String string;
        int i11;
        boolean z11;
        int iDp4;
        int i12;
        int lineCount;
        boolean z12 = tLObject != null;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z12) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.f24412b) && TextUtils.equals(this.f24413c, str2) && this.B == z12) {
            return;
        }
        boolean z13 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j10 != 0;
        boolean z14 = z12 || z13;
        this.B = z14;
        this.C = !zIsEmpty || z13;
        ImageReceiver imageReceiver = this.A;
        if (!z13) {
            if (z14) {
                String keyForParentObject = FileRefController.getKeyForParentObject(botInfo);
                if (!Objects.equals(this.d, keyForParentObject)) {
                    this.d = keyForParentObject;
                    if (tLObject instanceof TLRPC.TL_photo) {
                        TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                        imageReceiver.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 400), photo), "400_400", null, "jpg", botInfo, 0);
                    } else {
                        if (tLObject instanceof TLRPC.Document) {
                            TLRPC.Document document = (TLRPC.Document) tLObject;
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 400);
                            BitmapDrawable bitmapDrawable = null;
                            if (SharedConfig.getDevicePerformanceClass() != 0) {
                                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                                int size = arrayList.size();
                                int i13 = 0;
                                c10 = 1;
                                while (i13 < size) {
                                    TLRPC.PhotoSize photoSize = arrayList.get(i13);
                                    i13++;
                                    TLRPC.PhotoSize photoSize2 = photoSize;
                                    if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                        bitmapDrawable = new BitmapDrawable(getResources(), ImageLoader.getStrippedPhotoBitmap(photoSize2.bytes, "b"));
                                    }
                                }
                            } else {
                                c10 = 1;
                            }
                            f10 = 2.0f;
                            f11 = 4.0f;
                            imageReceiver.setImage(ImageLocation.getForDocument(document), "g", ImageLocation.getForDocument(MessageObject.getDocumentVideoThumb(document), document), null, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                        }
                        iDp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f10);
                        iDp2 = AndroidUtilities.dp(f11);
                        if (!this.C) {
                            iDp2 = iDp;
                        }
                        imageReceiver.setRoundRadius(iDp, iDp, iDp2, iDp2);
                    }
                    f10 = 2.0f;
                    c10 = 1;
                    f11 = 4.0f;
                    iDp = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(f10);
                    iDp2 = AndroidUtilities.dp(f11);
                    if (!this.C) {
                        iDp2 = iDp;
                    }
                    imageReceiver.setRoundRadius(iDp, iDp, iDp2, iDp2);
                }
            }
            this.f24412b = AndroidUtilities.getSafeString(str3);
            this.f24413c = str2;
            setVisibility(0);
            if (AndroidUtilities.isTablet()) {
                iMin = AndroidUtilities.getMinTabletSide();
            } else {
                Point point = AndroidUtilities.displaySize;
                iMin = Math.min(point.x, point.y);
            }
            i10 = (int) (iMin * 0.7f);
            if (this.C) {
                strArrSplit = str3.split("\n");
                spannableStringBuilder = new SpannableStringBuilder();
                if (z13) {
                    int i14 = R.string.ManagedBotChatInfo;
                    Object[] objArr = new Object[2];
                    objArr[0] = DialogObject.getName(this.f24419w, j10);
                    objArr[c10] = str2;
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i14, objArr)));
                    z11 = false;
                } else {
                    string = LocaleController.getString(R.string.BotInfoTitle);
                    if (z10) {
                        spannableStringBuilder.append((CharSequence) string);
                        spannableStringBuilder.append((CharSequence) "\n\n");
                    }
                    for (i11 = 0; i11 < strArrSplit.length; i11++) {
                        spannableStringBuilder.append((CharSequence) strArrSplit[i11].trim());
                        if (i11 != strArrSplit.length - 1) {
                            spannableStringBuilder.append((CharSequence) "\n");
                        }
                    }
                    z11 = false;
                    MessageObject.addLinks(false, spannableStringBuilder);
                    if (z10) {
                        spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, string.length(), 33);
                    }
                }
                Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), z11);
                try {
                    TextPaint textPaint = org.telegram.ui.ActionBar.g6.f23247o2;
                    if (this.B) {
                        iDp4 = AndroidUtilities.dp(5.0f);
                    } else {
                        iDp4 = 0;
                    }
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i10 - iDp4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.f24411a = staticLayout;
                    this.f24414e = 0;
                    this.f24415f = staticLayout.getHeight() + AndroidUtilities.dp(22.0f);
                    lineCount = this.f24411a.getLineCount();
                    for (i12 = 0; i12 < lineCount; i12++) {
                        this.f24414e = (int) Math.ceil(Math.max(this.f24414e, this.f24411a.getLineWidth(i12) + this.f24411a.getLineLeft(i12)));
                    }
                    if (this.f24414e <= i10 || this.B) {
                        this.f24414e = i10;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            } else if (this.B) {
                this.f24414e = i10;
            }
            iDp3 = AndroidUtilities.dp(22.0f) + this.f24414e;
            this.f24414e = iDp3;
            if (this.B) {
                int i15 = this.f24415f;
                int i16 = (int) (((double) iDp3) * 0.5625d);
                this.f24421y = i16;
                this.f24415f = org.telegram.messenger.y1.C(4.0f, i16, i15);
            }
        }
        if (!Objects.equals(this.d, "setup")) {
            this.d = "setup";
            imageReceiver.setImageBitmap(new sp(new g0(getContext())));
            int iDp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius) - AndroidUtilities.dp(2.0f);
            int iDp6 = AndroidUtilities.dp(4.0f);
            if (!this.C) {
                iDp6 = iDp5;
            }
            imageReceiver.setRoundRadius(iDp5, iDp5, iDp6, iDp6);
        }
        c10 = 1;
        this.f24412b = AndroidUtilities.getSafeString(str3);
        this.f24413c = str2;
        setVisibility(0);
        if (AndroidUtilities.isTablet()) {
            iMin = AndroidUtilities.getMinTabletSide();
        } else {
            Point point2 = AndroidUtilities.displaySize;
            iMin = Math.min(point2.x, point2.y);
        }
        i10 = (int) (iMin * 0.7f);
        if (this.C) {
            strArrSplit = str3.split("\n");
            spannableStringBuilder = new SpannableStringBuilder();
            if (z13) {
                int i17 = R.string.ManagedBotChatInfo;
                Object[] objArr2 = new Object[2];
                objArr2[0] = DialogObject.getName(this.f24419w, j10);
                objArr2[c10] = str2;
                spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(i17, objArr2)));
                z11 = false;
            } else {
                string = LocaleController.getString(R.string.BotInfoTitle);
                if (z10) {
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append((CharSequence) "\n\n");
                }
                while (i11 < strArrSplit.length) {
                    spannableStringBuilder.append((CharSequence) strArrSplit[i11].trim());
                    if (i11 != strArrSplit.length - 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                }
                z11 = false;
                MessageObject.addLinks(false, spannableStringBuilder);
                if (z10) {
                    spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, string.length(), 33);
                }
            }
            Emoji.replaceEmoji(spannableStringBuilder, org.telegram.ui.ActionBar.g6.f23247o2.getFontMetricsInt(), z11);
            TextPaint textPaint2 = org.telegram.ui.ActionBar.g6.f23247o2;
            if (this.B) {
                iDp4 = AndroidUtilities.dp(5.0f);
            } else {
                iDp4 = 0;
            }
            StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder, textPaint2, i10 - iDp4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f24411a = staticLayout2;
            this.f24414e = 0;
            this.f24415f = staticLayout2.getHeight() + AndroidUtilities.dp(22.0f);
            lineCount = this.f24411a.getLineCount();
            while (i12 < lineCount) {
                this.f24414e = (int) Math.ceil(Math.max(this.f24414e, this.f24411a.getLineWidth(i12) + this.f24411a.getLineLeft(i12)));
            }
            if (this.f24414e <= i10) {
                this.f24414e = i10;
            } else {
                this.f24414e = i10;
            }
        } else if (this.B) {
            this.f24414e = i10;
        }
        iDp3 = AndroidUtilities.dp(22.0f) + this.f24414e;
        this.f24414e = iDp3;
        if (this.B) {
            int i18 = this.f24415f;
            int i19 = (int) (((double) iDp3) * 0.5625d);
            this.f24421y = i19;
            this.f24415f = org.telegram.messenger.y1.C(4.0f, i19, i18);
        }
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f24411a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.f24414e) / 2;
        int iDp = AndroidUtilities.dp(2.0f) + this.f24421y;
        Drawable drawableJ = org.telegram.ui.ActionBar.g6.f23281q3.j();
        if (drawableJ != null) {
            drawableJ.setBounds(width, iDp, this.f24414e + width, this.f24415f + iDp);
            drawableJ.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int measuredWidth = point.x;
        int measuredHeight = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f24420x;
        Drawable drawable = c6Var != null ? c6Var.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.g6.O0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) drawable;
        d5Var.n((int) getY(), measuredWidth, measuredHeight);
        d5Var.setBounds(width, 0, this.f24414e + width, this.f24415f);
        d5Var.draw(canvas);
        z zVar = this.F;
        if (zVar != null) {
            int i10 = this.G;
            int i11 = SharedConfig.bubbleRadius;
            if (i10 != i11) {
                this.G = i11;
                org.telegram.ui.ActionBar.g6.A1(zVar, i11, i11);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.f24414e + width) - AndroidUtilities.dp(2.0f), this.f24415f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i12 = this.D;
        float f10 = width + i12;
        float f11 = i12;
        float f12 = this.f24414e - (i12 * 2);
        float f13 = this.f24421y - i12;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setImageCoords(f10, f11, f12, f13);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.g6.f23247o2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23077ec, c6Var));
        org.telegram.ui.ActionBar.g6.f23247o2.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var);
        canvas.save();
        int iDp2 = AndroidUtilities.dp(this.B ? 14.0f : 11.0f) + width;
        this.h = iDp2;
        float f14 = iDp2;
        int iDp3 = AndroidUtilities.dp(11.0f) + iDp;
        this.f24416n = iDp3;
        canvas.translate(f14, iDp3);
        if (this.f24418s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f24411a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f24411a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), AndroidUtilities.dp(8.0f) + this.f24415f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.f24411a == null) {
            z10 = false;
        } else {
            if (motionEvent.getAction() == 0 || (this.f24417r != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    a();
                    try {
                        int i10 = (int) (x8 - this.h);
                        int i11 = (int) (y10 - this.f24416n);
                        int lineForVertical = this.f24411a.getLineForVertical(i11);
                        float f10 = i10;
                        int offsetForHorizontal = this.f24411a.getOffsetForHorizontal(lineForVertical, f10);
                        float lineLeft = this.f24411a.getLineLeft(lineForVertical);
                        if (lineLeft > f10 || lineLeft + this.f24411a.getLineWidth(lineForVertical) < f10) {
                            a();
                        } else {
                            Spannable spannable = (Spannable) this.f24411a.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                a();
                                this.f24417r = new q80(clickableSpanArr[0], this.f24420x, f10, i11, 0);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        j80 j80VarB = this.f24417r.b();
                                        j80VarB.d(this.f24411a, spanStart, 0.0f);
                                        this.f24411a.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), j80VarB);
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    this.f24418s.a(this.f24417r, null);
                                    invalidate();
                                    z10 = true;
                                } catch (Exception e10) {
                                    e = e10;
                                    z11 = true;
                                    a();
                                    FileLog.e(e);
                                    z10 = z11;
                                }
                            } else {
                                a();
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        z11 = false;
                    }
                } else {
                    q80 q80Var = this.f24417r;
                    if (q80Var != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) q80Var.f31841i;
                            if (clickableSpan instanceof r41) {
                                String url = ((r41) clickableSpan).getURL();
                                if (url.startsWith("@") || url.startsWith("#") || url.startsWith("/") || url.startsWith("$")) {
                                    f0 f0Var = this.v;
                                    if (f0Var != null) {
                                        ((org.telegram.ui.c1) f0Var).k(url);
                                    }
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                f0 f0Var2 = this.v;
                                if (f0Var2 != null) {
                                    ((org.telegram.ui.c1) f0Var2).k(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e12) {
                            FileLog.e(e12);
                        }
                        a();
                        z10 = true;
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                a();
            }
            z10 = false;
        }
        z zVar = this.F;
        if (zVar != null) {
            if (!z10 && y10 > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                zVar.setState(new int[]{16842919, 16842910});
                zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                invalidate();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                zVar.setState(new int[0]);
                invalidate();
                if (!z10 && motionEvent.getAction() == 1) {
                    performClick();
                }
            }
            z10 = true;
        }
        return z10 || super.onTouchEvent(motionEvent);
    }

    public void setAnimating(boolean z10) {
        this.E = z10;
    }

    public void setDelegate(f0 f0Var) {
        this.v = f0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }
}
