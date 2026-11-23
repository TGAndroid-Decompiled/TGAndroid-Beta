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
public final class dq0 extends org.telegram.ui.Components.ke0 {
    public final Rect N;
    public final PhotoViewer O;

    public dq0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.y0 y0Var) {
        super(context);
        this.O = photoViewer;
        this.f36720a = org.telegram.messenger.i10.f24637t0;
        this.f36728w = new ArrayList();
        this.M = new org.telegram.ui.Components.eb0(this, 9);
        this.f36721b = photoViewer2;
        this.f36726r = y0Var;
        org.telegram.ui.Components.cu cuVar = new org.telegram.ui.Components.cu(this, context, context, 1);
        this.f36724f = cuVar;
        cuVar.getSettings().setJavaScriptEnabled(true);
        cuVar.getSettings().setDomStorageEnabled(true);
        cuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        cuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(cuVar, true);
        cuVar.setWebViewClient(new n1(this, 2));
        addView(cuVar, c8.na.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36722c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.na.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29843y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, c8.na.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f36723e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29633n6;
        org.telegram.ui.ActionBar.u6.U(textView2, i7, null);
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        int i10 = org.telegram.ui.ActionBar.b6.f28874a;
        textView2.setBackground(org.telegram.ui.ActionBar.b6.d(0, org.telegram.ui.ActionBar.b6.b(org.telegram.ui.ActionBar.n6.x0(null, i7, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, c8.na.t(-2, -2, 1, 0, 8, 0, 0));
        bi.o3 o3Var = new bi.o3(22, context, this);
        this.h = o3Var;
        o3Var.setBackgroundColor(-16777216);
        o3Var.setVisibility(4);
        addView(o3Var, c8.na.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f36725n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, c8.na.e(-2, -2, 17));
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
