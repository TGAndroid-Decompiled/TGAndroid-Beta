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

public final class ht0 extends org.telegram.ui.Components.df0 {
    public final Rect I;
    public final PhotoViewer J;

    public ht0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.f1 f1Var) {
        super(context);
        this.J = photoViewer;
        this.f27737a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.H = new org.telegram.ui.Components.mb0(this, 10);
        this.f27738b = photoViewer2;
        this.f27743r = f1Var;
        org.telegram.ui.Components.zt ztVar = new org.telegram.ui.Components.zt(this, context, context, 1);
        this.f27741f = ztVar;
        ztVar.getSettings().setJavaScriptEnabled(true);
        ztVar.getSettings().setDomStorageEnabled(true);
        ztVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        ztVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ztVar, true);
        ztVar.setWebViewClient(new org.telegram.ui.Components.ze0(this, 0));
        addView(ztVar, h7.z5.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f27739c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, h7.z5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.Cells.pa.s(org.telegram.ui.ActionBar.g6.f23423y6, null, false, textView, 17);
        linearLayout.addView(textView, h7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f27740e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f23234n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.w5.f23936a;
        textView2.setBackground(org.telegram.ui.ActionBar.w5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.w5.b(org.telegram.ui.ActionBar.g6.w0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        ag.s0 s0Var = new ag.s0(this, context, 19);
        this.h = s0Var;
        s0Var.setBackgroundColor(-16777216);
        s0Var.setVisibility(4);
        addView(s0Var, h7.z5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f27742n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, h7.z5.e(-2, -2, 17));
        this.I = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap bitmap = this.J.f35805y4.getBitmap();
        if (bitmap != null) {
            float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * fMin);
            int height = (int) (bitmap.getHeight() * fMin);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.I;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}
