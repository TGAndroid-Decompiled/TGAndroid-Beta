package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h2 extends View implements org.telegram.ui.Cells.j9 {
    public final l60 f37630a;
    public final f4 f37631b;
    public z2 f37632c;
    public z2 d;
    public boolean e;
    public boolean f37633f;
    public final ImageReceiver h;
    public b4 f37634n;
    public TLObject f37635r;
    public final int f37636s;
    public final int f37637w;
    public int f37638x;

    public h2(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f37636s = org.telegram.messenger.i0.L(18.0f);
        this.f37637w = org.telegram.messenger.i0.L(10.0f);
        this.f37630a = l60Var;
        this.f37631b = f4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f37632c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f37632c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f37632c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.f37634n != null) {
            if (this.f37633f) {
                this.h.h(canvas, null);
            }
            canvas.save();
            canvas.translate(this.f37636s, org.telegram.messenger.i0.L(10.0f));
            z2 z2Var = this.f37632c;
            l60 l60Var = this.f37630a;
            int i11 = 0;
            if (z2Var != null) {
                h4.t(l60Var, canvas, this, 0);
                this.f37632c.d(canvas, this);
                i10 = 1;
            } else {
                i10 = 0;
            }
            float f7 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f37638x);
                h4.t(l60Var, canvas, this, i10);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                f4 f4Var = this.f37631b;
                if (f4Var == null || !f4Var.G) {
                    f7 = org.telegram.messenger.i0.L(17.0f);
                }
                float f10 = f7;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (f4Var != null && f4Var.G) {
                    i11 = org.telegram.messenger.i0.L(17.0f);
                }
                canvas.drawLine(f10, measuredHeight, measuredWidth - i11, getMeasuredHeight() - 1, h4.f37662s1);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        z2 z2Var = this.f37632c;
        f4 f4Var = this.f37631b;
        l60 l60Var = this.f37630a;
        if (z2Var != null && (h10 = h4.h(l60Var, f4Var, z2Var)) != null) {
            spannableStringBuilder.append(h10);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = h4.h(l60Var, f4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.dd.L0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        TLRPC.Photo photo;
        ImageReceiver imageReceiver;
        int i12;
        int i13;
        int i14;
        float f7;
        int i15;
        int i16;
        String str;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i10);
        b4 b4Var = this.f37634n;
        if (b4Var.f35935b != b4Var.f35934a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        b4 b4Var2 = this.f37634n;
        TL_iv.pageRelatedArticle pagerelatedarticle = b4Var2.f35934a.articles.get(b4Var2.f35935b);
        int L2 = org.telegram.messenger.i0.L(org.telegram.messenger.uz.Z0 - 16);
        long j10 = pagerelatedarticle.photo_id;
        int i17 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        f4 f4Var = this.f37631b;
        if (i17 != 0) {
            if (f4Var != null) {
                photo = e4.e(f4Var.E, j10);
            } else {
                photo = e4.d(j10, this.f37635r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f37633f = true;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo.sizes, 80, true, null, false);
            if (w9 == w10) {
                w10 = null;
            }
            imageReceiver2.r0(org.telegram.messenger.jc.i(w9, photo), "64_64", org.telegram.messenger.jc.i(w10, photo), "64_64_b", null, w9.size, null, this.f37635r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f37633f = false;
        }
        int L3 = org.telegram.messenger.i0.L(60.0f);
        int L4 = size - org.telegram.messenger.i0.L(36.0f);
        if (this.f37633f) {
            float L5 = org.telegram.messenger.i0.L(44.0f);
            imageReceiver.y0((size - L) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), L5, L5);
            L4 = (int) (L4 - (imageReceiver.M0 + org.telegram.messenger.i0.L(6.0f)));
        }
        int L6 = org.telegram.messenger.i0.L(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i13 = L4;
            i14 = 1;
            i12 = L3;
            f7 = 6.0f;
            this.f37632c = h4.n(this.f37630a, this, str2, null, i13, this.f37637w, this.f37634n, Layout.Alignment.ALIGN_NORMAL, 3, this.f37631b);
        } else {
            i12 = L3;
            i13 = L4;
            i14 = 1;
            f7 = 6.0f;
        }
        z2 z2Var = this.f37632c;
        int i18 = this.f37636s;
        int i19 = this.f37637w;
        if (z2Var != null) {
            int lineCount = z2Var.d.getLineCount();
            i15 = 4 - lineCount;
            this.f37638x = org.telegram.messenger.m5.C(f7, this.f37632c.d.getHeight(), L2);
            L6 = this.f37632c.d.getHeight() + L6;
            int i20 = 0;
            while (true) {
                if (i20 < lineCount) {
                    if (this.f37632c.d.getLineLeft(i20) != 0.0f) {
                        i16 = i14;
                        break;
                    }
                    i20++;
                } else {
                    i16 = 0;
                    break;
                }
            }
            z2 z2Var2 = this.f37632c;
            z2Var2.f43793s = i18;
            z2Var2.f43794w = i19;
        } else {
            this.f37638x = 0;
            i15 = 4;
            i16 = 0;
        }
        int i21 = i15;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format = org.telegram.messenger.dd.D0().h0().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i14] = str3;
            str = org.telegram.messenger.dd.a0(null, null, 2131754040, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            Object[] objArr2 = new Object[i14];
            objArr2[0] = pagerelatedarticle.author;
            str = org.telegram.messenger.dd.a0(null, null, 2131754056, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = org.telegram.messenger.dd.D0().h0().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i22 = this.f37638x + i19;
        String str4 = str;
        b4 b4Var3 = this.f37634n;
        if ((f4Var != null && f4Var.G) || i16 != 0) {
            alignment = org.telegram.ui.Components.pv0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        z2 n10 = h4.n(this.f37630a, this, str4, null, i13, i22, b4Var3, alignment, i21, this.f37631b);
        this.d = n10;
        if (n10 != null) {
            int height = n10.d.getHeight() + L6;
            if (this.f37632c != null) {
                height = org.telegram.messenger.m5.C(f7, L2, height);
            }
            L6 = height;
            z2 z2Var3 = this.d;
            z2Var3.f43793s = i18;
            z2Var3.f43794w = i19 + this.f37638x;
        }
        setMeasuredDimension(size, Math.max(i12, L6) + (this.e ? 1 : 0));
    }
}
