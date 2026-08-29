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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.RadialProgressView;
public final class et0 extends org.telegram.ui.Components.mf0 {
    public final Rect I;
    public final PhotoViewer J;

    public et0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.g1 g1Var) {
        super(context);
        this.J = photoViewer;
        this.f30671a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.H = new org.telegram.ui.Components.xb0(this, 10);
        this.f30672b = photoViewer2;
        this.f30677r = g1Var;
        org.telegram.ui.Components.gu guVar = new org.telegram.ui.Components.gu(this, context, context, 1);
        this.f30675f = guVar;
        guVar.getSettings().setJavaScriptEnabled(true);
        guVar.getSettings().setDomStorageEnabled(true);
        guVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        guVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(guVar, true);
        guVar.setWebViewClient(new org.telegram.ui.Components.if0(this, 0));
        addView(guVar, i7.f6.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f30673c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, i7.f6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        th.s(org.telegram.ui.ActionBar.g6.f23433y6, null, false, textView, 17);
        linearLayout.addView(textView, i7.f6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f30674e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23241n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.w5.f23945a;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.w0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 0, 8, 0, 0));
        cg.h0 h0Var = new cg.h0(this, context, 17);
        this.h = h0Var;
        h0Var.setBackgroundColor(-16777216);
        h0Var.setVisibility(4);
        addView(h0Var, i7.f6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f30676n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, i7.f6.e(-2, -2, 17));
        this.I = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap bitmap = this.J.f35869y4.getBitmap();
        if (bitmap != null) {
            float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * min);
            int height = (int) (bitmap.getHeight() * min);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.I;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}
