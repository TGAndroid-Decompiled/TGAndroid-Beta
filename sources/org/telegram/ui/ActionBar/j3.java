package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.net.URLEncoder;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.mk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.ql;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xv;
import org.telegram.ui.Components.yt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.cn;
import org.telegram.ui.e7;
import org.telegram.ui.fj;
import org.telegram.ui.fk;
import org.telegram.ui.ie;
import org.telegram.ui.nm;
import org.telegram.ui.qc;
import org.telegram.ui.qn;
import org.telegram.ui.rc;
import org.telegram.ui.t21;
import org.telegram.ui.tn;
import org.telegram.ui.vc;
public final class j3 implements Utilities.Callback {
    public final int f21418a;
    public final Object f21419b;
    public final Object f21420c;

    public j3(int i10, Object obj, Object obj2) {
        this.f21418a = i10;
        this.f21420c = obj;
        this.f21419b = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        int i12;
        String userName;
        boolean z10;
        qn qnVar;
        fk fkVar;
        org.telegram.ui.web.f2 f2Var;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        int i19;
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        TLRPC.User user;
        boolean z12;
        switch (this.f21418a) {
            case 0:
                n3 n3Var = (n3) this.f21420c;
                m3 m3Var = (m3) this.f21419b;
                n2 n2Var = (n2) obj;
                if (n2Var != null) {
                    boolean z13 = true;
                    if ((n2Var instanceof qn) && (fkVar = (qnVar = (qn) n2Var).Y) != null) {
                        fkVar.N();
                        qnVar.Y.l0(true, false, true);
                    }
                    if (n2Var.getContext() != null && n2Var.getParentActivity() != null) {
                        gi.d3 d3Var = new gi.d3(n2Var.getContext(), n2Var.getResourceProvider());
                        d3Var.f11148k0 = n2Var.getParentActivity();
                        if (m3Var != null && m3Var.f21582a != null) {
                            d3Var.E0 = true;
                            boolean z14 = m3Var.f21593o;
                            d3Var.V = z14;
                            if (z14) {
                                d3Var.w(m3Var.f21596r, false);
                            }
                            if (!m3Var.f21592n) {
                                int i20 = m3Var.f21594p;
                                if (i20 < 0) {
                                    i20 = h6.f20990d6;
                                }
                                i10 = h6.w0(i20, d3Var.E);
                            } else {
                                i10 = m3Var.f21595q;
                            }
                            d3Var.u(i10, m3Var.f21592n, false);
                            d3Var.z(m3Var.f21597s, false);
                            d3Var.F0 = m3Var.f21588j;
                            d3Var.G0 = m3Var.f21589k;
                            boolean z15 = m3Var.f21599u;
                            d3Var.f11163w0 = z15;
                            gi.v2 v2Var = d3Var.f11164x;
                            v2Var.setIsBackButtonVisible(z15);
                            d3Var.v.setAllowSwipes(m3Var.f21590l);
                            ImageView backButton = d3Var.W.getBackButton();
                            if (d3Var.f11163w0) {
                                i11 = R.drawable.ic_ab_back;
                            } else {
                                i11 = R.drawable.ic_close_white;
                            }
                            AndroidUtilities.updateImageViewImageAnimated(backButton, i11);
                            BotFullscreenButtons botFullscreenButtons = d3Var.m0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(d3Var.f11163w0, false);
                            }
                            d3Var.f11156r0 = m3Var.f21602y;
                            d3Var.f11168z0 = Boolean.valueOf(m3Var.B);
                            d3Var.A0 = m3Var.C;
                            gi.y0 y0Var = m3Var.K;
                            d3Var.B0 = y0Var;
                            if (y0Var != null) {
                                gi.w0 w0Var = y0Var.f11562r;
                                SensorManager sensorManager = y0Var.f11548a;
                                if (y0Var.f11556l) {
                                    y0Var.f11556l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = y0Var.f11549b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(y0Var.f11558n, sensor, gi.y0.a(y0Var.f11550c));
                                        }
                                        Sensor sensor2 = y0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(y0Var.f11560p, sensor2, gi.y0.a(y0Var.e));
                                        }
                                        Sensor sensor3 = y0Var.f11552g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(w0Var, sensor3, gi.y0.a(y0Var.h));
                                        }
                                        Sensor sensor4 = y0Var.f11551f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(w0Var, sensor4, gi.y0.a(y0Var.h));
                                        }
                                        Sensor sensor5 = y0Var.f11553i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(y0Var.f11564t, sensor5, gi.y0.a(y0Var.f11554j));
                                        }
                                    }
                                }
                            }
                            a5.a aVar = m3Var.f21600w;
                            if (aVar != null) {
                                gi.z2 z2Var = d3Var.f11149l0;
                                int totalHeight = z2Var.getTotalHeight();
                                z2Var.e = aVar;
                                gi.u[] uVarArr = z2Var.f11519f;
                                gi.w.b(uVarArr[0].f11488l, (gi.v) aVar.f282c, false);
                                gi.w.b(uVarArr[1].f11488l, (gi.v) aVar.d, false);
                                z2Var.invalidate();
                                if (totalHeight != z2Var.getTotalHeight() && z2Var.f11521r != null) {
                                    if (totalHeight < z2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(z2Var.f11521r, 200L);
                                    } else {
                                        z2Var.f11521r.run();
                                    }
                                }
                                int i21 = aVar.f281b;
                                Paint paint = z2Var.f11516a;
                                z2Var.e.f281b = i21;
                                paint.setColor(i21);
                                z2Var.d.a(i21, true);
                            }
                            d3Var.y(m3Var.f21603z, false, m3Var.A);
                            gi.t4 t4Var = m3Var.f21582a;
                            if (t4Var != null) {
                                i12 = t4Var.f11465a;
                            } else {
                                i12 = UserConfig.selectedAccount;
                            }
                            d3Var.G = i12;
                            org.telegram.ui.web.x0 x0Var = m3Var.f21583b;
                            if (x0Var != null) {
                                x0Var.onResume();
                                v2Var.N(d3Var.G, m3Var.f21583b, m3Var.d, m3Var.f21585f, m3Var.e);
                                if (!m3Var.f21598t && !m3Var.f21583b.f42846b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str5 = m3Var.f21601x;
                                v2Var.g("setState(" + z10 + ", " + str5 + ")");
                                v2Var.N = z10;
                                v2Var.f42563b = str5;
                                if (h6.I.q() != m3Var.D) {
                                    v2Var.z();
                                }
                            } else {
                                t4Var.f11478q = null;
                                t4Var.f11479r = 0L;
                            }
                            d3Var.t(n2Var, m3Var.f21582a);
                            d3Var.f11137b0 = m3Var.v;
                            if (m3Var.G) {
                                d3Var.S0 = true;
                                d3Var.i();
                                org.telegram.ui.f3 f3Var = d3Var.U0;
                                if (d3Var.m()) {
                                    userName = d3Var.f11161v0.e;
                                } else {
                                    userName = UserObject.getUserName(MessagesController.getInstance(d3Var.G).getUser(Long.valueOf(d3Var.H)));
                                }
                                String str6 = m3Var.H;
                                d3Var.T0 = str6;
                                f3Var.a(userName, str6);
                                org.telegram.ui.f3 f3Var2 = d3Var.U0;
                                Paint paint2 = d3Var.P;
                                if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) > 0.721f) {
                                    z13 = false;
                                }
                                f3Var2.b(z13, false);
                                d3Var.U0.setBackgroundColor(paint2.getColor());
                                d3Var.U0.setVisibility(0);
                                d3Var.U0.setAlpha(1.0f);
                            }
                            d3Var.p(m3Var.L);
                            n3Var.h(n3Var.f21620w, m3Var, false);
                            d3Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                t3 t3Var = (t3) this.f21420c;
                ((m3) this.f21419b).f21591m = (Bitmap) obj;
                t3Var.mo36getWindowView().setDrawingFromOverlay(false);
                t3Var.release();
                return;
            case 2:
                v3 v3Var = (v3) this.f21419b;
                w3 w3Var = ((s3) this.f21420c).f21709p;
                if (((Boolean) obj).booleanValue()) {
                    v3Var.a(1.0f);
                    if (w3Var.f21833a.getTabs().isEmpty()) {
                        w3Var.a(false);
                        return;
                    }
                    return;
                }
                v3Var.a(0.0f);
                return;
            case 3:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f21420c;
                Activity activity = (Activity) this.f21419b;
                Integer num = (Integer) obj;
                org.telegram.ui.x3 x3Var = l4Var.K;
                org.telegram.ui.m0[] m0VarArr = l4Var.S0;
                if ((!l4Var.f38778u0[0].c() || l4Var.f38778u0[0].f39754c.E != null) && l4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.n0 n0Var = l4Var.f38766h0;
                        int dp = AndroidUtilities.dp(56.0f);
                        l4Var.I0 = dp;
                        n0Var.setHeight(dp);
                        l4Var.f38766h0.h(true);
                        return;
                    }
                    org.telegram.ui.b0 b0Var = null;
                    ci.b bVar = null;
                    org.telegram.ui.b0 b0Var2 = null;
                    if (num.intValue() == 2) {
                        if (l4Var.f38778u0[0].f()) {
                            if (l4Var.f38778u0[0].getWebView() != null) {
                                str4 = l4Var.f38778u0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = l4Var.f38778u0[0].f39754c.E;
                            if (webPage != null) {
                                str4 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = org.telegram.ui.web.a1.u(str4);
                        Activity activity2 = l4Var.L;
                        if (AndroidUtilities.computePerceivedBrightness(l4Var.f38766h0.getBackgroundColor()) < 0.721f) {
                            bVar = new ci.b();
                        }
                        l4Var.a0(new fr0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (l4Var.f38778u0[0].f()) {
                            if (l4Var.f38778u0[0].getWebView() != null) {
                                str3 = l4Var.f38778u0[0].getWebView().getUrl();
                                frameLayout = l4Var.f38778u0[0].f39755f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.o3 o3Var = l4Var.f38778u0[0];
                            TLRPC.WebPage webPage2 = o3Var.f39754c.E;
                            if (webPage2 != null) {
                                str3 = webPage2.url;
                                frameLayout = o3Var;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.l4.f(str3, l4Var.X, frameLayout, x3Var, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj2 = new Object();
                        obj2.f21556a = true;
                        n2 U = LaunchActivity.U();
                        if (U != 0) {
                            if (x3Var != null) {
                                b0Var2 = new org.telegram.ui.b0(l4Var, 5);
                            }
                            U.showAsSheet(new org.telegram.ui.web.p(b0Var2, new org.telegram.ui.r(l4Var, 2)), obj2);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj3 = new Object();
                        obj3.f21556a = true;
                        n2 U2 = LaunchActivity.U();
                        if (U2 != 0) {
                            if (x3Var != null) {
                                b0Var = new org.telegram.ui.b0(l4Var, 6);
                            }
                            U2.showAsSheet(new org.telegram.ui.web.f1(b0Var, new org.telegram.ui.r(l4Var, 3)), obj3);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (l4Var.f38778u0[0].getWebView() != null) {
                            l4Var.f38778u0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (l4Var.f38778u0[0].f()) {
                            if (l4Var.f38778u0[0].getWebView() != null) {
                                str = l4Var.f38778u0[0].getWebView().getUrl();
                                str2 = l4Var.f38778u0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = l4Var.f38778u0[0].f39754c.E;
                            if (webPage3 != null) {
                                String str7 = webPage3.url;
                                TL_iv.Page page = webPage3.cached_page;
                                if (page != null) {
                                    file = page.local;
                                    str = str7;
                                    str2 = null;
                                } else {
                                    str = str7;
                                    str2 = null;
                                    file = null;
                                }
                            } else {
                                return;
                            }
                        }
                        Activity activity3 = l4Var.L;
                        if (activity3 != null && !activity3.isFinishing()) {
                            if (file != null) {
                                AndroidUtilities.openForView(file, null, "text/markdown", l4Var.L, null, true);
                                return;
                            } else if (str != null) {
                                String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(l4Var, str, 1);
                                org.telegram.ui.z zVar = new org.telegram.ui.z(l4Var, hostAuthority2, hostAuthority, 1);
                                if (l4Var.f38778u0[0].f() && MessagesController.getInstance(l4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(l4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                                    org.telegram.ui.Components.f5.n0(activity, null, str, true, new ai.r5(8, zVar, yVar));
                                    return;
                                } else {
                                    yVar.run();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (num.intValue() == 4) {
                        if (l4Var.f38778u0[0].f()) {
                            n2 U3 = LaunchActivity.U();
                            if (U3 != 0) {
                                ?? obj4 = new Object();
                                obj4.f21556a = true;
                                U3.showAsSheet(new org.telegram.ui.web.x1(new org.telegram.ui.r(l4Var, 3)), obj4);
                                return;
                            }
                            return;
                        }
                        f3 f3Var3 = new f3(1, (Context) l4Var.L, (d6) null, false);
                        f3Var3.fixNavigationBar();
                        f3Var3.applyTopPadding = false;
                        LinearLayout linearLayout = new LinearLayout(l4Var.L);
                        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(l4Var.L, (d6) null);
                        l4Var2.setText(LocaleController.getString(R.string.FontSize));
                        linearLayout.addView(l4Var2, w7.z5.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new org.telegram.ui.g4(l4Var, l4Var.L), w7.z5.t(-1, -2, 51, 3, 0, 3, 0));
                        org.telegram.ui.Cells.l4 l4Var3 = new org.telegram.ui.Cells.l4(l4Var.L, (d6) null);
                        l4Var3.setText(LocaleController.getString(R.string.FontType));
                        linearLayout.addView(l4Var3, w7.z5.t(-2, -2, 51, 3, 4, 3, 2));
                        int i22 = 0;
                        for (int i23 = 2; i22 < i23; i23 = 2) {
                            Activity activity4 = l4Var.L;
                            org.telegram.ui.m0 m0Var = new org.telegram.ui.m0(activity4);
                            m0Var.setBackgroundDrawable(h6.g0(h6.x0(null, h6.f21079i6, false), i23, -1));
                            RadioButton radioButton = new RadioButton(activity4);
                            m0Var.f39071b = radioButton;
                            radioButton.setSize(AndroidUtilities.dp(20.0f));
                            radioButton.b(h6.x0(null, h6.D5, false), h6.x0(null, h6.E5, false));
                            boolean z16 = LocaleController.isRTL;
                            if (z16) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            int i24 = i13 | 48;
                            if (z16) {
                                i14 = 0;
                            } else {
                                i14 = 22;
                            }
                            float f7 = i14;
                            if (z16) {
                                i15 = 22;
                            } else {
                                i15 = 0;
                            }
                            m0Var.addView(radioButton, w7.z5.d(22, 22.0f, i24, f7, 13.0f, i15, 0.0f));
                            TextView textView = new TextView(activity4);
                            mk.u(textView, h6.x0(null, h6.G6, false), 1, 16.0f, 1);
                            textView.setMaxLines(1);
                            textView.setSingleLine(true);
                            if (LocaleController.isRTL) {
                                i16 = 5;
                            } else {
                                i16 = 3;
                            }
                            textView.setGravity(i16 | 16);
                            boolean z17 = LocaleController.isRTL;
                            if (z17) {
                                i17 = 5;
                            } else {
                                i17 = 3;
                            }
                            int i25 = i17 | 48;
                            int i26 = 17;
                            if (z17) {
                                i18 = 17;
                            } else {
                                i18 = 62;
                            }
                            float f10 = i18;
                            if (z17) {
                                i26 = 62;
                            }
                            m0Var.addView(textView, w7.z5.d(-1, -1.0f, i25, f10, 0.0f, i26, 0.0f));
                            m0VarArr[i22] = m0Var;
                            if (i22 != 0) {
                                if (i22 == 1) {
                                    Typeface typeface = Typeface.SERIF;
                                    textView.setText("Serif");
                                    textView.setTypeface(typeface);
                                    m0Var.setContentDescription("Serif");
                                    m0Var.invalidate();
                                }
                            } else {
                                String string = LocaleController.getString(R.string.Default);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(string);
                                textView.setTypeface(typeface2);
                                m0Var.setContentDescription(string);
                                m0Var.invalidate();
                            }
                            org.telegram.ui.m0 m0Var2 = m0VarArr[i22];
                            if (i22 == l4Var.f35521a) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ((RadioButton) m0Var2.f39071b).a(z11, false);
                            m0VarArr[i22].setTag(Integer.valueOf(i22));
                            m0VarArr[i22].setOnClickListener(new org.telegram.ui.s(l4Var, 4));
                            linearLayout.addView(m0VarArr[i22], w7.z5.n(-1, 50));
                            i22++;
                        }
                        f3Var3.customView = linearLayout;
                        l4Var.I = f3Var3;
                        l4Var.a0(f3Var3);
                        return;
                    } else if (num.intValue() == 5) {
                        if (l4Var.f38778u0[0].f() && l4Var.f38778u0[0].getWebView() != null) {
                            l4Var.f38778u0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (f2Var = l4Var.f38778u0[0].f39761y) != null && f2Var.b() != null) {
                        l4Var.h(f2Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.o3 o3Var2 = (org.telegram.ui.o3) this.f21420c;
                Activity activity5 = (Activity) this.f21419b;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && o3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i27 = 0;
                    for (int i28 = 0; i28 < uRLSpanArr.length; i28++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i28]), length);
                        i27 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i28]), i27);
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str8);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        String str9 = null;
                        if ((uRLSpanArr.length > 0 && length == 0 && i27 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str8 = pf.d.u(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            o3Var2.getWebView().loadUrl(str8);
                            return;
                        }
                        org.telegram.ui.web.k.b(activity5, str8);
                        org.telegram.ui.web.x0 webView = o3Var2.getWebView();
                        String str10 = org.telegram.ui.web.m1.a().f42726b;
                        if (str10 != null) {
                            StringBuilder u11 = a1.g.u(str10);
                            u11.append(URLEncoder.encode(str8));
                            str9 = u11.toString();
                        }
                        webView.loadUrl(str9);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                bd bdVar = (bd) this.f21420c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f21419b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f35576c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i29 = tL_premium_boostsStatus.level;
                    bdVar.f35574b = i29;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i29;
                    }
                }
                bdVar.X0(true);
                ei.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 6:
                rc rcVar = (rc) this.f21420c;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f21419b;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(h6.w0(h6.f20990d6, rcVar.f41118a));
                    rcVar.f41119b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 7:
                sg.k0 k0Var = (sg.k0) this.f21419b;
                k0Var.H1((ChannelBoostsController.CanApplyBoost) obj);
                ((ie) this.f21420c).f37951w0.showDialog(k0Var);
                return;
            case 8:
                qn qnVar2 = (qn) this.f21420c;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = qnVar2.getMessagesController().getInputPeer(qnVar2.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((ig.z1) this.f21419b).f13098a;
                qnVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                fk fkVar2 = qnVar2.Y;
                if (fkVar2 != null) {
                    fkVar2.setFieldText(null);
                    return;
                }
                return;
            case 9:
                qn qnVar3 = (qn) this.f21420c;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.f21419b, qnVar3.T5, qnVar3.f40779n5, qnVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = qnVar3.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = qnVar3.S8();
                of2.suggestionParams = qnVar3.f40693g5;
                qnVar3.getSendMessagesHelper().sendMessage(of2);
                qnVar3.Y.setFieldText("");
                qnVar3.j9(false);
                return;
            case 10:
                qn qnVar4 = (qn) this.f21420c;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f21419b;
                Long l10 = (Long) obj;
                if (qnVar4.R3 == 1) {
                    org.telegram.ui.Components.f5.L(qnVar4.getParentActivity(), qnVar4.T5, new e7(qnVar4, botInlineResult, l10, 2), qnVar4.f40673ea);
                    return;
                } else {
                    qnVar4.gb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 11:
                qn.k1((qn) this.f21420c, (t21[]) this.f21419b, (i80) obj);
                return;
            case 12:
                Boolean bool = (Boolean) obj;
                ((qn) this.f21420c).f40735jb = true;
                ((org.telegram.ui.i0) this.f21419b).run();
                return;
            case 13:
                qn qnVar5 = (qn) this.f21420c;
                b2[] b2VarArr = (b2[]) this.f21419b;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.g0.q(R.string.PollStatsWillLater, xc.a0(qnVar5), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new uh.g(qnVar5.getParentActivity(), qnVar5.f40673ea, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 14:
                qn qnVar6 = (qn) this.f21420c;
                MessageObject messageObject = (MessageObject) this.f21419b;
                qnVar6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    qnVar6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 15:
                ig.z1 z1Var = (ig.z1) this.f21419b;
                String str11 = (String) obj;
                qn qnVar7 = ((fj) this.f21420c).f37019b;
                if (z1Var != null) {
                    i19 = qnVar7.currentAccount;
                    ig.a2.f(i19).k(z1Var.f13098a, str11);
                }
                qnVar7.Q3 = str11;
                qnVar7.f40613a1.setTitle(str11);
                return;
            case 16:
                MessageObject messageObject2 = (MessageObject) this.f21419b;
                Long l11 = (Long) obj;
                qn qnVar8 = ((cn) this.f21420c).f36010a;
                if (qnVar8.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), qnVar8.T5, qnVar8.f40779n5, qnVar8.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = qnVar8.H8();
                    of3.dice_stake = l11.longValue();
                    qnVar8.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f21419b;
                qn qnVar9 = ((cn) this.f21420c).f36010a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i30 = 0; i30 < qnVar9.f40901x0.getChildCount(); i30++) {
                        View childAt = qnVar9.f40901x0.getChildAt(i30);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                    }
                    return;
                }
                if (u1Var.getMessageObject() != null) {
                    u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                u1Var.h4();
                return;
            case 18:
                cn cnVar = (cn) this.f21420c;
                j3 j3Var = (j3) this.f21419b;
                qn qnVar10 = cnVar.f36010a;
                if (!((Boolean) obj).booleanValue()) {
                    xc.a0(qnVar10).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                qnVar10.getMessagesController().setContentSettings(true);
                xc.a0(qnVar10).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new nm(cnVar, 8)), true)).k(true);
                j3Var.run(Boolean.TRUE);
                return;
            case 19:
                TLRPC.Message message = (TLRPC.Message) this.f21419b;
                ((cn) this.f21420c).f36010a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f20297id, (String) obj);
                return;
            case 20:
                tn tnVar = (tn) this.f21420c;
                tnVar.f41707f.s(((eg.a) obj).f8645b, ((TLRPC.WallPaper) this.f21419b).settings.intensity);
                View view2 = tnVar.f41705b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 21:
                String str12 = (String) this.f21419b;
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f21420c).f29034a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(str12, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                qn qnVar11 = chatActivityEnterView.P2;
                if (qnVar11 != null) {
                    sendMessageChatArguments = qnVar11.H8();
                } else {
                    sendMessageChatArguments = null;
                }
                of4.sendMessageChatArguments = sendMessageChatArguments;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                return;
            case 22:
                ti tiVar = (ti) this.f21420c;
                mi miVar = (mi) this.f21419b;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i31 = tiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i31).getInputUser(miVar.f28524c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i31).sendRequest(tL_messages_toggleBotInAttachMenu, new vc(12, tiVar, miVar), 66);
                return;
            case 23:
                ti tiVar2 = (ti) this.f21420c;
                ((qn) this.f21419b).f40693g5 = (MessageSuggestionParams) obj;
                boolean J1 = tiVar2.J1(0, true, 0, tiVar2.u1(), tiVar2.Q0);
                mf mfVar = tiVar2.f30551h0;
                if (mfVar != null) {
                    mfVar.h(!J1);
                    tiVar2.f30551h0 = null;
                    return;
                }
                return;
            case 24:
                ((gi.f4) this.f21420c).getWebViewContainer().F((String) this.f21419b, (String) obj, false);
                return;
            case 25:
                org.telegram.ui.Components.fj fjVar = (org.telegram.ui.Components.fj) this.f21420c;
                MessagesController messagesController = (MessagesController) this.f21419b;
                Long l13 = (Long) obj;
                boolean z18 = false;
                fjVar.f26232i0 = false;
                if (l13 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l13);
                }
                fjVar.f26231h0 = user;
                if (user == null) {
                    z18 = true;
                }
                fjVar.f26233j0 = z18;
                if (user != null) {
                    fjVar.R();
                    return;
                }
                return;
            case 26:
                rl rlVar = ((ol) this.f21420c).f29063b;
                rlVar.f29973x0.b(((ql) this.f21419b).f29630c, rlVar.f29975y0, true, 0, ((Long) obj).longValue());
                rlVar.f28173b.dismiss(true);
                return;
            case 27:
                xv xvVar = (xv) this.f21420c;
                boolean[] zArr = (boolean[]) this.f21419b;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new wv(xvVar, 1));
                    return;
                }
                return;
            case 28:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f21420c;
                yt ytVar = (yt) this.f21419b;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                ytVar.run();
                return;
            default:
                sy syVar = (sy) this.f21420c;
                ty tyVar = syVar.f30372a;
                tz tzVar = tyVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(tzVar.f30722c1);
                String[] strArr = tzVar.W0;
                String str13 = tyVar.v;
                ry ryVar = new ry(syVar, (String) this.f21419b, (Runnable) obj, 0);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(tzVar.f30722c1).isPremium()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str13, false, ryVar, null, z12, false, true, 25);
                return;
        }
    }

    public j3(m3 m3Var, t3 t3Var) {
        this.f21418a = 1;
        this.f21419b = m3Var;
        this.f21420c = t3Var;
    }
}
