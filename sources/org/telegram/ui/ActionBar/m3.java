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
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hr0;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.wt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bd;
import org.telegram.ui.dn;
import org.telegram.ui.e7;
import org.telegram.ui.fj;
import org.telegram.ui.gk;
import org.telegram.ui.ie;
import org.telegram.ui.om;
import org.telegram.ui.qc;
import org.telegram.ui.rc;
import org.telegram.ui.sn;
import org.telegram.ui.vn;
import org.telegram.ui.w21;
public final class m3 implements Utilities.Callback {
    public final int f21640a;
    public final Object f21641b;
    public final Object f21642c;

    public m3(int i10, Object obj, Object obj2) {
        this.f21640a = i10;
        this.f21642c = obj;
        this.f21641b = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        int i12;
        String userName;
        boolean z10;
        sn snVar;
        gk gkVar;
        org.telegram.ui.web.g2 g2Var;
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
        switch (this.f21640a) {
            case 0:
                q3 q3Var = (q3) this.f21642c;
                p3 p3Var = (p3) this.f21641b;
                o2 o2Var = (o2) obj;
                if (o2Var != null) {
                    boolean z13 = true;
                    if ((o2Var instanceof sn) && (gkVar = (snVar = (sn) o2Var).Y) != null) {
                        gkVar.M();
                        snVar.Y.k0(true, false, true);
                    }
                    if (o2Var.getContext() != null && o2Var.getParentActivity() != null) {
                        gi.d3 d3Var = new gi.d3(o2Var.getContext(), o2Var.getResourceProvider());
                        d3Var.f11171l0 = o2Var.getParentActivity();
                        if (p3Var != null && p3Var.f21755a != null) {
                            d3Var.F0 = true;
                            boolean z14 = p3Var.f21766o;
                            d3Var.W = z14;
                            if (z14) {
                                d3Var.w(p3Var.f21769r, false);
                            }
                            if (!p3Var.f21765n) {
                                int i20 = p3Var.f21767p;
                                if (i20 < 0) {
                                    i20 = k6.f21184d6;
                                }
                                i10 = k6.w0(i20, d3Var.F);
                            } else {
                                i10 = p3Var.f21768q;
                            }
                            d3Var.u(i10, p3Var.f21765n, false);
                            d3Var.z(p3Var.f21770s, false);
                            d3Var.G0 = p3Var.f21761j;
                            d3Var.H0 = p3Var.f21762k;
                            boolean z15 = p3Var.f21772u;
                            d3Var.f11187x0 = z15;
                            gi.v2 v2Var = d3Var.f11188y;
                            v2Var.setIsBackButtonVisible(z15);
                            d3Var.f11184w.setAllowSwipes(p3Var.f21763l);
                            ImageView backButton = d3Var.X.getBackButton();
                            if (d3Var.f11187x0) {
                                i11 = R.drawable.ic_ab_back;
                            } else {
                                i11 = R.drawable.ic_close_white;
                            }
                            AndroidUtilities.updateImageViewImageAnimated(backButton, i11);
                            BotFullscreenButtons botFullscreenButtons = d3Var.f11173n0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(d3Var.f11187x0, false);
                            }
                            d3Var.f11180s0 = p3Var.f21775y;
                            d3Var.A0 = Boolean.valueOf(p3Var.B);
                            d3Var.B0 = p3Var.C;
                            gi.y0 y0Var = p3Var.K;
                            d3Var.C0 = y0Var;
                            if (y0Var != null) {
                                gi.w0 w0Var = y0Var.f11589r;
                                SensorManager sensorManager = y0Var.f11575a;
                                if (y0Var.f11583l) {
                                    y0Var.f11583l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = y0Var.f11576b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(y0Var.f11585n, sensor, gi.y0.a(y0Var.f11577c));
                                        }
                                        Sensor sensor2 = y0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(y0Var.f11587p, sensor2, gi.y0.a(y0Var.e));
                                        }
                                        Sensor sensor3 = y0Var.f11579g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(w0Var, sensor3, gi.y0.a(y0Var.h));
                                        }
                                        Sensor sensor4 = y0Var.f11578f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(w0Var, sensor4, gi.y0.a(y0Var.h));
                                        }
                                        Sensor sensor5 = y0Var.f11580i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(y0Var.f11591t, sensor5, gi.y0.a(y0Var.f11581j));
                                        }
                                    }
                                }
                            }
                            a5.a aVar = p3Var.f21773w;
                            if (aVar != null) {
                                gi.z2 z2Var = d3Var.m0;
                                int totalHeight = z2Var.getTotalHeight();
                                z2Var.e = aVar;
                                gi.u[] uVarArr = z2Var.f11546f;
                                gi.w.b(uVarArr[0].f11514l, (gi.v) aVar.f282c, false);
                                gi.w.b(uVarArr[1].f11514l, (gi.v) aVar.d, false);
                                z2Var.invalidate();
                                if (totalHeight != z2Var.getTotalHeight() && z2Var.f11548r != null) {
                                    if (totalHeight < z2Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(z2Var.f11548r, 200L);
                                    } else {
                                        z2Var.f11548r.run();
                                    }
                                }
                                int i21 = aVar.f281b;
                                Paint paint = z2Var.f11543a;
                                z2Var.e.f281b = i21;
                                paint.setColor(i21);
                                z2Var.d.a(i21, true);
                            }
                            d3Var.y(p3Var.f21776z, false, p3Var.A);
                            gi.t4 t4Var = p3Var.f21755a;
                            if (t4Var != null) {
                                i12 = t4Var.f11491a;
                            } else {
                                i12 = UserConfig.selectedAccount;
                            }
                            d3Var.H = i12;
                            org.telegram.ui.web.y0 y0Var2 = p3Var.f21756b;
                            if (y0Var2 != null) {
                                y0Var2.onResume();
                                v2Var.N(d3Var.H, p3Var.f21756b, p3Var.d, p3Var.f21758f, p3Var.e);
                                if (!p3Var.f21771t && !p3Var.f21756b.f43318b) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                String str5 = p3Var.f21774x;
                                v2Var.g("setState(" + z10 + ", " + str5 + ")");
                                v2Var.N = z10;
                                v2Var.f43034b = str5;
                                if (k6.I.q() != p3Var.D) {
                                    v2Var.z();
                                }
                            } else {
                                t4Var.f11504q = null;
                                t4Var.f11505r = 0L;
                            }
                            d3Var.t(o2Var, p3Var.f21755a);
                            d3Var.f11161c0 = p3Var.v;
                            if (p3Var.G) {
                                d3Var.W0 = true;
                                d3Var.i();
                                org.telegram.ui.e3 e3Var = d3Var.Y0;
                                if (d3Var.m()) {
                                    userName = d3Var.f11185w0.e;
                                } else {
                                    userName = UserObject.getUserName(MessagesController.getInstance(d3Var.H).getUser(Long.valueOf(d3Var.I)));
                                }
                                String str6 = p3Var.H;
                                d3Var.X0 = str6;
                                e3Var.a(userName, str6);
                                org.telegram.ui.e3 e3Var2 = d3Var.Y0;
                                Paint paint2 = d3Var.Q;
                                if (AndroidUtilities.computePerceivedBrightness(paint2.getColor()) > 0.721f) {
                                    z13 = false;
                                }
                                e3Var2.b(z13, false);
                                d3Var.Y0.setBackgroundColor(paint2.getColor());
                                d3Var.Y0.setVisibility(0);
                                d3Var.Y0.setAlpha(1.0f);
                            }
                            d3Var.p(p3Var.L);
                            q3Var.h(q3Var.f21795w, p3Var, false);
                            d3Var.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                w3 w3Var = (w3) this.f21642c;
                ((p3) this.f21641b).f21764m = (Bitmap) obj;
                w3Var.mo36getWindowView().setDrawingFromOverlay(false);
                w3Var.release();
                return;
            case 2:
                y3 y3Var = (y3) this.f21641b;
                z3 z3Var = ((v3) this.f21642c).f21927p;
                if (((Boolean) obj).booleanValue()) {
                    y3Var.a(1.0f);
                    if (z3Var.f22023a.getTabs().isEmpty()) {
                        z3Var.a(false);
                        return;
                    }
                    return;
                }
                y3Var.a(0.0f);
                return;
            case 3:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.f21642c;
                Activity activity = (Activity) this.f21641b;
                Integer num = (Integer) obj;
                org.telegram.ui.w3 w3Var2 = k4Var.K;
                org.telegram.ui.l0[] l0VarArr = k4Var.T0;
                if ((!k4Var.f38774u0[0].c() || k4Var.f38774u0[0].f39703c.E != null) && k4Var.L != null) {
                    if (num.intValue() == 1) {
                        org.telegram.ui.m0 m0Var = k4Var.f38762h0;
                        int dp = AndroidUtilities.dp(56.0f);
                        k4Var.J0 = dp;
                        m0Var.setHeight(dp);
                        k4Var.f38762h0.h(true);
                        return;
                    }
                    org.telegram.ui.a0 a0Var = null;
                    ci.b bVar = null;
                    org.telegram.ui.a0 a0Var2 = null;
                    if (num.intValue() == 2) {
                        if (k4Var.f38774u0[0].f()) {
                            if (k4Var.f38774u0[0].getWebView() != null) {
                                str4 = k4Var.f38774u0[0].getWebView().getUrl();
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage = k4Var.f38774u0[0].f39703c.E;
                            if (webPage != null) {
                                str4 = webPage.url;
                            } else {
                                return;
                            }
                        }
                        String u10 = org.telegram.ui.web.b1.u(str4);
                        Activity activity2 = k4Var.L;
                        if (AndroidUtilities.computePerceivedBrightness(k4Var.f38762h0.getBackgroundColor()) < 0.721f) {
                            bVar = new ci.b();
                        }
                        k4Var.a0(new hr0(activity2, null, u10, false, u10, false, bVar));
                        return;
                    } else if (num.intValue() == 6) {
                        if (k4Var.f38774u0[0].f()) {
                            if (k4Var.f38774u0[0].getWebView() != null) {
                                str3 = k4Var.f38774u0[0].getWebView().getUrl();
                                frameLayout = k4Var.f38774u0[0].f39704f;
                            } else {
                                return;
                            }
                        } else {
                            org.telegram.ui.n3 n3Var = k4Var.f38774u0[0];
                            TLRPC.WebPage webPage2 = n3Var.f39703c.E;
                            if (webPage2 != null) {
                                str3 = webPage2.url;
                                frameLayout = n3Var;
                            } else {
                                return;
                            }
                        }
                        org.telegram.ui.k4.f(str3, k4Var.X, frameLayout, w3Var2, null);
                        return;
                    } else if (num.intValue() == 7) {
                        ?? obj2 = new Object();
                        obj2.f21637a = true;
                        o2 U = LaunchActivity.U();
                        if (U != 0) {
                            if (w3Var2 != null) {
                                a0Var2 = new org.telegram.ui.a0(k4Var, 5);
                            }
                            U.showAsSheet(new org.telegram.ui.web.p(a0Var2, new org.telegram.ui.q(k4Var, 2)), obj2);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 8) {
                        ?? obj3 = new Object();
                        obj3.f21637a = true;
                        o2 U2 = LaunchActivity.U();
                        if (U2 != 0) {
                            if (w3Var2 != null) {
                                a0Var = new org.telegram.ui.a0(k4Var, 6);
                            }
                            U2.showAsSheet(new org.telegram.ui.web.g1(a0Var, new org.telegram.ui.q(k4Var, 3)), obj3);
                            return;
                        }
                        return;
                    } else if (num.intValue() == 9) {
                        if (k4Var.f38774u0[0].getWebView() != null) {
                            k4Var.f38774u0[0].getWebView().goForward();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 3) {
                        if (k4Var.f38774u0[0].f()) {
                            if (k4Var.f38774u0[0].getWebView() != null) {
                                str = k4Var.f38774u0[0].getWebView().getUrl();
                                str2 = k4Var.f38774u0[0].getWebView().getOpenURL();
                                file = null;
                            } else {
                                return;
                            }
                        } else {
                            TLRPC.WebPage webPage3 = k4Var.f38774u0[0].f39703c.E;
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
                        Activity activity3 = k4Var.L;
                        if (activity3 != null && !activity3.isFinishing()) {
                            if (file != null) {
                                AndroidUtilities.openForView(file, null, "text/markdown", k4Var.L, null, true);
                                return;
                            } else if (str != null) {
                                String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
                                String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
                                org.telegram.ui.x xVar = new org.telegram.ui.x(k4Var, str, 1);
                                org.telegram.ui.y yVar = new org.telegram.ui.y(k4Var, hostAuthority2, hostAuthority, 1);
                                if (k4Var.f38774u0[0].f() && MessagesController.getInstance(k4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(k4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                                    org.telegram.ui.Components.d5.n0(activity, null, str, true, new ai.r5(8, yVar, xVar));
                                    return;
                                } else {
                                    xVar.run();
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (num.intValue() == 4) {
                        if (k4Var.f38774u0[0].f()) {
                            o2 U3 = LaunchActivity.U();
                            if (U3 != 0) {
                                ?? obj4 = new Object();
                                obj4.f21637a = true;
                                U3.showAsSheet(new org.telegram.ui.web.y1(new org.telegram.ui.q(k4Var, 3)), obj4);
                                return;
                            }
                            return;
                        }
                        h3 h3Var = new h3(1, (Context) k4Var.L, (g6) null, false);
                        h3Var.fixNavigationBar();
                        h3Var.applyTopPadding = false;
                        LinearLayout linearLayout = new LinearLayout(k4Var.L);
                        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                        linearLayout.setOrientation(1);
                        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(k4Var.L, (g6) null);
                        l4Var.setText(LocaleController.getString(R.string.FontSize));
                        linearLayout.addView(l4Var, w7.z5.t(-2, -2, 51, 3, 1, 3, 0));
                        linearLayout.addView(new org.telegram.ui.f4(k4Var, k4Var.L), w7.z5.t(-1, -2, 51, 3, 0, 3, 0));
                        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(k4Var.L, (g6) null);
                        l4Var2.setText(LocaleController.getString(R.string.FontType));
                        linearLayout.addView(l4Var2, w7.z5.t(-2, -2, 51, 3, 4, 3, 2));
                        int i22 = 0;
                        for (int i23 = 2; i22 < i23; i23 = 2) {
                            Activity activity4 = k4Var.L;
                            org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity4);
                            int i24 = k6.f21273i6;
                            org.telegram.ui.Cells.y g02 = k6.g0(k6.x0(null, i24, false), i23, -1);
                            n6 O = r6.O(i24);
                            l0Var.setBackground(g02);
                            r6.k(l0Var, g02, null, O, null);
                            RadioButton radioButton = new RadioButton(activity4);
                            l0Var.f39078b = radioButton;
                            radioButton.setSize(AndroidUtilities.dp(20.0f));
                            r6.Q(radioButton, k6.D5, k6.E5, null);
                            boolean z16 = LocaleController.isRTL;
                            if (z16) {
                                i13 = 5;
                            } else {
                                i13 = 3;
                            }
                            int i25 = i13 | 48;
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
                            l0Var.addView(radioButton, w7.z5.d(22, 22.0f, i25, f7, 13.0f, i15, 0.0f));
                            TextView textView = new TextView(activity4);
                            r6.W(textView, k6.G6, null);
                            tl.u(textView, 1, 16.0f, 1, 1);
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
                            int i26 = i17 | 48;
                            int i27 = 17;
                            if (z17) {
                                i18 = 17;
                            } else {
                                i18 = 62;
                            }
                            float f10 = i18;
                            if (z17) {
                                i27 = 62;
                            }
                            l0Var.addView(textView, w7.z5.d(-1, -1.0f, i26, f10, 0.0f, i27, 0.0f));
                            l0VarArr[i22] = l0Var;
                            if (i22 != 0) {
                                if (i22 == 1) {
                                    Typeface typeface = Typeface.SERIF;
                                    textView.setText("Serif");
                                    textView.setTypeface(typeface);
                                    l0Var.setContentDescription("Serif");
                                    l0Var.invalidate();
                                }
                            } else {
                                String string = LocaleController.getString(R.string.Default);
                                Typeface typeface2 = Typeface.DEFAULT;
                                textView.setText(string);
                                textView.setTypeface(typeface2);
                                l0Var.setContentDescription(string);
                                l0Var.invalidate();
                            }
                            org.telegram.ui.l0 l0Var2 = l0VarArr[i22];
                            if (i22 == k4Var.f37214a) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ((RadioButton) l0Var2.f39078b).a(z11, false);
                            l0VarArr[i22].setTag(Integer.valueOf(i22));
                            l0VarArr[i22].setOnClickListener(new org.telegram.ui.r(k4Var, 4));
                            linearLayout.addView(l0VarArr[i22], w7.z5.n(-1, 50));
                            i22++;
                        }
                        h3Var.customView = linearLayout;
                        k4Var.I = h3Var;
                        k4Var.a0(h3Var);
                        return;
                    } else if (num.intValue() == 5) {
                        if (k4Var.f38774u0[0].f() && k4Var.f38774u0[0].getWebView() != null) {
                            k4Var.f38774u0[0].getWebView().reload();
                            return;
                        }
                        return;
                    } else if (num.intValue() == 10 && (g2Var = k4Var.f38774u0[0].E) != null && g2Var.b() != null) {
                        k4Var.h(g2Var.b(), null, 1);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                org.telegram.ui.n3 n3Var2 = (org.telegram.ui.n3) this.f21642c;
                Activity activity5 = (Activity) this.f21641b;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && n3Var2.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i28 = 0;
                    for (int i29 = 0; i29 < uRLSpanArr.length; i29++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i29]), length);
                        i28 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i29]), i28);
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str8);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        String str9 = null;
                        if ((uRLSpanArr.length > 0 && length == 0 && i28 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str8 = pf.d.u(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            n3Var2.getWebView().loadUrl(str8);
                            return;
                        }
                        org.telegram.ui.web.l.b(activity5, str8);
                        org.telegram.ui.web.y0 webView = n3Var2.getWebView();
                        String str10 = org.telegram.ui.web.n1.a().f43196b;
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
                bd bdVar = (bd) this.f21642c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f21641b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f36019c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i30 = tL_premium_boostsStatus.level;
                    bdVar.f36017b = i30;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i30;
                    }
                }
                bdVar.Z0(true);
                ei.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 6:
                rc rcVar = (rc) this.f21642c;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f21641b;
                View view = (View) obj;
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(k6.w0(k6.f21184d6, rcVar.f41089a));
                    rcVar.f41090b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                    }
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                sg.j0 j0Var = (sg.j0) this.f21641b;
                j0Var.K1((ChannelBoostsController.CanApplyBoost) obj);
                ((ie) this.f21642c).f38260w0.showDialog(j0Var);
                return;
            case 8:
                sn snVar2 = (sn) this.f21642c;
                Long l4 = (Long) obj;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = snVar2.getMessagesController().getInputPeer(snVar2.f41516f6);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((ig.y1) this.f21641b).f13129a;
                snVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                gk gkVar2 = snVar2.Y;
                if (gkVar2 != null) {
                    gkVar2.setFieldText(null);
                    return;
                }
                return;
            case 9:
                sn snVar3 = (sn) this.f21642c;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.f21641b, snVar3.f41516f6, snVar3.f41764z5, snVar3.f41561j4, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = snVar3.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = snVar3.S8();
                of2.suggestionParams = snVar3.f41674s5;
                snVar3.getSendMessagesHelper().sendMessage(of2);
                snVar3.Y.setFieldText("");
                snVar3.j9(false);
                return;
            case 10:
                sn snVar4 = (sn) this.f21642c;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f21641b;
                Long l10 = (Long) obj;
                if (snVar4.f41489d4 == 1) {
                    org.telegram.ui.Components.d5.L(snVar4.getParentActivity(), snVar4.f41516f6, new e7(snVar4, botInlineResult, l10, 2), snVar4.f41651qa);
                    return;
                } else {
                    snVar4.hb(botInlineResult, true, 0, l10.longValue());
                    return;
                }
            case 11:
                sn.n1((sn) this.f21642c, (w21[]) this.f21641b, (h80) obj);
                return;
            case 12:
                Boolean bool = (Boolean) obj;
                ((sn) this.f21642c).f41731wb = true;
                ((org.telegram.ui.h0) this.f21641b).run();
                return;
            case 13:
                sn snVar5 = (sn) this.f21642c;
                c2[] c2VarArr = (c2[]) this.f21641b;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.v0.p(R.string.PollStatsWillLater, vc.a0(snVar5), R.raw.timer_toast, 24);
                        return;
                    } else {
                        new uh.g(snVar5.getParentActivity(), snVar5.f41651qa, tL_statsPollStats).show();
                        return;
                    }
                }
                return;
            case 14:
                sn snVar6 = (sn) this.f21642c;
                MessageObject messageObject = (MessageObject) this.f21641b;
                snVar6.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    snVar6.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    return;
                }
                return;
            case 15:
                ig.y1 y1Var = (ig.y1) this.f21641b;
                String str11 = (String) obj;
                sn snVar7 = ((fj) this.f21642c).f37347b;
                if (y1Var != null) {
                    i19 = snVar7.currentAccount;
                    ig.z1.f(i19).k(y1Var.f13129a, str11);
                }
                snVar7.f41476c4 = str11;
                snVar7.f41594m1.setTitle(str11);
                return;
            case 16:
                MessageObject messageObject2 = (MessageObject) this.f21641b;
                Long l11 = (Long) obj;
                sn snVar8 = ((dn) this.f21642c).f36651a;
                if (snVar8.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), snVar8.f41516f6, snVar8.f41764z5, snVar8.f41561j4, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = snVar8.H8();
                    of3.dice_stake = l11.longValue();
                    snVar8.getSendMessagesHelper().sendMessage(of3);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f21641b;
                sn snVar9 = ((dn) this.f21642c).f36651a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i31 = 0; i31 < snVar9.f41734x0.getChildCount(); i31++) {
                        View childAt = snVar9.f41734x0.getChildAt(i31);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.g4();
                            }
                        }
                    }
                    return;
                }
                if (t1Var.getMessageObject() != null) {
                    t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                }
                t1Var.g4();
                return;
            case 18:
                dn dnVar = (dn) this.f21642c;
                m3 m3Var = (m3) this.f21641b;
                sn snVar10 = dnVar.f36651a;
                if (!((Boolean) obj).booleanValue()) {
                    vc.a0(snVar10).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
                snVar10.getMessagesController().setContentSettings(true);
                vc.a0(snVar10).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new om(dnVar, 8)), true)).k(true);
                m3Var.run(Boolean.TRUE);
                return;
            case 19:
                TLRPC.Message message = (TLRPC.Message) this.f21641b;
                ((dn) this.f21642c).f36651a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.f20365id, (String) obj);
                return;
            case 20:
                vn vnVar = (vn) this.f21642c;
                vnVar.f42776f.s(((eg.a) obj).f8652b, ((TLRPC.WallPaper) this.f21641b).settings.intensity);
                View view2 = vnVar.f42774b;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 21:
                String str12 = (String) this.f21641b;
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((mf) this.f21642c).f28590a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of(str12, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                sn snVar11 = chatActivityEnterView.P2;
                if (snVar11 != null) {
                    sendMessageChatArguments = snVar11.H8();
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
                ve veVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                veVar.setEffect(0L);
                return;
            case 22:
                ri riVar = (ri) this.f21642c;
                ki kiVar = (ki) this.f21641b;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i32 = riVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i32).getInputUser(kiVar.f28021c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i32).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.ui.vc(12, riVar, kiVar), 66);
                return;
            case 23:
                ri riVar2 = (ri) this.f21642c;
                ((sn) this.f21641b).f41674s5 = (MessageSuggestionParams) obj;
                boolean N1 = riVar2.N1(0, true, 0, riVar2.x1(), riVar2.Q0);
                kf kfVar = riVar2.f30152h0;
                if (kfVar != null) {
                    kfVar.g(!N1);
                    riVar2.f30152h0 = null;
                    return;
                }
                return;
            case 24:
                ((gi.f4) this.f21642c).getWebViewContainer().F((String) this.f21641b, (String) obj, false);
                return;
            case 25:
                dj djVar = (dj) this.f21642c;
                MessagesController messagesController = (MessagesController) this.f21641b;
                Long l13 = (Long) obj;
                boolean z18 = false;
                djVar.f25750i0 = false;
                if (l13 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l13);
                }
                djVar.f25749h0 = user;
                if (user == null) {
                    z18 = true;
                }
                djVar.f25751j0 = z18;
                if (user != null) {
                    djVar.R();
                    return;
                }
                return;
            case 26:
                pl plVar = ((ml) this.f21642c).f28621b;
                plVar.f29610u0.b(((ol) this.f21641b).f29315c, plVar.f29611v0, true, 0, ((Long) obj).longValue());
                plVar.f27704b.dismiss(true);
                return;
            case 27:
                vv vvVar = (vv) this.f21642c;
                boolean[] zArr = (boolean[]) this.f21641b;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new uv(vvVar, 1));
                    return;
                }
                return;
            case 28:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f21642c;
                wt wtVar = (wt) this.f21641b;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                wtVar.run();
                return;
            default:
                qy qyVar = (qy) this.f21642c;
                ry ryVar = qyVar.f30009a;
                rz rzVar = ryVar.F;
                MediaDataController mediaDataController = MediaDataController.getInstance(rzVar.f30310c1);
                String[] strArr = rzVar.W0;
                String str13 = ryVar.v;
                py pyVar = new py(qyVar, (String) this.f21641b, (Runnable) obj, 0);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(rzVar.f30310c1).isPremium()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str13, false, pyVar, null, z12, false, true, 25);
                return;
        }
    }

    public m3(p3 p3Var, w3 w3Var) {
        this.f21640a = 1;
        this.f21641b = p3Var;
        this.f21642c = w3Var;
    }
}
