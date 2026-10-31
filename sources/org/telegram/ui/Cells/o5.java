package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
public final class o5 extends FrameLayout {
    public final TextView f22382a;
    public final TextView f22383b;
    public final TextView f22384c;
    public final org.telegram.ui.Components.g9 d;

    public o5(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        float f13;
        float f14;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.d = g9Var;
        g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(8.0f));
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(g9Var, w7.b6.d(100, 100.0f, i10, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f22382a = textView;
        int i16 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i16, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 48);
        boolean z10 = cd.X;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z10) {
            f7 = 10.0f;
        } else {
            f7 = 123.0f;
        }
        if (z10) {
            f10 = 123.0f;
        } else {
            f10 = 10.0f;
        }
        addView(textView, w7.b6.d(-1, -2.0f, i17, f7, 9.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22383b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i16, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        if (cd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13 | 48);
        boolean z11 = cd.X;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z11) {
            f11 = 10.0f;
        } else {
            f11 = 123.0f;
        }
        if (z11) {
            f12 = 123.0f;
        } else {
            f12 = 10.0f;
        }
        addView(textView2, w7.b6.d(-1, -2.0f, i18, f11, 33.0f, f12, 0.0f));
        TextView textView3 = new TextView(context);
        this.f22384c = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21330z6, null);
        z20.o(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        if (cd.X) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView3.setGravity(i15 | 48);
        boolean z12 = cd.X;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            f13 = 10.0f;
        } else {
            f13 = 123.0f;
        }
        if (z12) {
            f14 = 123.0f;
        } else {
            f14 = 10.0f;
        }
        addView(textView3, w7.b6.d(-1, -2.0f, i19, f13, 90.0f, f14, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        int i13;
        float f11;
        float f12;
        float f13;
        float f14;
        TextView textView = this.f22382a;
        textView.setText(str);
        TextView textView2 = this.f22383b;
        textView2.setText(str2);
        TextView textView3 = this.f22384c;
        textView3.setText(str3);
        if (org.telegram.messenger.i0.Q1()) {
            min = org.telegram.messenger.i0.Q0();
        } else {
            Point point = org.telegram.messenger.i0.f16026q;
            min = Math.min(point.x, point.y);
        }
        float f15 = 640;
        float L = f15 / (((int) (min * 0.7f)) - org.telegram.messenger.i0.L(2.0f));
        int i14 = (int) (f15 / L);
        int i15 = (int) (360 / L);
        org.telegram.ui.Components.g9 g9Var = this.d;
        int i16 = 3;
        if (webDocument != null && webDocument.mime_type.startsWith("image/")) {
            boolean z10 = cd.X;
            if (z10) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i17 = i12 | 48;
            if (z10) {
                f7 = 10.0f;
            } else {
                f7 = 123.0f;
            }
            if (z10) {
                f10 = 123.0f;
            } else {
                f10 = 10.0f;
            }
            textView.setLayoutParams(w7.b6.d(-1, -2.0f, i17, f7, 9.0f, f10, 0.0f));
            boolean z11 = cd.X;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i18 = i13 | 48;
            if (z11) {
                f11 = 10.0f;
            } else {
                f11 = 123.0f;
            }
            if (z11) {
                f12 = 123.0f;
            } else {
                f12 = 10.0f;
            }
            textView2.setLayoutParams(w7.b6.d(-1, -2.0f, i18, f11, 33.0f, f12, 0.0f));
            boolean z12 = cd.X;
            if (z12) {
                i16 = 5;
            }
            int i19 = i16 | 48;
            if (z12) {
                f13 = 10.0f;
            } else {
                f13 = 123.0f;
            }
            if (z12) {
                f14 = 123.0f;
            } else {
                f14 = 10.0f;
            }
            textView3.setLayoutParams(w7.b6.d(-1, -2.0f, i19, f13, 90.0f, f14, 0.0f));
            g9Var.setVisibility(0);
            Locale locale = Locale.US;
            g9Var.getImageReceiver().r0(ic.p(b30.c(webDocument)), a1.g.i(i14, i15, "_"), null, null, null, -1L, null, obj, 1);
            return;
        }
        if (cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setLayoutParams(w7.b6.d(-1, -2.0f, i10 | 48, 17.0f, 9.0f, 17.0f, 0.0f));
        if (cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setLayoutParams(w7.b6.d(-1, -2.0f, i11 | 48, 17.0f, 33.0f, 17.0f, 0.0f));
        if (cd.X) {
            i16 = 5;
        }
        textView3.setLayoutParams(w7.b6.d(-1, -2.0f, i16 | 48, 17.0f, 90.0f, 17.0f, 9.0f));
        g9Var.setVisibility(8);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.d.getVisibility() != 8) {
            i13 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), 1073741824);
            i12 = i10;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            TextView textView = this.f22383b;
            i12 = i10;
            measureChildWithMargins(textView, i12, 0, i11, 0);
            ((FrameLayout.LayoutParams) this.f22384c.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(3.0f) + textView.getMeasuredHeight() + org.telegram.messenger.i0.L(33.0f);
            i13 = makeMeasureSpec;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), 1073741824), i13);
    }
}
