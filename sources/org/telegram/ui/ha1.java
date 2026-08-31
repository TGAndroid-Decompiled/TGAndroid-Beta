package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SegmentTree;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ha1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final tg.d A0;
    public t91 B;
    public final tg.d B0;
    public t91 C;
    public final og.a C0;
    public da1 D;
    public e91 D0;
    public t91 E;
    public final ArrayList E0;
    public t91 F;
    public final RectF F0;
    public t91 G;
    public final RectF G0;
    public t91 H;
    public t91 I;
    public t91 J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public org.telegram.ui.Components.bo O;
    public i91 P;
    public og.k Q;
    public f2.j0 R;
    public final LruCache S;
    public org.telegram.ui.Components.lj0 T;
    public m91 U;
    public f91 V;
    public ga1 W;
    public wf.f X;
    public LinearLayout Y;
    public final boolean Z;
    public TLRPC.ChatFull f37416a;
    public final boolean f37417a0;
    public final long f37418b;
    public final boolean f37419b0;
    public boolean f37420c;
    public long f37421c0;
    public t91 d;
    public long f37422d0;
    public t91 f37423e;
    public final org.telegram.ui.ActionBar.d2[] f37424e0;
    public ca1 f37425f;
    public ek f37426f0;
    public ac f37427g0;
    public t91 h;
    public ke f37428h0;
    public final boolean f37429i0;
    public yg0 f37430j0;
    public ch.b[] f37431k0;
    public int f37432l0;
    public final SparseIntArray m0;
    public t91 f37433n;
    public final SparseIntArray f37434n0;
    public final ArrayList f37435o0;
    public final ArrayList f37436p0;
    public final ArrayList f37437q0;
    public t91 f37438r;
    public final ArrayList f37439r0;
    public t91 f37440s;
    public final ArrayList f37441s0;
    public boolean f37442t0;
    public boolean f37443u0;
    public t91 v;
    public u91 f37444v0;
    public t91 f37445w;
    public oh.l6 f37446w0;
    public t91 f37447x;
    public int f37448x0;
    public t91 f37449y;
    public final z5 f37450y0;
    public final og.e f37451z0;

    public ha1(Bundle bundle) {
        super(bundle);
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.S = new LruCache(50);
        this.f37424e0 = new org.telegram.ui.ActionBar.d2[1];
        this.f37432l0 = -1;
        this.m0 = new SparseIntArray();
        this.f37434n0 = new SparseIntArray();
        this.f37435o0 = new ArrayList();
        this.f37436p0 = new ArrayList();
        this.f37437q0 = new ArrayList();
        this.f37439r0 = new ArrayList();
        this.f37441s0 = new ArrayList();
        this.f37443u0 = true;
        this.f37450y0 = new z5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.E0 = arrayList;
        RectF rectF = new RectF();
        this.F0 = rectF;
        RectF rectF2 = new RectF();
        this.G0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.f37418b = j10;
        this.Z = bundle.getBoolean("is_megagroup", false);
        this.f37417a0 = bundle.getBoolean("start_from_boosts", false);
        this.f37419b0 = bundle.getBoolean("start_from_monetization", false);
        this.f37429i0 = bundle.getBoolean("only_boosts", false);
        this.f37416a = getMessagesController().getChatFull(j10);
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f37451z0 = new og.e(false);
            this.A0 = new tg.d(null);
            tg.d dVar = new tg.d(null);
            this.B0 = dVar;
            og.a aVar = new og.a(dVar);
            this.C0 = aVar;
            aVar.f16755f = LiteMode.isEnabled(262144);
            return;
        }
        this.f37451z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = new og.a(cVar);
    }

    public static void U(ha1 ha1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(ha1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            ha1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new b91(ha1Var, arrayList, 0));
    }

    public static void V(ha1 ha1Var, TLObject tLObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        String str3;
        float abs;
        boolean z4;
        float abs2;
        boolean z10;
        float abs3;
        boolean z11;
        float abs4;
        boolean z12;
        ArrayList arrayList3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        float abs5;
        int i10;
        boolean z13;
        float abs6;
        boolean z14;
        float abs7;
        boolean z15;
        int i11;
        ArrayList arrayList4;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        ArrayList arrayList5 = ha1Var.K;
        ArrayList arrayList6 = ha1Var.L;
        ArrayList arrayList7 = ha1Var.f37435o0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final t91[] t91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            t91 t91Var = t91VarArr[2];
            if (t91Var != null) {
                t91Var.f41553n = true;
            }
            ?? obj = new Object();
            sf.e a2 = ca1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f35748o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f35749p = (String) a2.f47315b;
            obj.f35750q = (String) a2.f47316c;
            obj.f35751r = ((Boolean) a2.d).booleanValue();
            obj.f35752s = ((Boolean) a2.f47317e).booleanValue();
            sf.e a10 = ca1.a(tL_broadcastStats.reactions_per_story);
            obj.f35753t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f35754u = (String) a10.f47315b;
            obj.v = (String) a10.f47316c;
            obj.f35755w = ((Boolean) a10.d).booleanValue();
            obj.f35756x = ((Boolean) a10.f47317e).booleanValue();
            sf.e a11 = ca1.a(tL_broadcastStats.views_per_story);
            obj.f35757y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f35758z = (String) a11.f47315b;
            obj.A = (String) a11.f47316c;
            obj.B = ((Boolean) a11.d).booleanValue();
            obj.C = ((Boolean) a11.f47317e).booleanValue();
            sf.e a12 = ca1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f47315b;
            obj.F = (String) a12.f47316c;
            obj.G = ((Boolean) a12.d).booleanValue();
            obj.H = ((Boolean) a12.f47317e).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList8 = arrayList7;
            int i12 = (int) (d - d10);
            if (d10 == 0.0d) {
                abs5 = 0.0f;
            } else {
                abs5 = Math.abs((i12 / ((float) d10)) * 100.0f);
            }
            obj.f35736a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f35737b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f35738c = "";
            } else {
                int i13 = (int) abs5;
                if (abs5 == i13) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb = new StringBuilder();
                    if (i12 <= 0) {
                        str15 = "";
                    } else {
                        str15 = str3;
                    }
                    sb.append(str15);
                    sb.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    String sb2 = sb.toString();
                    obj.f35738c = sb2 + " (" + i13 + "%)";
                    i10 = i12;
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    if (i12 <= 0) {
                        str14 = "";
                    } else {
                        str14 = str3;
                    }
                    sb3.append(str14);
                    sb3.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    i10 = i12;
                    obj.f35738c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
                }
            }
            if (i10 >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            obj.d = z13;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i14 = (int) (d11 - d12);
            if (d12 == 0.0d) {
                abs6 = 0.0f;
            } else {
                abs6 = Math.abs((i14 / ((float) d12)) * 100.0f);
            }
            obj.f35742i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f35743j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i14 != 0 && abs6 != 0.0f) {
                int i15 = (int) abs6;
                if (abs6 == i15) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    if (i14 <= 0) {
                        str13 = "";
                    } else {
                        str13 = str3;
                    }
                    sb4.append(str13);
                    sb4.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    String sb5 = sb4.toString();
                    obj.f35744k = sb5 + " (" + i15 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    if (i14 <= 0) {
                        str12 = "";
                    } else {
                        str12 = str3;
                    }
                    sb6.append(str12);
                    sb6.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    obj.f35744k = String.format(locale4, "%s (%.1f%s)", sb6.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f35744k = "";
            }
            if (i14 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.f35745l = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.f35739e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f35740f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i16 != 0 && abs7 != 0.0f) {
                int i17 = (int) abs7;
                if (abs7 == i17) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    if (i16 <= 0) {
                        str11 = "";
                    } else {
                        str11 = str3;
                    }
                    sb7.append(str11);
                    sb7.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    String sb8 = sb7.toString();
                    obj.f35741g = sb8 + " (" + i17 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    if (i16 <= 0) {
                        str10 = "";
                    } else {
                        str10 = str3;
                    }
                    sb9.append(str10);
                    sb9.append(AndroidUtilities.formatWholeNumber(i16, 0));
                    obj.f35741g = String.format(locale6, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f35741g = "";
            }
            if (i16 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.h = z15;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f35746m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f10;
            if (f10 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f35747n = android.support.v4.media.a.l(i18, "%");
            } else {
                obj.f35747n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            ha1Var.f37425f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            ha1Var.f37421c0 = tL_statsDateRangeDays.max_date * 1000;
            ha1Var.f37422d0 = tL_statsDateRangeDays.min_date * 1000;
            arrayList8.clear();
            ArrayList arrayList9 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList10 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList10.size();
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList10.get(i21);
                int i22 = i21 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList11 = arrayList10;
                ?? obj2 = new Object();
                obj2.f36455a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    ha1Var.m0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    ha1Var.f37437q0.add(obj2);
                    ha1Var.f37434n0.put(obj2.b(), i20);
                    i20++;
                }
                arrayList10 = arrayList11;
                str16 = str9;
                i21 = i11;
                arrayList8 = arrayList4;
                size = i23;
            }
            ArrayList arrayList12 = arrayList8;
            str = str16;
            AndroidUtilities.runOnUIThread(new b91(ha1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                ha1Var.getMessagesStorage().getMessages(-ha1Var.f37418b, 0L, false, arrayList12.size(), ((ea1) arrayList12.get(0)).b(), 0, 0, ha1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(ha1Var) {
                public final ha1 f35099b;

                {
                    this.f35099b = ha1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ha1 ha1Var2 = this.f35099b;
                            ha1Var2.getClass();
                            t91[] t91VarArr2 = t91VarArr;
                            ha1Var2.d = t91VarArr2[0];
                            ha1Var2.E = t91VarArr2[1];
                            ha1Var2.F = t91VarArr2[2];
                            ha1Var2.G = t91VarArr2[3];
                            ha1Var2.H = t91VarArr2[4];
                            ha1Var2.I = t91VarArr2[5];
                            ha1Var2.f37423e = t91VarArr2[6];
                            ha1Var2.J = t91VarArr2[7];
                            ha1Var2.g0(t91VarArr2);
                            return;
                        default:
                            ha1 ha1Var3 = this.f35099b;
                            ha1Var3.getClass();
                            t91[] t91VarArr3 = t91VarArr;
                            ha1Var3.f37438r = t91VarArr3[0];
                            ha1Var3.h = t91VarArr3[1];
                            ha1Var3.f37423e = t91VarArr3[2];
                            ha1Var3.f37433n = t91VarArr3[3];
                            ha1Var3.d = t91VarArr3[4];
                            ha1Var3.f37440s = t91VarArr3[5];
                            ha1Var3.v = t91VarArr3[6];
                            ha1Var3.f37445w = t91VarArr3[7];
                            ha1Var3.f37447x = t91VarArr3[8];
                            ha1Var3.f37449y = t91VarArr3[9];
                            ha1Var3.B = t91VarArr3[10];
                            ha1Var3.C = t91VarArr3[11];
                            ha1Var3.g0(t91VarArr3);
                            return;
                    }
                }
            });
        } else {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            str = "%";
            str2 = "TopHoursChartTitle";
            str3 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final t91[] t91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            t91 t91Var2 = t91VarArr2[6];
            if (t91Var2 != null) {
                t91Var2.f41553n = true;
            }
            t91 t91Var3 = t91VarArr2[7];
            if (t91Var3 != null) {
                t91Var3.f41554o = true;
            }
            ?? obj3 = new Object();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i24 = (int) (d15 - d16);
            if (d16 == 0.0d) {
                abs = 0.0f;
            } else {
                abs = Math.abs((i24 / ((float) d16)) * 100.0f);
            }
            obj3.f36157a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f36158b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i24 != 0 && abs != 0.0f) {
                int i25 = (int) abs;
                if (abs == i25) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb10 = new StringBuilder();
                    if (i24 <= 0) {
                        str8 = "";
                    } else {
                        str8 = str3;
                    }
                    sb10.append(str8);
                    sb10.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    String sb11 = sb10.toString();
                    obj3.f36159c = sb11 + " (" + i25 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb12 = new StringBuilder();
                    if (i24 <= 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    sb12.append(str7);
                    sb12.append(AndroidUtilities.formatWholeNumber(i24, 0));
                    obj3.f36159c = String.format(locale9, "%s (%.1f%s)", sb12.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f36159c = "";
            }
            if (i24 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            obj3.d = z4;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i26 = (int) (d17 - d18);
            if (d18 == 0.0d) {
                abs2 = 0.0f;
            } else {
                abs2 = Math.abs((i26 / ((float) d18)) * 100.0f);
            }
            obj3.f36163i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f36164j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i26 != 0 && abs2 != 0.0f) {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb13 = new StringBuilder();
                if (i26 <= 0) {
                    str6 = "";
                } else {
                    str6 = str3;
                }
                sb13.append(str6);
                sb13.append(AndroidUtilities.formatWholeNumber(i26, 0));
                String sb14 = sb13.toString();
                obj3.f36165k = sb14;
            } else {
                obj3.f36165k = "";
            }
            if (i26 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.f36166l = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f36167m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f36168n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i27 != 0 && abs3 != 0.0f) {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb15 = new StringBuilder();
                if (i27 <= 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                sb15.append(str5);
                sb15.append(AndroidUtilities.formatWholeNumber(i27, 0));
                String sb16 = sb15.toString();
                obj3.f36169o = sb16;
            } else {
                obj3.f36169o = "";
            }
            if (i27 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f36170p = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.f36160e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f36161f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i28 != 0 && abs4 != 0.0f) {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb17 = new StringBuilder();
                if (i28 <= 0) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                sb17.append(str4);
                sb17.append(AndroidUtilities.formatWholeNumber(i28, 0));
                String sb18 = sb17.toString();
                obj3.f36162g = sb18;
            } else {
                obj3.f36162g = "";
            }
            if (i28 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.h = z12;
            ha1Var.D = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            ha1Var.f37421c0 = tL_statsDateRangeDays2.max_date * 1000;
            ha1Var.f37422d0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f35107a = aa1.a(tL_statsGroupTopPoster.user_id, arrayList14);
                    StringBuilder sb19 = new StringBuilder();
                    int i30 = tL_statsGroupTopPoster.messages;
                    if (i30 > 0) {
                        sb19.append(LocaleController.formatPluralString("messages", i30, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb19.length() > 0) {
                            sb19.append(", ");
                        }
                        sb19.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    obj4.f35108b = sb19.toString();
                    if (arrayList2.size() < 10) {
                        arrayList3 = arrayList2;
                        arrayList3.add(obj4);
                    } else {
                        arrayList3 = arrayList2;
                    }
                    ArrayList arrayList15 = arrayList;
                    arrayList15.add(obj4);
                    i29++;
                    arrayList2 = arrayList3;
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
                    ArrayList arrayList19 = ha1Var.N;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f35107a = aa1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
                    StringBuilder sb20 = new StringBuilder();
                    int i32 = tL_statsGroupTopAdmin.deleted;
                    if (i32 > 0) {
                        sb20.append(LocaleController.formatPluralString("Deletions", i32, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb20.length() > 0) {
                            sb20.append(", ");
                        }
                        sb20.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    obj5.f35108b = sb20.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = ha1Var.M;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f35107a = aa1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f35108b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f35108b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(ha1Var) {
                public final ha1 f35099b;

                {
                    this.f35099b = ha1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            ha1 ha1Var2 = this.f35099b;
                            ha1Var2.getClass();
                            t91[] t91VarArr22 = t91VarArr2;
                            ha1Var2.d = t91VarArr22[0];
                            ha1Var2.E = t91VarArr22[1];
                            ha1Var2.F = t91VarArr22[2];
                            ha1Var2.G = t91VarArr22[3];
                            ha1Var2.H = t91VarArr22[4];
                            ha1Var2.I = t91VarArr22[5];
                            ha1Var2.f37423e = t91VarArr22[6];
                            ha1Var2.J = t91VarArr22[7];
                            ha1Var2.g0(t91VarArr22);
                            return;
                        default:
                            ha1 ha1Var3 = this.f35099b;
                            ha1Var3.getClass();
                            t91[] t91VarArr3 = t91VarArr2;
                            ha1Var3.f37438r = t91VarArr3[0];
                            ha1Var3.h = t91VarArr3[1];
                            ha1Var3.f37423e = t91VarArr3[2];
                            ha1Var3.f37433n = t91VarArr3[3];
                            ha1Var3.d = t91VarArr3[4];
                            ha1Var3.f37440s = t91VarArr3[5];
                            ha1Var3.v = t91VarArr3[6];
                            ha1Var3.f37445w = t91VarArr3[7];
                            ha1Var3.f37447x = t91VarArr3[8];
                            ha1Var3.f37449y = t91VarArr3[9];
                            ha1Var3.B = t91VarArr3[10];
                            ha1Var3.C = t91VarArr3[11];
                            ha1Var3.g0(t91VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(ha1 ha1Var) {
        float f10;
        RectF rectF = ha1Var.G0;
        og.e eVar = ha1Var.f37451z0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null && ha1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (ha1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            ha1Var.F0.set(0.0f, -dp, ha1Var.fragmentView.getMeasuredWidth(), ha1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), ha1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            eVar.g(2, ha1Var.E0);
            eVar.e(ha1Var.D0, ha1Var.fragmentView.getMeasuredWidth(), ha1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(ha1 ha1Var) {
        View currentView = ha1Var.f37426f0.getCurrentView();
        ac acVar = ha1Var.f37427g0;
        if (currentView == acVar) {
            ha1Var.actionBar.setAdaptiveBackground(acVar.C);
            return;
        }
        ke keVar = ha1Var.f37428h0;
        if (currentView == keVar) {
            ha1Var.actionBar.setAdaptiveBackground(keVar.X0);
        } else {
            ha1Var.actionBar.setAdaptiveBackground(ha1Var.P);
        }
    }

    public static void Z(ha1 ha1Var) {
        ga1 ga1Var = ha1Var.W;
        if (ga1Var != null) {
            ga1Var.f37145b = true;
        }
        int childCount = ha1Var.P.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ha1Var.P.getChildAt(i10);
            if (childAt instanceof s91) {
                ((s91) childAt).f40868b.f49569q0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.p2 d0(TLRPC.Chat chat, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f20843id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z4);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20843id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new ha1(bundle);
        }
        return new y5(-chat.f20843id);
    }

    public static xf.b e0(JSONObject jSONObject, int i10, boolean z4) {
        if (i10 == 0) {
            return new xf.b(jSONObject);
        }
        if (i10 == 1) {
            return new xf.b(jSONObject);
        }
        if (i10 == 2) {
            ?? bVar = new xf.b(jSONObject);
            int length = ((xf.a) bVar.d.get(0)).f50539a.length;
            int size = bVar.d.size();
            bVar.f50556l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f50556l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f50556l;
                    jArr[i11] = jArr[i11] + ((xf.a) bVar.d.get(i12)).f50539a[i11];
                }
            }
            bVar.f50557m = new SegmentTree(bVar.f50556l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new xf.b(jSONObject);
            if (z4) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f50546a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j11 = ((xf.a) bVar2.d.get(i13)).f50539a[i14];
                        jArr2[i13] = jArr2[i13] + j11;
                        if (j11 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j10 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j10 < 0.01d && iArr[i15] > bVar2.f50546a.length / 2.0f) {
                        arrayList.add((xf.a) bVar2.d.get(i15));
                    }
                }
                int size2 = arrayList.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    bVar2.d.remove((xf.a) obj);
                }
            }
            int length3 = ((xf.a) bVar2.d.get(0)).f50539a.length;
            int size3 = bVar2.d.size();
            bVar2.f50558l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f50558l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f50558l;
                    jArr3[i17] = jArr3[i17] + ((xf.a) bVar2.d.get(i18)).f50539a[i17];
                }
            }
            new SegmentTree(bVar2.f50558l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static t91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z4) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        t91 t91Var = new t91(str, i10);
        t91Var.f41552m = z4;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                xf.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z4);
                t91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                t91Var.f41547g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f50546a) == null || jArr2.length < 2) {
                    t91Var.f41551l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f50546a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    t91Var.f41545e = new xf.e(e02, j10);
                    t91Var.f41544c = j10;
                    return t91Var;
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            t91Var.f41546f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return t91Var;
    }

    public static void k0(t91 t91Var, ArrayList arrayList, org.telegram.ui.ActionBar.l6 l6Var) {
        xf.b bVar;
        int i10;
        if (t91Var != null && (bVar = t91Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                xf.a aVar = (xf.a) obj;
                int i12 = aVar.f50544g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.k6.c1(i12)) {
                        int i13 = aVar.f50544g;
                        if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                            i10 = aVar.f50545i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.k6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.k6.nl[aVar.f50544g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, aVar.f50544g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof s91) {
            ((s91) view).d();
        } else if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false)), org.telegram.ui.ActionBar.k6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21624b7), 0, 0);
            pqVar.f30173w = true;
            view.setBackground(pqVar);
        } else if (view instanceof yf.c) {
            ((yf.c) view).a();
        } else if (view instanceof ba1) {
            int i10 = ba1.d;
            ((ba1) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        yg0 yg0Var = this.f37430j0;
        if (yg0Var != null) {
            yg0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f37420c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        i91 i91Var = this.P;
        if (i91Var != null) {
            i91Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ac acVar = this.f37427g0;
        if (acVar != null) {
            acVar.C.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ke keVar = this.f37428h0;
        if (keVar != null) {
            keVar.X0.setPadding(0, currentActionBarHeight, 0, i13);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override
    public final View createView(Context context) {
        boolean z4;
        boolean z10;
        FrameLayout frameLayout;
        boolean z11;
        int i10;
        float f10;
        String str;
        boolean z12;
        ha1 ha1Var = this;
        ha1Var.X = new wf.f(null);
        MessagesController messagesController = MessagesController.getInstance(ha1Var.currentAccount);
        long j10 = ha1Var.f37418b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(ha1Var.currentAccount).getChatFull(j10);
        if (chatFull != null && chatFull.can_view_stats) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean isBoostSupported = ChatObject.isBoostSupported(chat);
        if (chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList(3);
        if (z4) {
            arrayList.add(ch.b.b(context, ha1Var.resourceProvider, ch.a.F, R.string.Statistics));
        }
        arrayList.add(ch.b.b(context, ha1Var.resourceProvider, ch.a.BOOSTS, R.string.Boosts));
        if (z10) {
            arrayList.add(ch.b.b(context, ha1Var.resourceProvider, ch.a.MONETIZATION, R.string.Monetization));
        }
        ha1Var.f37431k0 = (ch.b[]) arrayList.toArray(new ch.b[0]);
        yg0 yg0Var = new yg0(context, ha1Var.resourceProvider);
        ha1Var.f37430j0 = yg0Var;
        yg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            ch.b[] bVarArr = ha1Var.f37431k0;
            if (i11 >= bVarArr.length) {
                break;
            }
            ch.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new mh.x0(ha1Var, i11, 22));
            ha1Var.f37430j0.addView(ha1Var.f37431k0[i11]);
            ha1Var.f37430j0.i(bVar, true, false);
            i11++;
        }
        ha1Var.f37426f0 = new ek(ha1Var, ha1Var.getParentActivity(), 4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            ha1Var.f37427g0 = new ac(ha1Var, -j10, ha1Var.getResourceProvider());
        }
        if (z10) {
            Activity parentActivity = ha1Var.getParentActivity();
            int i12 = ha1Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z12 = true;
            } else {
                z12 = false;
            }
            frameLayout = frameLayout2;
            ke keVar = new ke(parentActivity, this, i12, j11, resourceProvider, z12, chatFull.can_view_stars_revenue);
            ha1Var = this;
            ha1Var.f37428h0 = keVar;
            keVar.setActionBar(ha1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z13 = z4;
        FrameLayout frameLayout3 = frameLayout;
        ha1Var.f37426f0.setAdapter(new h91(ha1Var, z13, isBoostSupported, z10, frameLayout3));
        boolean z14 = ha1Var.f37429i0;
        if (isBoostSupported && !z14) {
            z11 = true;
        } else {
            z11 = false;
        }
        ha1Var.f37420c = z11;
        if (z11 && ha1Var.f37417a0) {
            ha1Var.f37426f0.setPosition(z13 ? 1 : 0);
        } else if (z11 && ha1Var.f37419b0) {
            ek ekVar = ha1Var.f37426f0;
            if (!z14 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            ekVar.setPosition((z13 ? 1 : 0) + i10);
        }
        ha1Var.m0(ha1Var.f37426f0.getCurrentPosition(), false);
        lh.j4 j4Var = new lh.j4(ha1Var, ha1Var.getParentActivity(), 9);
        ha1Var.actionBar.setDrawBlurBackground(j4Var);
        j4Var.setBackgroundColor(ha1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21605a7));
        vg.i iVar = new vg.i(j4Var);
        og.a aVar = ha1Var.C0;
        aVar.d = iVar;
        aVar.f16754e = j4Var;
        j4Var.addView(ha1Var.f37426f0, k7.c6.g());
        j4Var.addView(ha1Var.actionBar);
        if (ha1Var.f37420c) {
            j4Var.addView(ha1Var.f37430j0, k7.c6.e(344, 72, 81));
            ha1Var.setBulletinDelegate(new hg.w(11));
        }
        ha1Var.fragmentView = j4Var;
        i91 i91Var = new i91(ha1Var, context);
        ha1Var.P = i91Var;
        i91Var.setSections(true);
        ha1Var.P.setClipToPadding(false);
        i91 i91Var2 = ha1Var.P;
        Objects.requireNonNull(i91Var2);
        ha1Var.Q = new og.k(i91Var2, j4Var, new us(i91Var2, 1));
        ac acVar = ha1Var.f37427g0;
        if (acVar != null) {
            org.telegram.ui.Components.tl0 tl0Var = acVar.C;
            Objects.requireNonNull(tl0Var);
            acVar.D = new og.k(tl0Var, j4Var, new us(tl0Var, 0));
            ha1Var.f37427g0.C.j(new g91(ha1Var, 1));
        }
        ke keVar2 = ha1Var.f37428h0;
        if (keVar2 != null) {
            org.telegram.ui.Components.i61 i61Var = keVar2.X0;
            Objects.requireNonNull(i61Var);
            keVar2.Y0 = new og.k(i61Var, j4Var, new x8(i61Var, 0));
            ha1Var.f37428h0.X0.j(new g91(ha1Var, 2));
        }
        ha1Var.D0 = new e91(ha1Var, j4Var);
        ha1Var.P.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        ha1Var.Y = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        ha1Var.T = imageView;
        imageView.setAutoRepeat(true);
        ha1Var.T.f(R.raw.statistic_preload, 120, 120, null);
        ha1Var.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.k6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i13, false));
        textView.setTag(Integer.valueOf(i13));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        textView2.setTag(Integer.valueOf(i14));
        org.telegram.messenger.y3.r(R.string.LoadingStatsDescription, textView2, 1);
        ha1Var.Y.addView(ha1Var.T, k7.c6.t(120, 120, 1, 0, 0, 0, 20));
        ha1Var.Y.addView(textView, k7.c6.t(-2, -2, 1, 0, 0, 0, 10));
        ha1Var.Y.addView(textView2, k7.c6.q(-2, -2, 1));
        frameLayout3.addView(ha1Var.Y, k7.c6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (ha1Var.U == null) {
            ha1Var.U = new m91(ha1Var);
        }
        ha1Var.P.setAdapter(ha1Var.U);
        f2.j0 j0Var = new f2.j0();
        ha1Var.R = j0Var;
        ha1Var.P.setLayoutManager(j0Var);
        ha1Var.V = new f2.l();
        ha1Var.P.setItemAnimator(null);
        ha1Var.P.j(new g91(ha1Var, 0));
        ha1Var.P.setOnItemClickListener(new r21(ha1Var, 5));
        ha1Var.P.setOnItemLongClickListener(new kl0(ha1Var, 18));
        frameLayout3.addView(ha1Var.P);
        org.telegram.ui.Components.bo boVar = new org.telegram.ui.Components.bo(context, null, false, null);
        ha1Var.O = boVar;
        boVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        ha1Var.O.getAvatarImageView().setScaleX(0.9f);
        ha1Var.O.getAvatarImageView().setScaleY(0.9f);
        ha1Var.O.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = ha1Var.actionBar;
        org.telegram.ui.Components.bo boVar2 = ha1Var.O;
        if (!ha1Var.inPreviewMode) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(boVar2, 0, k7.c6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = ha1Var.getMessagesController().getChat(Long.valueOf(j10));
        ha1Var.O.setChatAvatar(chat2);
        org.telegram.ui.Components.bo boVar3 = ha1Var.O;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        boVar3.setTitle(str);
        org.telegram.ui.Components.bo boVar4 = ha1Var.O;
        if (boVar4.getSubtitleTextView() != null) {
            boVar4.getSubtitleTextView().setVisibility(8);
        }
        yh.z(false, ha1Var.actionBar);
        ha1Var.actionBar.setActionBarMenuOnItemClick(new ll0(ha1Var, 18));
        ha1Var.O.i(org.telegram.ui.ActionBar.k6.w0(null, i13, false), org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        ha1Var.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i13, false), false);
        ha1Var.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i13, false), true);
        ha1Var.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22055z8, false), false);
        ha1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
        boolean z15 = ha1Var.f37443u0;
        z5 z5Var = ha1Var.f37450y0;
        if (z15) {
            ha1Var.Y.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(z5Var, 500L);
            ha1Var.Y.setVisibility(0);
            ha1Var.P.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            ha1Var.Y.setVisibility(8);
            ha1Var.P.setVisibility(0);
        }
        qg.b c3 = aVar.c(ha1Var.f37430j0, sg.b.f(ha1Var.resourceProvider), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.666f));
        ha1Var.f37430j0.setBackground(c3);
        ha1Var.c0();
        ha1Var.f37444v0 = new u91(ha1Var.U, ha1Var.R);
        return ha1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.p2 p2Var2;
        org.telegram.ui.ActionBar.p2 p2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((oh.l6) objArr[0]) == this.f37446w0) {
                j0();
                o0();
                if (this.U != null) {
                    this.P.setItemAnimator(null);
                    this.f37444v0.f();
                }
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() != null) {
                TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                List fragmentStack = getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    p2Var = (org.telegram.ui.ActionBar.p2) yh.j(2, fragmentStack);
                } else {
                    p2Var = null;
                }
                if (p2Var instanceof po) {
                    ((ActionBarLayout) getParentLayout()).a0(p2Var, false);
                }
                List fragmentStack2 = getParentLayout().getFragmentStack();
                if (fragmentStack2.size() >= 2) {
                    p2Var2 = (org.telegram.ui.ActionBar.p2) yh.j(2, fragmentStack2);
                } else {
                    p2Var2 = null;
                }
                if (booleanValue) {
                    if (fragmentStack2.size() >= 3) {
                        p2Var3 = (org.telegram.ui.ActionBar.p2) yh.j(3, fragmentStack2);
                    }
                    if (p2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) getParentLayout()).a0(p2Var2, false);
                    }
                    finishFragment();
                    if (p2Var3 instanceof xn) {
                        hg.r.f(p2Var3, chat, true);
                        return;
                    }
                    return;
                }
                finishFragment();
                if (p2Var2 instanceof ProfileActivity) {
                    hg.r.f(p2Var2, chat, false);
                }
            }
        } else if (i10 == NotificationCenter.messagesDidLoad) {
            if (((Integer) objArr[10]).intValue() == this.classGuid) {
                ArrayList arrayList2 = (ArrayList) objArr[2];
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i13 = 0;
                while (true) {
                    arrayList = this.f37435o0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.m0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((ea1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((ea1) arrayList.get(i14));
                        } else {
                            ((ea1) arrayList.get(i14)).f36456b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f37436p0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    ea1 ea1Var = (ea1) arrayList.get(i12);
                    if (ea1Var.f36456b == null) {
                        this.f37432l0 = ea1Var.b();
                        break;
                    } else {
                        arrayList4.add(ea1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.U != null) {
                    this.P.setItemAnimator(null);
                    this.f37444v0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20844id == this.f37418b && this.f37416a == null) {
                this.f37416a = chatFull;
                i0();
            }
        }
    }

    public final void g0(t91[] t91VarArr) {
        m91 m91Var = this.U;
        if (m91Var != null) {
            m91Var.E();
            this.P.setItemAnimator(null);
            this.U.l();
        }
        this.f37443u0 = false;
        LinearLayout linearLayout = this.Y;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.f37450y0);
            this.Y.animate().alpha(0.0f).setDuration(230L).setListener(new ns0(this, 20));
            this.P.setVisibility(0);
            this.P.setAlpha(0.0f);
            this.P.animate().alpha(1.0f).setDuration(230L).start();
            for (t91 t91Var : t91VarArr) {
                if (t91Var != null && t91Var.d == null && t91Var.f41546f != null) {
                    t91Var.a(this.currentAccount, this.classGuid, this.f37416a.stats_dc, new org.telegram.ui.Components.t51(1, this, t91Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.l5 l5Var;
        t91 t91Var;
        t91 t91Var2;
        ey0 ey0Var = new ey0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21605a7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{yf.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f21731h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f21659d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f22053z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, ey0Var, org.telegram.ui.ActionBar.k6.f22055z8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f21624b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.f22017x6));
        int i13 = org.telegram.ui.ActionBar.k6.f21876p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, i13));
        org.telegram.ui.Components.bo boVar = this.O;
        if (boVar != null) {
            l5Var = boVar.getTitleTextView();
        } else {
            l5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(l5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.Oi));
        org.telegram.ui.Components.bo boVar2 = this.O;
        if (boVar2 != null) {
            view2 = boVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.k6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, ey0Var, org.telegram.ui.ActionBar.k6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21821m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21961u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21979v6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.Z) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    t91Var2 = this.d;
                } else if (i14 == 1) {
                    t91Var2 = this.E;
                } else if (i14 == 2) {
                    t91Var2 = this.F;
                } else if (i14 == 3) {
                    t91Var2 = this.G;
                } else if (i14 == 4) {
                    t91Var2 = this.H;
                } else {
                    t91Var2 = this.I;
                }
                k0(t91Var2, arrayList, ey0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    t91Var = this.d;
                } else if (i15 == 1) {
                    t91Var = this.h;
                } else if (i15 == 2) {
                    t91Var = this.f37433n;
                } else if (i15 == 3) {
                    t91Var = this.f37438r;
                } else if (i15 == 4) {
                    t91Var = this.f37440s;
                } else if (i15 == 5) {
                    t91Var = this.v;
                } else if (i15 == 6) {
                    t91Var = this.f37447x;
                } else if (i15 == 7) {
                    t91Var = this.f37423e;
                } else if (i15 == 8) {
                    t91Var = this.f37445w;
                } else if (i15 == 9) {
                    t91Var = this.f37449y;
                } else if (i15 == 10) {
                    t91Var = this.B;
                } else {
                    t91Var = this.C;
                }
                k0(t91Var, arrayList, ey0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f20881id = new ArrayList<>();
        ArrayList arrayList = this.f37435o0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.m0.get(this.f37432l0); i11 < size; i11++) {
            if (((ea1) arrayList.get(i11)).f36456b == null) {
                tL_channels_getMessages.f20881id.add(Integer.valueOf(((ea1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f37418b);
        this.f37442t0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new d91(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f37429i0) {
            return;
        }
        boolean z4 = this.Z;
        long j10 = this.f37418b;
        if (z4) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new d91(this, 1), null, null, 0, this.f37416a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false)) <= 0.699999988079071d) {
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
        ek ekVar = this.f37426f0;
        if (ekVar != null && (ekVar.f28985b != 0 || ekVar.f28986c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f37439r0;
        arrayList.clear();
        ArrayList arrayList2 = this.f37437q0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ea1 ea1Var = (ea1) obj;
            MessageObject f10 = this.f37446w0.f(ea1Var.b());
            if (f10 != null) {
                ea1Var.f36456b = f10;
                arrayList.add(ea1Var);
            }
        }
        this.f37434n0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z4) {
        boolean z10;
        int i11 = 0;
        while (true) {
            ch.b[] bVarArr = this.f37431k0;
            if (i11 < bVarArr.length) {
                ch.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar.e(z10, z4);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void n0(float f10, boolean z4) {
        for (int i10 = 0; i10 < this.f37431k0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            ch.b bVar = this.f37431k0[i10];
            bVar.G = max;
            bVar.F = z4;
            bVar.invalidate();
        }
        this.f37430j0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f37441s0;
        arrayList.clear();
        arrayList.addAll(this.f37436p0);
        arrayList.addAll(this.f37439r0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        oh.t6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f37418b;
        oh.l6 A = storiesController.A(-j10, 2, -1, true);
        this.f37446w0 = A;
        if (A != null) {
            this.f37448x0 = A.o();
        }
        if (this.f37416a != null) {
            i0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(j10, this.classGuid, true);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesListUpdated);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.f37424e0;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
            d2VarArr[0] = null;
        }
        oh.l6 l6Var = this.f37446w0;
        if (l6Var != null) {
            l6Var.z(this.f37448x0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
