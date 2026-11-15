package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.RadialProgressView;
public final class bq0 extends org.telegram.ui.Components.ae0 {
    public final Rect N;
    public final PhotoViewer O;

    public bq0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.z0 z0Var) {
        super(context);
        this.O = photoViewer;
        this.f32971a = org.telegram.messenger.m10.f24940t0;
        this.f32979w = new ArrayList();
        this.M = new org.telegram.ui.Components.wa0(this, 9);
        this.f32972b = photoViewer2;
        this.f32977r = z0Var;
        org.telegram.ui.Components.xt xtVar = new org.telegram.ui.Components.xt(this, context, context, 1);
        this.f32975f = xtVar;
        xtVar.getSettings().setJavaScriptEnabled(true);
        xtVar.getSettings().setDomStorageEnabled(true);
        xtVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        xtVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(xtVar, true);
        xtVar.setWebViewClient(new n1(this, 2));
        addView(xtVar, c8.ja.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f32973c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ja.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, c8.ja.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f32974e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.j6.f29031n6;
        org.telegram.ui.ActionBar.q6.U(textView2, i7, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.y5.f29895a;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.j6.x0(null, i7, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 1, 0, 8, 0, 0));
        bi.o2 o2Var = new bi.o2(22, context, this);
        this.h = o2Var;
        o2Var.setBackgroundColor(-16777216);
        o2Var.setVisibility(4);
        addView(o2Var, c8.ja.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f32976n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, c8.ja.e(-2, -2, 17));
        this.N = new Rect();
    }

    public final void j(Canvas canvas, int i7, int i10) {
        Bitmap n10 = this.O.C4.n();
        if (n10 != null) {
            float min = Math.min(i7 / n10.getWidth(), i10 / n10.getHeight());
            int width = (int) (n10.getWidth() * min);
            int height = (int) (n10.getHeight() * min);
            int i11 = (i10 - height) / 2;
            int i12 = (i7 - width) / 2;
            Rect rect = this.N;
            rect.set(i12, i11, width + i12, height + i11);
            canvas.drawBitmap(n10, (Rect) null, rect, (Paint) null);
        }
    }
}
