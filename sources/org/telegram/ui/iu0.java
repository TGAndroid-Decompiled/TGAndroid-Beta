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
public final class iu0 extends org.telegram.ui.Components.qf0 {
    public final Rect M;
    public final PhotoViewer N;

    public iu0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.f1 f1Var) {
        super(context);
        this.N = photoViewer;
        this.f27319a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.bc0(this, 10);
        this.f27320b = photoViewer2;
        this.f27324r = f1Var;
        org.telegram.ui.Components.pu puVar = new org.telegram.ui.Components.pu(this, context, context, 1);
        this.f27322f = puVar;
        puVar.getSettings().setJavaScriptEnabled(true);
        puVar.getSettings().setDomStorageEnabled(true);
        puVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        puVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(puVar, true);
        puVar.setWebViewClient(new ni.i(this, 1));
        addView(puVar, w7.x5.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27321c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.i6.f19215y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.x5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f19018n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.y5.f19729a;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.i6.w0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 0, 8, 0, 0));
        ci.eb ebVar = new ci.eb(this, context, 20);
        this.h = ebVar;
        ebVar.setBackgroundColor(-16777216);
        ebVar.setVisibility(4);
        addView(ebVar, w7.x5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f27323n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.x5.e(-2, -2, 17));
        this.M = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap bitmap = this.N.C4.getBitmap();
        if (bitmap != null) {
            float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * min);
            int height = (int) (bitmap.getHeight() * min);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.M;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}
