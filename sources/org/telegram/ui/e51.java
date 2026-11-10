package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class e51 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean A0;
    public r41 B0;
    public di.r6 C0;
    public q41 D;
    public int D0;
    public q41 E;
    public final m4 E0;
    public q41 F;
    public ab.b0 F0;
    public a51 G;
    public PorterDuffColorFilter G0;
    public q41 H;
    public int H0;
    public q41 I;
    public q41 J;
    public q41 K;
    public q41 L;
    public q41 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.jn R;
    public d41 S;
    public v4.b0 T;
    public final h2.j0 U;
    public org.telegram.ui.Components.ch0 V;
    public i41 W;
    public e41 X;
    public d51 Y;
    public lg.f Z;
    public TLRPC.ChatFull f45138a;
    public LinearLayout f45139a0;
    public final long f45140b;
    public final boolean f45141b0;
    public boolean f45142c;
    public final boolean f45143c0;
    public q41 d;
    public final boolean f45144d0;
    public q41 f45145e;
    public long f45146e0;
    public z41 f45147f;
    public long f45148f0;
    public final org.telegram.ui.ActionBar.u1[] f45149g0;
    public q41 h;
    public b41 f45150h0;
    public tb f45151i0;
    public zd f45152j0;
    public View f45153k0;
    public FrameLayout f45154l0;
    public te.a m0;
    public q41 f45155n;
    public final boolean f45156n0;
    public oe0 f45157o0;
    public FrameLayout f45158p0;
    public qh.b[] f45159q0;
    public q41 f45160r;
    public int f45161r0;
    public q41 f45162s;
    public final SparseIntArray f45163s0;
    public final SparseIntArray f45164t0;
    public final ArrayList f45165u0;
    public final ArrayList f45166v0;
    public q41 f45167w;
    public final ArrayList f45168w0;
    public q41 f45169x;
    public final ArrayList f45170x0;
    public q41 f45171y;
    public final ArrayList f45172y0;
    public boolean f45173z0;

    public e51(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new h2.j0(50, 2);
        this.f45149g0 = new org.telegram.ui.ActionBar.u1[1];
        this.f45161r0 = -1;
        this.f45163s0 = new SparseIntArray();
        this.f45164t0 = new SparseIntArray();
        this.f45165u0 = new ArrayList();
        this.f45166v0 = new ArrayList();
        this.f45168w0 = new ArrayList();
        this.f45170x0 = new ArrayList();
        this.f45172y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.f45140b = j3;
        this.f45141b0 = bundle.getBoolean("is_megagroup", false);
        this.f45143c0 = bundle.getBoolean("start_from_boosts", false);
        this.f45144d0 = bundle.getBoolean("start_from_monetization", false);
        this.f45156n0 = bundle.getBoolean("only_boosts", false);
        this.f45138a = getMessagesController().N0(j3);
    }

    public static void Z(final e51 e51Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        float abs;
        boolean z9;
        float abs2;
        boolean z10;
        float abs3;
        boolean z11;
        float abs4;
        boolean z12;
        ArrayList arrayList3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        float abs5;
        int i7;
        boolean z13;
        float abs6;
        boolean z14;
        float abs7;
        boolean z15;
        String str10;
        ArrayList arrayList4;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList5 = e51Var.N;
        ArrayList arrayList6 = e51Var.O;
        ArrayList arrayList7 = e51Var.f45165u0;
        String str18 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final q41[] q41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.id.M0(2131749273, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.id.M0(2131750610, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.id.M0(2131744033, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.id.M0(2131743530, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.id.M0(2131749375, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.id.M0(2131743529, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.id.M0(2131748274, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.id.M0(2131749041, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.id.M0(2131747920, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.id.M0(2131746385, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.id.M0(2131744659, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.id.M0(2131744504, "StoryReactionsByEmotionChartTitle"), 2, false)};
            q41 q41Var = q41VarArr[2];
            if (q41Var != null) {
                q41Var.f48959n = true;
            }
            ?? obj = new Object();
            ab.b0 a10 = z41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            obj.f52253o = org.telegram.messenger.id.M0(2131746378, "ReactionsPerPost");
            obj.f52254p = (String) a10.f907b;
            obj.f52255q = (String) a10.f909e;
            obj.f52256r = ((Boolean) a10.f908c).booleanValue();
            obj.f52257s = ((Boolean) a10.d).booleanValue();
            ab.b0 a11 = z41.a(tL_broadcastStats.reactions_per_story);
            obj.f52258t = org.telegram.messenger.id.M0(2131746377, "ReactionsPerStory");
            obj.f52259u = (String) a11.f907b;
            obj.v = (String) a11.f909e;
            obj.f52260w = ((Boolean) a11.f908c).booleanValue();
            obj.f52261x = ((Boolean) a11.d).booleanValue();
            ab.b0 a12 = z41.a(tL_broadcastStats.views_per_story);
            obj.f52262y = org.telegram.messenger.id.M0(2131743527, "ViewsPerStory");
            obj.f52263z = (String) a12.f907b;
            obj.A = (String) a12.f909e;
            obj.B = ((Boolean) a12.f908c).booleanValue();
            obj.C = ((Boolean) a12.d).booleanValue();
            ab.b0 a13 = z41.a(tL_broadcastStats.shares_per_story);
            obj.D = org.telegram.messenger.id.M0(2131745397, "SharesPerStory");
            obj.E = (String) a13.f907b;
            obj.F = (String) a13.f909e;
            obj.G = ((Boolean) a13.f908c).booleanValue();
            obj.H = ((Boolean) a13.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            String str19 = "GrowthChartTitle";
            double d = tL_statsAbsValueAndPrev.current;
            double d2 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i11 = (int) (d - d2);
            if (d2 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i11 / ((float) d2)) * 100.0f);
            }
            obj.f52241a = org.telegram.messenger.id.M0(2131750610, "FollowersChartTitle");
            obj.f52242b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs5 == 0.0f) {
                i7 = i11;
                obj.f52243c = "";
            } else {
                int i12 = (int) abs5;
                if (abs5 == i12) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    if (i11 <= 0) {
                        str17 = "";
                    } else {
                        str17 = str4;
                    }
                    sb2.append(str17);
                    sb2.append(org.telegram.messenger.g0.o0(i11, 0));
                    obj.f52243c = sb2.toString() + " (" + i12 + "%)";
                    i7 = i11;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    if (i11 <= 0) {
                        str16 = "";
                    } else {
                        str16 = str4;
                    }
                    sb3.append(str16);
                    sb3.append(org.telegram.messenger.g0.o0(i11, 0));
                    i7 = i11;
                    obj.f52243c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i7 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj.d = z13;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            if (d11 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i13 / ((float) d11)) * 100.0f);
            }
            obj.f52247i = org.telegram.messenger.id.M0(2131745398, "SharesPerPost");
            obj.f52248j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i13 != 0 && abs6 != 0.0f) {
                int i14 = (int) abs6;
                if (abs6 == i14) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i13 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str4;
                    }
                    sb4.append(str15);
                    sb4.append(org.telegram.messenger.g0.o0(i13, 0));
                    obj.f52249k = sb4.toString() + " (" + i14 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    if (i13 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str4;
                    }
                    sb5.append(str14);
                    sb5.append(org.telegram.messenger.g0.o0(i13, 0));
                    obj.f52249k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f52249k = "";
            }
            if (i13 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.f52250l = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            if (d13 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i15 / ((float) d13)) * 100.0f);
            }
            obj.f52244e = org.telegram.messenger.id.M0(2131743528, "ViewsPerPost");
            obj.f52245f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
            if (i15 != 0 && abs7 != 0.0f) {
                int i16 = (int) abs7;
                if (abs7 == i16) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    if (i15 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str4;
                    }
                    sb6.append(str13);
                    sb6.append(org.telegram.messenger.g0.o0(i15, 0));
                    obj.f52246g = sb6.toString() + " (" + i16 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i15 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str4;
                    }
                    sb7.append(str12);
                    sb7.append(org.telegram.messenger.g0.o0(i15, 0));
                    obj.f52246g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f52246g = "";
            }
            if (i15 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.h = z15;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f52251m = org.telegram.messenger.id.M0(2131751143, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                obj.f52252n = com.google.android.recaptcha.internal.a.i(i17, "%");
            } else {
                obj.f52252n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            e51Var.f45147f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            e51Var.f45146e0 = tL_statsDateRangeDays.max_date * 1000;
            e51Var.f45148f0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i20 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i20);
                i20++;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f43930a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str10 = str19;
                    str11 = str18;
                    e51Var.f45163s0.put(obj2.b(), i18);
                    i18++;
                } else {
                    str10 = str19;
                    arrayList4 = arrayList8;
                    str11 = str18;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    e51Var.f45168w0.add(obj2);
                    e51Var.f45164t0.put(obj2.b(), i19);
                    i19++;
                }
                arrayList10 = arrayList11;
                str19 = str10;
                str18 = str11;
                arrayList8 = arrayList4;
                size = i21;
            }
            str3 = str19;
            ArrayList arrayList12 = arrayList8;
            str2 = str18;
            org.telegram.messenger.g0.h3(new x31(e51Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((b51) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.yr messagesStorage = e51Var.getMessagesStorage();
                int i22 = e51Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.f26723a.c(new org.telegram.messenger.wp(messagesStorage, org.telegram.messenger.a00.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -e51Var.f45140b, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            org.telegram.messenger.g0.h3(new Runnable(e51Var) {
                public final e51 f51883b;

                {
                    this.f51883b = e51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e51 e51Var2 = this.f51883b;
                            e51Var2.getClass();
                            q41[] q41VarArr2 = q41VarArr;
                            e51Var2.f45160r = q41VarArr2[0];
                            e51Var2.h = q41VarArr2[1];
                            e51Var2.f45145e = q41VarArr2[2];
                            e51Var2.f45155n = q41VarArr2[3];
                            e51Var2.d = q41VarArr2[4];
                            e51Var2.f45162s = q41VarArr2[5];
                            e51Var2.f45167w = q41VarArr2[6];
                            e51Var2.f45169x = q41VarArr2[7];
                            e51Var2.f45171y = q41VarArr2[8];
                            e51Var2.D = q41VarArr2[9];
                            e51Var2.E = q41VarArr2[10];
                            e51Var2.F = q41VarArr2[11];
                            e51Var2.j0(q41VarArr2);
                            return;
                        default:
                            e51 e51Var3 = this.f51883b;
                            e51Var3.getClass();
                            q41[] q41VarArr3 = q41VarArr;
                            e51Var3.d = q41VarArr3[0];
                            e51Var3.H = q41VarArr3[1];
                            e51Var3.I = q41VarArr3[2];
                            e51Var3.J = q41VarArr3[3];
                            e51Var3.K = q41VarArr3[4];
                            e51Var3.L = q41VarArr3[5];
                            e51Var3.f45145e = q41VarArr3[6];
                            e51Var3.M = q41VarArr3[7];
                            e51Var3.j0(q41VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "TopHoursChartTitle";
            str2 = "%";
            str3 = "GrowthChartTitle";
            str4 = "+";
            r15 = 0;
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            q41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.id.M0(2131749375, str3), r15, r15);
            q41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.id.M0(2131749427, "GroupMembersChartTitle"), r15, r15);
            q41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.id.M0(2131748271, "NewMembersBySourceChartTitle"), 2, r15);
            q41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.id.M0(2131748618, "MembersLanguageChartTitle"), 4, true);
            q41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.id.M0(2131748462, "MessagesChartTitle"), 2, r15);
            q41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.id.M0(2131754489, "ActionsChartTitle"), 1, r15);
            q41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.id.M0(2131744033, str), r15, r15);
            q41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.id.M0(2131744034, "TopDaysOfWeekChartTitle"), 4, r15);
            final q41[] q41VarArr2 = new q41[8];
            q41VarArr2[r15] = i02;
            q41VarArr2[1] = i03;
            q41VarArr2[2] = i04;
            q41VarArr2[3] = i05;
            q41VarArr2[4] = i06;
            q41VarArr2[5] = i07;
            q41VarArr2[6] = i08;
            q41VarArr2[7] = i09;
            q41 q41Var2 = q41VarArr2[6];
            if (q41Var2 != null) {
                q41Var2.f48959n = true;
            }
            q41 q41Var3 = q41VarArr2[7];
            if (q41Var3 != null) {
                q41Var3.f48960o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d14 = tL_statsAbsValueAndPrev4.current;
            double d15 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d14 - d15);
            if (d15 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i23 / ((float) d15)) * 100.0f);
            }
            obj3.f43564a = org.telegram.messenger.id.M0(2131748617, "MembersOverviewTitle");
            obj3.f43565b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
            if (i23 != 0 && abs != 0.0f) {
                int i24 = (int) abs;
                if (abs == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    if (i23 <= 0) {
                        str9 = "";
                    } else {
                        str9 = str4;
                    }
                    sb8.append(str9);
                    sb8.append(org.telegram.messenger.g0.o0(i23, 0));
                    obj3.f43566c = sb8.toString() + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    if (i23 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str4;
                    }
                    sb9.append(str8);
                    sb9.append(org.telegram.messenger.g0.o0(i23, 0));
                    obj3.f43566c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str2);
                }
            } else {
                obj3.f43566c = "";
            }
            if (i23 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            obj3.d = z9;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d16 - d17);
            if (d17 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i25 / ((float) d17)) * 100.0f);
            }
            obj3.f43570i = org.telegram.messenger.id.M0(2131743532, "ViewingMembers");
            obj3.f43571j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
            if (i25 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                if (i25 <= 0) {
                    str7 = "";
                } else {
                    str7 = str4;
                }
                sb10.append(str7);
                sb10.append(org.telegram.messenger.g0.o0(i25, 0));
                obj3.f43572k = sb10.toString();
            } else {
                obj3.f43572k = "";
            }
            if (i25 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.f43573l = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            if (d19 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i26 / ((float) d19)) * 100.0f);
            }
            obj3.f43574m = org.telegram.messenger.id.M0(2131747067, "PostingMembers");
            obj3.f43575n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
            if (i26 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                sb11.append(str6);
                sb11.append(org.telegram.messenger.g0.o0(i26, 0));
                obj3.f43576o = sb11.toString();
            } else {
                obj3.f43576o = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f43577p = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            if (d21 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i27 / ((float) d21)) * 100.0f);
            }
            obj3.f43567e = org.telegram.messenger.id.M0(2131748453, "MessagesOverview");
            obj3.f43568f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
            if (i27 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                sb12.append(str5);
                sb12.append(org.telegram.messenger.g0.o0(i27, 0));
                obj3.f43569g = sb12.toString();
            } else {
                obj3.f43569g = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.h = z12;
            e51Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            e51Var.f45146e0 = tL_statsDateRangeDays2.max_date * 1000;
            e51Var.f45148f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f51520a = x41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.id.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.id.a0("CharactersPerMessage", null, 2131752254, org.telegram.messenger.id.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    obj4.f51521b = sb13.toString();
                    int i30 = i10;
                    if (arrayList2.size() < i30) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i28++;
                    arrayList2 = arrayList3;
                    i10 = i30;
                    arrayList = arrayList15;
                }
                ArrayList arrayList16 = arrayList;
                ArrayList arrayList17 = arrayList2;
                if (arrayList16.size() - arrayList17.size() < 2) {
                    arrayList17.clear();
                    arrayList17.addAll(arrayList16);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList18 = tL_megagroupStats.top_admins;
            if (arrayList18 != null && !arrayList18.isEmpty()) {
                for (int i31 = 0; i31 < tL_megagroupStats.top_admins.size(); i31++) {
                    ArrayList arrayList19 = e51Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f51520a = x41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.id.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.id.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.id.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    obj5.f51521b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = e51Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f51520a = x41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f51521b = org.telegram.messenger.id.G(i34, "Invitations", new Object[0]);
                    } else {
                        obj6.f51521b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            org.telegram.messenger.g0.h3(new Runnable(e51Var) {
                public final e51 f51883b;

                {
                    this.f51883b = e51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            e51 e51Var2 = this.f51883b;
                            e51Var2.getClass();
                            q41[] q41VarArr22 = q41VarArr2;
                            e51Var2.f45160r = q41VarArr22[0];
                            e51Var2.h = q41VarArr22[1];
                            e51Var2.f45145e = q41VarArr22[2];
                            e51Var2.f45155n = q41VarArr22[3];
                            e51Var2.d = q41VarArr22[4];
                            e51Var2.f45162s = q41VarArr22[5];
                            e51Var2.f45167w = q41VarArr22[6];
                            e51Var2.f45169x = q41VarArr22[7];
                            e51Var2.f45171y = q41VarArr22[8];
                            e51Var2.D = q41VarArr22[9];
                            e51Var2.E = q41VarArr22[10];
                            e51Var2.F = q41VarArr22[11];
                            e51Var2.j0(q41VarArr22);
                            return;
                        default:
                            e51 e51Var3 = this.f51883b;
                            e51Var3.getClass();
                            q41[] q41VarArr3 = q41VarArr2;
                            e51Var3.d = q41VarArr3[0];
                            e51Var3.H = q41VarArr3[1];
                            e51Var3.I = q41VarArr3[2];
                            e51Var3.J = q41VarArr3[3];
                            e51Var3.K = q41VarArr3[4];
                            e51Var3.L = q41VarArr3[5];
                            e51Var3.f45145e = q41VarArr3[6];
                            e51Var3.M = q41VarArr3[7];
                            e51Var3.j0(q41VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void a0(e51 e51Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.ij(e51Var.currentAccount, arrayList2.get(i7), false, true));
            }
            e51Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.h3(new x31(e51Var, arrayList, 1));
    }

    public static void c0(e51 e51Var) {
        d51 d51Var = e51Var.Y;
        if (d51Var != null) {
            d51Var.f44902b = true;
        }
        int childCount = e51Var.S.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = e51Var.S.getChildAt(i7);
            if (childAt instanceof o41) {
                ((o41) childAt).f48114b.f18325t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.f2 g0(TLRPC.Chat chat, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f26960id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z9);
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).N0(chat.f26960id);
        if (N0 != null && (N0.can_view_stats || N0.can_view_stars_revenue)) {
            return new e51(bundle);
        }
        return new t5(-chat.f26960id);
    }

    public static mg.b h0(JSONObject jSONObject, int i7, boolean z9) {
        if (i7 == 0) {
            return new mg.b(jSONObject);
        }
        if (i7 == 1) {
            return new mg.b(jSONObject);
        }
        if (i7 == 2) {
            ?? bVar = new mg.b(jSONObject);
            int length = ((mg.a) bVar.d.get(0)).f20021a.length;
            int size = bVar.d.size();
            bVar.f20038l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bVar.f20038l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = bVar.f20038l;
                    jArr[i10] = jArr[i10] + ((mg.a) bVar.d.get(i11)).f20021a[i10];
                }
            }
            bVar.f20039m = new m4.d0(bVar.f20038l);
            return bVar;
        } else if (i7 == 4) {
            ?? bVar2 = new mg.b(jSONObject);
            if (z9) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i12 = 0; i12 < bVar2.d.size(); i12++) {
                    int length2 = bVar2.f20028a.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        long j10 = ((mg.a) bVar2.d.get(i12)).f20021a[i13];
                        jArr2[i12] = jArr2[i12] + j10;
                        if (j10 == 0) {
                            iArr[i12] = iArr[i12] + 1;
                        }
                    }
                    j3 += jArr2[i12];
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < bVar2.d.size(); i14++) {
                    if (jArr2[i14] / j3 < 0.01d && iArr[i14] > bVar2.f20028a.length / 2.0f) {
                        arrayList.add((mg.a) bVar2.d.get(i14));
                    }
                }
                int size2 = arrayList.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    bVar2.d.remove((mg.a) obj);
                }
            }
            int length3 = ((mg.a) bVar2.d.get(0)).f20021a.length;
            int size3 = bVar2.d.size();
            bVar2.f20040l = new long[length3];
            for (int i16 = 0; i16 < length3; i16++) {
                bVar2.f20040l[i16] = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    long[] jArr3 = bVar2.f20040l;
                    jArr3[i16] = jArr3[i16] + ((mg.a) bVar2.d.get(i17)).f20021a[i16];
                }
            }
            new m4.d0(bVar2.f20040l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static q41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z9) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        q41 q41Var = new q41(str, i7);
        q41Var.f48958m = z9;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z9);
                q41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                q41Var.f48953g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.f20028a) == null || jArr2.length < 2) {
                    q41Var.f48957l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.f20028a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    q41Var.f48951e = new mg.e(h02, j3);
                    q41Var.f48950c = j3;
                    return q41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            q41Var.f48952f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return q41Var;
    }

    public static void n0(q41 q41Var, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        mg.b bVar;
        int i7;
        if (q41Var != null && (bVar = q41Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                mg.a aVar = (mg.a) obj;
                int i11 = aVar.f20026g;
                if (i11 >= 0) {
                    if (!org.telegram.ui.ActionBar.m6.f1(i11)) {
                        int i12 = aVar.f20026g;
                        if (org.telegram.ui.ActionBar.m6.I == org.telegram.ui.ActionBar.m6.J) {
                            i7 = aVar.f20027i;
                        } else {
                            i7 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.m6.A1(i12, i7, false);
                        org.telegram.ui.ActionBar.m6.em[aVar.f20026g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, aVar.f20026g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28111p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28225v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28206u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28055m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.fk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28263x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28300z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27963h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Oj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Nj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27998j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
    }

    @Override
    public final View createView(Context context) {
        boolean z9;
        boolean z10;
        FrameLayout frameLayout;
        int i7;
        boolean z11;
        int i10;
        String str;
        boolean z12;
        e51 e51Var = this;
        e51Var.setHasOwnBackground(true);
        e51Var.Z = new lg.f((org.telegram.ui.ActionBar.h6) null);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(e51Var.currentAccount);
        long j3 = e51Var.f45140b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(e51Var.currentAccount).N0(j3);
        if (N0 != null && N0.can_view_stats) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean R = org.telegram.messenger.t3.R(M0);
        if (N0 != null && (N0.can_view_revenue || N0.can_view_stars_revenue)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z9) {
            arrayList.add(qh.b.c(context, e51Var.resourceProvider, qh.a.I, 2131744892));
        }
        arrayList.add(qh.b.c(context, e51Var.resourceProvider, qh.a.O, 2131753163));
        if (z10) {
            arrayList.add(qh.b.c(context, e51Var.resourceProvider, qh.a.P, 2131748407));
        }
        e51Var.f45159q0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        oe0 oe0Var = new oe0(context, e51Var.resourceProvider);
        e51Var.f45157o0 = oe0Var;
        oe0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        e51Var.f45157o0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        e51Var.f45157o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        e51Var.f45158p0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.l1(19));
        e51Var.f45158p0.addView(e51Var.f45157o0, c8.ha.e(-1, 72, 81));
        e51Var.f45158p0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = e51Var.f45159q0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new ru0(e51Var, i11, 1));
            e51Var.f45157o0.addView(e51Var.f45159q0[i11]);
            e51Var.f45157o0.i(bVar, true, false);
            i11++;
        }
        e51Var.f45150h0 = new b41(e51Var, e51Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            tb tbVar = new tb(e51Var, -j3, e51Var.getResourceProvider());
            e51Var.f45151i0 = tbVar;
            tbVar.F.setCaptureSectionsDecoratorAllowed(true);
            e51Var.glassEngine.b(e51Var.f45151i0.F);
        }
        if (z10) {
            Activity parentActivity = e51Var.getParentActivity();
            int i12 = e51Var.currentAccount;
            long j10 = -j3;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.h6 resourceProvider = e51Var.getResourceProvider();
            oi.q qVar = e51Var.glassEngine;
            if (org.telegram.messenger.t3.V(M0) && N0.can_view_revenue) {
                z12 = true;
            } else {
                z12 = false;
            }
            i7 = -1;
            zd zdVar = new zd(parentActivity, e51Var, i12, j10, resourceProvider, qVar, z12, N0.can_view_stars_revenue);
            e51Var = e51Var;
            e51Var.f45152j0 = zdVar;
            zdVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z13 = z9;
        FrameLayout frameLayout4 = frameLayout;
        e51Var.f45150h0.setAdapter(new c41(e51Var, z13, R, z10, frameLayout4));
        boolean z14 = e51Var.f45156n0;
        if (R && !z14) {
            z11 = true;
        } else {
            z11 = false;
        }
        e51Var.f45142c = z11;
        if (z11 && e51Var.f45143c0) {
            e51Var.f45150h0.setPosition(z13 ? 1 : 0);
        } else if (z11 && e51Var.f45144d0) {
            b41 b41Var = e51Var.f45150h0;
            if (!z14 && R) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            b41Var.setPosition(i10 + (z13 ? 1 : 0));
        }
        e51Var.p0(e51Var.f45150h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(e51Var.getParentActivity());
        frameLayout5.addView(e51Var.f45150h0, c8.ha.g());
        View view = new View(context);
        e51Var.f45153k0 = view;
        frameLayout5.addView(view, c8.ha.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        e51Var.f45154l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(e51Var.f45154l0, c8.ha.g());
        frameLayout5.addView(e51Var.simpleActionBar);
        if (e51Var.f45142c) {
            e51Var.setBulletinDelegate(new fi.r7(12));
            e51Var.f45158p0.setBackground(e51Var.getBaseSimpleGlass().b(e51Var.f45158p0));
            frameLayout5.addView(e51Var.f45158p0, c8.ha.e(i7, -2, 80));
        }
        e51Var.fragmentView = frameLayout5;
        d41 d41Var = new d41(e51Var, context);
        e51Var.S = d41Var;
        d41Var.setCaptureSectionsDecoratorAllowed(true);
        e51Var.S.setSections(true);
        e51Var.S.setClipToPadding(false);
        e51Var.glassEngine.b(e51Var.S);
        e51Var.S.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        e51Var.f45139a0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        e51Var.V = imageView;
        imageView.setAutoRepeat(true);
        e51Var.V.f(2131624228, 120, 120, null);
        e51Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.m6.Cj;
        org.telegram.ui.ActionBar.t6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.id.M0(2131748777, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.m6.Dj;
        org.telegram.ui.ActionBar.t6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.id.M0(2131748776, null));
        textView2.setGravity(1);
        e51Var.f45139a0.addView(e51Var.V, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        e51Var.f45139a0.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        e51Var.f45139a0.addView(textView2, c8.ha.r(-2, -2, 1));
        frameLayout4.addView(e51Var.f45139a0, c8.ha.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (e51Var.W == null) {
            e51Var.W = new i41(e51Var);
        }
        e51Var.S.setAdapter(e51Var.W);
        v4.b0 b0Var = new v4.b0();
        e51Var.T = b0Var;
        e51Var.S.setLayoutManager(b0Var);
        e51Var.X = new v4.k();
        e51Var.S.setItemAnimator(null);
        e51Var.S.j(new e21(e51Var, 2));
        e51Var.S.setOnItemClickListener(new ay0(e51Var, 6));
        e51Var.S.setOnItemLongClickListener(new a41(e51Var));
        frameLayout4.addView(e51Var.S);
        e51Var.R = new org.telegram.ui.Components.jn(context, null, false, null);
        TLRPC.Chat M02 = e51Var.getMessagesController().M0(Long.valueOf(j3));
        e51Var.R.setChatAvatar(M02);
        e51Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        org.telegram.ui.ActionBar.z4 z4Var = e51Var.simpleActionBar;
        if (M02 == null) {
            str = "";
        } else {
            str = M02.title;
        }
        z4Var.setTitle(str);
        e51Var.simpleActionBar.setActionBarMenuOnItemClick(new qt0(e51Var, 12));
        e51Var.R.i(org.telegram.ui.ActionBar.m6.x0(null, i13, false), org.telegram.ui.ActionBar.m6.x0(null, i14, false));
        boolean z15 = e51Var.A0;
        m4 m4Var = e51Var.E0;
        if (z15) {
            e51Var.f45139a0.setAlpha(0.0f);
            org.telegram.messenger.g0.i3(m4Var, 500L);
            e51Var.f45139a0.setVisibility(0);
            e51Var.S.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            e51Var.f45139a0.setVisibility(8);
            e51Var.S.setVisibility(0);
        }
        fh.g c10 = e51Var.getBaseSimpleGlass().f21026c.c(e51Var.f45157o0, c8.g0.f(e51Var.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        e51Var.f45157o0.setBackground(c10);
        e51Var.glassEngine.c(e51Var.f45150h0);
        oi.a baseSimpleGlass = e51Var.getBaseSimpleGlass();
        b41 b41Var2 = e51Var.f45150h0;
        org.telegram.ui.ActionBar.z4 z4Var2 = e51Var.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = e51Var.resourceProvider;
        baseSimpleGlass.f21034m = frameLayout5;
        baseSimpleGlass.f21035n = b41Var2;
        baseSimpleGlass.f21024a.c(b41Var2);
        baseSimpleGlass.g(frameLayout5, z4Var2, h6Var);
        e51Var.m0 = new te.a(0, new a41(e51Var), org.telegram.ui.Components.wq.h, 380L, false);
        zd zdVar2 = e51Var.f45152j0;
        if (zdVar2 != null) {
            oi.a baseSimpleGlass2 = e51Var.getBaseSimpleGlass();
            View view2 = zdVar2.f52411a1.d;
            fh.g c11 = baseSimpleGlass2.f21026c.c(view2, null, false);
            c11.p(c8.g0.l(zdVar2.f52423n0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = e51Var.f45152j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            e51Var.f45154l0.addView(transactionTabs, layoutParams);
            e51Var.f45152j0.setTabsPinnedChangedListener(new uu0(e51Var, 20));
            e51Var.m0.a(e51Var.f45152j0.f34746e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new hk(e51Var, 2));
        e51Var.getBaseSimpleGlass().f21036o = new xu(e51Var, frameLayout5, new z5(1, frameLayout5), 1);
        e51Var.getBaseSimpleGlass().f21035n = null;
        e51Var.simpleActionBar.setBackground(null);
        e51Var.f45153k0.setBackground(e51Var.getBaseSimpleGlass().a(e51Var.f45153k0));
        org.telegram.messenger.g0.E2(e51Var.R.f34997e);
        frameLayout5.addView(e51Var.R.f34997e, c8.ha.e(42, 42, 53));
        e51Var.f0();
        e51Var.fragmentView.setBackgroundColor(e51Var.getThemedColor(org.telegram.ui.ActionBar.m6.f27834a7));
        e51Var.B0 = new r41(e51Var.W, e51Var.T);
        return e51Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.ActionBar.f2 f2Var2;
        org.telegram.ui.ActionBar.f2 f2Var3 = null;
        int i11 = 0;
        if (i7 == org.telegram.messenger.qs.f25113x5) {
            if (((di.r6) objArr[0]) == this.C0) {
                m0();
                r0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.V2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    f2Var = (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack);
                } else {
                    f2Var = null;
                }
                if (f2Var instanceof rn) {
                    ((ActionBarLayout) getParentLayout()).d0(f2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    f2Var2 = (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack2);
                } else {
                    f2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        f2Var3 = (org.telegram.ui.ActionBar.f2) rf.b.g(3, fragmentStack2);
                    }
                    if (f2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).d0(f2Var2, false);
                    }
                    finishFragment();
                    if (f2Var3 instanceof cn) {
                        wg.h.f(f2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (f2Var2 instanceof ProfileActivity) {
                    wg.h.f(f2Var2, chat, false);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.D) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    arrayList = this.f45165u0;
                    if (i12 >= size) {
                        break;
                    }
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i12);
                    int i13 = this.f45163s0.get(ijVar.e1(), -1);
                    if (i13 >= 0 && ((b51) arrayList.get(i13)).b() == ijVar.e1()) {
                        if (ijVar.Z) {
                            arrayList3.add((b51) arrayList.get(i13));
                        } else {
                            ((b51) arrayList.get(i13)).f43931b = ijVar;
                        }
                    }
                    i12++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f45166v0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    b51 b51Var = (b51) arrayList.get(i11);
                    if (b51Var.f43931b == null) {
                        this.f45161r0 = b51Var.b();
                        break;
                    } else {
                        arrayList4.add(b51Var);
                        i11++;
                    }
                }
                if (arrayList4.size() < 20) {
                    k0();
                }
                r0();
                if (this.W != null) {
                    this.S.setItemAnimator(null);
                    this.B0.f();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f26961id == this.f45140b && this.f45138a == null) {
                this.f45138a = chatFull;
                l0();
            }
        }
    }

    public final void f0() {
        int i7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if (this.f45153k0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.mSystemInsets.f15123b;
            ViewGroup.LayoutParams layoutParams = this.f45153k0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.f45153k0.setLayoutParams(layoutParams);
            }
            t0();
        }
        if (this.f45142c) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        org.telegram.messenger.g0.B3(this.R.f34997e, 0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15123b, org.telegram.messenger.g0.L(6.0f), 0);
        this.f45158p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        d41 d41Var = this.S;
        if (d41Var != null) {
            i0.b bVar = this.mSystemInsets;
            oi.a.e(d41Var, bVar.f15123b, bVar.d, currentActionBarHeight, i7);
        }
        tb tbVar = this.f45151i0;
        if (tbVar != null) {
            org.telegram.ui.Components.pj0 pj0Var = tbVar.F;
            i0.b bVar2 = this.mSystemInsets;
            oi.a.e(pj0Var, bVar2.f15123b, bVar2.d, currentActionBarHeight, i7);
        }
        zd zdVar = this.f45152j0;
        if (zdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i10 = bVar3.f15123b;
            int i11 = bVar3.d;
            zdVar.U0 = i10;
            zdVar.V0 = i11;
            zdVar.W0 = i7;
            int C = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, i11, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.r41 r41Var = zdVar.X0;
            org.telegram.messenger.g0.B3(r41Var, 0, C, 0, C2);
            r41Var.setPadding(r41Var.getPaddingLeft(), (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10) - C, r41Var.getPaddingRight(), (i11 + i7) - C2);
            zdVar.z(-C, -C2);
            zdVar.B();
            zdVar.requestLayout();
            zdVar.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        q41 q41Var;
        q41 q41Var2;
        f6 f6Var = new f6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.S, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27998j5));
        if (this.f45141b0) {
            while (i7 < 6) {
                if (i7 == 0) {
                    q41Var2 = this.d;
                } else if (i7 == 1) {
                    q41Var2 = this.H;
                } else if (i7 == 2) {
                    q41Var2 = this.I;
                } else if (i7 == 3) {
                    q41Var2 = this.J;
                } else if (i7 == 4) {
                    q41Var2 = this.K;
                } else {
                    q41Var2 = this.L;
                }
                n0(q41Var2, arrayList, f6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                if (i7 == 0) {
                    q41Var = this.d;
                } else if (i7 == 1) {
                    q41Var = this.h;
                } else if (i7 == 2) {
                    q41Var = this.f45155n;
                } else if (i7 == 3) {
                    q41Var = this.f45160r;
                } else if (i7 == 4) {
                    q41Var = this.f45162s;
                } else if (i7 == 5) {
                    q41Var = this.f45167w;
                } else if (i7 == 6) {
                    q41Var = this.f45171y;
                } else if (i7 == 7) {
                    q41Var = this.f45145e;
                } else if (i7 == 8) {
                    q41Var = this.f45169x;
                } else if (i7 == 9) {
                    q41Var = this.D;
                } else if (i7 == 10) {
                    q41Var = this.E;
                } else {
                    q41Var = this.F;
                }
                n0(q41Var, arrayList, f6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)) <= 0.699999988079071d) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        b41 b41Var;
        if (motionEvent != null && this.f45152j0 != null && (b41Var = this.f45150h0) != null) {
            View currentView = b41Var.getCurrentView();
            zd zdVar = this.f45152j0;
            if (currentView == zdVar && zdVar.G((motionEvent.getX() - this.f45150h0.getX()) - this.f45152j0.getX(), (motionEvent.getY() - this.f45150h0.getY()) - this.f45152j0.getY())) {
                return false;
            }
        }
        b41 b41Var2 = this.f45150h0;
        if (b41Var2 != null && (b41Var2.f38891b != 0 || b41Var2.f38892c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(q41[] q41VarArr) {
        i41 i41Var = this.W;
        if (i41Var != null) {
            i41Var.E();
            this.S.setItemAnimator(null);
            this.W.f();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.f45139a0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            org.telegram.messenger.g0.r(this.E0);
            this.f45139a0.animate().alpha(0.0f).setDuration(230L).setListener(new g30(this, 28));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (q41 q41Var : q41VarArr) {
                if (q41Var != null && q41Var.d == null && q41Var.f48952f != null) {
                    q41Var.a(this.currentAccount, this.classGuid, this.f45138a.stats_dc, new gh(2, this, q41Var));
                }
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f26998id = new ArrayList<>();
        ArrayList arrayList = this.f45165u0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.f45163s0.get(this.f45161r0); i10 < size; i10++) {
            if (((b51) arrayList.get(i10)).f43931b == null) {
                tL_channels_getMessages.f26998id.add(Integer.valueOf(((b51) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(this.f45140b);
        this.f45173z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new w31(this, 0));
    }

    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f45156n0) {
            return;
        }
        boolean z9 = this.f45141b0;
        long j3 = this.f45140b;
        if (z9) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new w31(this, 1), null, null, 0, this.f45138a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.f45170x0;
        arrayList.clear();
        ArrayList arrayList2 = this.f45168w0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            b51 b51Var = (b51) obj;
            org.telegram.messenger.ij f10 = this.C0.f(b51Var.b());
            if (f10 != null) {
                b51Var.f43931b = f10;
                arrayList.add(b51Var);
            }
        }
        this.f45164t0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof o41) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.y6) && !this.S.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.xp) {
                org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) background;
                if ((xpVar.f40374a instanceof ColorDrawable) && xpVar.f40375b != null) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27854b7, false);
                    if (this.G0 == null || this.H0 != x02) {
                        this.H0 = x02;
                        this.G0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) xpVar.f40374a).setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false));
                    xpVar.f40375b.setColorFilter(this.G0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.xp xpVar2 = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27834a7, false)), org.telegram.ui.ActionBar.m6.Y0(org.telegram.messenger.t0.f25570b, 2131231229, org.telegram.ui.ActionBar.m6.f27854b7), 0, 0);
            xpVar2.f40383x = true;
            view.setBackground(xpVar2);
        } else if (view instanceof ng.c) {
            ((ng.c) view).a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        ab.b0 b0Var = this.F0;
        if (b0Var != null) {
            b0Var.b();
            this.F0 = null;
        }
        org.telegram.messenger.qs notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var2 = new ab.b0(notificationCenter, this);
        b0Var2.c(org.telegram.messenger.qs.D);
        b0Var2.c(org.telegram.messenger.qs.T);
        b0Var2.c(org.telegram.messenger.qs.V2);
        b0Var2.c(org.telegram.messenger.qs.f25113x5);
        this.F0 = b0Var2;
        di.z6 P1 = getMessagesController().P1();
        long j3 = this.f45140b;
        di.r6 A = P1.A(2, -1, -j3, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.f45138a != null) {
            l0();
        } else {
            org.telegram.messenger.qp.s1(this.currentAccount).V2(this.classGuid, j3, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        ab.b0 b0Var = this.F0;
        if (b0Var != null) {
            b0Var.b();
            this.F0 = null;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.f45149g0;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
            u1VarArr[0] = null;
        }
        di.r6 r6Var = this.C0;
        if (r6Var != null) {
            r6Var.z(this.D0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        f0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.jn jnVar = this.R;
            if (jnVar != null) {
                jnVar.i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Cj, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Dj, false));
            }
            s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(int i7, boolean z9) {
        boolean z10;
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f45159q0;
            if (i10 < bVarArr.length) {
                qh.b bVar = bVarArr[i10];
                if (i10 == i7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.f(z10, z9);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void q0(boolean z9, float f10) {
        for (int i7 = 0; i7 < this.f45159q0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.f45159q0[i7];
            bVar.J = max;
            bVar.I = z9;
            bVar.invalidate();
        }
        this.f45157o0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.f45172y0;
        arrayList.clear();
        arrayList.addAll(this.f45166v0);
        arrayList.addAll(this.f45170x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.messenger.sk(4))));
    }

    public final void s0() {
        d41 d41Var = this.S;
        if (d41Var != null) {
            int childCount = d41Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                o0(this.S.getChildAt(i7));
            }
            int hiddenChildCount = this.S.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                o0(this.S.V(i10));
            }
            int cachedChildCount = this.S.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                o0(this.S.P(i11));
            }
            int attachedScrapChildCount = this.S.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                o0(this.S.O(i12));
            }
            this.S.getRecycledViewPool().a();
        }
        lg.f fVar = this.Z;
        if (fVar != null) {
            fVar.f18271c = true;
        }
    }

    public final void t0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e51.t0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
