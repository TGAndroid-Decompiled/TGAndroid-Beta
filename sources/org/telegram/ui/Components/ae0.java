package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public abstract class ae0 extends FrameLayout {
    public TLRPC.WebPage E;
    public float F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public wa0 M;
    public int f32968a;
    public PhotoViewer f32969b;
    public LinearLayout f32970c;
    public TextView d;
    public TextView f32971e;
    public xt f32972f;
    public bi.o2 h;
    public RadialProgressView f32973n;
    public View f32974r;
    public String f32975s;
    public ArrayList f32976w;
    public String f32977x;
    public boolean f32978y;

    public static void a(org.telegram.ui.bq0 bq0Var, String str) {
        String str2;
        double ceil;
        int videoDuration = bq0Var.getVideoDuration() / 1000;
        ArrayList arrayList = bq0Var.f32976w;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String s5 = a8.p0.s(new StringBuilder(), split[0].split("\\$")[0], "2/");
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
            int i7 = (int) ceil;
            for (int i10 = 0; i10 < i7; i10++) {
                Locale locale = Locale.ROOT;
                arrayList.add(s5 + "M" + i10 + str3 + "&sigh=" + str2);
            }
        }
    }

    public final void b(boolean z10) {
        wa0 wa0Var = this.M;
        if (!z10 && this.H) {
            org.telegram.messenger.g0.i3(wa0Var, 500L);
        } else if (z10 && !this.H) {
            org.telegram.messenger.g0.r(wa0Var);
        }
    }

    public final java.lang.String c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ae0.c(int):java.lang.String");
    }

    public final boolean d() {
        return this.f32978y;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.L) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        if (this.f32973n.getVisibility() != 0) {
            wi.n c10 = l2.i.d().c();
            if (c10 != null) {
                c10.b();
                org.telegram.messenger.g0.i3(new wd0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            PhotoViewer photoViewer = this.f32969b;
            if (photoViewer.E != null && photoViewer.f42772g0 != null) {
                photoViewer.T0();
                photoViewer.P8.g(photoViewer.E, null, true);
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.H && this.f32978y) {
            h("pauseVideo();");
            this.H = false;
            b(true);
        }
    }

    public final void g() {
        if (!this.H && this.f32978y) {
            h("playVideo();");
            this.H = true;
            b(false);
        }
    }

    public float getBufferedPosition() {
        return this.K;
    }

    public int getCurrentPosition() {
        return this.J;
    }

    public int getEmbedHeight() {
        TLRPC.WebPage webPage = this.E;
        if (webPage != null) {
            return webPage.embed_height;
        }
        return 0;
    }

    public int getEmbedWidth() {
        TLRPC.WebPage webPage = this.E;
        if (webPage != null) {
            return webPage.embed_width;
        }
        return 0;
    }

    public int getVideoDuration() {
        return this.I;
    }

    public WebView getWebView() {
        return this.f32972f;
    }

    public final void h(String str) {
        this.f32972f.evaluateJavascript(str, null);
    }

    public final void i(long j3) {
        boolean z10 = this.H;
        this.J = (int) j3;
        if (z10) {
            f();
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new di.x2(this, j3, 23), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j3) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        xt xtVar = this.f32972f;
        if (xtVar.getParent() == this) {
            TLRPC.WebPage webPage = this.E;
            int i11 = webPage.embed_width;
            int i12 = 100;
            if (i11 == 0) {
                i11 = 100;
            }
            int i13 = webPage.embed_height;
            if (i13 != 0) {
                i12 = i13;
            }
            int size = View.MeasureSpec.getSize(i7);
            int size2 = View.MeasureSpec.getSize(i10);
            float f10 = i11;
            float f11 = i12;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) xtVar.getLayoutParams();
            int i14 = (int) (f10 * min);
            layoutParams.width = i14;
            int i15 = (int) (f11 * min);
            layoutParams.height = i15;
            layoutParams.topMargin = (size2 - i15) / 2;
            layoutParams.leftMargin = (size - i14) / 2;
        }
        super.onMeasure(i7, i10);
    }

    public void setPlaybackSpeed(float f10) {
        this.F = f10;
        if (this.f32973n.getVisibility() != 0) {
            if (this.f32978y) {
                h("setPlaybackSpeed(" + f10 + ");");
                return;
            }
            return;
        }
        this.G = true;
    }

    public void setTouchDisabled(boolean z10) {
        this.L = z10;
    }
}
