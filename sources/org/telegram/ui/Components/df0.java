package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Build;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

public abstract class df0 extends FrameLayout {
    public float A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public float F;
    public boolean G;
    public mb0 H;

    public int f27737a;

    public PhotoViewer f27738b;

    public LinearLayout f27739c;
    public TextView d;

    public TextView f27740e;

    public zt f27741f;
    public ag.s0 h;

    public RadialProgressView f27742n;

    public View f27743r;

    public String f27744s;
    public ArrayList v;

    public String f27745w;

    public boolean f27746x;

    public TLRPC.WebPage f27747y;

    public static void a(org.telegram.ui.ht0 ht0Var, String str) {
        double dCeil;
        int videoDuration = ht0Var.getVideoDuration() / 1000;
        ArrayList arrayList = ht0Var.v;
        arrayList.clear();
        if (videoDuration <= 15) {
            return;
        }
        String[] strArrSplit = str.split("\\|");
        String strP = a9.p.p(new StringBuilder(), strArrSplit[0].split("\\$")[0], "2/");
        String str2 = strArrSplit[0].split("\\$N")[1];
        String str3 = strArrSplit.length == 3 ? strArrSplit[2].split("M#")[1] : strArrSplit.length == 2 ? strArrSplit[1].split("t#")[1] : strArrSplit[3].split("M#")[1];
        if (videoDuration <= 100) {
            dCeil = Math.ceil(videoDuration / 25.0f);
        } else if (videoDuration <= 250) {
            dCeil = Math.ceil((videoDuration / 2.0f) / 25.0f);
        } else if (videoDuration <= 500) {
            dCeil = Math.ceil((videoDuration / 4.0f) / 25.0f);
        } else {
            dCeil = videoDuration <= 1000 ? Math.ceil((videoDuration / 5.0f) / 25.0f) : Math.ceil((videoDuration / 10.0f) / 25.0f);
        }
        int i10 = (int) dCeil;
        for (int i11 = 0; i11 < i10; i11++) {
            Locale locale = Locale.ROOT;
            arrayList.add(strP + "M" + i11 + str2 + "&sigh=" + str3);
        }
    }

    public final void b(boolean z10) {
        mb0 mb0Var = this.H;
        if (!z10 && this.C) {
            AndroidUtilities.runOnUIThread(mb0Var, 500L);
        } else {
            if (!z10 || this.C) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(mb0Var);
        }
    }

    public final String c(int i10) {
        float f10;
        int i11;
        ArrayList arrayList = this.v;
        int videoDuration = getVideoDuration() / 1000;
        if (videoDuration > 100) {
            if (videoDuration <= 250) {
                i11 = ((int) (i10 / 2.0f)) / 25;
            } else if (videoDuration <= 500) {
                i11 = ((int) (i10 / 4.0f)) / 25;
            } else if (videoDuration <= 1000) {
                i11 = ((int) (i10 / 5.0f)) / 25;
            } else {
                f10 = i10 / 10.0f;
            }
            if (i11 < arrayList.size()) {
                return (String) arrayList.get(i11);
            }
            return null;
        }
        f10 = i10;
        i11 = (int) (f10 / 25.0f);
        if (i11 < arrayList.size()) {
            return (String) arrayList.get(i11);
        }
        return null;
    }

    public final boolean d() {
        return this.f27746x;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.G) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z10 = this.f27746x && "inapp".equals(MessagesController.getInstance(this.f27737a).youtubePipType);
        if (!z10 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            y4.B((Activity) getContext(), null, false);
            return false;
        }
        if (this.f27742n.getVisibility() == 0) {
            return false;
        }
        if (sf0.f32415l0.L) {
            sf0.j(false);
            AndroidUtilities.runOnUIThread(new ye0(this, 0), 300L);
            return true;
        }
        this.h.setVisibility(0);
        Activity activity = (Activity) getContext();
        zt ztVar = this.f27741f;
        TLRPC.WebPage webPage = this.f27747y;
        if (sf0.x(z10, activity, this, ztVar, webPage.embed_width, webPage.embed_height, false)) {
            sf0.w(PhotoViewer.t1());
        }
        return true;
    }

    public final void f() {
        if (this.C && this.f27746x) {
            h("pauseVideo();");
            this.C = false;
            b(true);
        }
    }

    public final void g() {
        if (this.C || !this.f27746x) {
            return;
        }
        h("playVideo();");
        this.C = true;
        b(false);
    }

    public float getBufferedPosition() {
        return this.F;
    }

    public int getCurrentPosition() {
        return this.E;
    }

    public int getVideoDuration() {
        return this.D;
    }

    public WebView getWebView() {
        return this.f27741f;
    }

    public final void h(String str) {
        this.f27741f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z10 = this.C;
        this.E = (int) j10;
        if (z10) {
            f();
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new cg.b2(this, j10, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(j10 / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        zt ztVar = this.f27741f;
        if (ztVar.getParent() == this) {
            TLRPC.WebPage webPage = this.f27747y;
            int i12 = webPage.embed_width;
            if (i12 == 0) {
                i12 = 100;
            }
            int i13 = webPage.embed_height;
            int i14 = i13 != 0 ? i13 : 100;
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            float f10 = i12;
            float f11 = i14;
            float fMin = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ztVar.getLayoutParams();
            int i15 = (int) (f10 * fMin);
            layoutParams.width = i15;
            int i16 = (int) (f11 * fMin);
            layoutParams.height = i16;
            layoutParams.topMargin = (size2 - i16) / 2;
            layoutParams.leftMargin = (size - i15) / 2;
        }
        super.onMeasure(i10, i11);
    }

    public void setPlaybackSpeed(float f10) {
        this.A = f10;
        if (this.f27742n.getVisibility() == 0) {
            this.B = true;
        } else if (this.f27746x) {
            h("setPlaybackSpeed(" + f10 + ");");
        }
    }

    public void setTouchDisabled(boolean z10) {
        this.G = z10;
    }
}
