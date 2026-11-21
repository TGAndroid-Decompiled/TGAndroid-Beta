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
public final class g2 extends View implements org.telegram.ui.Cells.i9 {
    public final p50 f47909a;
    public final e4 f47910b;
    public z2 f47911c;
    public z2 d;
    public boolean f47912e;
    public boolean f47913f;
    public final ImageReceiver h;
    public a4 f47914n;
    public TLObject f47915r;
    public final int f47916s;
    public final int f47917w;
    public int f47918x;

    public g2(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f47916s = org.telegram.messenger.g0.L(18.0f);
        this.f47917w = org.telegram.messenger.g0.L(10.0f);
        this.f47909a = p50Var;
        this.f47910b = e4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f47911c;
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
        z2 z2Var = this.f47911c;
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
        z2 z2Var = this.f47911c;
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
        if (this.f47914n != null) {
            if (this.f47913f) {
                this.h.h(canvas, null);
            }
            canvas.save();
            canvas.translate(this.f47916s, org.telegram.messenger.g0.L(10.0f));
            z2 z2Var = this.f47911c;
            p50 p50Var = this.f47909a;
            int i10 = 0;
            if (z2Var != null) {
                g4.t(p50Var, canvas, this, 0);
                this.f47911c.d(canvas, this);
                i7 = 1;
            } else {
                i7 = 0;
            }
            float f10 = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.f47918x);
                g4.t(p50Var, canvas, this, i7);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.f47912e) {
                e4 e4Var = this.f47910b;
                if (e4Var == null || !e4Var.H) {
                    f10 = org.telegram.messenger.g0.L(17.0f);
                }
                float f11 = f10;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (e4Var != null && e4Var.H) {
                    i10 = org.telegram.messenger.g0.L(17.0f);
                }
                canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, g4.f47939t1);
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
        z2 z2Var = this.f47911c;
        e4 e4Var = this.f47910b;
        p50 p50Var = this.f47909a;
        if (z2Var != null && (h7 = g4.h(p50Var, e4Var, z2Var)) != null) {
            spannableStringBuilder.append(h7);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null && (h = g4.h(p50Var, e4Var, z2Var2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(h);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) org.telegram.messenger.gd.N0(2131754857, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
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
        int size = View.MeasureSpec.getSize(i7);
        a4 a4Var = this.f47914n;
        if (a4Var.f45489b != a4Var.f45488a.articles.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47912e = z10;
        a4 a4Var2 = this.f47914n;
        TL_iv.pageRelatedArticle pagerelatedarticle = a4Var2.f45488a.articles.get(a4Var2.f45489b);
        int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.bz.Z0 - 16);
        long j3 = pagerelatedarticle.photo_id;
        int i16 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        e4 e4Var = this.f47910b;
        if (i16 != 0) {
            if (e4Var != null) {
                photo = d4.e(e4Var.F, j3);
            } else {
                photo = d4.d(j3, this.f47915r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f47913f = true;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo.sizes, 80, true, null, false);
            if (w10 == w11) {
                w11 = null;
            }
            imageReceiver2.r0(org.telegram.messenger.fc.i(w10, photo), "64_64", org.telegram.messenger.fc.i(w11, photo), "64_64_b", null, w10.size, null, this.f47915r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f47913f = false;
        }
        int L3 = org.telegram.messenger.g0.L(60.0f);
        int L4 = size - org.telegram.messenger.g0.L(36.0f);
        if (this.f47913f) {
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
            this.f47911c = g4.n(this.f47909a, this, str2, null, i12, this.f47917w, this.f47914n, Layout.Alignment.ALIGN_NORMAL, 3, this.f47910b);
        } else {
            i11 = L3;
            i12 = L4;
            i13 = 1;
            f10 = 6.0f;
        }
        z2 z2Var = this.f47911c;
        int i17 = this.f47916s;
        int i18 = this.f47917w;
        if (z2Var != null) {
            int lineCount = z2Var.d.getLineCount();
            i14 = 4 - lineCount;
            this.f47918x = org.telegram.messenger.f3.C(f10, this.f47911c.d.getHeight(), L2);
            L6 = this.f47911c.d.getHeight() + L6;
            int i19 = 0;
            while (true) {
                if (i19 < lineCount) {
                    if (this.f47911c.d.getLineLeft(i19) != 0.0f) {
                        i15 = i13;
                        break;
                    }
                    i19++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            z2 z2Var2 = this.f47911c;
            z2Var2.f54374s = i17;
            z2Var2.f54375w = i18;
        } else {
            this.f47918x = 0;
            i14 = 4;
            i15 = 0;
        }
        int i20 = i14;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format = org.telegram.messenger.gd.E0().h0().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i13] = str3;
            str = org.telegram.messenger.gd.a0(null, null, 2131754037, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            Object[] objArr2 = new Object[i13];
            objArr2[0] = pagerelatedarticle.author;
            str = org.telegram.messenger.gd.a0(null, null, 2131754053, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = org.telegram.messenger.gd.E0().h0().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i21 = this.f47918x + i18;
        String str4 = str;
        a4 a4Var3 = this.f47914n;
        if ((e4Var != null && e4Var.H) || i15 != 0) {
            alignment = org.telegram.ui.Components.zu0.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        z2 n10 = g4.n(this.f47909a, this, str4, null, i12, i21, a4Var3, alignment, i20, this.f47910b);
        this.d = n10;
        if (n10 != null) {
            int height = n10.d.getHeight() + L6;
            if (this.f47911c != null) {
                height = org.telegram.messenger.f3.C(f10, L2, height);
            }
            L6 = height;
            z2 z2Var3 = this.d;
            z2Var3.f54374s = i17;
            z2Var3.f54375w = i18 + this.f47918x;
        }
        setMeasuredDimension(size, Math.max(i11, L6) + (this.f47912e ? 1 : 0));
    }
}
