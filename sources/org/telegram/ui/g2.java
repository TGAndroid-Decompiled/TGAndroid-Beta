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
public final class g2 extends View implements org.telegram.ui.Cells.h9 {
    public final o50 f45780a;
    public final e4 f45781b;
    public z2 f45782c;
    public z2 d;
    public boolean f45783e;
    public boolean f45784f;
    public final ImageReceiver h;
    public a4 f45785n;
    public TLObject f45786r;
    public final int f45787s;
    public final int f45788w;
    public int f45789x;

    public g2(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f45787s = org.telegram.messenger.g0.L(18.0f);
        this.f45788w = org.telegram.messenger.g0.L(10.0f);
        this.f45780a = o50Var;
        this.f45781b = e4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f45782c;
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
        z2 z2Var = this.f45782c;
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
        z2 z2Var = this.f45782c;
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
        int i7;
        if (this.f45785n != null) {
            if (this.f45784f) {
                this.h.h(canvas, null);
            }
            canvas.save();
            canvas.translate(this.f45787s, org.telegram.messenger.g0.L(10.0f));
            z2 z2Var = this.f45782c;
            o50 o50Var = this.f45780a;
            int i10 = 0;
            if (z2Var != null) {
                g4.t(o50Var, canvas, this, 0);
                this.f45782c.d(canvas, this);
                i7 = 1;
            } else {
                i7 = 0;
            }
            float f10 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f45789x);
                g4.t(o50Var, canvas, this, i7);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.f45783e) {
                e4 e4Var = this.f45781b;
                if (e4Var == null || !e4Var.G) {
                    f10 = org.telegram.messenger.g0.L(17.0f);
                }
                float f11 = f10;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (e4Var != null && e4Var.G) {
                    i10 = org.telegram.messenger.g0.L(17.0f);
                }
                canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, g4.f45813s1);
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
        z2 z2Var = this.f45782c;
        e4 e4Var = this.f45781b;
        o50 o50Var = this.f45780a;
        if (z2Var != null && (h7 = g4.h(o50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(o50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.hd.M0(2131754858, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        boolean z9;
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
        int size = View.MeasureSpec.getSize(i7);
        a4 a4Var = this.f45785n;
        if (a4Var.f43559b != a4Var.f43558a.articles.size() - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f45783e = z9;
        a4 a4Var2 = this.f45785n;
        TL_iv.pageRelatedArticle pagerelatedarticle = a4Var2.f43558a.articles.get(a4Var2.f43559b);
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.iz.Z0 - 16);
        long j3 = pagerelatedarticle.photo_id;
        int i16 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        e4 e4Var = this.f45781b;
        if (i16 != 0) {
            if (e4Var != null) {
                photo = d4.e(e4Var.E, j3);
            } else {
                photo = d4.d(j3, this.f45786r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f45784f = true;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 80, true, null, false);
            if (w10 == w11) {
                w11 = null;
            }
            imageReceiver2.r0(org.telegram.messenger.hc.i(w10, photo), "64_64", org.telegram.messenger.hc.i(w11, photo), "64_64_b", null, w10.size, null, this.f45786r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f45784f = false;
        }
        int L3 = org.telegram.messenger.g0.L(60.0f);
        int L4 = size - org.telegram.messenger.g0.L(36.0f);
        if (this.f45784f) {
            float L5 = org.telegram.messenger.g0.L(44.0f);
            imageReceiver.y0((size - L) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), L5, L5);
            L4 = (int) (L4 - (imageReceiver.M0 + org.telegram.messenger.g0.L(6.0f)));
        }
        int L6 = org.telegram.messenger.g0.L(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i12 = L4;
            i13 = 1;
            i11 = L3;
            f10 = 6.0f;
            this.f45782c = g4.n(this.f45780a, this, str2, null, i12, this.f45788w, this.f45785n, Layout.Alignment.ALIGN_NORMAL, 3, this.f45781b);
        } else {
            i11 = L3;
            i12 = L4;
            i13 = 1;
            f10 = 6.0f;
        }
        z2 z2Var = this.f45782c;
        int i17 = this.f45787s;
        int i18 = this.f45788w;
        if (z2Var != null) {
            int lineCount = z2Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.f45789x = org.telegram.messenger.k5.C(f10, this.f45782c.d.getHeight(), L2);
            L6 = this.f45782c.d.getHeight() + L6;
            int i19 = 0;
            while (true) {
                if (i19 < lineCount) {
                    if (this.f45782c.d.getLineLeft(i19) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i19++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            z2 z2Var2 = this.f45782c;
            z2Var2.f52441s = i17;
            z2Var2.f52442w = i18;
        } else {
            this.f45789x = 0;
            i14 = 4;
            i15 = 0;
        }
        int i20 = i14;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format = org.telegram.messenger.hd.E0().h0().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i13] = str3;
            str = org.telegram.messenger.hd.a0(null, null, 2131754040, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            Object[] objArr2 = new Object[i13];
            objArr2[0] = pagerelatedarticle.author;
            str = org.telegram.messenger.hd.a0(null, null, 2131754056, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = org.telegram.messenger.hd.E0().h0().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i21 = this.f45789x + i18;
        String str4 = str;
        a4 a4Var3 = this.f45785n;
        if ((e4Var != null && e4Var.G) || i15 != 0) {
            alignment = org.telegram.ui.Components.mu0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        z2 n10 = g4.n(this.f45780a, this, str4, null, i12, i21, a4Var3, alignment, i20, this.f45781b);
        this.d = n10;
        if (n10 != null) {
            int height = n10.d.getHeight() + L6;
            if (this.f45782c != null) {
                height = org.telegram.messenger.k5.C(f10, L2, height);
            }
            L6 = height;
            z2 z2Var3 = this.d;
            z2Var3.f52441s = i17;
            z2Var3.f52442w = i18 + this.f45789x;
        }
        setMeasuredDimension(size, Math.max(i11, L6) + (this.f45783e ? 1 : 0));
    }
}
