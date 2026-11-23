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
public final class b51 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public boolean A0;
    public boolean B0;
    public o41 C0;
    public fi.h6 D0;
    public n41 E;
    public int E0;
    public n41 F;
    public final m4 F0;
    public n41 G;
    public xi.e G0;
    public x41 H;
    public PorterDuffColorFilter H0;
    public n41 I;
    public int I0;
    public n41 J;
    public n41 K;
    public n41 L;
    public n41 M;
    public n41 N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public org.telegram.ui.Components.zn S;
    public b41 T;
    public v4.c0 U;
    public final h2.j0 V;
    public org.telegram.ui.Components.qh0 W;
    public g41 X;
    public c41 Y;
    public a51 Z;
    public TLRPC.ChatFull f45924a;
    public lg.f f45925a0;
    public final long f45926b;
    public LinearLayout f45927b0;
    public boolean f45928c;
    public final boolean f45929c0;
    public n41 d;
    public final boolean f45930d0;
    public n41 f45931e;
    public final boolean f45932e0;
    public w41 f45933f;
    public long f45934f0;
    public long f45935g0;
    public n41 h;
    public final org.telegram.ui.ActionBar.t1[] f45936h0;
    public z31 f45937i0;
    public sb f45938j0;
    public xd f45939k0;
    public View f45940l0;
    public FrameLayout m0;
    public n41 f45941n;
    public te.a f45942n0;
    public final boolean f45943o0;
    public ne0 f45944p0;
    public FrameLayout f45945q0;
    public n41 f45946r;
    public qh.b[] f45947r0;
    public n41 f45948s;
    public int f45949s0;
    public final SparseIntArray f45950t0;
    public final SparseIntArray f45951u0;
    public final ArrayList f45952v0;
    public n41 f45953w;
    public final ArrayList f45954w0;
    public n41 f45955x;
    public final ArrayList f45956x0;
    public n41 f45957y;
    public final ArrayList f45958y0;
    public final ArrayList f45959z0;

    public b51(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new h2.j0(50, 2);
        this.f45936h0 = new org.telegram.ui.ActionBar.t1[1];
        this.f45949s0 = -1;
        this.f45950t0 = new SparseIntArray();
        this.f45951u0 = new SparseIntArray();
        this.f45952v0 = new ArrayList();
        this.f45954w0 = new ArrayList();
        this.f45956x0 = new ArrayList();
        this.f45958y0 = new ArrayList();
        this.f45959z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.f45926b = j3;
        this.f45929c0 = bundle.getBoolean("is_megagroup", false);
        this.f45930d0 = bundle.getBoolean("start_from_boosts", false);
        this.f45932e0 = bundle.getBoolean("start_from_monetization", false);
        this.f45943o0 = bundle.getBoolean("only_boosts", false);
        this.f45924a = getMessagesController().P0(j3);
    }

    public static void Z(final b51 b51Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        String str4;
        ?? r15;
        float abs;
        boolean z10;
        float abs2;
        boolean z11;
        float abs3;
        boolean z12;
        float abs4;
        boolean z13;
        ArrayList arrayList3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        float abs5;
        int i7;
        boolean z14;
        float abs6;
        boolean z15;
        float abs7;
        boolean z16;
        String str10;
        ArrayList arrayList4;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList5 = b51Var.O;
        ArrayList arrayList6 = b51Var.P;
        ArrayList arrayList7 = b51Var.f45952v0;
        String str18 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final n41[] n41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.gd.N0(2131749080, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.gd.N0(2131750593, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.gd.N0(2131743788, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.gd.N0(2131743280, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.gd.N0(2131749182, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.gd.N0(2131743279, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.gd.N0(2131748081, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.gd.N0(2131748848, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.gd.N0(2131747726, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.gd.N0(2131746189, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.gd.N0(2131744415, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.gd.N0(2131744260, "StoryReactionsByEmotionChartTitle"), 2, false)};
            n41 n41Var = n41VarArr[2];
            if (n41Var != null) {
                n41Var.f50219n = true;
            }
            ?? obj = new Object();
            xi.e a10 = w41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            obj.f53131o = org.telegram.messenger.gd.N0(2131746182, "ReactionsPerPost");
            obj.f53132p = (String) a10.f60749a;
            obj.f53133q = (String) a10.f60750b;
            obj.f53134r = ((Boolean) a10.f60751c).booleanValue();
            obj.f53135s = ((Boolean) a10.d).booleanValue();
            xi.e a11 = w41.a(tL_broadcastStats.reactions_per_story);
            obj.f53136t = org.telegram.messenger.gd.N0(2131746181, "ReactionsPerStory");
            obj.f53137u = (String) a11.f60749a;
            obj.v = (String) a11.f60750b;
            obj.f53138w = ((Boolean) a11.f60751c).booleanValue();
            obj.f53139x = ((Boolean) a11.d).booleanValue();
            xi.e a12 = w41.a(tL_broadcastStats.views_per_story);
            obj.f53140y = org.telegram.messenger.gd.N0(2131743277, "ViewsPerStory");
            obj.f53141z = (String) a12.f60749a;
            obj.A = (String) a12.f60750b;
            obj.B = ((Boolean) a12.f60751c).booleanValue();
            obj.C = ((Boolean) a12.d).booleanValue();
            xi.e a13 = w41.a(tL_broadcastStats.shares_per_story);
            obj.D = org.telegram.messenger.gd.N0(2131745201, "SharesPerStory");
            obj.E = (String) a13.f60749a;
            obj.F = (String) a13.f60750b;
            obj.G = ((Boolean) a13.f60751c).booleanValue();
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
            obj.f53119a = org.telegram.messenger.gd.N0(2131750593, "FollowersChartTitle");
            obj.f53120b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs5 == 0.0f) {
                i7 = i11;
                obj.f53121c = "";
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
                    obj.f53121c = sb2.toString() + " (" + i12 + "%)";
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
                    obj.f53121c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i7 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.d = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d10 = tL_statsAbsValueAndPrev2.current;
            double d11 = tL_statsAbsValueAndPrev2.previous;
            int i13 = (int) (d10 - d11);
            if (d11 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i13 / ((float) d11)) * 100.0f);
            }
            obj.f53125i = org.telegram.messenger.gd.N0(2131745202, "SharesPerPost");
            obj.f53126j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f53127k = sb4.toString() + " (" + i14 + "%)";
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
                    obj.f53127k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f53127k = "";
            }
            if (i13 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f53128l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            if (d13 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i15 / ((float) d13)) * 100.0f);
            }
            obj.f53122e = org.telegram.messenger.gd.N0(2131743278, "ViewsPerPost");
            obj.f53123f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f53124g = sb6.toString() + " (" + i16 + "%)";
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
                    obj.f53124g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f53124g = "";
            }
            if (i15 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f53129m = org.telegram.messenger.gd.N0(2131751131, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                obj.f53130n = com.google.android.gms.internal.vision.e2.i(i17, "%");
            } else {
                obj.f53130n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            b51Var.f45933f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            b51Var.f45934f0 = tL_statsDateRangeDays.max_date * 1000;
            b51Var.f45935g0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f54222a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str10 = str19;
                    str11 = str18;
                    b51Var.f45950t0.put(obj2.b(), i18);
                    i18++;
                } else {
                    str10 = str19;
                    arrayList4 = arrayList8;
                    str11 = str18;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    b51Var.f45956x0.add(obj2);
                    b51Var.f45951u0.put(obj2.b(), i19);
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
            org.telegram.messenger.g0.g3(new v31(b51Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((y41) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.tr messagesStorage = b51Var.getMessagesStorage();
                int i22 = b51Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.f27149a.c(new org.telegram.messenger.op(messagesStorage, org.telegram.messenger.sz.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -b51Var.f45926b, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            org.telegram.messenger.g0.g3(new Runnable(b51Var) {
                public final b51 f53100b;

                {
                    this.f53100b = b51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            b51 b51Var2 = this.f53100b;
                            b51Var2.getClass();
                            n41[] n41VarArr2 = n41VarArr;
                            b51Var2.f45946r = n41VarArr2[0];
                            b51Var2.h = n41VarArr2[1];
                            b51Var2.f45931e = n41VarArr2[2];
                            b51Var2.f45941n = n41VarArr2[3];
                            b51Var2.d = n41VarArr2[4];
                            b51Var2.f45948s = n41VarArr2[5];
                            b51Var2.f45953w = n41VarArr2[6];
                            b51Var2.f45955x = n41VarArr2[7];
                            b51Var2.f45957y = n41VarArr2[8];
                            b51Var2.E = n41VarArr2[9];
                            b51Var2.F = n41VarArr2[10];
                            b51Var2.G = n41VarArr2[11];
                            b51Var2.j0(n41VarArr2);
                            return;
                        default:
                            b51 b51Var3 = this.f53100b;
                            b51Var3.getClass();
                            n41[] n41VarArr3 = n41VarArr;
                            b51Var3.d = n41VarArr3[0];
                            b51Var3.I = n41VarArr3[1];
                            b51Var3.J = n41VarArr3[2];
                            b51Var3.K = n41VarArr3[3];
                            b51Var3.L = n41VarArr3[4];
                            b51Var3.M = n41VarArr3[5];
                            b51Var3.f45931e = n41VarArr3[6];
                            b51Var3.N = n41VarArr3[7];
                            b51Var3.j0(n41VarArr3);
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
            n41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.gd.N0(2131749182, str3), r15, r15);
            n41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.gd.N0(2131749234, "GroupMembersChartTitle"), r15, r15);
            n41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.gd.N0(2131748078, "NewMembersBySourceChartTitle"), 2, r15);
            n41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.gd.N0(2131748425, "MembersLanguageChartTitle"), 4, true);
            n41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.gd.N0(2131748269, "MessagesChartTitle"), 2, r15);
            n41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.gd.N0(2131754486, "ActionsChartTitle"), 1, r15);
            n41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.gd.N0(2131743788, str), r15, r15);
            n41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.gd.N0(2131743789, "TopDaysOfWeekChartTitle"), 4, r15);
            final n41[] n41VarArr2 = new n41[8];
            n41VarArr2[r15] = i02;
            n41VarArr2[1] = i03;
            n41VarArr2[2] = i04;
            n41VarArr2[3] = i05;
            n41VarArr2[4] = i06;
            n41VarArr2[5] = i07;
            n41VarArr2[6] = i08;
            n41VarArr2[7] = i09;
            n41 n41Var2 = n41VarArr2[6];
            if (n41Var2 != null) {
                n41Var2.f50219n = true;
            }
            n41 n41Var3 = n41VarArr2[7];
            if (n41Var3 != null) {
                n41Var3.f50220o = true;
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
            obj3.f53842a = org.telegram.messenger.gd.N0(2131748424, "MembersOverviewTitle");
            obj3.f53843b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f53844c = sb8.toString() + " (" + i24 + "%)";
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
                    obj3.f53844c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str2);
                }
            } else {
                obj3.f53844c = "";
            }
            if (i23 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.d = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d16 = tL_statsAbsValueAndPrev5.current;
            double d17 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d16 - d17);
            if (d17 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i25 / ((float) d17)) * 100.0f);
            }
            obj3.f53848i = org.telegram.messenger.gd.N0(2131743282, "ViewingMembers");
            obj3.f53849j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f53850k = sb10.toString();
            } else {
                obj3.f53850k = "";
            }
            if (i25 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f53851l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            if (d19 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i26 / ((float) d19)) * 100.0f);
            }
            obj3.f53852m = org.telegram.messenger.gd.N0(2131746873, "PostingMembers");
            obj3.f53853n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f53854o = sb11.toString();
            } else {
                obj3.f53854o = "";
            }
            if (i26 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f53855p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            if (d21 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i27 / ((float) d21)) * 100.0f);
            }
            obj3.f53845e = org.telegram.messenger.gd.N0(2131748260, "MessagesOverview");
            obj3.f53846f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f53847g = sb12.toString();
            } else {
                obj3.f53847g = "";
            }
            if (i27 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            b51Var.H = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            b51Var.f45934f0 = tL_statsDateRangeDays2.max_date * 1000;
            b51Var.f45935g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f52527a = u41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.gd.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.gd.a0("CharactersPerMessage", null, 2131752242, org.telegram.messenger.gd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    obj4.f52528b = sb13.toString();
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
                    ArrayList arrayList19 = b51Var.R;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f52527a = u41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.gd.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.gd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.gd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    obj5.f52528b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = b51Var.Q;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f52527a = u41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f52528b = org.telegram.messenger.gd.G(i34, "Invitations", new Object[0]);
                    } else {
                        obj6.f52528b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            org.telegram.messenger.g0.g3(new Runnable(b51Var) {
                public final b51 f53100b;

                {
                    this.f53100b = b51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            b51 b51Var2 = this.f53100b;
                            b51Var2.getClass();
                            n41[] n41VarArr22 = n41VarArr2;
                            b51Var2.f45946r = n41VarArr22[0];
                            b51Var2.h = n41VarArr22[1];
                            b51Var2.f45931e = n41VarArr22[2];
                            b51Var2.f45941n = n41VarArr22[3];
                            b51Var2.d = n41VarArr22[4];
                            b51Var2.f45948s = n41VarArr22[5];
                            b51Var2.f45953w = n41VarArr22[6];
                            b51Var2.f45955x = n41VarArr22[7];
                            b51Var2.f45957y = n41VarArr22[8];
                            b51Var2.E = n41VarArr22[9];
                            b51Var2.F = n41VarArr22[10];
                            b51Var2.G = n41VarArr22[11];
                            b51Var2.j0(n41VarArr22);
                            return;
                        default:
                            b51 b51Var3 = this.f53100b;
                            b51Var3.getClass();
                            n41[] n41VarArr3 = n41VarArr2;
                            b51Var3.d = n41VarArr3[0];
                            b51Var3.I = n41VarArr3[1];
                            b51Var3.J = n41VarArr3[2];
                            b51Var3.K = n41VarArr3[3];
                            b51Var3.L = n41VarArr3[4];
                            b51Var3.M = n41VarArr3[5];
                            b51Var3.f45931e = n41VarArr3[6];
                            b51Var3.N = n41VarArr3[7];
                            b51Var3.j0(n41VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void a0(b51 b51Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.fj(b51Var.currentAccount, arrayList2.get(i7), false, true));
            }
            b51Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.g3(new v31(b51Var, arrayList, 1));
    }

    public static void c0(b51 b51Var) {
        a51 a51Var = b51Var.Z;
        if (a51Var != null) {
            a51Var.f45592b = true;
        }
        int childCount = b51Var.T.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = b51Var.T.getChildAt(i7);
            if (childAt instanceof m41) {
                ((m41) childAt).f49585b.f19917u0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.g2 g0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f28492id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).P0(chat.f28492id);
        if (P0 != null && (P0.can_view_stats || P0.can_view_stars_revenue)) {
            return new b51(bundle);
        }
        return new t5(-chat.f28492id);
    }

    public static mg.b h0(JSONObject jSONObject, int i7, boolean z10) {
        if (i7 == 0) {
            return new mg.b(jSONObject);
        }
        if (i7 == 1) {
            return new mg.b(jSONObject);
        }
        if (i7 == 2) {
            ?? bVar = new mg.b(jSONObject);
            int length = ((mg.a) bVar.d.get(0)).f21067a.length;
            int size = bVar.d.size();
            bVar.f21084l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bVar.f21084l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = bVar.f21084l;
                    jArr[i10] = jArr[i10] + ((mg.a) bVar.d.get(i11)).f21067a[i10];
                }
            }
            bVar.f21085m = new jb.m(bVar.f21084l);
            return bVar;
        } else if (i7 == 4) {
            ?? bVar2 = new mg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i12 = 0; i12 < bVar2.d.size(); i12++) {
                    int length2 = bVar2.f21074a.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        long j10 = ((mg.a) bVar2.d.get(i12)).f21067a[i13];
                        jArr2[i12] = jArr2[i12] + j10;
                        if (j10 == 0) {
                            iArr[i12] = iArr[i12] + 1;
                        }
                    }
                    j3 += jArr2[i12];
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < bVar2.d.size(); i14++) {
                    if (jArr2[i14] / j3 < 0.01d && iArr[i14] > bVar2.f21074a.length / 2.0f) {
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
            int length3 = ((mg.a) bVar2.d.get(0)).f21067a.length;
            int size3 = bVar2.d.size();
            bVar2.f21086l = new long[length3];
            for (int i16 = 0; i16 < length3; i16++) {
                bVar2.f21086l[i16] = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    long[] jArr3 = bVar2.f21086l;
                    jArr3[i16] = jArr3[i16] + ((mg.a) bVar2.d.get(i17)).f21067a[i16];
                }
            }
            new jb.m(bVar2.f21086l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static n41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        n41 n41Var = new n41(str, i7);
        n41Var.f50218m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z10);
                n41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                n41Var.f50213g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.f21074a) == null || jArr2.length < 2) {
                    n41Var.f50217l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.f21074a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    n41Var.f50211e = new mg.e(h02, j3);
                    n41Var.f50210c = j3;
                    return n41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            n41Var.f50212f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return n41Var;
    }

    public static void n0(n41 n41Var, ArrayList arrayList, org.telegram.ui.ActionBar.v6 v6Var) {
        mg.b bVar;
        int i7;
        if (n41Var != null && (bVar = n41Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                mg.a aVar = (mg.a) obj;
                int i11 = aVar.f21072g;
                if (i11 >= 0) {
                    if (!org.telegram.ui.ActionBar.n6.f1(i11)) {
                        int i12 = aVar.f21072g;
                        if (org.telegram.ui.ActionBar.n6.I == org.telegram.ui.ActionBar.n6.J) {
                            i7 = aVar.f21073i;
                        } else {
                            i7 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.n6.A1(i12, i7, false);
                        org.telegram.ui.ActionBar.n6.hm[aVar.f21072g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, aVar.f21072g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29672p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29786v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29767u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29616m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29824x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29862z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29524h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        int i7;
        boolean z12;
        int i10;
        String str;
        boolean z13;
        b51 b51Var = this;
        b51Var.setHasOwnBackground(true);
        b51Var.f45925a0 = new lg.f((org.telegram.ui.ActionBar.i6) null);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(b51Var.currentAccount);
        long j3 = b51Var.f45926b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(b51Var.currentAccount).P0(j3);
        if (P0 != null && P0.can_view_stats) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean R = org.telegram.messenger.v3.R(O0);
        if (P0 != null && (P0.can_view_revenue || P0.can_view_stars_revenue)) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(qh.b.c(context, b51Var.resourceProvider, qh.a.J, 2131744651));
        }
        arrayList.add(qh.b.c(context, b51Var.resourceProvider, qh.a.P, 2131753160));
        if (z11) {
            arrayList.add(qh.b.c(context, b51Var.resourceProvider, qh.a.Q, 2131748214));
        }
        b51Var.f45947r0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        ne0 ne0Var = new ne0(context, b51Var.resourceProvider);
        b51Var.f45944p0 = ne0Var;
        ne0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        b51Var.f45944p0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        b51Var.f45944p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        b51Var.f45945q0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.o(24));
        b51Var.f45945q0.addView(b51Var.f45944p0, c8.na.e(-1, 72, 81));
        b51Var.f45945q0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = b51Var.f45947r0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new tm0(b51Var, i11, 3));
            b51Var.f45944p0.addView(b51Var.f45947r0[i11]);
            b51Var.f45944p0.j(bVar, true, false);
            i11++;
        }
        b51Var.f45937i0 = new z31(b51Var, b51Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sb sbVar = new sb(b51Var, -j3, b51Var.getResourceProvider());
            b51Var.f45938j0 = sbVar;
            sbVar.G.setCaptureSectionsDecoratorAllowed(true);
            b51Var.glassEngine.b(b51Var.f45938j0.G);
        }
        if (z11) {
            Activity parentActivity = b51Var.getParentActivity();
            int i12 = b51Var.currentAccount;
            long j10 = -j3;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.i6 resourceProvider = b51Var.getResourceProvider();
            ri.q qVar = b51Var.glassEngine;
            if (org.telegram.messenger.v3.V(O0) && P0.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            i7 = -1;
            xd xdVar = new xd(parentActivity, b51Var, i12, j10, resourceProvider, qVar, z13, P0.can_view_stars_revenue);
            b51Var = b51Var;
            b51Var.f45939k0 = xdVar;
            xdVar.Y0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z14 = z10;
        FrameLayout frameLayout4 = frameLayout;
        b51Var.f45937i0.setAdapter(new a41(b51Var, z14, R, z11, frameLayout4));
        boolean z15 = b51Var.f45943o0;
        if (R && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        b51Var.f45928c = z12;
        if (z12 && b51Var.f45930d0) {
            b51Var.f45937i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && b51Var.f45932e0) {
            z31 z31Var = b51Var.f45937i0;
            if (!z15 && R) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            z31Var.setPosition(i10 + (z14 ? 1 : 0));
        }
        b51Var.p0(b51Var.f45937i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(b51Var.getParentActivity());
        frameLayout5.addView(b51Var.f45937i0, c8.na.g());
        View view = new View(context);
        b51Var.f45940l0 = view;
        frameLayout5.addView(view, c8.na.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        b51Var.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(b51Var.m0, c8.na.g());
        frameLayout5.addView(b51Var.simpleActionBar);
        if (b51Var.f45928c) {
            b51Var.setBulletinDelegate(new bi.t(13));
            b51Var.f45945q0.setBackground(b51Var.getBaseSimpleGlass().b(b51Var.f45945q0));
            frameLayout5.addView(b51Var.f45945q0, c8.na.e(i7, -2, 80));
        }
        b51Var.fragmentView = frameLayout5;
        b41 b41Var = new b41(b51Var, context);
        b51Var.T = b41Var;
        b41Var.setCaptureSectionsDecoratorAllowed(true);
        b51Var.T.setSections(true);
        b51Var.T.setClipToPadding(false);
        b51Var.glassEngine.b(b51Var.T);
        b51Var.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        b51Var.f45927b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        b51Var.W = imageView;
        imageView.setAutoRepeat(true);
        b51Var.W.f(2131624229, 120, 120, null);
        b51Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.gd.N0(2131748584, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.gd.N0(2131748583, null));
        textView2.setGravity(1);
        b51Var.f45927b0.addView(b51Var.W, c8.na.t(120, 120, 1, 0, 0, 0, 20));
        b51Var.f45927b0.addView(textView, c8.na.t(-2, -2, 1, 0, 0, 0, 10));
        b51Var.f45927b0.addView(textView2, c8.na.r(-2, -2, 1));
        frameLayout4.addView(b51Var.f45927b0, c8.na.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (b51Var.X == null) {
            b51Var.X = new g41(b51Var);
        }
        b51Var.T.setAdapter(b51Var.X);
        v4.c0 c0Var = new v4.c0();
        b51Var.U = c0Var;
        b51Var.T.setLayoutManager(c0Var);
        b51Var.Y = new v4.l();
        b51Var.T.setItemAnimator(null);
        b51Var.T.j(new b21(b51Var, 2));
        b51Var.T.setOnItemClickListener(new xx0(b51Var, 6));
        b51Var.T.setOnItemLongClickListener(new y31(b51Var));
        frameLayout4.addView(b51Var.T);
        b51Var.S = new org.telegram.ui.Components.zn(context, null, false, null);
        TLRPC.Chat O02 = b51Var.getMessagesController().O0(Long.valueOf(j3));
        b51Var.S.setChatAvatar(O02);
        b51Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        org.telegram.ui.ActionBar.z4 z4Var = b51Var.simpleActionBar;
        if (O02 == null) {
            str = "";
        } else {
            str = O02.title;
        }
        z4Var.setTitle(str);
        b51Var.simpleActionBar.setActionBarMenuOnItemClick(new gs0(b51Var, 15));
        b51Var.S.i(org.telegram.ui.ActionBar.n6.x0(null, i13, false), org.telegram.ui.ActionBar.n6.x0(null, i14, false));
        boolean z16 = b51Var.B0;
        m4 m4Var = b51Var.F0;
        if (z16) {
            b51Var.f45927b0.setAlpha(0.0f);
            org.telegram.messenger.g0.h3(m4Var, 500L);
            b51Var.f45927b0.setVisibility(0);
            b51Var.T.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            b51Var.f45927b0.setVisibility(8);
            b51Var.T.setVisibility(0);
        }
        fh.g c10 = b51Var.getBaseSimpleGlass().f56739c.c(b51Var.f45944p0, c8.j0.g(b51Var.resourceProvider), false);
        org.telegram.messenger.m10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        b51Var.f45944p0.setBackground(c10);
        b51Var.glassEngine.c(b51Var.f45937i0);
        ri.a baseSimpleGlass = b51Var.getBaseSimpleGlass();
        z31 z31Var2 = b51Var.f45937i0;
        org.telegram.ui.ActionBar.z4 z4Var2 = b51Var.simpleActionBar;
        org.telegram.ui.ActionBar.i6 i6Var = b51Var.resourceProvider;
        baseSimpleGlass.f56747m = frameLayout5;
        baseSimpleGlass.f56748n = z31Var2;
        baseSimpleGlass.f56737a.c(z31Var2);
        baseSimpleGlass.g(frameLayout5, z4Var2, i6Var);
        b51Var.f45942n0 = new te.a(0, new y31(b51Var), org.telegram.ui.Components.kr.h, 380L, false);
        xd xdVar2 = b51Var.f45939k0;
        if (xdVar2 != null) {
            ri.a baseSimpleGlass2 = b51Var.getBaseSimpleGlass();
            View view2 = xdVar2.f53921b1.d;
            fh.g c11 = baseSimpleGlass2.f56739c.c(view2, null, false);
            c11.p(c8.j0.m(xdVar2.f53933o0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = b51Var.f45939k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            b51Var.m0.addView(transactionTabs, layoutParams);
            b51Var.f45939k0.setTabsPinnedChangedListener(new qu0(b51Var, 20));
            b51Var.f45942n0.a(b51Var.f45939k0.f39707f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new gk(b51Var, 2));
        b51Var.getBaseSimpleGlass().f56749o = new vu(b51Var, frameLayout5, new a6(1, frameLayout5), 1);
        b51Var.getBaseSimpleGlass().f56748n = null;
        b51Var.simpleActionBar.setBackground(null);
        b51Var.f45940l0.setBackground(b51Var.getBaseSimpleGlass().a(b51Var.f45940l0));
        org.telegram.messenger.g0.E2(b51Var.S.f42934e);
        frameLayout5.addView(b51Var.S.f42934e, c8.na.e(42, 42, 53));
        b51Var.f0();
        b51Var.fragmentView.setBackgroundColor(b51Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
        b51Var.C0 = new o41(b51Var.X, b51Var.U);
        return b51Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.g2 g2Var;
        org.telegram.ui.ActionBar.g2 g2Var2;
        org.telegram.ui.ActionBar.g2 g2Var3 = null;
        int i11 = 0;
        if (i7 == org.telegram.messenger.ks.A5) {
            if (((fi.h6) objArr[0]) == this.D0) {
                m0();
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.f();
                }
            }
        } else if (i7 == org.telegram.messenger.ks.X2) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    g2Var = (org.telegram.ui.ActionBar.g2) p5.c.h(2, fragmentStack);
                } else {
                    g2Var = null;
                }
                if (g2Var instanceof rn) {
                    ((ActionBarLayout) getParentLayout()).d0(g2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    g2Var2 = (org.telegram.ui.ActionBar.g2) p5.c.h(2, fragmentStack2);
                } else {
                    g2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        g2Var3 = (org.telegram.ui.ActionBar.g2) p5.c.h(3, fragmentStack2);
                    }
                    if (g2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).d0(g2Var2, false);
                    }
                    finishFragment();
                    if (g2Var3 instanceof bn) {
                        wg.h.f(g2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (g2Var2 instanceof ProfileActivity) {
                    wg.h.f(g2Var2, chat, false);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.D) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    arrayList = this.f45952v0;
                    if (i12 >= size) {
                        break;
                    }
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i12);
                    int i13 = this.f45950t0.get(fjVar.e1(), -1);
                    if (i13 >= 0 && ((y41) arrayList.get(i13)).b() == fjVar.e1()) {
                        if (fjVar.Z) {
                            arrayList3.add((y41) arrayList.get(i13));
                        } else {
                            ((y41) arrayList.get(i13)).f54223b = fjVar;
                        }
                    }
                    i12++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f45954w0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    y41 y41Var = (y41) arrayList.get(i11);
                    if (y41Var.f54223b == null) {
                        this.f45949s0 = y41Var.b();
                        break;
                    } else {
                        arrayList4.add(y41Var);
                        i11++;
                    }
                }
                if (arrayList4.size() < 20) {
                    k0();
                }
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.f();
                }
            }
        } else if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28493id == this.f45926b && this.f45924a == null) {
                this.f45924a = chatFull;
                l0();
            }
        }
    }

    public final void f0() {
        int i7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.f45940l0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15979b;
            ViewGroup.LayoutParams layoutParams = this.f45940l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.f45940l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        if (this.f45928c) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        org.telegram.messenger.g0.z3(this.S.f42934e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15979b, org.telegram.messenger.g0.L(6.0f), 0);
        this.f45945q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        b41 b41Var = this.T;
        if (b41Var != null) {
            i0.b bVar = this.mSystemInsets;
            ri.a.e(b41Var, bVar.f15979b, bVar.d, currentActionBarHeight, i7);
        }
        sb sbVar = this.f45938j0;
        if (sbVar != null) {
            org.telegram.ui.Components.ek0 ek0Var = sbVar.G;
            i0.b bVar2 = this.mSystemInsets;
            ri.a.e(ek0Var, bVar2.f15979b, bVar2.d, currentActionBarHeight, i7);
        }
        xd xdVar = this.f45939k0;
        if (xdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i10 = bVar3.f15979b;
            int i11 = bVar3.d;
            xdVar.V0 = i10;
            xdVar.W0 = i11;
            xdVar.X0 = i7;
            int D = org.telegram.messenger.m10.D(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            int D2 = org.telegram.messenger.m10.D(48.0f, i11, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.g51 g51Var = xdVar.Y0;
            org.telegram.messenger.g0.z3(g51Var, 0, D, 0, D2);
            g51Var.setPadding(g51Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - D, g51Var.getPaddingRight(), (i11 + i7) - D2);
            xdVar.z(-D, -D2);
            xdVar.B();
            xdVar.requestLayout();
            xdVar.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        n41 n41Var;
        n41 n41Var2;
        g6 g6Var = new g6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29559j5));
        if (this.f45929c0) {
            while (i7 < 6) {
                if (i7 == 0) {
                    n41Var2 = this.d;
                } else if (i7 == 1) {
                    n41Var2 = this.I;
                } else if (i7 == 2) {
                    n41Var2 = this.J;
                } else if (i7 == 3) {
                    n41Var2 = this.K;
                } else if (i7 == 4) {
                    n41Var2 = this.L;
                } else {
                    n41Var2 = this.M;
                }
                n0(n41Var2, arrayList, g6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                if (i7 == 0) {
                    n41Var = this.d;
                } else if (i7 == 1) {
                    n41Var = this.h;
                } else if (i7 == 2) {
                    n41Var = this.f45941n;
                } else if (i7 == 3) {
                    n41Var = this.f45946r;
                } else if (i7 == 4) {
                    n41Var = this.f45948s;
                } else if (i7 == 5) {
                    n41Var = this.f45953w;
                } else if (i7 == 6) {
                    n41Var = this.f45957y;
                } else if (i7 == 7) {
                    n41Var = this.f45931e;
                } else if (i7 == 8) {
                    n41Var = this.f45955x;
                } else if (i7 == 9) {
                    n41Var = this.E;
                } else if (i7 == 10) {
                    n41Var = this.F;
                } else {
                    n41Var = this.G;
                }
                n0(n41Var, arrayList, g6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false)) <= 0.699999988079071d) {
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
        z31 z31Var;
        if (motionEvent != null && this.f45939k0 != null && (z31Var = this.f45937i0) != null) {
            View currentView = z31Var.getCurrentView();
            xd xdVar = this.f45939k0;
            if (currentView == xdVar && xdVar.G((motionEvent.getX() - this.f45937i0.getX()) - this.f45939k0.getX(), (motionEvent.getY() - this.f45937i0.getY()) - this.f45939k0.getY())) {
                return false;
            }
        }
        z31 z31Var2 = this.f45937i0;
        if (z31Var2 != null && (z31Var2.f36663b != 0 || z31Var2.f36664c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(n41[] n41VarArr) {
        g41 g41Var = this.X;
        if (g41Var != null) {
            g41Var.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.f45927b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            org.telegram.messenger.g0.r(this.F0);
            this.f45927b0.animate().alpha(0.0f).setDuration(230L).setListener(new zx(this, 29));
            this.T.setVisibility(0);
            this.T.setAlpha(0.0f);
            this.T.animate().alpha(1.0f).setDuration(230L).start();
            for (n41 n41Var : n41VarArr) {
                if (n41Var != null && n41Var.d == null && n41Var.f50212f != null) {
                    n41Var.a(this.currentAccount, this.classGuid, this.f45924a.stats_dc, new fh(2, this, n41Var));
                }
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f28530id = new ArrayList<>();
        ArrayList arrayList = this.f45952v0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.f45950t0.get(this.f45949s0); i10 < size; i10++) {
            if (((y41) arrayList.get(i10)).f54223b == null) {
                tL_channels_getMessages.f28530id.add(Integer.valueOf(((y41) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(this.f45926b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new u31(this, 0));
    }

    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f45943o0) {
            return;
        }
        boolean z10 = this.f45929c0;
        long j3 = this.f45926b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new u31(this, 1), null, null, 0, this.f45924a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.f45958y0;
        arrayList.clear();
        ArrayList arrayList2 = this.f45956x0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            y41 y41Var = (y41) obj;
            org.telegram.messenger.fj f10 = this.D0.f(y41Var.b());
            if (f10 != null) {
                y41Var.f54223b = f10;
                arrayList.add(y41Var);
            }
        }
        this.f45951u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof m41) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.y6) && !this.T.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.lq) {
                org.telegram.ui.Components.lq lqVar = (org.telegram.ui.Components.lq) background;
                if ((lqVar.f37195a instanceof ColorDrawable) && lqVar.f37196b != null) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29415b7, false);
                    if (this.H0 == null || this.I0 != x02) {
                        this.I0 = x02;
                        this.H0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) lqVar.f37195a).setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false));
                    lqVar.f37196b.setColorFilter(this.H0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.lq lqVar2 = new org.telegram.ui.Components.lq(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394a7, false)), org.telegram.ui.ActionBar.n6.Y0(org.telegram.messenger.t0.f27013b, 2131231232, org.telegram.ui.ActionBar.n6.f29415b7), 0, 0);
            lqVar2.f37204x = true;
            view.setBackground(lqVar2);
        } else if (view instanceof ng.c) {
            ((ng.c) view).a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.messenger.ks notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ks.D);
        eVar2.c(org.telegram.messenger.ks.T);
        eVar2.c(org.telegram.messenger.ks.X2);
        eVar2.c(org.telegram.messenger.ks.A5);
        this.G0 = eVar2;
        fi.p6 R1 = getMessagesController().R1();
        long j3 = this.f45926b;
        fi.h6 A = R1.A(2, -1, -j3, true);
        this.D0 = A;
        if (A != null) {
            this.E0 = A.o();
        }
        if (this.f45924a != null) {
            l0();
        } else {
            org.telegram.messenger.mp.u1(this.currentAccount).b3(this.classGuid, j3, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        xi.e eVar = this.G0;
        if (eVar != null) {
            eVar.b();
            this.G0 = null;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f45936h0;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
            t1VarArr[0] = null;
        }
        fi.h6 h6Var = this.D0;
        if (h6Var != null) {
            h6Var.z(this.E0);
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
            org.telegram.ui.Components.zn znVar = this.S;
            if (znVar != null) {
                znVar.i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fj, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gj, false));
            }
            s0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void p0(int i7, boolean z10) {
        boolean z11;
        int i10 = 0;
        while (true) {
            qh.b[] bVarArr = this.f45947r0;
            if (i10 < bVarArr.length) {
                qh.b bVar = bVarArr[i10];
                if (i10 == i7) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void q0(boolean z10, float f10) {
        for (int i7 = 0; i7 < this.f45947r0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.f45947r0[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.f45944p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.f45959z0;
        arrayList.clear();
        arrayList.addAll(this.f45954w0);
        arrayList.addAll(this.f45958y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.messenger.ok(4))));
    }

    public final void s0() {
        b41 b41Var = this.T;
        if (b41Var != null) {
            int childCount = b41Var.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                o0(this.T.getChildAt(i7));
            }
            int hiddenChildCount = this.T.getHiddenChildCount();
            for (int i10 = 0; i10 < hiddenChildCount; i10++) {
                o0(this.T.V(i10));
            }
            int cachedChildCount = this.T.getCachedChildCount();
            for (int i11 = 0; i11 < cachedChildCount; i11++) {
                o0(this.T.P(i11));
            }
            int attachedScrapChildCount = this.T.getAttachedScrapChildCount();
            for (int i12 = 0; i12 < attachedScrapChildCount; i12++) {
                o0(this.T.O(i12));
            }
            this.T.getRecycledViewPool().a();
        }
        lg.f fVar = this.f45925a0;
        if (fVar != null) {
            fVar.f19862c = true;
        }
    }

    public final void t0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b51.t0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
