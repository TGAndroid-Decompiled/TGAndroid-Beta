package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
public final class j5 extends FrameLayout {
    public final TextView f30491a;
    public final TextView f30492b;
    public final TextView f30493c;
    public final org.telegram.ui.Components.i9 d;

    public j5(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        float f14;
        float f15;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.d = i9Var;
        i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(8.0f));
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(i9Var, c8.ja.d(100, 100.0f, i7, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f30491a = textView;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i15, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 48);
        boolean z10 = hd.f24101a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i16 = i11 | 48;
        if (z10) {
            f10 = 10.0f;
        } else {
            f10 = 123.0f;
        }
        if (z10) {
            f11 = 123.0f;
        } else {
            f11 = 10.0f;
        }
        addView(textView, c8.ja.d(-1, -2.0f, i16, f10, 9.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30492b = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i15, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        if (hd.f24101a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12 | 48);
        boolean z11 = hd.f24101a0;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i17 = i13 | 48;
        if (z11) {
            f12 = 10.0f;
        } else {
            f12 = 123.0f;
        }
        if (z11) {
            f13 = 123.0f;
        } else {
            f13 = 10.0f;
        }
        addView(textView2, c8.ja.d(-1, -2.0f, i17, f12, 33.0f, f13, 0.0f));
        TextView textView3 = new TextView(context);
        this.f30493c = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29260z6, null);
        i20.p(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        if (hd.f24101a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView3.setGravity(i14 | 48);
        boolean z12 = hd.f24101a0;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f14 = 10.0f;
        } else {
            f14 = 123.0f;
        }
        if (z12) {
            f15 = 123.0f;
        } else {
            f15 = 10.0f;
        }
        addView(textView3, c8.ja.d(-1, -2.0f, i18, f14, 90.0f, f15, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        TextView textView = this.f30491a;
        textView.setText(str);
        TextView textView2 = this.f30492b;
        textView2.setText(str2);
        TextView textView3 = this.f30493c;
        textView3.setText(str3);
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
        } else {
            Point point = org.telegram.messenger.g0.f23609q;
            min = Math.min(point.x, point.y);
        }
        float f16 = 640;
        float L = f16 / (((int) (min * 0.7f)) - org.telegram.messenger.g0.L(2.0f));
        int i13 = (int) (f16 / L);
        int i14 = (int) (360 / L);
        org.telegram.ui.Components.i9 i9Var = this.d;
        int i15 = 3;
        if (webDocument != null && webDocument.mime_type.startsWith("image/")) {
            boolean z10 = hd.f24101a0;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i16 = i11 | 48;
            if (z10) {
                f10 = 10.0f;
            } else {
                f10 = 123.0f;
            }
            if (z10) {
                f11 = 123.0f;
            } else {
                f11 = 10.0f;
            }
            textView.setLayoutParams(c8.ja.d(-1, -2.0f, i16, f10, 9.0f, f11, 0.0f));
            boolean z11 = hd.f24101a0;
            if (z11) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i17 = i12 | 48;
            if (z11) {
                f12 = 10.0f;
            } else {
                f12 = 123.0f;
            }
            if (z11) {
                f13 = 123.0f;
            } else {
                f13 = 10.0f;
            }
            textView2.setLayoutParams(c8.ja.d(-1, -2.0f, i17, f12, 33.0f, f13, 0.0f));
            boolean z12 = hd.f24101a0;
            if (z12) {
                i15 = 5;
            }
            int i18 = i15 | 48;
            if (z12) {
                f14 = 10.0f;
            } else {
                f14 = 123.0f;
            }
            if (z12) {
                f15 = 123.0f;
            } else {
                f15 = 10.0f;
            }
            textView3.setLayoutParams(c8.ja.d(-1, -2.0f, i18, f14, 90.0f, f15, 0.0f));
            i9Var.setVisibility(0);
            Locale locale = Locale.US;
            i9Var.getImageReceiver().r0(gc.p(k20.c(webDocument)), com.google.android.gms.internal.vision.e2.j(i13, "_", i14), null, null, null, -1L, null, obj, 1);
            return;
        }
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setLayoutParams(c8.ja.d(-1, -2.0f, i7 | 48, 17.0f, 9.0f, 17.0f, 0.0f));
        if (hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView2.setLayoutParams(c8.ja.d(-1, -2.0f, i10 | 48, 17.0f, 33.0f, 17.0f, 0.0f));
        if (hd.f24101a0) {
            i15 = 5;
        }
        textView3.setLayoutParams(c8.ja.d(-1, -2.0f, i15 | 48, 17.0f, 90.0f, 17.0f, 9.0f));
        i9Var.setVisibility(8);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        if (this.d.getVisibility() != 8) {
            i12 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824);
            i11 = i7;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            TextView textView = this.f30492b;
            i11 = i7;
            measureChildWithMargins(textView, i11, 0, i10, 0);
            ((FrameLayout.LayoutParams) this.f30493c.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(3.0f) + textView.getMeasuredHeight() + org.telegram.messenger.g0.L(33.0f);
            i12 = makeMeasureSpec;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824), i12);
    }
}
