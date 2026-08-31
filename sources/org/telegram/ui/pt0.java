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
public final class pt0 extends org.telegram.ui.Components.xf0 {
    public final Rect J;
    public final PhotoViewer K;

    public pt0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.g1 g1Var) {
        super(context);
        this.K = photoViewer;
        this.f33059a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.I = new org.telegram.ui.Components.ec0(this, 10);
        this.f33060b = photoViewer2;
        this.f33065r = g1Var;
        org.telegram.ui.Components.lu luVar = new org.telegram.ui.Components.lu(this, context, context, 1);
        this.f33063f = luVar;
        luVar.getSettings().setJavaScriptEnabled(true);
        luVar.getSettings().setDomStorageEnabled(true);
        luVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        luVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(luVar, true);
        luVar.setWebViewClient(new org.telegram.ui.Components.tf0(this, 0));
        addView(luVar, k7.c6.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33061c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, k7.c6.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        yh.t(org.telegram.ui.ActionBar.k6.f22036y6, null, false, textView, 17);
        linearLayout.addView(textView, k7.c6.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.f33062e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f21839n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i11 = org.telegram.ui.ActionBar.a6.f21184a;
        textView2.setBackground(org.telegram.ui.ActionBar.a6.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.a6.b(org.telegram.ui.ActionBar.k6.w0(null, i10, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 1, 0, 8, 0, 0));
        fg.h0 h0Var = new fg.h0(this, context, 15);
        this.h = h0Var;
        h0Var.setBackgroundColor(-16777216);
        h0Var.setVisibility(4);
        addView(h0Var, k7.c6.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f33064n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, k7.c6.e(-2, -2, 17));
        this.J = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap bitmap = this.K.z4.getBitmap();
        if (bitmap != null) {
            float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * min);
            int height = (int) (bitmap.getHeight() * min);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.J;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}
