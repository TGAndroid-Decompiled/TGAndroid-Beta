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
public final class d51 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public boolean A0;
    public q41 B0;
    public di.r6 C0;
    public p41 D;
    public int D0;
    public p41 E;
    public final m4 E0;
    public p41 F;
    public ab.b0 F0;
    public z41 G;
    public PorterDuffColorFilter G0;
    public p41 H;
    public int H0;
    public p41 I;
    public p41 J;
    public p41 K;
    public p41 L;
    public p41 M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public org.telegram.ui.Components.kn R;
    public c41 S;
    public v4.b0 T;
    public final h2.j0 U;
    public org.telegram.ui.Components.dh0 V;
    public h41 W;
    public d41 X;
    public c51 Y;
    public lg.f Z;
    public TLRPC.ChatFull f44825a;
    public LinearLayout f44826a0;
    public final long f44827b;
    public final boolean f44828b0;
    public boolean f44829c;
    public final boolean f44830c0;
    public p41 d;
    public final boolean f44831d0;
    public p41 f44832e;
    public long f44833e0;
    public y41 f44834f;
    public long f44835f0;
    public final org.telegram.ui.ActionBar.u1[] f44836g0;
    public p41 h;
    public a41 f44837h0;
    public tb f44838i0;
    public zd f44839j0;
    public View f44840k0;
    public FrameLayout f44841l0;
    public te.a m0;
    public p41 f44842n;
    public final boolean f44843n0;
    public ne0 f44844o0;
    public FrameLayout f44845p0;
    public qh.b[] f44846q0;
    public p41 f44847r;
    public int f44848r0;
    public p41 f44849s;
    public final SparseIntArray f44850s0;
    public final SparseIntArray f44851t0;
    public final ArrayList f44852u0;
    public final ArrayList f44853v0;
    public p41 f44854w;
    public final ArrayList f44855w0;
    public p41 f44856x;
    public final ArrayList f44857x0;
    public p41 f44858y;
    public final ArrayList f44859y0;
    public boolean f44860z0;

    public d51(Bundle bundle) {
        super(bundle);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.U = new h2.j0(50, 2);
        this.f44836g0 = new org.telegram.ui.ActionBar.u1[1];
        this.f44848r0 = -1;
        this.f44850s0 = new SparseIntArray();
        this.f44851t0 = new SparseIntArray();
        this.f44852u0 = new ArrayList();
        this.f44853v0 = new ArrayList();
        this.f44855w0 = new ArrayList();
        this.f44857x0 = new ArrayList();
        this.f44859y0 = new ArrayList();
        this.A0 = true;
        this.E0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.f44827b = j3;
        this.f44828b0 = bundle.getBoolean("is_megagroup", false);
        this.f44830c0 = bundle.getBoolean("start_from_boosts", false);
        this.f44831d0 = bundle.getBoolean("start_from_monetization", false);
        this.f44843n0 = bundle.getBoolean("only_boosts", false);
        this.f44825a = getMessagesController().N0(j3);
    }

    public static void Z(final d51 d51Var, TLObject tLObject) {
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
        ArrayList arrayList5 = d51Var.N;
        ArrayList arrayList6 = d51Var.O;
        ArrayList arrayList7 = d51Var.f44852u0;
        String str18 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final p41[] p41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.id.M0(2131749273, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.id.M0(2131750610, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.id.M0(2131744033, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.id.M0(2131743530, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.id.M0(2131749375, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.id.M0(2131743529, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.id.M0(2131748274, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.id.M0(2131749041, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.id.M0(2131747920, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.id.M0(2131746385, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.id.M0(2131744659, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.id.M0(2131744504, "StoryReactionsByEmotionChartTitle"), 2, false)};
            p41 p41Var = p41VarArr[2];
            if (p41Var != null) {
                p41Var.f48631n = true;
            }
            ?? obj = new Object();
            ab.b0 a10 = y41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            obj.f51898o = org.telegram.messenger.id.M0(2131746378, "ReactionsPerPost");
            obj.f51899p = (String) a10.f907b;
            obj.f51900q = (String) a10.f909e;
            obj.f51901r = ((Boolean) a10.f908c).booleanValue();
            obj.f51902s = ((Boolean) a10.d).booleanValue();
            ab.b0 a11 = y41.a(tL_broadcastStats.reactions_per_story);
            obj.f51903t = org.telegram.messenger.id.M0(2131746377, "ReactionsPerStory");
            obj.f51904u = (String) a11.f907b;
            obj.v = (String) a11.f909e;
            obj.f51905w = ((Boolean) a11.f908c).booleanValue();
            obj.f51906x = ((Boolean) a11.d).booleanValue();
            ab.b0 a12 = y41.a(tL_broadcastStats.views_per_story);
            obj.f51907y = org.telegram.messenger.id.M0(2131743527, "ViewsPerStory");
            obj.f51908z = (String) a12.f907b;
            obj.A = (String) a12.f909e;
            obj.B = ((Boolean) a12.f908c).booleanValue();
            obj.C = ((Boolean) a12.d).booleanValue();
            ab.b0 a13 = y41.a(tL_broadcastStats.shares_per_story);
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
            obj.f51886a = org.telegram.messenger.id.M0(2131750610, "FollowersChartTitle");
            obj.f51887b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs5 == 0.0f) {
                i7 = i11;
                obj.f51888c = "";
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
                    obj.f51888c = sb2.toString() + " (" + i12 + "%)";
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
                    obj.f51888c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
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
            obj.f51892i = org.telegram.messenger.id.M0(2131745398, "SharesPerPost");
            obj.f51893j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f51894k = sb4.toString() + " (" + i14 + "%)";
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
                    obj.f51894k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f51894k = "";
            }
            if (i13 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.f51895l = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            if (d13 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i15 / ((float) d13)) * 100.0f);
            }
            obj.f51889e = org.telegram.messenger.id.M0(2131743528, "ViewsPerPost");
            obj.f51890f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f51891g = sb6.toString() + " (" + i16 + "%)";
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
                    obj.f51891g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f51891g = "";
            }
            if (i15 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.h = z15;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f51896m = org.telegram.messenger.id.M0(2131751143, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                obj.f51897n = com.google.android.recaptcha.internal.a.i(i17, "%");
            } else {
                obj.f51897n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            d51Var.f44834f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            d51Var.f44833e0 = tL_statsDateRangeDays.max_date * 1000;
            d51Var.f44835f0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f43588a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str10 = str19;
                    str11 = str18;
                    d51Var.f44850s0.put(obj2.b(), i18);
                    i18++;
                } else {
                    str10 = str19;
                    arrayList4 = arrayList8;
                    str11 = str18;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    d51Var.f44855w0.add(obj2);
                    d51Var.f44851t0.put(obj2.b(), i19);
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
            org.telegram.messenger.g0.h3(new w31(d51Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((a51) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.yr messagesStorage = d51Var.getMessagesStorage();
                int i22 = d51Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.f26719a.c(new org.telegram.messenger.wp(messagesStorage, org.telegram.messenger.a00.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -d51Var.f44827b, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            org.telegram.messenger.g0.h3(new Runnable(d51Var) {
                public final d51 f51539b;

                {
                    this.f51539b = d51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            d51 d51Var2 = this.f51539b;
                            d51Var2.getClass();
                            p41[] p41VarArr2 = p41VarArr;
                            d51Var2.f44847r = p41VarArr2[0];
                            d51Var2.h = p41VarArr2[1];
                            d51Var2.f44832e = p41VarArr2[2];
                            d51Var2.f44842n = p41VarArr2[3];
                            d51Var2.d = p41VarArr2[4];
                            d51Var2.f44849s = p41VarArr2[5];
                            d51Var2.f44854w = p41VarArr2[6];
                            d51Var2.f44856x = p41VarArr2[7];
                            d51Var2.f44858y = p41VarArr2[8];
                            d51Var2.D = p41VarArr2[9];
                            d51Var2.E = p41VarArr2[10];
                            d51Var2.F = p41VarArr2[11];
                            d51Var2.j0(p41VarArr2);
                            return;
                        default:
                            d51 d51Var3 = this.f51539b;
                            d51Var3.getClass();
                            p41[] p41VarArr3 = p41VarArr;
                            d51Var3.d = p41VarArr3[0];
                            d51Var3.H = p41VarArr3[1];
                            d51Var3.I = p41VarArr3[2];
                            d51Var3.J = p41VarArr3[3];
                            d51Var3.K = p41VarArr3[4];
                            d51Var3.L = p41VarArr3[5];
                            d51Var3.f44832e = p41VarArr3[6];
                            d51Var3.M = p41VarArr3[7];
                            d51Var3.j0(p41VarArr3);
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
            p41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.id.M0(2131749375, str3), r15, r15);
            p41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.id.M0(2131749427, "GroupMembersChartTitle"), r15, r15);
            p41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.id.M0(2131748271, "NewMembersBySourceChartTitle"), 2, r15);
            p41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.id.M0(2131748618, "MembersLanguageChartTitle"), 4, true);
            p41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.id.M0(2131748462, "MessagesChartTitle"), 2, r15);
            p41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.id.M0(2131754489, "ActionsChartTitle"), 1, r15);
            p41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.id.M0(2131744033, str), r15, r15);
            p41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.id.M0(2131744034, "TopDaysOfWeekChartTitle"), 4, r15);
            final p41[] p41VarArr2 = new p41[8];
            p41VarArr2[r15] = i02;
            p41VarArr2[1] = i03;
            p41VarArr2[2] = i04;
            p41VarArr2[3] = i05;
            p41VarArr2[4] = i06;
            p41VarArr2[5] = i07;
            p41VarArr2[6] = i08;
            p41VarArr2[7] = i09;
            p41 p41Var2 = p41VarArr2[6];
            if (p41Var2 != null) {
                p41Var2.f48631n = true;
            }
            p41 p41Var3 = p41VarArr2[7];
            if (p41Var3 != null) {
                p41Var3.f48632o = true;
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
            obj3.f52422a = org.telegram.messenger.id.M0(2131748617, "MembersOverviewTitle");
            obj3.f52423b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f52424c = sb8.toString() + " (" + i24 + "%)";
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
                    obj3.f52424c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str2);
                }
            } else {
                obj3.f52424c = "";
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
            obj3.f52428i = org.telegram.messenger.id.M0(2131743532, "ViewingMembers");
            obj3.f52429j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f52430k = sb10.toString();
            } else {
                obj3.f52430k = "";
            }
            if (i25 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.f52431l = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            if (d19 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i26 / ((float) d19)) * 100.0f);
            }
            obj3.f52432m = org.telegram.messenger.id.M0(2131747067, "PostingMembers");
            obj3.f52433n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f52434o = sb11.toString();
            } else {
                obj3.f52434o = "";
            }
            if (i26 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f52435p = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            if (d21 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i27 / ((float) d21)) * 100.0f);
            }
            obj3.f52425e = org.telegram.messenger.id.M0(2131748453, "MessagesOverview");
            obj3.f52426f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f52427g = sb12.toString();
            } else {
                obj3.f52427g = "";
            }
            if (i27 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.h = z12;
            d51Var.G = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            d51Var.f44833e0 = tL_statsDateRangeDays2.max_date * 1000;
            d51Var.f44835f0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f50866a = w41.a(arrayList14, tL_statsGroupTopPoster.user_id);
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
                    obj4.f50867b = sb13.toString();
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
                    ArrayList arrayList19 = d51Var.Q;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f50866a = w41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
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
                    obj5.f50867b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = d51Var.P;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f50866a = w41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f50867b = org.telegram.messenger.id.G(i34, "Invitations", new Object[0]);
                    } else {
                        obj6.f50867b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            org.telegram.messenger.g0.h3(new Runnable(d51Var) {
                public final d51 f51539b;

                {
                    this.f51539b = d51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            d51 d51Var2 = this.f51539b;
                            d51Var2.getClass();
                            p41[] p41VarArr22 = p41VarArr2;
                            d51Var2.f44847r = p41VarArr22[0];
                            d51Var2.h = p41VarArr22[1];
                            d51Var2.f44832e = p41VarArr22[2];
                            d51Var2.f44842n = p41VarArr22[3];
                            d51Var2.d = p41VarArr22[4];
                            d51Var2.f44849s = p41VarArr22[5];
                            d51Var2.f44854w = p41VarArr22[6];
                            d51Var2.f44856x = p41VarArr22[7];
                            d51Var2.f44858y = p41VarArr22[8];
                            d51Var2.D = p41VarArr22[9];
                            d51Var2.E = p41VarArr22[10];
                            d51Var2.F = p41VarArr22[11];
                            d51Var2.j0(p41VarArr22);
                            return;
                        default:
                            d51 d51Var3 = this.f51539b;
                            d51Var3.getClass();
                            p41[] p41VarArr3 = p41VarArr2;
                            d51Var3.d = p41VarArr3[0];
                            d51Var3.H = p41VarArr3[1];
                            d51Var3.I = p41VarArr3[2];
                            d51Var3.J = p41VarArr3[3];
                            d51Var3.K = p41VarArr3[4];
                            d51Var3.L = p41VarArr3[5];
                            d51Var3.f44832e = p41VarArr3[6];
                            d51Var3.M = p41VarArr3[7];
                            d51Var3.j0(p41VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void a0(d51 d51Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.ij(d51Var.currentAccount, arrayList2.get(i7), false, true));
            }
            d51Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.h3(new w31(d51Var, arrayList, 1));
    }

    public static void c0(d51 d51Var) {
        c51 c51Var = d51Var.Y;
        if (c51Var != null) {
            c51Var.f44226b = true;
        }
        int childCount = d51Var.S.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = d51Var.S.getChildAt(i7);
            if (childAt instanceof n41) {
                ((n41) childAt).f47744b.f18322t0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.f2 g0(TLRPC.Chat chat, boolean z9) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f26956id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z9);
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).N0(chat.f26956id);
        if (N0 != null && (N0.can_view_stats || N0.can_view_stars_revenue)) {
            return new d51(bundle);
        }
        return new t5(-chat.f26956id);
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
            int length = ((mg.a) bVar.d.get(0)).f20016a.length;
            int size = bVar.d.size();
            bVar.f20033l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bVar.f20033l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = bVar.f20033l;
                    jArr[i10] = jArr[i10] + ((mg.a) bVar.d.get(i11)).f20016a[i10];
                }
            }
            bVar.f20034m = new m4.d0(bVar.f20033l);
            return bVar;
        } else if (i7 == 4) {
            ?? bVar2 = new mg.b(jSONObject);
            if (z9) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i12 = 0; i12 < bVar2.d.size(); i12++) {
                    int length2 = bVar2.f20023a.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        long j10 = ((mg.a) bVar2.d.get(i12)).f20016a[i13];
                        jArr2[i12] = jArr2[i12] + j10;
                        if (j10 == 0) {
                            iArr[i12] = iArr[i12] + 1;
                        }
                    }
                    j3 += jArr2[i12];
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < bVar2.d.size(); i14++) {
                    if (jArr2[i14] / j3 < 0.01d && iArr[i14] > bVar2.f20023a.length / 2.0f) {
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
            int length3 = ((mg.a) bVar2.d.get(0)).f20016a.length;
            int size3 = bVar2.d.size();
            bVar2.f20035l = new long[length3];
            for (int i16 = 0; i16 < length3; i16++) {
                bVar2.f20035l[i16] = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    long[] jArr3 = bVar2.f20035l;
                    jArr3[i16] = jArr3[i16] + ((mg.a) bVar2.d.get(i17)).f20016a[i16];
                }
            }
            new m4.d0(bVar2.f20035l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static p41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z9) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        p41 p41Var = new p41(str, i7);
        p41Var.f48630m = z9;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z9);
                p41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                p41Var.f48625g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.f20023a) == null || jArr2.length < 2) {
                    p41Var.f48629l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.f20023a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    p41Var.f48623e = new mg.e(h02, j3);
                    p41Var.f48622c = j3;
                    return p41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            p41Var.f48624f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return p41Var;
    }

    public static void n0(p41 p41Var, ArrayList arrayList, org.telegram.ui.ActionBar.t6 t6Var) {
        mg.b bVar;
        int i7;
        if (p41Var != null && (bVar = p41Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                mg.a aVar = (mg.a) obj;
                int i11 = aVar.f20021g;
                if (i11 >= 0) {
                    if (!org.telegram.ui.ActionBar.l6.f1(i11)) {
                        int i12 = aVar.f20021g;
                        if (org.telegram.ui.ActionBar.l6.I == org.telegram.ui.ActionBar.l6.J) {
                            i7 = aVar.f20022i;
                        } else {
                            i7 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.l6.A1(i12, i7, false);
                        org.telegram.ui.ActionBar.l6.em[aVar.f20021g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.u6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, t6Var, aVar.f20021g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28086p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28200v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28181u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28030m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.fk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28238x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28275z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27938h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Oj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Nj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27973j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A6));
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
        d51 d51Var = this;
        d51Var.setHasOwnBackground(true);
        d51Var.Z = new lg.f((org.telegram.ui.ActionBar.g6) null);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(d51Var.currentAccount);
        long j3 = d51Var.f44827b;
        TLRPC.Chat M0 = s12.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(d51Var.currentAccount).N0(j3);
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
            arrayList.add(qh.b.c(context, d51Var.resourceProvider, qh.a.I, 2131744892));
        }
        arrayList.add(qh.b.c(context, d51Var.resourceProvider, qh.a.O, 2131753163));
        if (z10) {
            arrayList.add(qh.b.c(context, d51Var.resourceProvider, qh.a.P, 2131748407));
        }
        d51Var.f44846q0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        ne0 ne0Var = new ne0(context, d51Var.resourceProvider);
        d51Var.f44844o0 = ne0Var;
        ne0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        d51Var.f44844o0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        d51Var.f44844o0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        d51Var.f44845p0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.l1(19));
        d51Var.f44845p0.addView(d51Var.f44844o0, c8.ha.e(-1, 72, 81));
        d51Var.f44845p0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = d51Var.f44846q0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new qu0(d51Var, i11, 1));
            d51Var.f44844o0.addView(d51Var.f44846q0[i11]);
            d51Var.f44844o0.i(bVar, true, false);
            i11++;
        }
        d51Var.f44837h0 = new a41(d51Var, d51Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            tb tbVar = new tb(d51Var, -j3, d51Var.getResourceProvider());
            d51Var.f44838i0 = tbVar;
            tbVar.F.setCaptureSectionsDecoratorAllowed(true);
            d51Var.glassEngine.b(d51Var.f44838i0.F);
        }
        if (z10) {
            Activity parentActivity = d51Var.getParentActivity();
            int i12 = d51Var.currentAccount;
            long j10 = -j3;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.g6 resourceProvider = d51Var.getResourceProvider();
            oi.q qVar = d51Var.glassEngine;
            if (org.telegram.messenger.t3.V(M0) && N0.can_view_revenue) {
                z12 = true;
            } else {
                z12 = false;
            }
            i7 = -1;
            zd zdVar = new zd(parentActivity, d51Var, i12, j10, resourceProvider, qVar, z12, N0.can_view_stars_revenue);
            d51Var = d51Var;
            d51Var.f44839j0 = zdVar;
            zdVar.X0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z13 = z9;
        FrameLayout frameLayout4 = frameLayout;
        d51Var.f44837h0.setAdapter(new b41(d51Var, z13, R, z10, frameLayout4));
        boolean z14 = d51Var.f44843n0;
        if (R && !z14) {
            z11 = true;
        } else {
            z11 = false;
        }
        d51Var.f44829c = z11;
        if (z11 && d51Var.f44830c0) {
            d51Var.f44837h0.setPosition(z13 ? 1 : 0);
        } else if (z11 && d51Var.f44831d0) {
            a41 a41Var = d51Var.f44837h0;
            if (!z14 && R) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            a41Var.setPosition(i10 + (z13 ? 1 : 0));
        }
        d51Var.p0(d51Var.f44837h0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(d51Var.getParentActivity());
        frameLayout5.addView(d51Var.f44837h0, c8.ha.g());
        View view = new View(context);
        d51Var.f44840k0 = view;
        frameLayout5.addView(view, c8.ha.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        d51Var.f44841l0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(d51Var.f44841l0, c8.ha.g());
        frameLayout5.addView(d51Var.simpleActionBar);
        if (d51Var.f44829c) {
            d51Var.setBulletinDelegate(new fi.r7(12));
            d51Var.f44845p0.setBackground(d51Var.getBaseSimpleGlass().b(d51Var.f44845p0));
            frameLayout5.addView(d51Var.f44845p0, c8.ha.e(i7, -2, 80));
        }
        d51Var.fragmentView = frameLayout5;
        c41 c41Var = new c41(d51Var, context);
        d51Var.S = c41Var;
        c41Var.setCaptureSectionsDecoratorAllowed(true);
        d51Var.S.setSections(true);
        d51Var.S.setClipToPadding(false);
        d51Var.glassEngine.b(d51Var.S);
        d51Var.S.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        d51Var.f44826a0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        d51Var.V = imageView;
        imageView.setAutoRepeat(true);
        d51Var.V.f(2131624228, 120, 120, null);
        d51Var.V.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.l6.Cj;
        org.telegram.ui.ActionBar.s6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.id.M0(2131748777, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.l6.Dj;
        org.telegram.ui.ActionBar.s6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.id.M0(2131748776, null));
        textView2.setGravity(1);
        d51Var.f44826a0.addView(d51Var.V, c8.ha.t(120, 120, 1, 0, 0, 0, 20));
        d51Var.f44826a0.addView(textView, c8.ha.t(-2, -2, 1, 0, 0, 0, 10));
        d51Var.f44826a0.addView(textView2, c8.ha.r(-2, -2, 1));
        frameLayout4.addView(d51Var.f44826a0, c8.ha.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (d51Var.W == null) {
            d51Var.W = new h41(d51Var);
        }
        d51Var.S.setAdapter(d51Var.W);
        v4.b0 b0Var = new v4.b0();
        d51Var.T = b0Var;
        d51Var.S.setLayoutManager(b0Var);
        d51Var.X = new v4.k();
        d51Var.S.setItemAnimator(null);
        d51Var.S.j(new d21(d51Var, 2));
        d51Var.S.setOnItemClickListener(new zx0(d51Var, 6));
        d51Var.S.setOnItemLongClickListener(new z31(d51Var));
        frameLayout4.addView(d51Var.S);
        d51Var.R = new org.telegram.ui.Components.kn(context, null, false, null);
        TLRPC.Chat M02 = d51Var.getMessagesController().M0(Long.valueOf(j3));
        d51Var.R.setChatAvatar(M02);
        d51Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        org.telegram.ui.ActionBar.y4 y4Var = d51Var.simpleActionBar;
        if (M02 == null) {
            str = "";
        } else {
            str = M02.title;
        }
        y4Var.setTitle(str);
        d51Var.simpleActionBar.setActionBarMenuOnItemClick(new pt0(d51Var, 12));
        d51Var.R.i(org.telegram.ui.ActionBar.l6.x0(null, i13, false), org.telegram.ui.ActionBar.l6.x0(null, i14, false));
        boolean z15 = d51Var.A0;
        m4 m4Var = d51Var.E0;
        if (z15) {
            d51Var.f44826a0.setAlpha(0.0f);
            org.telegram.messenger.g0.i3(m4Var, 500L);
            d51Var.f44826a0.setVisibility(0);
            d51Var.S.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            d51Var.f44826a0.setVisibility(8);
            d51Var.S.setVisibility(0);
        }
        fh.g c10 = d51Var.getBaseSimpleGlass().f21021c.c(d51Var.f44844o0, c8.g0.f(d51Var.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        d51Var.f44844o0.setBackground(c10);
        d51Var.glassEngine.c(d51Var.f44837h0);
        oi.a baseSimpleGlass = d51Var.getBaseSimpleGlass();
        a41 a41Var2 = d51Var.f44837h0;
        org.telegram.ui.ActionBar.y4 y4Var2 = d51Var.simpleActionBar;
        org.telegram.ui.ActionBar.g6 g6Var = d51Var.resourceProvider;
        baseSimpleGlass.f21029m = frameLayout5;
        baseSimpleGlass.f21030n = a41Var2;
        baseSimpleGlass.f21019a.c(a41Var2);
        baseSimpleGlass.g(frameLayout5, y4Var2, g6Var);
        d51Var.m0 = new te.a(0, new z31(d51Var), org.telegram.ui.Components.xq.h, 380L, false);
        zd zdVar2 = d51Var.f44839j0;
        if (zdVar2 != null) {
            oi.a baseSimpleGlass2 = d51Var.getBaseSimpleGlass();
            View view2 = zdVar2.f52504a1.d;
            fh.g c11 = baseSimpleGlass2.f21021c.c(view2, null, false);
            c11.p(c8.g0.l(zdVar2.f52516n0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = d51Var.f44839j0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            d51Var.f44841l0.addView(transactionTabs, layoutParams);
            d51Var.f44839j0.setTabsPinnedChangedListener(new tu0(d51Var, 20));
            d51Var.m0.a(d51Var.f44839j0.f35139e0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new hk(d51Var, 2));
        d51Var.getBaseSimpleGlass().f21031o = new wu(d51Var, frameLayout5, new z5(1, frameLayout5), 1);
        d51Var.getBaseSimpleGlass().f21030n = null;
        d51Var.simpleActionBar.setBackground(null);
        d51Var.f44840k0.setBackground(d51Var.getBaseSimpleGlass().a(d51Var.f44840k0));
        org.telegram.messenger.g0.E2(d51Var.R.f35406e);
        frameLayout5.addView(d51Var.R.f35406e, c8.ha.e(42, 42, 53));
        d51Var.f0();
        d51Var.fragmentView.setBackgroundColor(d51Var.getThemedColor(org.telegram.ui.ActionBar.l6.f27809a7));
        d51Var.B0 = new q41(d51Var.W, d51Var.T);
        return d51Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.ActionBar.f2 f2Var2;
        org.telegram.ui.ActionBar.f2 f2Var3 = null;
        int i11 = 0;
        if (i7 == org.telegram.messenger.qs.f25109x5) {
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
                    arrayList = this.f44852u0;
                    if (i12 >= size) {
                        break;
                    }
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i12);
                    int i13 = this.f44850s0.get(ijVar.e1(), -1);
                    if (i13 >= 0 && ((a51) arrayList.get(i13)).b() == ijVar.e1()) {
                        if (ijVar.Z) {
                            arrayList3.add((a51) arrayList.get(i13));
                        } else {
                            ((a51) arrayList.get(i13)).f43589b = ijVar;
                        }
                    }
                    i12++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f44853v0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    a51 a51Var = (a51) arrayList.get(i11);
                    if (a51Var.f43589b == null) {
                        this.f44848r0 = a51Var.b();
                        break;
                    } else {
                        arrayList4.add(a51Var);
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
            if (chatFull.f26957id == this.f44827b && this.f44825a == null) {
                this.f44825a = chatFull;
                l0();
            }
        }
    }

    public final void f0() {
        int i7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.f44840k0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15121b;
            ViewGroup.LayoutParams layoutParams = this.f44840k0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.f44840k0.setLayoutParams(layoutParams);
            }
            t0();
        }
        if (this.f44829c) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        org.telegram.messenger.g0.B3(this.R.f35406e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15121b, org.telegram.messenger.g0.L(6.0f), 0);
        this.f44845p0.setPadding(0, 0, 0, this.mSystemInsets.d);
        c41 c41Var = this.S;
        if (c41Var != null) {
            i0.b bVar = this.mSystemInsets;
            oi.a.e(c41Var, bVar.f15121b, bVar.d, currentActionBarHeight, i7);
        }
        tb tbVar = this.f44838i0;
        if (tbVar != null) {
            org.telegram.ui.Components.qj0 qj0Var = tbVar.F;
            i0.b bVar2 = this.mSystemInsets;
            oi.a.e(qj0Var, bVar2.f15121b, bVar2.d, currentActionBarHeight, i7);
        }
        zd zdVar = this.f44839j0;
        if (zdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i10 = bVar3.f15121b;
            int i11 = bVar3.d;
            zdVar.U0 = i10;
            zdVar.V0 = i11;
            zdVar.W0 = i7;
            int C = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, i11, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.r41 r41Var = zdVar.X0;
            org.telegram.messenger.g0.B3(r41Var, 0, C, 0, C2);
            r41Var.setPadding(r41Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - C, r41Var.getPaddingRight(), (i11 + i7) - C2);
            zdVar.z(-C, -C2);
            zdVar.B();
            zdVar.requestLayout();
            zdVar.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        p41 p41Var;
        p41 p41Var2;
        f6 f6Var = new f6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.S, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27973j5));
        if (this.f44828b0) {
            while (i7 < 6) {
                if (i7 == 0) {
                    p41Var2 = this.d;
                } else if (i7 == 1) {
                    p41Var2 = this.H;
                } else if (i7 == 2) {
                    p41Var2 = this.I;
                } else if (i7 == 3) {
                    p41Var2 = this.J;
                } else if (i7 == 4) {
                    p41Var2 = this.K;
                } else {
                    p41Var2 = this.L;
                }
                n0(p41Var2, arrayList, f6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                if (i7 == 0) {
                    p41Var = this.d;
                } else if (i7 == 1) {
                    p41Var = this.h;
                } else if (i7 == 2) {
                    p41Var = this.f44842n;
                } else if (i7 == 3) {
                    p41Var = this.f44847r;
                } else if (i7 == 4) {
                    p41Var = this.f44849s;
                } else if (i7 == 5) {
                    p41Var = this.f44854w;
                } else if (i7 == 6) {
                    p41Var = this.f44858y;
                } else if (i7 == 7) {
                    p41Var = this.f44832e;
                } else if (i7 == 8) {
                    p41Var = this.f44856x;
                } else if (i7 == 9) {
                    p41Var = this.D;
                } else if (i7 == 10) {
                    p41Var = this.E;
                } else {
                    p41Var = this.F;
                }
                n0(p41Var, arrayList, f6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)) <= 0.699999988079071d) {
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
        a41 a41Var;
        if (motionEvent != null && this.f44839j0 != null && (a41Var = this.f44837h0) != null) {
            View currentView = a41Var.getCurrentView();
            zd zdVar = this.f44839j0;
            if (currentView == zdVar && zdVar.G((motionEvent.getX() - this.f44837h0.getX()) - this.f44839j0.getX(), (motionEvent.getY() - this.f44837h0.getY()) - this.f44839j0.getY())) {
                return false;
            }
        }
        a41 a41Var2 = this.f44837h0;
        if (a41Var2 != null && (a41Var2.f39948b != 0 || a41Var2.f39949c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(p41[] p41VarArr) {
        h41 h41Var = this.W;
        if (h41Var != null) {
            h41Var.E();
            this.S.setItemAnimator(null);
            this.W.f();
        }
        this.A0 = false;
        LinearLayout linearLayout = this.f44826a0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            org.telegram.messenger.g0.r(this.E0);
            this.f44826a0.animate().alpha(0.0f).setDuration(230L).setListener(new f30(this, 28));
            this.S.setVisibility(0);
            this.S.setAlpha(0.0f);
            this.S.animate().alpha(1.0f).setDuration(230L).start();
            for (p41 p41Var : p41VarArr) {
                if (p41Var != null && p41Var.d == null && p41Var.f48624f != null) {
                    p41Var.a(this.currentAccount, this.classGuid, this.f44825a.stats_dc, new gh(2, this, p41Var));
                }
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f26994id = new ArrayList<>();
        ArrayList arrayList = this.f44852u0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.f44850s0.get(this.f44848r0); i10 < size; i10++) {
            if (((a51) arrayList.get(i10)).f43589b == null) {
                tL_channels_getMessages.f26994id.add(Integer.valueOf(((a51) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(this.f44827b);
        this.f44860z0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new v31(this, 0));
    }

    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f44843n0) {
            return;
        }
        boolean z9 = this.f44828b0;
        long j3 = this.f44827b;
        if (z9) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.qp.s1(this.currentAccount).h1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new v31(this, 1), null, null, 0, this.f44825a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.f44857x0;
        arrayList.clear();
        ArrayList arrayList2 = this.f44855w0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            a51 a51Var = (a51) obj;
            org.telegram.messenger.ij f10 = this.C0.f(a51Var.b());
            if (f10 != null) {
                a51Var.f43589b = f10;
                arrayList.add(a51Var);
            }
        }
        this.f44851t0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof n41) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.y6) && !this.S.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.xp) {
                org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) background;
                if ((xpVar.f40444a instanceof ColorDrawable) && xpVar.f40445b != null) {
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27829b7, false);
                    if (this.G0 == null || this.H0 != x02) {
                        this.H0 = x02;
                        this.G0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) xpVar.f40444a).setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, false));
                    xpVar.f40445b.setColorFilter(this.G0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.xp xpVar2 = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27809a7, false)), org.telegram.ui.ActionBar.l6.Y0(org.telegram.messenger.t0.f25566b, 2131231229, org.telegram.ui.ActionBar.l6.f27829b7), 0, 0);
            xpVar2.f40453x = true;
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
        b0Var2.c(org.telegram.messenger.qs.f25109x5);
        this.F0 = b0Var2;
        di.z6 P1 = getMessagesController().P1();
        long j3 = this.f44827b;
        di.r6 A = P1.A(2, -1, -j3, true);
        this.C0 = A;
        if (A != null) {
            this.D0 = A.o();
        }
        if (this.f44825a != null) {
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
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.f44836g0;
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
            org.telegram.ui.Components.kn knVar = this.R;
            if (knVar != null) {
                knVar.i(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Cj, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dj, false));
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
            qh.b[] bVarArr = this.f44846q0;
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
        for (int i7 = 0; i7 < this.f44846q0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.f44846q0[i7];
            bVar.J = max;
            bVar.I = z9;
            bVar.invalidate();
        }
        this.f44844o0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.f44859y0;
        arrayList.clear();
        arrayList.addAll(this.f44853v0);
        arrayList.addAll(this.f44857x0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.messenger.sk(4))));
    }

    public final void s0() {
        c41 c41Var = this.S;
        if (c41Var != null) {
            int childCount = c41Var.getChildCount();
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
            fVar.f18268c = true;
        }
    }

    public final void t0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d51.t0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
