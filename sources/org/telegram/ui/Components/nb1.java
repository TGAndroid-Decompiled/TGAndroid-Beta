package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public final class nb1 implements cc1 {
    public final String f30838a;
    public final String f30839b;
    public final Context f30840c;
    public u7.s e;
    public dc1 f30841f;
    public ac1 f30842g;
    public ub1 h;
    public int f30843i;
    public int f30844j;
    public int f30845k;
    public boolean f30846l;
    public boolean f30848n;
    public boolean f30849o;
    public boolean f30850p;
    public int f30851q;
    public int f30852r;
    public String f30853s;
    public String f30854t;
    public String f30855u;
    public boolean f30857x;
    public String v = "{}";
    public String f30856w = "{}";
    public boolean f30847m = false;
    public final int d = 1;

    public nb1(Context context, String str, String str2) {
        this.f30840c = context.getApplicationContext();
        this.f30838a = str;
        this.f30839b = str2;
    }

    @Override
    public final void a(boolean z10) {
        if (this.f30857x != z10) {
            this.f30857x = z10;
            u7.s sVar = this.e;
            if (sVar != null) {
                sVar.getClass();
                jb1.y();
            }
        }
    }

    @Override
    public final void b(String str) {
        org.telegram.ui.ActionBar.r2 r2Var;
        if (this.e != null && !TextUtils.isEmpty(str)) {
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                r2Var = LaunchActivity.U();
            } else {
                r2Var = null;
            }
            if (r2Var != null) {
                if (str.length() > 80) {
                    str = str.substring(0, 80) + "…";
                }
                ic.a.s(R.string.WidgetTextCopied, new Object[]{str}, wc.b0(r2Var), R.raw.copy, 36);
            }
        }
    }

    @Override
    public final void c(String str) {
        ub1 ub1Var = this.h;
        if (ub1Var != null) {
            if (ub1Var.E || (ub1Var.f33353w && ub1Var.D)) {
                ub1Var.f33335a.c(str);
            }
        }
    }

    @Override
    public final void d(boolean z10, boolean z11, boolean z12) {
        ub1 ub1Var = this.h;
        if (ub1Var != null && ub1Var.f33353w && !ub1Var.f33354x) {
            ub1Var.k(z10, z11, z12);
        }
    }

    @Override
    public final void e(String str) {
        u7.s sVar = this.e;
        if (sVar != null) {
            sVar.getClass();
            FileLog.e("widget " + this.f30838a + ": " + str);
        }
        ub1 ub1Var = this.h;
        if (ub1Var != null) {
            ub1Var.f33335a.d();
        }
    }

    @Override
    public final void f(org.telegram.ui.Components.dc1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nb1.f(org.telegram.ui.Components.dc1):void");
    }

    @Override
    public final void g(JSONObject jSONObject) {
        org.telegram.ui.ActionBar.r2 U;
        int i10;
        bn0 bn0Var;
        if (this.e != null) {
            gb1 h = jb1.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.f28529w > 0 && (bn0Var = h.v) != null) {
                        view = bn0Var.n();
                    }
                    if (view != null) {
                        String optString2 = jSONObject.optString("haptic");
                        if ("selection".equals(optString2)) {
                            i10 = 4;
                        } else if ("notification".equals(optString2)) {
                            i10 = 16;
                        } else {
                            i10 = 3;
                        }
                        view.performHapticFeedback(i10);
                        return;
                    }
                    return;
                }
                return;
            }
            String optString3 = jSONObject.optString("url");
            boolean equals = "openTelegramLink".equals(optString);
            if (!TextUtils.isEmpty(optString3) && !jb1.f29629i && (U = LaunchActivity.U()) != null && U.getParentActivity() != null) {
                Activity parentActivity = U.getParentActivity();
                if (equals) {
                    qf.d.r(parentActivity, optString3);
                    return;
                }
                jb1.f29629i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, U.getResourceProvider());
                String string = LocaleController.getString(R.string.WidgetOpenLinkTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                e2Var.T = LocaleController.formatString(R.string.WidgetOpenLinkText, optString3);
                alertDialog$Builder.k(LocaleController.getString(R.string.Open), new p1(29, parentActivity, optString3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                e2Var.setOnDismissListener(new fi.e1(5));
                if (U.showDialog(e2Var) == null) {
                    jb1.f29629i = false;
                }
            }
        }
    }

    @Override
    public final void h(JSONObject jSONObject) {
        ub1 ub1Var;
        dc1 dc1Var;
        gb1 h;
        if (this.e != null) {
            String optString = jSONObject.optString("dead");
            if (!TextUtils.isEmpty(optString) && (h = jb1.h(this)) != null) {
                int i10 = h.B;
                int i11 = this.f30851q;
                if (i10 != i11) {
                    h.B = i11;
                    h.A++;
                    h.C = true;
                    FileLog.d("widget " + this.f30838a + " stopped (" + h.A + "): " + optString);
                    jb1.a(h);
                    jb1.b();
                }
            }
        }
        if (jSONObject.optBoolean("loaded") && this.f30842g != null && (dc1Var = this.f30841f) != null) {
            f(dc1Var);
        } else if (m() && (ub1Var = this.h) != null) {
            tb1 tb1Var = ub1Var.f33335a;
            tb1Var.e();
            tb1Var.d();
        }
    }

    @Override
    public final void i(final long j10, String str) {
        if (this.e != null) {
            gb1 h = jb1.h(this);
            if (h != null) {
                int i10 = h.f28512b;
                if (h.f28516i) {
                    TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
                    tL_messages_getBotWidgetQueryAnswer.peer = MessagesController.getInstance(i10).getInputPeer(h.f28513c);
                    tL_messages_getBotWidgetQueryAnswer.msg_id = h.d;
                    tL_messages_getBotWidgetQueryAnswer.data = str.getBytes(StandardCharsets.UTF_8);
                    final boolean[] zArr = new boolean[1];
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final bi.a0 a0Var = new bi.a0(zArr, connectionsManager, r7, this, j10, 14);
                    int[] iArr = {connectionsManager.sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            String str2;
                            TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                int i11 = 1;
                                zArr2[0] = true;
                                AndroidUtilities.cancelRunOnUIThread(a0Var);
                                nb1 nb1Var = this;
                                long j11 = j10;
                                if (tL_messages_botWidgetQueryAnswer != null) {
                                    String w10 = jb1.w(tL_messages_botWidgetQueryAnswer.result);
                                    dc1 dc1Var = nb1Var.f30841f;
                                    if (dc1Var != null) {
                                        dc1Var.a(0, w10, j11);
                                        return;
                                    }
                                    return;
                                }
                                if (tL_error != null) {
                                    str2 = tL_error.text;
                                } else {
                                    str2 = "";
                                }
                                if (!"WIDGET_RESPONSE_TIMEOUT".equals(str2)) {
                                    if (str2 != null && str2.startsWith("FLOOD_WAIT")) {
                                        i11 = 2;
                                    } else {
                                        i11 = 3;
                                    }
                                }
                                dc1 dc1Var2 = nb1Var.f30841f;
                                if (dc1Var2 != null) {
                                    dc1Var2.a(i11, null, j11);
                                }
                            }
                        }
                    })};
                    AndroidUtilities.runOnUIThread(a0Var, 30000L);
                    return;
                }
            }
            dc1 dc1Var = this.f30841f;
            if (dc1Var != null) {
                dc1Var.a(3, null, j10);
                return;
            }
            return;
        }
        dc1 dc1Var2 = this.f30841f;
        if (dc1Var2 != null) {
            dc1Var2.a(3, null, j10);
        }
    }

    @Override
    public final void j(String str, JSONObject jSONObject) {
        gb1 h;
        String str2;
        if (this.e != null && (h = jb1.h(this)) != null) {
            String a2 = h.a();
            JSONObject jSONObject2 = (JSONObject) jb1.f29626c.get(a2);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put(str, jSONObject);
            } catch (Exception unused) {
            }
            jb1.f29626c.put(a2, jSONObject2);
            for (gb1 gb1Var : jb1.f29624a.values()) {
                if (gb1Var.f28526s != null && a2.equals(gb1Var.a())) {
                    nb1 nb1Var = gb1Var.f28526s;
                    try {
                        str2 = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    nb1Var.f30854t = str2;
                    nb1Var.f30855u = jSONObject3;
                }
            }
            if ("local".equals(str)) {
                jb1.d.put(a2, h);
                k5 k5Var = jb1.e;
                AndroidUtilities.cancelRunOnUIThread(k5Var);
                AndroidUtilities.runOnUIThread(k5Var, 1000L);
            }
        }
    }

    public final void k() {
        int i10;
        dc1 dc1Var = this.f30841f;
        if (dc1Var != null && !dc1Var.f27412t && dc1Var.f27411s != 0 && !dc1Var.B) {
            ac1 ac1Var = dc1Var.E;
            if (ac1Var == null || (((i10 = dc1Var.D) != 0 && Math.abs(ac1Var.d - i10) > 1) || !ac1Var.a())) {
                dc1Var.B = true;
                WidgetSandboxNative.repaint(dc1Var.f27411s);
            }
        }
    }

    public final ac1 l() {
        ac1 ac1Var;
        dc1 dc1Var = this.f30841f;
        if (dc1Var == null) {
            ac1Var = null;
        } else {
            ac1Var = dc1Var.E;
        }
        if (ac1Var != null && (this.f30842g == null || dc1Var.f27413u)) {
            return ac1Var;
        }
        ac1 ac1Var2 = this.f30842g;
        if (ac1Var2 != null && Math.abs(ac1Var2.d - this.f30844j) <= 1) {
            return this.f30842g;
        }
        if (ac1Var != null) {
            return ac1Var;
        }
        return this.f30842g;
    }

    public final boolean m() {
        dc1 dc1Var;
        ac1 ac1Var;
        if (this.f30852r != this.f30851q && (dc1Var = this.f30841f) != null && (ac1Var = dc1Var.E) != null) {
            if (ac1Var.f26509g || dc1Var.f27414w) {
                this.f30852r = this.f30851q;
                if (this.e != null) {
                    jb1.b();
                    gb1 h = jb1.h(this);
                    if (h != null) {
                        jb1.a(h);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n(String str) {
        if (str != null && !str.equals(this.v)) {
            this.v = str;
            dc1 dc1Var = this.f30841f;
            if (dc1Var != null) {
                long j10 = dc1Var.f27411s;
                if (!dc1Var.f27412t && j10 != 0) {
                    WidgetSandboxNative.data(j10, str.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    public final void o(String str) {
        if (str != null && !str.equals(this.f30853s)) {
            this.f30853s = str;
            this.f30847m = str.contains("\"dark\"");
            dc1 dc1Var = this.f30841f;
            if (dc1Var != null) {
                dc1Var.e(str);
            }
        }
    }

    public final void p(boolean z10) {
        boolean z11;
        this.f30848n = z10;
        dc1 dc1Var = this.f30841f;
        if (dc1Var != null) {
            if (z10 && !this.f30850p) {
                z11 = true;
            } else {
                z11 = false;
            }
            dc1Var.f(z11);
        }
    }

    public final void q(int i10) {
        if (i10 > 0 && i10 != this.f30844j) {
            this.f30844j = i10;
            dc1 dc1Var = this.f30841f;
            if (dc1Var != null && i10 > 0 && i10 != dc1Var.D && !dc1Var.f27412t) {
                dc1Var.D = i10;
                long j10 = dc1Var.f27411s;
                if (j10 != 0) {
                    WidgetSandboxNative.width(j10, i10 / dc1Var.f27401i);
                }
            }
        }
    }

    public final void r() {
        this.f30849o = false;
        if (this.f30841f != null) {
            ac1 l4 = l();
            if (l4 != null) {
                this.f30842g = l4;
            }
            this.f30841f.b();
            this.f30841f = null;
            if (this.f30857x) {
                this.f30857x = false;
                u7.s sVar = this.e;
                if (sVar != null) {
                    sVar.getClass();
                    jb1.y();
                }
            }
        }
    }
}
