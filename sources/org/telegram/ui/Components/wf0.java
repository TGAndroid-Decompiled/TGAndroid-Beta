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
public abstract class wf0 extends FrameLayout {
    public float B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public dc0 I;
    public int f30237a;
    public PhotoViewer f30238b;
    public LinearLayout f30239c;
    public TextView d;
    public TextView e;
    public iu f30240f;
    public eg.h0 h;
    public RadialProgressView f30241n;
    public View f30242r;
    public String f30243s;
    public ArrayList v;
    public String f30244w;
    public boolean f30245x;
    public TLRPC.WebPage f30246y;

    public static void a(org.telegram.ui.ut0 ut0Var, String str) {
        String str2;
        double ceil;
        int videoDuration = ut0Var.getVideoDuration() / 1000;
        ArrayList arrayList = ut0Var.v;
        arrayList.clear();
        if (videoDuration > 15) {
            String[] split = str.split("\\|");
            String r10 = android.support.v4.media.a.r(new StringBuilder(), split[0].split("\\$")[0], "2/");
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
                arrayList.add(r10 + "M" + i11 + str3 + "&sigh=" + str2);
            }
        }
    }

    public final void b(boolean z4) {
        dc0 dc0Var = this.I;
        if (!z4 && this.D) {
            AndroidUtilities.runOnUIThread(dc0Var, 500L);
        } else if (z4 && !this.D) {
            AndroidUtilities.cancelRunOnUIThread(dc0Var);
        }
    }

    public final java.lang.String c(int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wf0.c(int):java.lang.String");
    }

    public final boolean d() {
        return this.f30245x;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.H) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        boolean z4;
        if (this.f30245x && "inapp".equals(MessagesController.getInstance(this.f30237a).youtubePipType)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getContext())) {
            z4.B((Activity) getContext(), null, false);
            return false;
        } else if (this.f30241n.getVisibility() == 0) {
            return false;
        } else {
            if (mg0.m0.M) {
                mg0.j(false);
                AndroidUtilities.runOnUIThread(new rf0(this, 0), 300L);
                return true;
            }
            this.h.setVisibility(0);
            Activity activity = (Activity) getContext();
            iu iuVar = this.f30240f;
            TLRPC.WebPage webPage = this.f30246y;
            if (mg0.x(z4, activity, this, iuVar, webPage.embed_width, webPage.embed_height, false)) {
                mg0.w(PhotoViewer.t1());
            }
            return true;
        }
    }

    public final void f() {
        if (this.D && this.f30245x) {
            h("pauseVideo();");
            this.D = false;
            b(true);
        }
    }

    public final void g() {
        if (!this.D && this.f30245x) {
            h("playVideo();");
            this.D = true;
            b(false);
        }
    }

    public float getBufferedPosition() {
        return this.G;
    }

    public int getCurrentPosition() {
        return this.F;
    }

    public int getVideoDuration() {
        return this.E;
    }

    public WebView getWebView() {
        return this.f30240f;
    }

    public final void h(String str) {
        this.f30240f.evaluateJavascript(str, null);
    }

    public final void i(long j10) {
        boolean z4 = this.D;
        this.F = (int) j10;
        if (z4) {
            f();
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new gg.y1(this, j10, 17), 100L);
            return;
        }
        h("seekTo(" + Math.round(((float) j10) / 1000.0f) + ", true);");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iu iuVar = this.f30240f;
        if (iuVar.getParent() == this) {
            TLRPC.WebPage webPage = this.f30246y;
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
            float f10 = i12;
            float f11 = i13;
            float min = Math.min(size / f10, size2 / f11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) iuVar.getLayoutParams();
            int i15 = (int) (f10 * min);
            layoutParams.width = i15;
            int i16 = (int) (f11 * min);
            layoutParams.height = i16;
            layoutParams.topMargin = (size2 - i16) / 2;
            layoutParams.leftMargin = (size - i15) / 2;
        }
        super.onMeasure(i10, i11);
    }

    public void setPlaybackSpeed(float f10) {
        this.B = f10;
        if (this.f30241n.getVisibility() != 0) {
            if (this.f30245x) {
                h("setPlaybackSpeed(" + f10 + ");");
                return;
            }
            return;
        }
        this.C = true;
    }

    public void setTouchDisabled(boolean z4) {
        this.H = z4;
    }
}
