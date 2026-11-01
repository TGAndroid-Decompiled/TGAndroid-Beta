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
public final class lr0 extends org.telegram.ui.Components.ve0 {
    public final Rect M;
    public final PhotoViewer N;

    public lr0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.b1 b1Var) {
        super(context);
        this.N = photoViewer;
        this.f31269a = org.telegram.messenger.e20.f15506s0;
        this.f31276w = new ArrayList();
        this.L = new org.telegram.ui.Components.eb0(this, 10);
        this.f31270b = photoViewer2;
        this.f31274r = b1Var;
        org.telegram.ui.Components.cu cuVar = new org.telegram.ui.Components.cu(this, context, context, 1);
        this.f31272f = cuVar;
        cuVar.getSettings().setJavaScriptEnabled(true);
        cuVar.getSettings().setDomStorageEnabled(true);
        cuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        cuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(cuVar, true);
        cuVar.setWebViewClient(new ji.i(this, 3));
        addView(cuVar, w7.b6.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31271c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.b6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, null);
        textView.setGravity(17);
        linearLayout.addView(textView, w7.b6.r(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.t6.f21116n6;
        org.telegram.ui.ActionBar.a7.V(textView2, i10, null);
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        int i11 = org.telegram.ui.ActionBar.j6.f20447a;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.d(0, org.telegram.ui.ActionBar.j6.b(org.telegram.ui.ActionBar.t6.x0(null, i10, false)), 12.0f));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 1, 0, 8, 0, 0));
        bi.t0 t0Var = new bi.t0(this, context, 16);
        this.h = t0Var;
        t0Var.setBackgroundColor(-16777216);
        t0Var.setVisibility(4);
        addView(t0Var, w7.b6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f31273n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.b6.e(-2, -2, 17));
        this.M = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap n10 = this.N.C4.n();
        if (n10 != null) {
            float min = Math.min(i10 / n10.getWidth(), i11 / n10.getHeight());
            int width = (int) (n10.getWidth() * min);
            int height = (int) (n10.getHeight() * min);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.M;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(n10, (Rect) null, rect, (Paint) null);
        }
    }
}
