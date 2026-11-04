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
public final class h2 extends View implements org.telegram.ui.Cells.g9 {
    public final i50 f45779a;
    public final g4 f45780b;
    public a3 f45781c;
    public a3 d;
    public boolean f45782e;
    public boolean f45783f;
    public final ImageReceiver h;
    public b4 f45784n;
    public TLObject f45785r;
    public final int f45786s;
    public final int f45787w;
    public int f45788x;

    public h2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f45786s = org.telegram.messenger.g0.L(18.0f);
        this.f45787w = org.telegram.messenger.g0.L(10.0f);
        this.f45779a = i50Var;
        this.f45780b = g4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f45781c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f45781c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f45781c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        if (this.f45784n != null) {
            if (this.f45783f) {
                this.h.h(canvas, null);
            }
            canvas.save();
            canvas.translate(this.f45786s, org.telegram.messenger.g0.L(10.0f));
            a3 a3Var = this.f45781c;
            i50 i50Var = this.f45779a;
            int i10 = 0;
            if (a3Var != null) {
                i4.t(i50Var, canvas, this, 0);
                this.f45781c.d(canvas, this);
                i3 = 1;
            } else {
                i3 = 0;
            }
            float f10 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f45788x);
                i4.t(i50Var, canvas, this, i3);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.f45782e) {
                g4 g4Var = this.f45780b;
                if (g4Var == null || !g4Var.H) {
                    f10 = org.telegram.messenger.g0.L(17.0f);
                }
                float f11 = f10;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (g4Var != null && g4Var.H) {
                    i10 = org.telegram.messenger.g0.L(17.0f);
                }
                canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, i4.f46070t1);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence h;
        CharSequence h7;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a3 a3Var = this.f45781c;
        g4 g4Var = this.f45780b;
        i50 i50Var = this.f45779a;
        if (a3Var != null && (h7 = i4.h(i50Var, g4Var, a3Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null && (h = i4.h(i50Var, g4Var, a3Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.bd.M0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        boolean z10;
        TLRPC.Photo photo;
        ImageReceiver imageReceiver;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        String str;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i3);
        b4 b4Var = this.f45784n;
        if (b4Var.f43914b != b4Var.f43913a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45782e = z10;
        b4 b4Var2 = this.f45784n;
        TL_iv.pageRelatedArticle pagerelatedarticle = b4Var2.f43913a.articles.get(b4Var2.f43914b);
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.az.Z0 - 16);
        long j10 = pagerelatedarticle.photo_id;
        int i16 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        g4 g4Var = this.f45780b;
        if (i16 != 0) {
            if (g4Var != null) {
                photo = e4.e(g4Var.F, j10);
            } else {
                photo = e4.d(j10, this.f45785r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f45783f = true;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 80, true, null, false);
            if (w10 == w11) {
                w11 = null;
            }
            imageReceiver2.r0(org.telegram.messenger.ac.i(w10, photo), "64_64", org.telegram.messenger.ac.i(w11, photo), "64_64_b", null, w10.size, null, this.f45785r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f45783f = false;
        }
        int L3 = org.telegram.messenger.g0.L(60.0f);
        int L4 = size - org.telegram.messenger.g0.L(36.0f);
        if (this.f45783f) {
            float L5 = org.telegram.messenger.g0.L(44.0f);
            imageReceiver.y0((size - L) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), L5, L5);
            L4 = (int) (L4 - (imageReceiver.N0 + org.telegram.messenger.g0.L(6.0f)));
        }
        int L6 = org.telegram.messenger.g0.L(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i12 = L4;
            i13 = 1;
            i11 = L3;
            f10 = 6.0f;
            this.f45781c = i4.n(this.f45779a, this, str2, null, i12, this.f45787w, this.f45784n, Layout.Alignment.ALIGN_NORMAL, 3, this.f45780b);
        } else {
            i11 = L3;
            i12 = L4;
            i13 = 1;
            f10 = 6.0f;
        }
        a3 a3Var = this.f45781c;
        int i17 = this.f45786s;
        int i18 = this.f45787w;
        if (a3Var != null) {
            int lineCount = a3Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.f45788x = org.telegram.messenger.k5.C(f10, this.f45781c.d.getHeight(), L2);
            L6 = this.f45781c.d.getHeight() + L6;
            int i19 = 0;
            while (true) {
                if (i19 < lineCount) {
                    if (this.f45781c.d.getLineLeft(i19) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i19++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            a3 a3Var2 = this.f45781c;
            a3Var2.f43579s = i17;
            a3Var2.f43580w = i18;
        } else {
            this.f45788x = 0;
            i14 = 4;
            i15 = 0;
        }
        int i20 = i14;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format = org.telegram.messenger.bd.E0().h0().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i13] = str3;
            str = org.telegram.messenger.bd.a0(null, null, 2131754040, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            Object[] objArr2 = new Object[i13];
            objArr2[0] = pagerelatedarticle.author;
            str = org.telegram.messenger.bd.a0(null, null, 2131754056, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = org.telegram.messenger.bd.E0().h0().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i21 = this.f45788x + i18;
        String str4 = str;
        b4 b4Var3 = this.f45784n;
        if ((g4Var != null && g4Var.H) || i15 != 0) {
            alignment = org.telegram.ui.Components.lu0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        a3 n4 = i4.n(this.f45779a, this, str4, null, i12, i21, b4Var3, alignment, i20, this.f45780b);
        this.d = n4;
        if (n4 != null) {
            int height = n4.d.getHeight() + L6;
            if (this.f45781c != null) {
                height = org.telegram.messenger.k5.C(f10, L2, height);
            }
            L6 = height;
            a3 a3Var3 = this.d;
            a3Var3.f43579s = i17;
            a3Var3.f43580w = i18 + this.f45788x;
        }
        setMeasuredDimension(size, Math.max(i11, L6) + (this.f45782e ? 1 : 0));
    }
}
