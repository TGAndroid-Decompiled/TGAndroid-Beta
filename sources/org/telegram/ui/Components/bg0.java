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
public abstract class bg0 extends FrameLayout {
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public jc0 L;
    public int f23004a;
    public PhotoViewer f23005b;
    public LinearLayout f23006c;
    public TextView d;
    public TextView e;
    public ru f23007f;
    public ci.bb h;
    public RadialProgressView f23008n;
    public View f23009r;
    public String f23010s;
    public ArrayList v;
    public String f23011w;
    public boolean f23012x;
    public TLRPC.WebPage f23013y;

    public static void a(org.telegram.ui.au0 au0Var, String str) {
        String str2;
        double ceil;
        int videoDuration = au0Var.getVideoDuration() / 1000;
        ArrayList arrayList = au0Var.v;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String t10 = a4.a.t(new StringBuilder(), split[0].split("\\$")[0], "2/");
            String str3 = split[0].split("\\$N")[1];
            if (split.length == 3) {
                str2 = split[2].split("M#")[1];
            } else if (split.length == 2) {
                str2 = split[1].split("t#")[1];
            } else {
                str2 = split[3].split("M#")[1];
            }
            if (videoDuration <= 100) {
                ceil = Math.ceil(videoDuration / 25.0f);
            } else if (videoDuration <= 250) {
                ceil = Math.ceil((videoDuration / 2.0f) / 25.0f);
            } else if (videoDuration <= 500) {
                ceil = Math.ceil((videoDuration / 4.0f) / 25.0f);
            } else if (videoDuration <= 1000) {
                ceil = Math.ceil((videoDuration / 5.0f) / 25.0f);
            } else {
                ceil = Math.ceil((videoDuration / 10.0f) / 25.0f);
            }
            int i10 = (int) ceil;
            for (int i11 = 0; i11 < i10; i11++) {
                Locale locale = Locale.ROOT;
                arrayList.add(t10 + "M" + i11 + str3 + "&sigh=" + str2);
            }
        }
    }

    public final void b(boolean z10) {
        jc0 jc0Var = this.L;
        if (!z10 && this.G) {
            AndroidUtilities.runOnUIThread(jc0Var, 500L);
        } else if (z10 && !this.G) {
            AndroidUtilities.cancelRunOnUIThread(jc0Var);
        }
    }

    public final java.lang.String c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bg0.c(int):java.lang.String");
    }

    public final boolean d() {
        return this.f23012x;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z10;
        if (this.f23012x && "inapp".equals(MessagesController.getInstance(this.f23004a).youtubePipType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            e5.B((Activity) getContext(), null, false);
            return false;
        } else if (this.f23008n.getVisibility() == 0) {
            return false;
        } else {
            if (pg0.f27353p0.P) {
                pg0.j(false);
                AndroidUtilities.runOnUIThread(new xf0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            Activity activity = (Activity) getContext();
            ru ruVar = this.f23007f;
            TLRPC.WebPage webPage = this.f23013y;
            if (pg0.x(z10, activity, this, ruVar, webPage.embed_width, webPage.embed_height, false)) {
                pg0.w(PhotoViewer.t1());
            }
            return true;
        }
    }

    public final void f() {
        if (this.G && this.f23012x) {
            h("pauseVideo();");
            this.G = false;
            b(true);
        }
    }

    public final void g() {
        if (!this.G && this.f23012x) {
            h("playVideo();");
            this.G = true;
            b(false);
        }
    }

    public float getBufferedPosition() {
        return this.J;
    }

    public int getCurrentPosition() {
        return this.I;
    }

    public int getVideoDuration() {
        return this.H;
    }

    public WebView getWebView() {
        return this.f23007f;
    }

    public final void h(String str) {
        this.f23007f.evaluateJavascript(str, null);
    }

    public final void i(long j3) {
        boolean z10 = this.G;
        this.I = (int) j3;
        if (z10) {
            f();
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ai.j(this, j3, 21), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ru ruVar = this.f23007f;
        if (ruVar.getParent() == this) {
            TLRPC.WebPage webPage = this.f23013y;
            int i12 = webPage.embed_width;
            int i13 = 100;
            if (i12 == 0) {
                i12 = 100;
            }
            int i14 = webPage.embed_height;
            if (i14 != 0) {
                i13 = i14;
            }
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            float f7 = i12;
            float f10 = i13;
            float min = Math.min(size / f7, size2 / f10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ruVar.getLayoutParams();
            int i15 = (int) (f7 * min);
            layoutParams.width = i15;
            int i16 = (int) (f10 * min);
            layoutParams.height = i16;
            layoutParams.topMargin = (size2 - i16) / 2;
            layoutParams.leftMargin = (size - i15) / 2;
        }
        super.onMeasure(i10, i11);
    }

    public void setPlaybackSpeed(float f7) {
        this.E = f7;
        if (this.f23008n.getVisibility() != 0) {
            if (this.f23012x) {
                h("setPlaybackSpeed(" + f7 + ");");
                return;
            }
            return;
        }
        this.F = true;
    }

    public void setTouchDisabled(boolean z10) {
        this.K = z10;
    }
}
