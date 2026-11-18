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
public final class c51 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public org.telegram.ui.Components.ao S;
    public c41 T;
    public v4.c0 U;
    public final h2.j0 V;
    public org.telegram.ui.Components.ph0 W;
    public h41 X;
    public d41 Y;
    public b51 Z;
    public TLRPC.ChatFull f46396a;
    public lg.f f46397a0;
    public final long f46398b;
    public LinearLayout f46399b0;
    public boolean f46400c;
    public final boolean f46401c0;
    public o41 d;
    public final boolean f46402d0;
    public o41 f46403e;
    public final boolean f46404e0;
    public x41 f46405f;
    public long f46406f0;
    public long f46407g0;
    public o41 h;
    public final org.telegram.ui.ActionBar.u1[] f46408h0;
    public a41 f46409i0;
    public sb f46410j0;
    public xd f46411k0;
    public View f46412l0;
    public FrameLayout m0;
    public o41 f46413n;
    public te.a f46414n0;
    public final boolean f46415o0;
    public oe0 f46416p0;
    public FrameLayout f46417q0;
    public o41 f46418r;
    public qh.b[] f46419r0;
    public o41 f46420s;
    public int f46421s0;
    public final SparseIntArray f46422t0;
    public final SparseIntArray f46423u0;
    public final ArrayList f46424v0;
    public o41 f46425w;
    public final ArrayList f46426w0;
    public o41 f46427x;
    public final ArrayList f46428x0;
    public o41 f46429y;
    public final ArrayList f46430y0;
    public final ArrayList f46431z0;

    public c51(Bundle bundle) {
        super(bundle);
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.V = new h2.j0(50, 2);
        this.f46408h0 = new org.telegram.ui.ActionBar.u1[1];
        this.f46421s0 = -1;
        this.f46422t0 = new SparseIntArray();
        this.f46423u0 = new SparseIntArray();
        this.f46424v0 = new ArrayList();
        this.f46426w0 = new ArrayList();
        this.f46428x0 = new ArrayList();
        this.f46430y0 = new ArrayList();
        this.f46431z0 = new ArrayList();
        this.B0 = true;
        this.F0 = new m4(this, 15);
        long j3 = bundle.getLong("chat_id");
        this.f46398b = j3;
        this.f46401c0 = bundle.getBoolean("is_megagroup", false);
        this.f46402d0 = bundle.getBoolean("start_from_boosts", false);
        this.f46404e0 = bundle.getBoolean("start_from_monetization", false);
        this.f46415o0 = bundle.getBoolean("only_boosts", false);
        this.f46396a = getMessagesController().P0(j3);
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
        ArrayList arrayList7 = c51Var.f46424v0;
        String str18 = "%";
        int i10 = 10;
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str4 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final o41[] o41VarArr = {i0(tL_broadcastStats.iv_interactions_graph, org.telegram.messenger.gd.M0(2131749081, "IVInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.followers_graph, org.telegram.messenger.gd.M0(2131750594, "FollowersChartTitle"), 0, false), i0(tL_broadcastStats.top_hours_graph, org.telegram.messenger.gd.M0(2131743798, "TopHoursChartTitle"), 0, false), i0(tL_broadcastStats.interactions_graph, org.telegram.messenger.gd.M0(2131743293, "ViewsAndSharesChartTitle"), 1, false), i0(tL_broadcastStats.growth_graph, org.telegram.messenger.gd.M0(2131749183, "GrowthChartTitle"), 0, false), i0(tL_broadcastStats.views_by_source_graph, org.telegram.messenger.gd.M0(2131743292, "ViewsBySourceChartTitle"), 2, false), i0(tL_broadcastStats.new_followers_by_source_graph, org.telegram.messenger.gd.M0(2131748082, "NewFollowersBySourceChartTitle"), 2, false), i0(tL_broadcastStats.languages_graph, org.telegram.messenger.gd.M0(2131748849, "LanguagesChartTitle"), 4, true), i0(tL_broadcastStats.mute_graph, org.telegram.messenger.gd.M0(2131747727, "NotificationsChartTitle"), 0, false), i0(tL_broadcastStats.reactions_by_emotion_graph, org.telegram.messenger.gd.M0(2131746190, "ReactionsByEmotionChartTitle"), 2, false), i0(tL_broadcastStats.story_interactions_graph, org.telegram.messenger.gd.M0(2131744424, "StoryInteractionsChartTitle"), 1, false), i0(tL_broadcastStats.story_reactions_by_emotion_graph, org.telegram.messenger.gd.M0(2131744269, "StoryReactionsByEmotionChartTitle"), 2, false)};
            o41 o41Var = o41VarArr[2];
            if (o41Var != null) {
                o41Var.f50458n = true;
            }
            ?? obj = new Object();
            xi.e a10 = x41.a(tL_broadcastStats.reactions_per_post);
            str = "TopHoursChartTitle";
            obj.f53576o = org.telegram.messenger.gd.M0(2131746183, "ReactionsPerPost");
            obj.f53577p = (String) a10.f60621a;
            obj.f53578q = (String) a10.f60622b;
            obj.f53579r = ((Boolean) a10.f60623c).booleanValue();
            obj.f53580s = ((Boolean) a10.d).booleanValue();
            xi.e a11 = x41.a(tL_broadcastStats.reactions_per_story);
            obj.f53581t = org.telegram.messenger.gd.M0(2131746182, "ReactionsPerStory");
            obj.f53582u = (String) a11.f60621a;
            obj.v = (String) a11.f60622b;
            obj.f53583w = ((Boolean) a11.f60623c).booleanValue();
            obj.f53584x = ((Boolean) a11.d).booleanValue();
            xi.e a12 = x41.a(tL_broadcastStats.views_per_story);
            obj.f53585y = org.telegram.messenger.gd.M0(2131743290, "ViewsPerStory");
            obj.f53586z = (String) a12.f60621a;
            obj.A = (String) a12.f60622b;
            obj.B = ((Boolean) a12.f60623c).booleanValue();
            obj.C = ((Boolean) a12.d).booleanValue();
            xi.e a13 = x41.a(tL_broadcastStats.shares_per_story);
            obj.D = org.telegram.messenger.gd.M0(2131745202, "SharesPerStory");
            obj.E = (String) a13.f60621a;
            obj.F = (String) a13.f60622b;
            obj.G = ((Boolean) a13.f60623c).booleanValue();
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
            obj.f53564a = org.telegram.messenger.gd.M0(2131750594, "FollowersChartTitle");
            obj.f53565b = org.telegram.messenger.g0.o0((int) tL_broadcastStats.followers.current, 0);
            if (i11 == 0 || abs5 == 0.0f) {
                i7 = i11;
                obj.f53566c = "";
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
                    obj.f53566c = sb2.toString() + " (" + i12 + "%)";
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
                    obj.f53566c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
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
            obj.f53570i = org.telegram.messenger.gd.M0(2131745203, "SharesPerPost");
            obj.f53571j = org.telegram.messenger.g0.o0((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f53572k = sb4.toString() + " (" + i14 + "%)";
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
                    obj.f53572k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f53572k = "";
            }
            if (i13 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.f53573l = z15;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d12 = tL_statsAbsValueAndPrev3.current;
            double d13 = tL_statsAbsValueAndPrev3.previous;
            int i15 = (int) (d12 - d13);
            if (d13 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i15 / ((float) d13)) * 100.0f);
            }
            obj.f53567e = org.telegram.messenger.gd.M0(2131743291, "ViewsPerPost");
            obj.f53568f = org.telegram.messenger.g0.o0((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f53569g = sb6.toString() + " (" + i16 + "%)";
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
                    obj.f53569g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f53569g = "";
            }
            if (i15 >= 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            obj.h = z16;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f53574m = org.telegram.messenger.gd.M0(2131751132, "EnabledNotifications");
            int i17 = (int) f10;
            if (f10 == i17) {
                Locale locale7 = Locale.ENGLISH;
                obj.f53575n = com.google.android.gms.internal.vision.e2.i(i17, "%");
            } else {
                obj.f53575n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            c51Var.f46405f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            c51Var.f46406f0 = tL_statsDateRangeDays.max_date * 1000;
            c51Var.f46407g0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f54388a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str10 = str19;
                    str11 = str18;
                    c51Var.f46422t0.put(obj2.b(), i18);
                    i18++;
                } else {
                    str10 = str19;
                    arrayList4 = arrayList8;
                    str11 = str18;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    c51Var.f46428x0.add(obj2);
                    c51Var.f46423u0.put(obj2.b(), i19);
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
                org.telegram.messenger.tr messagesStorage = c51Var.getMessagesStorage();
                int i22 = c51Var.classGuid;
                messagesStorage.getClass();
                messagesStorage.f27052a.c(new org.telegram.messenger.op(messagesStorage, org.telegram.messenger.tz.d(null, "MessagesStorage.getMessages: storageQueue.postRunnable"), null, -c51Var.f46398b, 0L, size2, b10, 0, 0, i22, 0, 0, 0L, 0, true, false));
            }
            r15 = 0;
            org.telegram.messenger.g0.g3(new Runnable(c51Var) {
                public final c51 f53551b;

                {
                    this.f53551b = c51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c51 c51Var2 = this.f53551b;
                            c51Var2.getClass();
                            o41[] o41VarArr2 = o41VarArr;
                            c51Var2.f46418r = o41VarArr2[0];
                            c51Var2.h = o41VarArr2[1];
                            c51Var2.f46403e = o41VarArr2[2];
                            c51Var2.f46413n = o41VarArr2[3];
                            c51Var2.d = o41VarArr2[4];
                            c51Var2.f46420s = o41VarArr2[5];
                            c51Var2.f46425w = o41VarArr2[6];
                            c51Var2.f46427x = o41VarArr2[7];
                            c51Var2.f46429y = o41VarArr2[8];
                            c51Var2.E = o41VarArr2[9];
                            c51Var2.F = o41VarArr2[10];
                            c51Var2.G = o41VarArr2[11];
                            c51Var2.j0(o41VarArr2);
                            return;
                        default:
                            c51 c51Var3 = this.f53551b;
                            c51Var3.getClass();
                            o41[] o41VarArr3 = o41VarArr;
                            c51Var3.d = o41VarArr3[0];
                            c51Var3.I = o41VarArr3[1];
                            c51Var3.J = o41VarArr3[2];
                            c51Var3.K = o41VarArr3[3];
                            c51Var3.L = o41VarArr3[4];
                            c51Var3.M = o41VarArr3[5];
                            c51Var3.f46403e = o41VarArr3[6];
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
            o41 i02 = i0(tL_megagroupStats.growth_graph, org.telegram.messenger.gd.M0(2131749183, str3), r15, r15);
            o41 i03 = i0(tL_megagroupStats.members_graph, org.telegram.messenger.gd.M0(2131749235, "GroupMembersChartTitle"), r15, r15);
            o41 i04 = i0(tL_megagroupStats.new_members_by_source_graph, org.telegram.messenger.gd.M0(2131748079, "NewMembersBySourceChartTitle"), 2, r15);
            o41 i05 = i0(tL_megagroupStats.languages_graph, org.telegram.messenger.gd.M0(2131748426, "MembersLanguageChartTitle"), 4, true);
            o41 i06 = i0(tL_megagroupStats.messages_graph, org.telegram.messenger.gd.M0(2131748270, "MessagesChartTitle"), 2, r15);
            o41 i07 = i0(tL_megagroupStats.actions_graph, org.telegram.messenger.gd.M0(2131754487, "ActionsChartTitle"), 1, r15);
            o41 i08 = i0(tL_megagroupStats.top_hours_graph, org.telegram.messenger.gd.M0(2131743798, str), r15, r15);
            o41 i09 = i0(tL_megagroupStats.weekdays_graph, org.telegram.messenger.gd.M0(2131743799, "TopDaysOfWeekChartTitle"), 4, r15);
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
                o41Var2.f50458n = true;
            }
            o41 o41Var3 = o41VarArr2[7];
            if (o41Var3 != null) {
                o41Var3.f50459o = true;
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
            obj3.f53992a = org.telegram.messenger.gd.M0(2131748425, "MembersOverviewTitle");
            obj3.f53993b = org.telegram.messenger.g0.o0((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f53994c = sb8.toString() + " (" + i24 + "%)";
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
                    obj3.f53994c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs), str2);
                }
            } else {
                obj3.f53994c = "";
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
            obj3.f53998i = org.telegram.messenger.gd.M0(2131743295, "ViewingMembers");
            obj3.f53999j = org.telegram.messenger.g0.o0((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f54000k = sb10.toString();
            } else {
                obj3.f54000k = "";
            }
            if (i25 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f54001l = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d18 = tL_statsAbsValueAndPrev6.current;
            double d19 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d18 - d19);
            if (d19 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i26 / ((float) d19)) * 100.0f);
            }
            obj3.f54002m = org.telegram.messenger.gd.M0(2131746874, "PostingMembers");
            obj3.f54003n = org.telegram.messenger.g0.o0((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f54004o = sb11.toString();
            } else {
                obj3.f54004o = "";
            }
            if (i26 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.f54005p = z12;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d20 = tL_statsAbsValueAndPrev7.current;
            double d21 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d20 - d21);
            if (d21 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i27 / ((float) d21)) * 100.0f);
            }
            obj3.f53995e = org.telegram.messenger.gd.M0(2131748261, "MessagesOverview");
            obj3.f53996f = org.telegram.messenger.g0.o0((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f53997g = sb12.toString();
            } else {
                obj3.f53997g = "";
            }
            if (i27 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj3.h = z13;
            c51Var.H = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            c51Var.f46406f0 = tL_statsDateRangeDays2.max_date * 1000;
            c51Var.f46407g0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f52673a = v41.a(arrayList14, tL_statsGroupTopPoster.user_id);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(org.telegram.messenger.gd.G(i29, "messages", new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(org.telegram.messenger.gd.a0("CharactersPerMessage", null, 2131752243, org.telegram.messenger.gd.G(tL_statsGroupTopPoster.avg_chars, "Characters", new Object[0])));
                    }
                    obj4.f52674b = sb13.toString();
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
                    obj5.f52673a = v41.a(arrayList20, tL_statsGroupTopAdmin.user_id);
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
                    obj5.f52674b = sb14.toString();
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
                    obj6.f52673a = v41.a(arrayList23, tL_statsGroupTopInviter.user_id);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f52674b = org.telegram.messenger.gd.G(i34, "Invitations", new Object[0]);
                    } else {
                        obj6.f52674b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            org.telegram.messenger.g0.g3(new Runnable(c51Var) {
                public final c51 f53551b;

                {
                    this.f53551b = c51Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c51 c51Var2 = this.f53551b;
                            c51Var2.getClass();
                            o41[] o41VarArr22 = o41VarArr2;
                            c51Var2.f46418r = o41VarArr22[0];
                            c51Var2.h = o41VarArr22[1];
                            c51Var2.f46403e = o41VarArr22[2];
                            c51Var2.f46413n = o41VarArr22[3];
                            c51Var2.d = o41VarArr22[4];
                            c51Var2.f46420s = o41VarArr22[5];
                            c51Var2.f46425w = o41VarArr22[6];
                            c51Var2.f46427x = o41VarArr22[7];
                            c51Var2.f46429y = o41VarArr22[8];
                            c51Var2.E = o41VarArr22[9];
                            c51Var2.F = o41VarArr22[10];
                            c51Var2.G = o41VarArr22[11];
                            c51Var2.j0(o41VarArr22);
                            return;
                        default:
                            c51 c51Var3 = this.f53551b;
                            c51Var3.getClass();
                            o41[] o41VarArr3 = o41VarArr2;
                            c51Var3.d = o41VarArr3[0];
                            c51Var3.I = o41VarArr3[1];
                            c51Var3.J = o41VarArr3[2];
                            c51Var3.K = o41VarArr3[3];
                            c51Var3.L = o41VarArr3[4];
                            c51Var3.M = o41VarArr3[5];
                            c51Var3.f46403e = o41VarArr3[6];
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
                arrayList.add(new org.telegram.messenger.fj(c51Var.currentAccount, arrayList2.get(i7), false, true));
            }
            c51Var.getMessagesStorage().j1(arrayList2, false, true, true, 0, false, 0, 0L);
        }
        org.telegram.messenger.g0.g3(new w31(c51Var, arrayList, 1));
    }

    public static void c0(c51 c51Var) {
        b51 b51Var = c51Var.Z;
        if (b51Var != null) {
            b51Var.f45759b = true;
        }
        int childCount = c51Var.T.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = c51Var.T.getChildAt(i7);
            if (childAt instanceof n41) {
                ((n41) childAt).f49707b.f19820u0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.h2 g0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f28403id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24770t0).P0(chat.f28403id);
        if (P0 != null && (P0.can_view_stats || P0.can_view_stars_revenue)) {
            return new c51(bundle);
        }
        return new t5(-chat.f28403id);
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
            int length = ((mg.a) bVar.d.get(0)).f20974a.length;
            int size = bVar.d.size();
            bVar.f20991l = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                bVar.f20991l[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    long[] jArr = bVar.f20991l;
                    jArr[i10] = jArr[i10] + ((mg.a) bVar.d.get(i11)).f20974a[i10];
                }
            }
            bVar.f20992m = new k8.a(bVar.f20991l);
            return bVar;
        } else if (i7 == 4) {
            ?? bVar2 = new mg.b(jSONObject);
            if (z10) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j3 = 0;
                for (int i12 = 0; i12 < bVar2.d.size(); i12++) {
                    int length2 = bVar2.f20981a.length;
                    for (int i13 = 0; i13 < length2; i13++) {
                        long j10 = ((mg.a) bVar2.d.get(i12)).f20974a[i13];
                        jArr2[i12] = jArr2[i12] + j10;
                        if (j10 == 0) {
                            iArr[i12] = iArr[i12] + 1;
                        }
                    }
                    j3 += jArr2[i12];
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < bVar2.d.size(); i14++) {
                    if (jArr2[i14] / j3 < 0.01d && iArr[i14] > bVar2.f20981a.length / 2.0f) {
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
            int length3 = ((mg.a) bVar2.d.get(0)).f20974a.length;
            int size3 = bVar2.d.size();
            bVar2.f20993l = new long[length3];
            for (int i16 = 0; i16 < length3; i16++) {
                bVar2.f20993l[i16] = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    long[] jArr3 = bVar2.f20993l;
                    jArr3[i16] = jArr3[i16] + ((mg.a) bVar2.d.get(i17)).f20974a[i16];
                }
            }
            new k8.a(bVar2.f20993l);
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
        o41Var.f50457m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                mg.b h02 = h0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i7, z10);
                o41Var.d = h02;
                if (h02 != null) {
                    h02.h = statsGraph.rate;
                }
                o41Var.f50452g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (h02 == null || (jArr2 = h02.f20981a) == null || jArr2.length < 2) {
                    o41Var.f50456l = true;
                }
                if (i7 == 4 && h02 != null && (jArr = h02.f20981a) != null && jArr.length > 0) {
                    long j3 = jArr[jArr.length - 1];
                    o41Var.f50450e = new mg.e(h02, j3);
                    o41Var.f50449c = j3;
                    return o41Var;
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            o41Var.f50451f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return o41Var;
    }

    public static void n0(o41 o41Var, ArrayList arrayList, org.telegram.ui.ActionBar.v6 v6Var) {
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
                int i11 = aVar.f20979g;
                if (i11 >= 0) {
                    if (!org.telegram.ui.ActionBar.n6.f1(i11)) {
                        int i12 = aVar.f20979g;
                        if (org.telegram.ui.ActionBar.n6.I == org.telegram.ui.ActionBar.n6.J) {
                            i7 = aVar.f20980i;
                        } else {
                            i7 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.n6.A1(i12, i7, false);
                        org.telegram.ui.ActionBar.n6.hm[aVar.f20979g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, v6Var, aVar.f20979g));
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29615p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29729v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29710u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29559m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ik));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29767x6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29805z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29467h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Sj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Rj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Qj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Pj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29502j5));
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
        c51 c51Var = this;
        c51Var.setHasOwnBackground(true);
        c51Var.f46397a0 = new lg.f((org.telegram.ui.ActionBar.i6) null);
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(c51Var.currentAccount);
        long j3 = c51Var.f46398b;
        TLRPC.Chat O0 = u12.O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(c51Var.currentAccount).P0(j3);
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
            arrayList.add(qh.b.c(context, c51Var.resourceProvider, qh.a.J, 2131744657));
        }
        arrayList.add(qh.b.c(context, c51Var.resourceProvider, qh.a.P, 2131753161));
        if (z11) {
            arrayList.add(qh.b.c(context, c51Var.resourceProvider, qh.a.Q, 2131748215));
        }
        c51Var.f46419r0 = (qh.b[]) arrayList.toArray(new qh.b[0]);
        oe0 oe0Var = new oe0(context, c51Var.resourceProvider);
        c51Var.f46416p0 = oe0Var;
        oe0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        c51Var.f46416p0.setMaxWidth(org.telegram.messenger.g0.L(344.0f));
        c51Var.f46416p0.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        c51Var.f46417q0 = frameLayout2;
        frameLayout2.setOnClickListener(new bi.o(24));
        c51Var.f46417q0.addView(c51Var.f46416p0, c8.ma.e(-1, 72, 81));
        c51Var.f46417q0.setClipToPadding(false);
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = c51Var.f46419r0;
            if (i11 >= bVarArr.length) {
                break;
            }
            qh.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new vm0(c51Var, i11, 3));
            c51Var.f46416p0.addView(c51Var.f46419r0[i11]);
            c51Var.f46416p0.j(bVar, true, false);
            i11++;
        }
        c51Var.f46409i0 = new a41(c51Var, c51Var.getParentActivity());
        FrameLayout frameLayout3 = new FrameLayout(context);
        if (R) {
            sb sbVar = new sb(c51Var, -j3, c51Var.getResourceProvider());
            c51Var.f46410j0 = sbVar;
            sbVar.G.setCaptureSectionsDecoratorAllowed(true);
            c51Var.glassEngine.b(c51Var.f46410j0.G);
        }
        if (z11) {
            Activity parentActivity = c51Var.getParentActivity();
            int i12 = c51Var.currentAccount;
            long j10 = -j3;
            frameLayout = frameLayout3;
            org.telegram.ui.ActionBar.i6 resourceProvider = c51Var.getResourceProvider();
            ri.q qVar = c51Var.glassEngine;
            if (org.telegram.messenger.v3.V(O0) && P0.can_view_revenue) {
                z13 = true;
            } else {
                z13 = false;
            }
            i7 = -1;
            xd xdVar = new xd(parentActivity, c51Var, i12, j10, resourceProvider, qVar, z13, P0.can_view_stars_revenue);
            c51Var = c51Var;
            c51Var.f46411k0 = xdVar;
            xdVar.Y0.setCaptureSectionsDecoratorAllowed(true);
        } else {
            frameLayout = frameLayout3;
            i7 = -1;
        }
        boolean z14 = z10;
        FrameLayout frameLayout4 = frameLayout;
        c51Var.f46409i0.setAdapter(new b41(c51Var, z14, R, z11, frameLayout4));
        boolean z15 = c51Var.f46415o0;
        if (R && !z15) {
            z12 = true;
        } else {
            z12 = false;
        }
        c51Var.f46400c = z12;
        if (z12 && c51Var.f46402d0) {
            c51Var.f46409i0.setPosition(z14 ? 1 : 0);
        } else if (z12 && c51Var.f46404e0) {
            a41 a41Var = c51Var.f46409i0;
            if (!z15 && R) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            a41Var.setPosition(i10 + (z14 ? 1 : 0));
        }
        c51Var.p0(c51Var.f46409i0.getCurrentPosition(), false);
        FrameLayout frameLayout5 = new FrameLayout(c51Var.getParentActivity());
        frameLayout5.addView(c51Var.f46409i0, c8.ma.g());
        View view = new View(context);
        c51Var.f46412l0 = view;
        frameLayout5.addView(view, c8.ma.e(i7, 0, 48));
        FrameLayout frameLayout6 = new FrameLayout(context);
        c51Var.m0 = frameLayout6;
        frameLayout6.setVisibility(4);
        frameLayout5.addView(c51Var.m0, c8.ma.g());
        frameLayout5.addView(c51Var.simpleActionBar);
        if (c51Var.f46400c) {
            c51Var.setBulletinDelegate(new bi.t(13));
            c51Var.f46417q0.setBackground(c51Var.getBaseSimpleGlass().b(c51Var.f46417q0));
            frameLayout5.addView(c51Var.f46417q0, c8.ma.e(i7, -2, 80));
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
        c51Var.f46399b0 = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        c51Var.W = imageView;
        imageView.setAutoRepeat(true);
        c51Var.W.f(2131624229, 120, 120, null);
        c51Var.W.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.n6.Fj;
        org.telegram.ui.ActionBar.u6.U(textView, i13, null);
        textView.setTag(Integer.valueOf(i13));
        textView.setText(org.telegram.messenger.gd.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.n6.Gj;
        org.telegram.ui.ActionBar.u6.U(textView2, i14, null);
        textView2.setTag(Integer.valueOf(i14));
        textView2.setText(org.telegram.messenger.gd.M0(2131748584, null));
        textView2.setGravity(1);
        c51Var.f46399b0.addView(c51Var.W, c8.ma.t(120, 120, 1, 0, 0, 0, 20));
        c51Var.f46399b0.addView(textView, c8.ma.t(-2, -2, 1, 0, 0, 0, 10));
        c51Var.f46399b0.addView(textView2, c8.ma.r(-2, -2, 1));
        frameLayout4.addView(c51Var.f46399b0, c8.ma.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (c51Var.X == null) {
            c51Var.X = new h41(c51Var);
        }
        c51Var.T.setAdapter(c51Var.X);
        v4.c0 c0Var = new v4.c0();
        c51Var.U = c0Var;
        c51Var.T.setLayoutManager(c0Var);
        c51Var.Y = new v4.k();
        c51Var.T.setItemAnimator(null);
        c51Var.T.j(new c21(c51Var, 2));
        c51Var.T.setOnItemClickListener(new zx0(c51Var, 6));
        c51Var.T.setOnItemLongClickListener(new z31(c51Var));
        frameLayout4.addView(c51Var.T);
        c51Var.S = new org.telegram.ui.Components.ao(context, null, false, null);
        TLRPC.Chat O02 = c51Var.getMessagesController().O0(Long.valueOf(j3));
        c51Var.S.setChatAvatar(O02);
        c51Var.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        org.telegram.ui.ActionBar.a5 a5Var = c51Var.simpleActionBar;
        if (O02 == null) {
            str = "";
        } else {
            str = O02.title;
        }
        a5Var.setTitle(str);
        c51Var.simpleActionBar.setActionBarMenuOnItemClick(new hs0(c51Var, 15));
        c51Var.S.i(org.telegram.ui.ActionBar.n6.x0(null, i13, false), org.telegram.ui.ActionBar.n6.x0(null, i14, false));
        boolean z16 = c51Var.B0;
        m4 m4Var = c51Var.F0;
        if (z16) {
            c51Var.f46399b0.setAlpha(0.0f);
            org.telegram.messenger.g0.h3(m4Var, 500L);
            c51Var.f46399b0.setVisibility(0);
            c51Var.T.setVisibility(8);
        } else {
            org.telegram.messenger.g0.r(m4Var);
            c51Var.f46399b0.setVisibility(8);
            c51Var.T.setVisibility(0);
        }
        fh.g c10 = c51Var.getBaseSimpleGlass().f56616c.c(c51Var.f46416p0, c8.i0.g(c51Var.resourceProvider), false);
        org.telegram.messenger.n10.s(c10, org.telegram.messenger.g0.L(28.0f), 7.666f);
        c51Var.f46416p0.setBackground(c10);
        c51Var.glassEngine.c(c51Var.f46409i0);
        ri.a baseSimpleGlass = c51Var.getBaseSimpleGlass();
        a41 a41Var2 = c51Var.f46409i0;
        org.telegram.ui.ActionBar.a5 a5Var2 = c51Var.simpleActionBar;
        org.telegram.ui.ActionBar.i6 i6Var = c51Var.resourceProvider;
        baseSimpleGlass.f56624m = frameLayout5;
        baseSimpleGlass.f56625n = a41Var2;
        baseSimpleGlass.f56614a.c(a41Var2);
        baseSimpleGlass.g(frameLayout5, a5Var2, i6Var);
        c51Var.f46414n0 = new te.a(0, new z31(c51Var), org.telegram.ui.Components.lr.h, 380L, false);
        xd xdVar2 = c51Var.f46411k0;
        if (xdVar2 != null) {
            ri.a baseSimpleGlass2 = c51Var.getBaseSimpleGlass();
            View view2 = xdVar2.f53787b1.d;
            fh.g c11 = baseSimpleGlass2.f56616c.c(view2, null, false);
            c11.p(c8.i0.m(xdVar2.f53799o0));
            c11.q(org.telegram.messenger.g0.L(9.66f));
            c11.r(org.telegram.messenger.g0.L(18.0f));
            view2.setBackground(c11);
            View transactionTabs = c51Var.f46411k0.getTransactionTabs();
            ViewGroup.LayoutParams layoutParams = transactionTabs.getLayoutParams();
            org.telegram.messenger.g0.E2(transactionTabs);
            c51Var.m0.addView(transactionTabs, layoutParams);
            c51Var.f46411k0.setTabsPinnedChangedListener(new ru0(c51Var, 20));
            c51Var.f46414n0.a(c51Var.f46411k0.f38906f0, false);
        }
        frameLayout5.getViewTreeObserver().addOnPreDrawListener(new gk(c51Var, 2));
        c51Var.getBaseSimpleGlass().f56626o = new wu(c51Var, frameLayout5, new z5(1, frameLayout5), 1);
        c51Var.getBaseSimpleGlass().f56625n = null;
        c51Var.simpleActionBar.setBackground(null);
        c51Var.f46412l0.setBackground(c51Var.getBaseSimpleGlass().a(c51Var.f46412l0));
        org.telegram.messenger.g0.E2(c51Var.S.f33381e);
        frameLayout5.addView(c51Var.S.f33381e, c8.ma.e(42, 42, 53));
        c51Var.f0();
        c51Var.fragmentView.setBackgroundColor(c51Var.getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7));
        c51Var.C0 = new p41(c51Var.X, c51Var.U);
        return c51Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.h2 h2Var;
        org.telegram.ui.ActionBar.h2 h2Var2;
        org.telegram.ui.ActionBar.h2 h2Var3 = null;
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
                    h2Var = (org.telegram.ui.ActionBar.h2) p5.c.h(2, fragmentStack);
                } else {
                    h2Var = null;
                }
                if (h2Var instanceof rn) {
                    ((ActionBarLayout) getParentLayout()).d0(h2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    h2Var2 = (org.telegram.ui.ActionBar.h2) p5.c.h(2, fragmentStack2);
                } else {
                    h2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        h2Var3 = (org.telegram.ui.ActionBar.h2) p5.c.h(3, fragmentStack2);
                    }
                    if (h2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).d0(h2Var2, false);
                    }
                    finishFragment();
                    if (h2Var3 instanceof bn) {
                        wg.h.f(h2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (h2Var2 instanceof ProfileActivity) {
                    wg.h.f(h2Var2, chat, false);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.D) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i12 = 0;
                while (true) {
                    arrayList = this.f46424v0;
                    if (i12 >= size) {
                        break;
                    }
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i12);
                    int i13 = this.f46422t0.get(fjVar.e1(), -1);
                    if (i13 >= 0 && ((z41) arrayList.get(i13)).b() == fjVar.e1()) {
                        if (fjVar.Z) {
                            arrayList3.add((z41) arrayList.get(i13));
                        } else {
                            ((z41) arrayList.get(i13)).f54389b = fjVar;
                        }
                    }
                    i12++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f46426w0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    z41 z41Var = (z41) arrayList.get(i11);
                    if (z41Var.f54389b == null) {
                        this.f46421s0 = z41Var.b();
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
        } else if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f28404id == this.f46398b && this.f46396a == null) {
                this.f46396a = chatFull;
                l0();
            }
        }
    }

    public final void f0() {
        int i7;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if (this.f46412l0 != null) {
            int L = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f15890b;
            ViewGroup.LayoutParams layoutParams = this.f46412l0.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.f46412l0.setLayoutParams(layoutParams);
            }
            t0();
        }
        if (this.f46400c) {
            i7 = org.telegram.messenger.g0.L(72.0f);
        } else {
            i7 = 0;
        }
        org.telegram.messenger.g0.z3(this.S.f33381e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.f15890b, org.telegram.messenger.g0.L(6.0f), 0);
        this.f46417q0.setPadding(0, 0, 0, this.mSystemInsets.d);
        c41 c41Var = this.T;
        if (c41Var != null) {
            i0.b bVar = this.mSystemInsets;
            ri.a.e(c41Var, bVar.f15890b, bVar.d, currentActionBarHeight, i7);
        }
        sb sbVar = this.f46410j0;
        if (sbVar != null) {
            org.telegram.ui.Components.ck0 ck0Var = sbVar.G;
            i0.b bVar2 = this.mSystemInsets;
            ri.a.e(ck0Var, bVar2.f15890b, bVar2.d, currentActionBarHeight, i7);
        }
        xd xdVar = this.f46411k0;
        if (xdVar != null) {
            i0.b bVar3 = this.mSystemInsets;
            int i10 = bVar3.f15890b;
            int i11 = bVar3.d;
            xdVar.V0 = i10;
            xdVar.W0 = i11;
            xdVar.X0 = i7;
            int D = org.telegram.messenger.n10.D(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            int D2 = org.telegram.messenger.n10.D(48.0f, i11, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.e51 e51Var = xdVar.Y0;
            org.telegram.messenger.g0.z3(e51Var, 0, D, 0, D2);
            e51Var.setPadding(e51Var.getPaddingLeft(), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10) - D, e51Var.getPaddingRight(), (i11 + i7) - D2);
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
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.T, 0, new Class[]{ng.c.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29502j5));
        if (this.f46401c0) {
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
                    o41Var = this.f46413n;
                } else if (i7 == 3) {
                    o41Var = this.f46418r;
                } else if (i7 == 4) {
                    o41Var = this.f46420s;
                } else if (i7 == 5) {
                    o41Var = this.f46425w;
                } else if (i7 == 6) {
                    o41Var = this.f46429y;
                } else if (i7 == 7) {
                    o41Var = this.f46403e;
                } else if (i7 == 8) {
                    o41Var = this.f46427x;
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
        if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29394d6, false)) <= 0.699999988079071d) {
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
        if (motionEvent != null && this.f46411k0 != null && (a41Var = this.f46409i0) != null) {
            View currentView = a41Var.getCurrentView();
            xd xdVar = this.f46411k0;
            if (currentView == xdVar && xdVar.G((motionEvent.getX() - this.f46409i0.getX()) - this.f46411k0.getX(), (motionEvent.getY() - this.f46409i0.getY()) - this.f46411k0.getY())) {
                return false;
            }
        }
        a41 a41Var2 = this.f46409i0;
        if (a41Var2 != null && (a41Var2.f35376b != 0 || a41Var2.f35377c != 1.0f)) {
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
        LinearLayout linearLayout = this.f46399b0;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            org.telegram.messenger.g0.r(this.F0);
            this.f46399b0.animate().alpha(0.0f).setDuration(230L).setListener(new ay(this, 29));
            this.T.setVisibility(0);
            this.T.setAlpha(0.0f);
            this.T.animate().alpha(1.0f).setDuration(230L).start();
            for (o41 o41Var : o41VarArr) {
                if (o41Var != null && o41Var.d == null && o41Var.f50451f != null) {
                    o41Var.a(this.currentAccount, this.classGuid, this.f46396a.stats_dc, new eh(2, this, o41Var));
                }
            }
        }
    }

    public final void k0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f28441id = new ArrayList<>();
        ArrayList arrayList = this.f46424v0;
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = this.f46422t0.get(this.f46421s0); i10 < size; i10++) {
            if (((z41) arrayList.get(i10)).f54389b == null) {
                tL_channels_getMessages.f28441id.add(Integer.valueOf(((z41) arrayList.get(i10)).b()));
                i7++;
                if (i7 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(this.f46398b);
        this.A0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new v31(this, 0));
    }

    public final void l0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f46415o0) {
            return;
        }
        boolean z10 = this.f46401c0;
        long j3 = this.f46398b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = org.telegram.messenger.mp.u1(this.currentAccount).j1(j3);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new v31(this, 1), null, null, 0, this.f46396a.stats_dc, 1, true), this.classGuid);
    }

    public final void m0() {
        ArrayList arrayList = this.f46430y0;
        arrayList.clear();
        ArrayList arrayList2 = this.f46428x0;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            z41 z41Var = (z41) obj;
            org.telegram.messenger.fj f10 = this.D0.f(z41Var.b());
            if (f10 != null) {
                z41Var.f54389b = f10;
                arrayList.add(z41Var);
            }
        }
        this.f46423u0.clear();
        arrayList2.clear();
    }

    public final void o0(View view) {
        if (view instanceof n41) {
            return;
        }
        if ((view instanceof org.telegram.ui.Cells.z6) && !this.T.b1()) {
            Drawable background = view.getBackground();
            if (background instanceof org.telegram.ui.Components.mq) {
                org.telegram.ui.Components.mq mqVar = (org.telegram.ui.Components.mq) background;
                if ((mqVar.f37607a instanceof ColorDrawable) && mqVar.f37608b != null) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29358b7, false);
                    if (this.H0 == null || this.I0 != x02) {
                        this.I0 = x02;
                        this.H0 = new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY);
                    }
                    ((ColorDrawable) mqVar.f37607a).setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29337a7, false));
                    mqVar.f37608b.setColorFilter(this.H0);
                    view.invalidate();
                    return;
                }
            }
            org.telegram.ui.Components.mq mqVar2 = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29337a7, false)), org.telegram.ui.ActionBar.n6.Y0(org.telegram.messenger.t0.f26913b, 2131231229, org.telegram.ui.ActionBar.n6.f29358b7), 0, 0);
            mqVar2.f37616x = true;
            view.setBackground(mqVar2);
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
        long j3 = this.f46398b;
        fi.h6 A = R1.A(2, -1, -j3, true);
        this.D0 = A;
        if (A != null) {
            this.E0 = A.o();
        }
        if (this.f46396a != null) {
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
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.f46408h0;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
            u1VarArr[0] = null;
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
            org.telegram.ui.Components.ao aoVar = this.S;
            if (aoVar != null) {
                aoVar.i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fj, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gj, false));
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
            qh.b[] bVarArr = this.f46419r0;
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
        for (int i7 = 0; i7 < this.f46419r0.length; i7++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i7 - f10));
            qh.b bVar = this.f46419r0[i7];
            bVar.K = max;
            bVar.J = z10;
            bVar.invalidate();
        }
        this.f46416p0.invalidate();
    }

    public final void r0() {
        ArrayList arrayList = this.f46431z0;
        arrayList.clear();
        arrayList.addAll(this.f46426w0);
        arrayList.addAll(this.f46430y0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.messenger.ok(4))));
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
        lg.f fVar = this.f46397a0;
        if (fVar != null) {
            fVar.f19765c = true;
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
