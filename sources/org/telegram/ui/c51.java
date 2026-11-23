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
public final class c51 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public boolean A0;
    public boolean B0;
    public p41 C0;
    public fi.h6 D0;
    public o41 E;
    public int E0;
    public o41 F;
    public final m4 F0;
    public o41 G;
    public xi.e G0;
    public y41 H;
    public PorterDuffColorFilter H0;
    public o41 I;
    public int I0;
    public o41 J;
    public o41 K;
    public o41 L;
    public o41 M;
    public o41 N;
    public final ArrayList O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public org.telegram.ui.Components.co S;
    public c41 T;
    public v4.c0 U;
    public final h2.j0 V;
    public org.telegram.ui.Components.rh0 W;
    public h41 X;
    public d41 Y;
    public b51 Z;
    public TLRPC.ChatFull f46431a;
    public lg.f f46432a0;
    public final long f46433b;
    public LinearLayout f46434b0;
    public boolean f46435c;
    public final boolean f46436c0;
    public o41 d;
    public final boolean f46437d0;
    public o41 f46438e;
    public final boolean f46439e0;
    public x41 f46440f;
    public long f46441f0;
    public long f46442g0;
    public o41 h;
    public final org.telegram.ui.ActionBar.t1[] f46443h0;
    public a41 f46444i0;
    public sb f46445j0;
    public xd f46446k0;
    public View f46447l0;
    public FrameLayout m0;
    public o41 f46448n;
    public te.a f46449n0;
    public final boolean f46450o0;
    public oe0 f46451p0;
    public FrameLayout f46452q0;
    public o41 f46453r;
    public qh.b[] f46454r0;
    public o41 f46455s;
    public int f46456s0;
    public final SparseIntArray f46457t0;
    public final SparseIntArray f46458u0;
    public final ArrayList f46459v0;
    public o41 f46460w;
    public final ArrayList f46461w0;
    public o41 f46462x;
    public final ArrayList f46463x0;
    public o41 f46464y;
    public final ArrayList f46465y0;
    public final ArrayList f46466z0;

    public c51(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new h2.j0(50, 2);
        this.f46443h0 = new org.telegram.ui.ActionBar.t1[1];
        this.f46456s0 = -1;
        this.f46457t0 = new SparseIntArray();
        this.f46458u0 = new SparseIntArray();
        this.f46459v0 = new ArrayList();
        this.f46461w0 = new ArrayList();
        this.f46463x0 = new ArrayList();
        this.f46465y0 = new ArrayList();
        this.f46466z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.f46433b = j3;
        this.f46436c0 = bundle.getBoolean("is_megagroup", false);
        this.f46437d0 = bundle.getBoolean("start_from_boosts", false);
        this.f46439e0 = bundle.getBoolean("start_from_monetization", false);
        this.f46450o0 = bundle.getBoolean("only_boosts", false);
        this.f46431a = getMessagesController().P0(j3);
    }

    public static void Z(final c51 c51Var, TLObject tLObject) {
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
        ArrayList arrayList5 = c51Var.O;
        ArrayList arrayList6 = c51Var.P;
        ArrayList arrayList7 = c51Var.f46459v0;
        String str18 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final o41[] o41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.hd.N0(2131749080, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.hd.N0(2131750593, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.hd.N0(2131743790, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.hd.N0(2131743285, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.hd.N0(2131749182, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.hd.N0(2131743284, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.hd.N0(2131748081, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.hd.N0(2131748848, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.hd.N0(2131747726, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.hd.N0(2131746189, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.hd.N0(2131744416, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.hd.N0(2131744261, "StoryReactionsByEmotionChartTitle"), 2, false)};
            o41 o41Var = o41VarArr[2];
            if (o41Var != null) {
                o41Var.f50483n = true;
            }
            ?? obj = new Object();
            xi.e a10 = x41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            obj.f53621o = org.telegram.messenger.hd.N0(2131746182, "ReactionsPerPost");
            obj.f53622p = (String) a10.f60666a;
            obj.f53623q = (String) a10.f60667b;
            obj.f53624r = ((Boolean) a10.f60668c).booleanValue();
            obj.f53625s = ((Boolean) a10.d).booleanValue();
            xi.e a11 = x41.a(tL_broadcastStats.reactions_per_story);
            obj.f53626t = org.telegram.messenger.hd.N0(2131746181, "ReactionsPerStory");
            obj.f53627u = (String) a11.f60666a;
            obj.v = (String) a11.f60667b;
            obj.f53628w = ((Boolean) a11.f60668c).booleanValue();
            obj.f53629x = ((Boolean) a11.d).booleanValue();
            xi.e a12 = x41.a(tL_broadcastStats.views_per_story);
            obj.f53630y = org.telegram.messenger.hd.N0(2131743282, "ViewsPerStory");
            obj.f53631z = (String) a12.f60666a;
            obj.A = (String) a12.f60667b;
            obj.B = ((Boolean) a12.f60668c).booleanValue();
            obj.C = ((Boolean) a12.d).booleanValue();
            xi.e a13 = x41.a(tL_broadcastStats.shares_per_story);
            obj.D = org.telegram.messenger.hd.N0(2131745201, "SharesPerStory");
            obj.E = (String) a13.f60666a;
            obj.F = (String) a13.f60667b;
            obj.G = ((Boolean) a13.f60668c).booleanValue();
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
            obj.f53609a = org.telegram.messenger.hd.N0(2131750593, "FollowersChartTitle");
            obj.f53610b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs5 == 0.0f) {
                i7 = i11;
                obj.f53611c = "";
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
                    obj.f53611c = sb2.toString() + " (" + i12 + "%)";
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
                    obj.f53611c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
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
            obj.f53615i = org.telegram.messenger.hd.N0(2131745202, "SharesPerPost");
            obj.f53616j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f53617k = sb4.toString() + " (" + i14 + "%)";
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
                    obj.f53617k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f53617k = "";
            }
            if (i13 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f53618l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            if (d13 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i15 / ((float) d13)) * 100.0f);
            }
            obj.f53612e = org.telegram.messenger.hd.N0(2131743283, "ViewsPerPost");
            obj.f53613f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f53614g = sb6.toString() + " (" + i16 + "%)";
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
                    obj.f53614g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f53614g = "";
            }
            if (i15 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f53619m = org.telegram.messenger.hd.N0(2131751131, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                obj.f53620n = com.google.android.gms.internal.vision.e2.i(i17, "%");
            } else {
                obj.f53620n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            c51Var.f46440f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            c51Var.f46441f0 = tL_statsDateRangeDays.max_date * 1000;
            c51Var.f46442g0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f54436a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str10 = str19;
                    str11 = str18;
                    c51Var.f46457t0.put(obj2.b(), i18);
                    i18++;
                } else {
                    str10 = str19;
                    arrayList4 = arrayList8;
                    str11 = str18;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    c51Var.f46463x0.add(obj2);
                    c51Var.f46458u0.put(obj2.b(), i19);
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
            org.telegram.messenger.g0.g3(new w31(c51Var, arrayList9, 0));
            if (arrayList12.size() > 0) {
                int b10 = ((z41) arrayList12.get(0)).b();
                int size2 = arrayList12.size();
                org.telegram.messenger.ur messagesStorage = c51Var.getMessagesStorage();
                int i22 = c51Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.f27250a.c(new org.telegram.messenger.pp(messagesStorage, org.telegram.messenger.uz.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -c51Var.f46433b, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            org.telegram.messenger.g0.g3(new Runnable(c51Var) {
                public final c51 f53596b;

                {
                    this.f53596b = c51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c51 c51Var2 = this.f53596b;
                            c51Var2.getClass();
                            o41[] o41VarArr2 = o41VarArr;
                            c51Var2.f46453r = o41VarArr2[0];
                            c51Var2.h = o41VarArr2[1];
                            c51Var2.f46438e = o41VarArr2[2];
                            c51Var2.f46448n = o41VarArr2[3];
                            c51Var2.d = o41VarArr2[4];
                            c51Var2.f46455s = o41VarArr2[5];
                            c51Var2.f46460w = o41VarArr2[6];
                            c51Var2.f46462x = o41VarArr2[7];
                            c51Var2.f46464y = o41VarArr2[8];
                            c51Var2.E = o41VarArr2[9];
                            c51Var2.F = o41VarArr2[10];
                            c51Var2.G = o41VarArr2[11];
                            c51Var2.j0(o41VarArr2);
                            return;
                        default:
                            c51 c51Var3 = this.f53596b;
                            c51Var3.getClass();
                            o41[] o41VarArr3 = o41VarArr;
                            c51Var3.d = o41VarArr3[0];
                            c51Var3.I = o41VarArr3[1];
                            c51Var3.J = o41VarArr3[2];
                            c51Var3.K = o41VarArr3[3];
                            c51Var3.L = o41VarArr3[4];
                            c51Var3.M = o41VarArr3[5];
                            c51Var3.f46438e = o41VarArr3[6];
                            c51Var3.N = o41VarArr3[7];
                            c51Var3.j0(o41VarArr3);
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
            o41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.hd.N0(2131749182, str3), r15, r15);
            o41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.hd.N0(2131749234, "GroupMembersChartTitle"), r15, r15);
            o41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.hd.N0(2131748078, "NewMembersBySourceChartTitle"), 2, r15);
            o41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.hd.N0(2131748425, "MembersLanguageChartTitle"), 4, true);
            o41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.hd.N0(2131748269, "MessagesChartTitle"), 2, r15);
            o41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.hd.N0(2131754486, "ActionsChartTitle"), 1, r15);
            o41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.hd.N0(2131743790, str), r15, r15);
            o41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.hd.N0(2131743791, "TopDaysOfWeekChartTitle"), 4, r15);
            final o41[] o41VarArr2 = new o41[8];
            o41VarArr2[r15] = i02;
            o41VarArr2[1] = i03;
            o41VarArr2[2] = i04;
            o41VarArr2[3] = i05;
            o41VarArr2[4] = i06;
            o41VarArr2[5] = i07;
            o41VarArr2[6] = i08;
            o41VarArr2[7] = i09;
            o41 o41Var2 = o41VarArr2[6];
            if (o41Var2 != null) {
                o41Var2.f50483n = true;
            }
            o41 o41Var3 = o41VarArr2[7];
            if (o41Var3 != null) {
                o41Var3.f50484o = true;
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
            obj3.f54043a = org.telegram.messenger.hd.N0(2131748424, "MembersOverviewTitle");
            obj3.f54044b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f54045c = sb8.toString() + " (" + i24 + "%)";
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
                    obj3.f54045c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str2);
                }
            } else {
                obj3.f54045c = "";
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
            obj3.f54049i = org.telegram.messenger.hd.N0(2131743287, "ViewingMembers");
            obj3.f54050j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f54051k = sb10.toString();
            } else {
                obj3.f54051k = "";
            }
            if (i25 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f54052l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            if (d19 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i26 / ((float) d19)) * 100.0f);
            }
            obj3.f54053m = org.telegram.messenger.hd.N0(2131746873, "PostingMembers");
            obj3.f54054n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f54055o = sb11.toString();
            } else {
                obj3.f54055o = "";
            }
            if (i26 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f54056p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            if (d21 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i27 / ((float) d21)) * 100.0f);
            }
            obj3.f54046e = org.telegram.messenger.hd.N0(2131748260, "MessagesOverview");
            obj3.f54047f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f54048g = sb12.toString();
            } else {
                obj3.f54048g = "";
            }
            if (i27 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            c51Var.H = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            c51Var.f46441f0 = tL_statsDateRangeDays2.max_date * 1000;
            c51Var.f46442g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f52720a = v41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.hd.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.hd.a0("CharactersPerMessage", null, 2131752242, org.telegram.messenger.hd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    obj4.f52721b = sb13.toString();
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
                    ArrayList arrayList19 = c51Var.R;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f52720a = v41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
                    StringBuilder sb14 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb14.append(org.telegram.messenger.hd.G(i32, "Deletions", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.hd.G(tL_statsGroupTopAdmin.banned, "Bans", new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(org.telegram.messenger.hd.G(tL_statsGroupTopAdmin.kicked, "Restrictions", new Object[0]));
                    }
                    obj5.f52721b = sb14.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = c51Var.Q;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f52720a = v41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f52721b = org.telegram.messenger.hd.G(i34, "Invitations", new Object[0]);
                    } else {
                        obj6.f52721b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            org.telegram.messenger.g0.g3(new Runnable(c51Var) {
                public final c51 f53596b;

                {
                    this.f53596b = c51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c51 c51Var2 = this.f53596b;
                            c51Var2.getClass();
                            o41[] o41VarArr22 = o41VarArr2;
                            c51Var2.f46453r = o41VarArr22[0];
                            c51Var2.h = o41VarArr22[1];
                            c51Var2.f46438e = o41VarArr22[2];
                            c51Var2.f46448n = o41VarArr22[3];
                            c51Var2.d = o41VarArr22[4];
                            c51Var2.f46455s = o41VarArr22[5];
                            c51Var2.f46460w = o41VarArr22[6];
                            c51Var2.f46462x = o41VarArr22[7];
                            c51Var2.f46464y = o41VarArr22[8];
                            c51Var2.E = o41VarArr22[9];
                            c51Var2.F = o41VarArr22[10];
                            c51Var2.G = o41VarArr22[11];
                            c51Var2.j0(o41VarArr22);
                            return;
                        default:
                            c51 c51Var3 = this.f53596b;
                            c51Var3.getClass();
                            o41[] o41VarArr3 = o41VarArr2;
                            c51Var3.d = o41VarArr3[0];
                            c51Var3.I = o41VarArr3[1];
                            c51Var3.J = o41VarArr3[2];
                            c51Var3.K = o41VarArr3[3];
                            c51Var3.L = o41VarArr3[4];
                            c51Var3.M = o41VarArr3[5];
                            c51Var3.f46438e = o41VarArr3[6];
                            c51Var3.N = o41VarArr3[7];
                            c51Var3.j0(o41VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void a0(c51 c51Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                arrayList.add(new org.telegram.messenger.gj(c51Var.currentAccount, arrayList2.get(i7), false, true));
            }
            c51Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.g3(new w31(c51Var, arrayList, 1));
    }

    public static void c0(c51 c51Var) {
        b51 b51Var = c51Var.Z;
        if (b51Var != null) {
            b51Var.f45792b = true;
        }
        int childCount = c51Var.T.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c51Var.T.getChildAt(i7);
            if (childAt instanceof n41) {
                ((n41) childAt).f49759b.f19851u0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.g2 g0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f28434id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).P0(chat.f28434id);
        if (P0 != null && (P0.can_view_stats || P0.can_view_stars_revenue)) {
            return new c51(bundle);
        }
        return new t5(-chat.f28434id);
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
            int length = ((mg.a) bVar.d.get(0)).f21005a.length;
            int size = bVar.d.size();
            bVar.f21022l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bVar.f21022l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = bVar.f21022l;
                    jArr[i10] = jArr[i10] + ((mg.a) bVar.d.get(i11)).f21005a[i10];
                }
            }
            bVar.f21023m = new k8.a(bVar.f21022l);
            return bVar;
        } else if (i7 == 4) {
            ?? bVar2 = new mg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i12 = 0; i12 < bVar2.d.size(); i12++) {
                    int length2 = bVar2.f21012a.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        long j10 = ((mg.a) bVar2.d.get(i12)).f21005a[i13];
                        jArr2[i12] = jArr2[i12] + j10;
                        if (j10 == 0) {
                            iArr[i12] = iArr[i12] + 1;
                        }
                    }
                    j3 += jArr2[i12];
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < bVar2.d.size(); i14++) {
                    if (jArr2[i14] / j3 < 0.01d && iArr[i14] > bVar2.f21012a.length / 2.0f) {
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
            int length3 = ((mg.a) bVar2.d.get(0)).f21005a.length;
            int size3 = bVar2.d.size();
            bVar2.f21024l = new long[length3];
            for (int i16 = 0; i16 < length3; i16++) {
                bVar2.f21024l[i16] = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    long[] jArr3 = bVar2.f21024l;
                    jArr3[i16] = jArr3[i16] + ((mg.a) bVar2.d.get(i17)).f21005a[i16];
                }
            }
            new k8.a(bVar2.f21024l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static o41 i0(TL_stats.StatsGraph statsGraph, String str, int i7, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        o41 o41Var = new o41(str, i7);
        o41Var.f50482m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z10);
                o41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                o41Var.f50477g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.f21012a) == null || jArr2.length < 2) {
                    o41Var.f50481l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.f21012a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    o41Var.f50475e = new mg.e(h02, j3);
                    o41Var.f50474c = j3;
                    return o41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            o41Var.f50476f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return o41Var;
    }

    public static void n0(o41 o41Var, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        mg.b bVar;
        int i7;
        if (o41Var != null && (bVar = o41Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                mg.a aVar = (mg.a) obj;
                int i11 = aVar.f21010g;
                if (i11 >= 0) {
                    if (!org.telegram.ui.ActionBar.m6.f1(i11)) {
                        int i12 = aVar.f21010g;
                        if (org.telegram.ui.ActionBar.m6.I == org.telegram.ui.ActionBar.m6.J) {
                            i7 = aVar.f21011i;
                        } else {
                            i7 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.m6.A1(i12, i7, false);
                        org.telegram.ui.ActionBar.m6.hm[aVar.f21010g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, u6Var, aVar.f21010g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29602p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29716v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29697u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29546m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29754x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29792z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29454h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29489j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A6));
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
        c51 c51Var = this;
        c51Var.setHasOwnBackground(true);
        c51Var.f46432a0 = new lg.f((org.telegram.ui.ActionBar.h6) null);
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(c51Var.currentAccount);
        long j3 = c51Var.f46433b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(c51Var.currentAccount).P0(j3);
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
            arrayList.add(qh.b.c(context, c51Var.resourceProvider, qh.a.J, 2131744649));
        }
        arrayList.add(qh.b.c(context, c51Var.resourceProvider, qh.a.P, 2131753160));
        if (z11) {
            arrayList.add(qh.b.c(context, c51Var.resourceProvider, qh.a.Q, 2131748214));
        }
        c51Var.f46454r0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        oe0 oe0Var = new oe0(context, c51Var.resourceProvider);
        c51Var.f46451p0 = oe0Var;
        oe0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        c51Var.f46451p0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        c51Var.f46451p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        c51Var.f46452q0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.o(24));
        c51Var.f46452q0.addView(c51Var.f46451p0, c8.ma.e(-1, 72, 81));
        c51Var.f46452q0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = c51Var.f46454r0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new vm0(c51Var, i11, 3));
            c51Var.f46451p0.addView(c51Var.f46454r0[i11]);
            c51Var.f46451p0.j(bVar, true, false);
            i11++;
        }
        c51Var.f46444i0 = new a41(c51Var, c51Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sb sbVar = new sb(c51Var, -j3, c51Var.getResourceProvider());
            c51Var.f46445j0 = sbVar;
            sbVar.G.setCaptureSectionsDecoratorAllowed(true);
            c51Var.glassEngine.b(c51Var.f46445j0.G);
        }
        if (z11) {
            Activity parentActivity = c51Var.getParentActivity();
            int i12 = c51Var.currentAccount;
            long j10 = -j3;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.h6 resourceProvider = c51Var.getResourceProvider();
            ri.q qVar = c51Var.glassEngine;
            if (org.telegram.messenger.v3.V(O0) && P0.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            i7 = -1;
            xd xdVar = new xd(parentActivity, c51Var, i12, j10, resourceProvider, qVar, z13, P0.can_view_stars_revenue);
            c51Var = c51Var;
            c51Var.f46446k0 = xdVar;
            xdVar.Y0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z14 = z10;
        FrameLayout frameLayout4 = frameLayout;
        c51Var.f46444i0.setAdapter(new b41(c51Var, z14, R, z11, frameLayout4));
        boolean z15 = c51Var.f46450o0;
        if (R && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        c51Var.f46435c = z12;
        if (z12 && c51Var.f46437d0) {
            c51Var.f46444i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && c51Var.f46439e0) {
            a41 a41Var = c51Var.f46444i0;
            if (!z15 && R) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            a41Var.setPosition(i10 + (z14 ? 1 : 0));
        }
        c51Var.p0(c51Var.f46444i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(c51Var.getParentActivity());
        frameLayout5.addView(c51Var.f46444i0, c8.ma.g());
        View view = new View(context);
        c51Var.f46447l0 = view;
        frameLayout5.addView(view, c8.ma.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        c51Var.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(c51Var.m0, c8.ma.g());
        frameLayout5.addView(c51Var.simpleActionBar);
        if (c51Var.f46435c) {
            c51Var.setBulletinDelegate(new bi.t(13));
            c51Var.f46452q0.setBackground(c51Var.getBaseSimpleGlass().b(c51Var.f46452q0));
            frameLayout5.addView(c51Var.f46452q0, c8.ma.e(i7, -2, 80));
        }
        c51Var.fragmentView = frameLayout5;
        c41 c41Var = new c41(c51Var, context);
        c51Var.T = c41Var;
        c41Var.setCaptureSectionsDecoratorAllowed(true);
        c51Var.T.setSections(true);
        c51Var.T.setClipToPadding(false);
        c51Var.glassEngine.b(c51Var.T);
        c51Var.T.r1();
        LinearLayout linearLayout = new LinearLayout(context);
        c51Var.f46434b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        c51Var.W = imageView;
        imageView.setAutoRepeat(true);
        c51Var.W.f(2131624229, 120, 120, null);
        c51Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.m6.Fj;
        org.telegram.ui.ActionBar.t6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.hd.N0(2131748584, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.m6.Gj;
        org.telegram.ui.ActionBar.t6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.hd.N0(2131748583, null));
        textView2.setGravity(1);
        c51Var.f46434b0.addView(c51Var.W, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        c51Var.f46434b0.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        c51Var.f46434b0.addView(textView2, c8.ma.r(-2, -2, 1));
        frameLayout4.addView(c51Var.f46434b0, c8.ma.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (c51Var.X == null) {
            c51Var.X = new h41(c51Var);
        }
        c51Var.T.setAdapter(c51Var.X);
        v4.c0 c0Var = new v4.c0();
        c51Var.U = c0Var;
        c51Var.T.setLayoutManager(c0Var);
        c51Var.Y = new v4.k();
        c51Var.T.setItemAnimator(null);
        c51Var.T.j(new d21(c51Var, 2));
        c51Var.T.setOnItemClickListener(new zx0(c51Var, 6));
        c51Var.T.setOnItemLongClickListener(new z31(c51Var));
        frameLayout4.addView(c51Var.T);
        c51Var.S = new org.telegram.ui.Components.co(context, null, false, null);
        TLRPC.Chat O02 = c51Var.getMessagesController().O0(Long.valueOf(j3));
        c51Var.S.setChatAvatar(O02);
        c51Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        org.telegram.ui.ActionBar.z4 z4Var = c51Var.simpleActionBar;
        if (O02 == null) {
            str = "";
        } else {
            str = O02.title;
        }
        z4Var.setTitle(str);
        c51Var.simpleActionBar.setActionBarMenuOnItemClick(new hs0(c51Var, 15));
        c51Var.S.i(org.telegram.ui.ActionBar.m6.x0(null, i13, false), org.telegram.ui.ActionBar.m6.x0(null, i14, false));
        boolean z16 = c51Var.B0;
        m4 m4Var = c51Var.F0;
        if (z16) {
            c51Var.f46434b0.setAlpha(0.0f);
            org.telegram.messenger.g0.h3(m4Var, 500L);
            c51Var.f46434b0.setVisibility(0);
            c51Var.T.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            c51Var.f46434b0.setVisibility(8);
            c51Var.T.setVisibility(0);
        }
        fh.g c10 = c51Var.getBaseSimpleGlass().f56661c.c(c51Var.f46451p0, c8.i0.g(c51Var.resourceProvider), false);
        org.telegram.messenger.o10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        c51Var.f46451p0.setBackground(c10);
        c51Var.glassEngine.c(c51Var.f46444i0);
        ri.a baseSimpleGlass = c51Var.getBaseSimpleGlass();
        a41 a41Var2 = c51Var.f46444i0;
        org.telegram.ui.ActionBar.z4 z4Var2 = c51Var.simpleActionBar;
        org.telegram.ui.ActionBar.h6 h6Var = c51Var.resourceProvider;
        baseSimpleGlass.f56669m = frameLayout5;
        baseSimpleGlass.f56670n = a41Var2;
        baseSimpleGlass.f56659a.c(a41Var2);
        baseSimpleGlass.g(frameLayout5, z4Var2, h6Var);
        c51Var.f46449n0 = new te.a(0, new z31(c51Var), org.telegram.ui.Components.nr.h, 380L, false);
        xd xdVar2 = c51Var.f46446k0;
        if (xdVar2 != null) {
            ri.a baseSimpleGlass2 = c51Var.getBaseSimpleGlass();
            View view2 = xdVar2.f53834b1.d;
            fh.g c11 = baseSimpleGlass2.f56661c.c(view2, null, false);
            c11.p(c8.i0.m(xdVar2.f53846o0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = c51Var.f46446k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            c51Var.m0.addView(transactionTabs, layoutParams);
            c51Var.f46446k0.setTabsPinnedChangedListener(new ru0(c51Var, 20));
            c51Var.f46449n0.a(c51Var.f46446k0.f40048f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new gk(c51Var, 2));
        c51Var.getBaseSimpleGlass().f56671o = new wu(c51Var, frameLayout5, new z5(1, frameLayout5), 1);
        c51Var.getBaseSimpleGlass().f56670n = null;
        c51Var.simpleActionBar.setBackground(null);
        c51Var.f46447l0.setBackground(c51Var.getBaseSimpleGlass().a(c51Var.f46447l0));
        org.telegram.messenger.g0.E2(c51Var.S.f34234e);
        frameLayout5.addView(c51Var.S.f34234e, c8.ma.e(42, 42, 53));
        c51Var.f0();
        c51Var.fragmentView.setBackgroundColor(c51Var.getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7));
        c51Var.C0 = new p41(c51Var.X, c51Var.U);
        return c51Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.g2 g2Var;
        org.telegram.ui.ActionBar.g2 g2Var2;
        org.telegram.ui.ActionBar.g2 g2Var3 = null;
        int i11 = 0;
        if (i7 == org.telegram.messenger.ls.A5) {
            if (((fi.h6) objArr[0]) == this.D0) {
                m0();
                r0();
                if (this.X != null) {
                    this.T.setItemAnimator(null);
                    this.C0.f();
                }
            }
        } else if (i7 == org.telegram.messenger.ls.X2) {
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
        } else if (i7 == org.telegram.messenger.ls.D) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    arrayList = this.f46459v0;
                    if (i12 >= size) {
                        break;
                    }
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i12);
                    int i13 = this.f46457t0.get(gjVar.e1(), -1);
                    if (i13 >= 0 && ((z41) arrayList.get(i13)).b() == gjVar.e1()) {
                        if (gjVar.Z) {
                            arrayList3.add((z41) arrayList.get(i13));
                        } else {
                            ((z41) arrayList.get(i13)).f54437b = gjVar;
                        }
                    }
                    i12++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f46461w0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    z41 z41Var = (z41) arrayList.get(i11);
                    if (z41Var.f54437b == null) {
                        this.f46456s0 = z41Var.b();
                        break;
                    } else {
                        arrayList4.add(z41Var);
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
        } else if (i7 == org.telegram.messenger.ls.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28435id == this.f46433b && this.f46431a == null) {
                this.f46431a = chatFull;
                l0();
            }
        }
    }

    public final void f0() {
        int i7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.f46447l0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15918b;
            ViewGroup.LayoutParams layoutParams = this.f46447l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.f46447l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        if (this.f46435c) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        org.telegram.messenger.g0.z3(this.S.f34234e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15918b, org.telegram.messenger.g0.L(6.0f), 0);
        this.f46452q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        c41 c41Var = this.T;
        if (c41Var != null) {
            i0.b bVar = this.mSystemInsets;
            ri.a.e(c41Var, bVar.f15918b, bVar.d, currentActionBarHeight, i7);
        }
        sb sbVar = this.f46445j0;
        if (sbVar != null) {
            org.telegram.ui.Components.ek0 ek0Var = sbVar.G;
            i0.b bVar2 = this.mSystemInsets;
            ri.a.e(ek0Var, bVar2.f15918b, bVar2.d, currentActionBarHeight, i7);
        }
        xd xdVar = this.f46446k0;
        if (xdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i10 = bVar3.f15918b;
            int i11 = bVar3.d;
            xdVar.V0 = i10;
            xdVar.W0 = i11;
            xdVar.X0 = i7;
            int D = org.telegram.messenger.o10.D(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            int D2 = org.telegram.messenger.o10.D(48.0f, i11, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.h51 h51Var = xdVar.Y0;
            org.telegram.messenger.g0.z3(h51Var, 0, D, 0, D2);
            h51Var.setPadding(h51Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - D, h51Var.getPaddingRight(), (i11 + i7) - D2);
            xdVar.z(-D, -D2);
            xdVar.B();
            xdVar.requestLayout();
            xdVar.invalidate();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        o41 o41Var;
        o41 o41Var2;
        f6 f6Var = new f6(21, this);
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.T, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29489j5));
        if (this.f46436c0) {
            while (i7 < 6) {
                if (i7 == 0) {
                    o41Var2 = this.d;
                } else if (i7 == 1) {
                    o41Var2 = this.I;
                } else if (i7 == 2) {
                    o41Var2 = this.J;
                } else if (i7 == 3) {
                    o41Var2 = this.K;
                } else if (i7 == 4) {
                    o41Var2 = this.L;
                } else {
                    o41Var2 = this.M;
                }
                n0(o41Var2, arrayList, f6Var);
                i7++;
            }
        } else {
            while (i7 < 12) {
                if (i7 == 0) {
                    o41Var = this.d;
                } else if (i7 == 1) {
                    o41Var = this.h;
                } else if (i7 == 2) {
                    o41Var = this.f46448n;
                } else if (i7 == 3) {
                    o41Var = this.f46453r;
                } else if (i7 == 4) {
                    o41Var = this.f46455s;
                } else if (i7 == 5) {
                    o41Var = this.f46460w;
                } else if (i7 == 6) {
                    o41Var = this.f46464y;
                } else if (i7 == 7) {
                    o41Var = this.f46438e;
                } else if (i7 == 8) {
                    o41Var = this.f46462x;
                } else if (i7 == 9) {
                    o41Var = this.E;
                } else if (i7 == 10) {
                    o41Var = this.F;
                } else {
                    o41Var = this.G;
                }
                n0(o41Var, arrayList, f6Var);
                i7++;
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false)) <= 0.699999988079071d) {
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
        if (motionEvent != null && this.f46446k0 != null && (a41Var = this.f46444i0) != null) {
            View currentView = a41Var.getCurrentView();
            xd xdVar = this.f46446k0;
            if (currentView == xdVar && xdVar.G((motionEvent.getX() - this.f46444i0.getX()) - this.f46446k0.getX(), (motionEvent.getY() - this.f46444i0.getY()) - this.f46446k0.getY())) {
                return false;
            }
        }
        a41 a41Var2 = this.f46444i0;
        if (a41Var2 != null && (a41Var2.f36433b != 0 || a41Var2.f36434c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0(o41[] o41VarArr) {
        h41 h41Var = this.X;
        if (h41Var != null) {
            h41Var.E();
            this.T.setItemAnimator(null);
            this.X.f();
        }
        this.B0 = false;
        LinearLayout linearLayout = this.f46434b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            org.telegram.messenger.g0.r(this.F0);
            this.f46434b0.animate().alpha(0.0f).setDuration(230L).setListener(new ay(this, 29));
            this.T.setVisibility(0);
            this.T.setAlpha(0.0f);
            this.T.animate().alpha(1.0f).setDuration(230L).start();
            for (o41 o41Var : o41VarArr) {
                if (o41Var != null && o41Var.d == null && o41Var.f50476f != null) {
                    o41Var.a(this.currentAccount, this.classGuid, this.f46431a.stats_dc, new fh(2, this, o41Var));
                }
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f28472id = new ArrayList<>();
        ArrayList arrayList = this.f46459v0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.f46457t0.get(this.f46456s0); i10 < size; i10++) {
            if (((z41) arrayList.get(i10)).f54437b == null) {
                tL_channels_getMessages.f28472id.add(Integer.valueOf(((z41) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.np.u1(this.currentAccount).j1(this.f46433b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new v31(this, 0));
    }

    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f46450o0) {
            return;
        }
        boolean z10 = this.f46436c0;
        long j3 = this.f46433b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.np.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.np.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new v31(this, 1), null, null, 0, this.f46431a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.f46465y0;
        arrayList.clear();
        ArrayList arrayList2 = this.f46463x0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            z41 z41Var = (z41) obj;
            org.telegram.messenger.gj f10 = this.D0.f(z41Var.b());
            if (f10 != null) {
                z41Var.f54437b = f10;
                arrayList.add(z41Var);
            }
        }
        this.f46458u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof n41) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z6) && !this.T.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.oq) {
                org.telegram.ui.Components.oq oqVar = (org.telegram.ui.Components.oq) background;
                if ((oqVar.f38330a instanceof ColorDrawable) && oqVar.f38331b != null) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29345b7, false);
                    if (this.H0 == null || this.I0 != x02) {
                        this.I0 = x02;
                        this.H0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) oqVar.f38330a).setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29324a7, false));
                    oqVar.f38331b.setColorFilter(this.H0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.oq oqVar2 = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29324a7, false)), org.telegram.ui.ActionBar.m6.Y0(org.telegram.messenger.t0.f26931b, 2131231229, org.telegram.ui.ActionBar.m6.f29345b7), 0, 0);
            oqVar2.f38339x = true;
            view.setBackground(oqVar2);
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
        org.telegram.messenger.ls notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar2 = new xi.e(notificationCenter, this);
        eVar2.c(org.telegram.messenger.ls.D);
        eVar2.c(org.telegram.messenger.ls.T);
        eVar2.c(org.telegram.messenger.ls.X2);
        eVar2.c(org.telegram.messenger.ls.A5);
        this.G0 = eVar2;
        fi.p6 R1 = getMessagesController().R1();
        long j3 = this.f46433b;
        fi.h6 A = R1.A(2, -1, -j3, true);
        this.D0 = A;
        if (A != null) {
            this.E0 = A.o();
        }
        if (this.f46431a != null) {
            l0();
        } else {
            org.telegram.messenger.np.u1(this.currentAccount).b3(this.classGuid, j3, true);
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
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.f46443h0;
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
            org.telegram.ui.Components.co coVar = this.S;
            if (coVar != null) {
                coVar.i(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fj, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gj, false));
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
            qh.b[] bVarArr = this.f46454r0;
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
        for (int i7 = 0; i7 < this.f46454r0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.f46454r0[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.f46451p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.f46466z0;
        arrayList.clear();
        arrayList.addAll(this.f46461w0);
        arrayList.addAll(this.f46465y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.messenger.pk(4))));
    }

    public final void s0() {
        c41 c41Var = this.T;
        if (c41Var != null) {
            int childCount = c41Var.getChildCount();
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
        lg.f fVar = this.f46432a0;
        if (fVar != null) {
            fVar.f19796c = true;
        }
    }

    public final void t0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c51.t0():void");
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
