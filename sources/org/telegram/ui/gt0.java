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
public final class gt0 extends org.telegram.ui.Components.ze0 {
    public final Rect I;
    public final PhotoViewer J;

    public gt0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.g1 g1Var) {
        super(context);
        this.J = photoViewer;
        this.f35286a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.H = new org.telegram.ui.Components.ib0(this, 10);
        this.f35287b = photoViewer2;
        this.f35292r = g1Var;
        org.telegram.ui.Components.au auVar = new org.telegram.ui.Components.au(this, context, context, 1);
        this.f35290f = auVar;
        auVar.getSettings().setJavaScriptEnabled(true);
        auVar.getSettings().setDomStorageEnabled(true);
        auVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        auVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(auVar, true);
        auVar.setWebViewClient(new org.telegram.ui.Components.ve0(this, 0));
        addView(auVar, g7.e6.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35288c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, g7.e6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        j3.r0.w(org.telegram.ui.ActionBar.f6.f23369y6, null, false, textView, 17);
        linearLayout.addView(textView, g7.e6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f35289e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23179n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i10 = org.telegram.ui.ActionBar.v5.f23886a;
        textView2.setBackground(org.telegram.ui.ActionBar.v5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.v5.b(org.telegram.ui.ActionBar.f6.w0(null, i9, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, g7.e6.t(-2, -2, 1, 0, 8, 0, 0));
        fh.l2 l2Var = new fh.l2(this, context, 19);
        this.h = l2Var;
        l2Var.setBackgroundColor(-16777216);
        l2Var.setVisibility(4);
        addView(l2Var, g7.e6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f35291n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, g7.e6.e(-2, -2, 17));
        this.I = new Rect();
    }

    public final void j(Canvas canvas, int i9, int i10) {
        Bitmap bitmap = this.J.f35802y4.getBitmap();
        if (bitmap != null) {
            float min = Math.min(i9 / bitmap.getWidth(), i10 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * min);
            int height = (int) (bitmap.getHeight() * min);
            int i11 = (i10 - height) / 2;
            int i12 = (i9 - width) / 2;
            Rect rect = this.I;
            rect.set(i12, i11, width + i12, height + i11);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}
