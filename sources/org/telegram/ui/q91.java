package org.telegram.ui;

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

public final class q91 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public c91 A;
    public final og.d A0;
    public c91 B;
    public final jg.a B0;
    public m91 C;
    public n81 C0;
    public c91 D;
    public final ArrayList D0;
    public c91 E;
    public final RectF E0;
    public c91 F;
    public final RectF F0;
    public c91 G;
    public c91 H;
    public c91 I;
    public final ArrayList J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public org.telegram.ui.Components.rn N;
    public r81 O;
    public jg.k P;
    public f2.k0 Q;
    public final LruCache R;
    public org.telegram.ui.Components.ri0 S;
    public v81 T;
    public o81 U;
    public p91 V;
    public rf.f W;
    public LinearLayout X;
    public final boolean Y;
    public final boolean Z;

    public TLRPC.ChatFull f41549a;

    public final boolean f41550a0;

    public final long f41551b;

    public long f41552b0;

    public boolean f41553c;

    public long f41554c0;
    public c91 d;

    public final org.telegram.ui.ActionBar.b2[] f41555d0;

    public c91 f41556e;

    public lh.h1 f41557e0;

    public l91 f41558f;

    public yb f41559f0;

    public fe f41560g0;
    public c91 h;

    public final boolean f41561h0;

    public sg0 f41562i0;

    public xg.b[] f41563j0;

    public int f41564k0;

    public final SparseIntArray f41565l0;
    public final SparseIntArray m0;

    public c91 f41566n;

    public final ArrayList f41567n0;

    public final ArrayList f41568o0;

    public final ArrayList f41569p0;

    public final ArrayList f41570q0;

    public c91 f41571r;

    public final ArrayList f41572r0;

    public c91 f41573s;

    public boolean f41574s0;

    public boolean f41575t0;

    public d91 f41576u0;
    public c91 v;

    public jh.j6 f41577v0;

    public c91 f41578w;

    public int f41579w0;

    public c91 f41580x;

    public final w5 f41581x0;

    public c91 f41582y;

    public final jg.e f41583y0;

    public final og.d f41584z0;

    public q91(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.R = new LruCache(50);
        this.f41555d0 = new org.telegram.ui.ActionBar.b2[1];
        this.f41564k0 = -1;
        this.f41565l0 = new SparseIntArray();
        this.m0 = new SparseIntArray();
        this.f41567n0 = new ArrayList();
        this.f41568o0 = new ArrayList();
        this.f41569p0 = new ArrayList();
        this.f41570q0 = new ArrayList();
        this.f41572r0 = new ArrayList();
        this.f41575t0 = true;
        this.f41581x0 = new w5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.D0 = arrayList;
        RectF rectF = new RectF();
        this.E0 = rectF;
        RectF rectF2 = new RectF();
        this.F0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.f41551b = j10;
        this.Y = bundle.getBoolean("is_megagroup", false);
        this.Z = bundle.getBoolean("start_from_boosts", false);
        this.f41550a0 = bundle.getBoolean("start_from_monetization", false);
        this.f41561h0 = bundle.getBoolean("only_boosts", false);
        this.f41549a = getMessagesController().getChatFull(j10);
        og.c cVar = new og.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        if (i10 < 31) {
            this.f41583y0 = null;
            this.f41584z0 = null;
            this.A0 = null;
            this.B0 = new jg.a(cVar);
            return;
        }
        this.f41583y0 = new jg.e(false);
        this.f41584z0 = new og.d(null);
        og.d dVar = new og.d(null);
        this.A0 = dVar;
        jg.a aVar = new jg.a(dVar);
        this.B0 = aVar;
        aVar.f12944f = LiteMode.isEnabled(262144);
    }

    public static void U(q91 q91Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(q91Var.currentAccount, arrayList2.get(i10), false, true));
            }
            q91Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new k81(q91Var, arrayList, 0));
    }

    public static void V(final q91 q91Var, TLObject tLObject) {
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = q91Var.J;
        ArrayList arrayList4 = q91Var.K;
        ArrayList arrayList5 = q91Var.f41567n0;
        String str3 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str2 = "+";
            final c91[] c91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            c91 c91Var = c91VarArr[2];
            if (c91Var != null) {
                c91Var.f37032n = true;
            }
            l91 l91Var = new l91();
            com.google.firebase.messaging.t tVarA = l91.a(tL_broadcastStats.reactions_per_post);
            l91Var.f40016o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            l91Var.f40017p = (String) tVarA.f4619b;
            l91Var.f40018q = (String) tVarA.f4621e;
            l91Var.f40019r = ((Boolean) tVarA.f4620c).booleanValue();
            l91Var.f40020s = ((Boolean) tVarA.d).booleanValue();
            com.google.firebase.messaging.t tVarA2 = l91.a(tL_broadcastStats.reactions_per_story);
            l91Var.f40021t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            l91Var.f40022u = (String) tVarA2.f4619b;
            l91Var.v = (String) tVarA2.f4621e;
            l91Var.f40023w = ((Boolean) tVarA2.f4620c).booleanValue();
            l91Var.f40024x = ((Boolean) tVarA2.d).booleanValue();
            com.google.firebase.messaging.t tVarA3 = l91.a(tL_broadcastStats.views_per_story);
            l91Var.f40025y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            l91Var.f40026z = (String) tVarA3.f4619b;
            l91Var.A = (String) tVarA3.f4621e;
            l91Var.B = ((Boolean) tVarA3.f4620c).booleanValue();
            l91Var.C = ((Boolean) tVarA3.d).booleanValue();
            com.google.firebase.messaging.t tVarA4 = l91.a(tL_broadcastStats.shares_per_story);
            l91Var.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            l91Var.E = (String) tVarA4.f4619b;
            l91Var.F = (String) tVarA4.f4621e;
            l91Var.G = ((Boolean) tVarA4.f4620c).booleanValue();
            l91Var.H = ((Boolean) tVarA4.d).booleanValue();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev = tL_broadcastStats.followers;
            double d = tL_statsAbsValueAndPrev.current;
            double d10 = tL_statsAbsValueAndPrev.previous;
            ArrayList arrayList6 = arrayList5;
            int i10 = (int) (d - d10);
            float fAbs = d10 == 0.0d ? 0.0f : Math.abs((i10 / ((float) d10)) * 100.0f);
            l91Var.f40004a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            l91Var.f40005b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i10 == 0 || fAbs == 0.0f) {
                l91Var.f40006c = "";
            } else {
                int i11 = (int) fAbs;
                if (fAbs == i11) {
                    Locale locale = Locale.ENGLISH;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10 > 0 ? str2 : "");
                    sb2.append(AndroidUtilities.formatWholeNumber(i10, 0));
                    l91Var.f40006c = sb2.toString() + " (" + i11 + "%)";
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i10 > 0 ? str2 : "");
                    sb3.append(AndroidUtilities.formatWholeNumber(i10, 0));
                    l91Var.f40006c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(fAbs), "%");
                }
            }
            l91Var.d = i10 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev2 = tL_broadcastStats.shares_per_post;
            double d11 = tL_statsAbsValueAndPrev2.current;
            double d12 = tL_statsAbsValueAndPrev2.previous;
            int i12 = (int) (d11 - d12);
            float fAbs2 = d12 == 0.0d ? 0.0f : Math.abs((i12 / ((float) d12)) * 100.0f);
            l91Var.f40010i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            l91Var.f40011j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
            if (i12 == 0 || fAbs2 == 0.0f) {
                l91Var.f40012k = "";
            } else {
                int i13 = (int) fAbs2;
                if (fAbs2 == i13) {
                    Locale locale3 = Locale.ENGLISH;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i12 > 0 ? str2 : "");
                    sb4.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    l91Var.f40012k = sb4.toString() + " (" + i13 + "%)";
                } else {
                    Locale locale4 = Locale.ENGLISH;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(i12 > 0 ? str2 : "");
                    sb5.append(AndroidUtilities.formatWholeNumber(i12, 0));
                    l91Var.f40012k = String.format(locale4, "%s (%.1f%s)", sb5.toString(), Float.valueOf(fAbs2), "%");
                }
            }
            l91Var.f40013l = i12 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i14 = (int) (d13 - d14);
            float fAbs3 = d14 == 0.0d ? 0.0f : Math.abs((i14 / ((float) d14)) * 100.0f);
            l91Var.f40007e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            l91Var.f40008f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
            if (i14 == 0 || fAbs3 == 0.0f) {
                l91Var.f40009g = "";
            } else {
                int i15 = (int) fAbs3;
                if (fAbs3 == i15) {
                    Locale locale5 = Locale.ENGLISH;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i14 > 0 ? str2 : "");
                    sb6.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    l91Var.f40009g = sb6.toString() + " (" + i15 + "%)";
                } else {
                    Locale locale6 = Locale.ENGLISH;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(i14 > 0 ? str2 : "");
                    sb7.append(AndroidUtilities.formatWholeNumber(i14, 0));
                    l91Var.f40009g = String.format(locale6, "%s (%.1f%s)", sb7.toString(), Float.valueOf(fAbs3), "%");
                }
            }
            l91Var.h = i14 >= 0;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            l91Var.f40014m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i16 = (int) f10;
            if (f10 == i16) {
                Locale locale7 = Locale.ENGLISH;
                l91Var.f40015n = s3.c.d(i16, "%");
            } else {
                l91Var.f40015n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            q91Var.f41558f = l91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            q91Var.f41552b0 = ((long) tL_statsDateRangeDays.max_date) * 1000;
            q91Var.f41554c0 = ((long) tL_statsDateRangeDays.min_date) * 1000;
            arrayList6.clear();
            ArrayList arrayList7 = new ArrayList();
            ArrayList<TL_stats.PostInteractionCounters> arrayList8 = tL_broadcastStats.recent_posts_interactions;
            int size = arrayList8.size();
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < size) {
                TL_stats.PostInteractionCounters postInteractionCounters = arrayList8.get(i19);
                int i20 = i19 + 1;
                TL_stats.PostInteractionCounters postInteractionCounters2 = postInteractionCounters;
                ArrayList<TL_stats.PostInteractionCounters> arrayList9 = arrayList8;
                n91 n91Var = new n91();
                n91Var.f40698a = postInteractionCounters2;
                int i21 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList2 = arrayList6;
                    arrayList2.add(n91Var);
                    q91Var.f41565l0.put(n91Var.b(), i17);
                    i17++;
                } else {
                    arrayList2 = arrayList6;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList7.add(Integer.valueOf(n91Var.b()));
                    q91Var.f41569p0.add(n91Var);
                    q91Var.m0.put(n91Var.b(), i18);
                    i18++;
                }
                arrayList8 = arrayList9;
                str3 = str3;
                i19 = i20;
                arrayList6 = arrayList2;
                size = i21;
            }
            ArrayList arrayList10 = arrayList6;
            str = str3;
            AndroidUtilities.runOnUIThread(new k81(q91Var, arrayList7, 1));
            if (arrayList10.size() > 0) {
                q91Var.getMessagesStorage().getMessages(-q91Var.f41551b, 0L, false, arrayList10.size(), ((n91) arrayList10.get(0)).b(), 0, 0, q91Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            final int i22 = 1;
            AndroidUtilities.runOnUIThread(new Runnable(q91Var) {

                public final q91 f39288b;

                {
                    this.f39288b = q91Var;
                }

                @Override
                public final void run() {
                    switch (i22) {
                        case 0:
                            q91 q91Var2 = this.f39288b;
                            q91Var2.getClass();
                            c91[] c91VarArr2 = c91VarArr;
                            q91Var2.d = c91VarArr2[0];
                            q91Var2.D = c91VarArr2[1];
                            q91Var2.E = c91VarArr2[2];
                            q91Var2.F = c91VarArr2[3];
                            q91Var2.G = c91VarArr2[4];
                            q91Var2.H = c91VarArr2[5];
                            q91Var2.f41556e = c91VarArr2[6];
                            q91Var2.I = c91VarArr2[7];
                            q91Var2.g0(c91VarArr2);
                            break;
                        default:
                            q91 q91Var3 = this.f39288b;
                            q91Var3.getClass();
                            c91[] c91VarArr3 = c91VarArr;
                            q91Var3.f41571r = c91VarArr3[0];
                            q91Var3.h = c91VarArr3[1];
                            q91Var3.f41556e = c91VarArr3[2];
                            q91Var3.f41566n = c91VarArr3[3];
                            q91Var3.d = c91VarArr3[4];
                            q91Var3.f41573s = c91VarArr3[5];
                            q91Var3.v = c91VarArr3[6];
                            q91Var3.f41578w = c91VarArr3[7];
                            q91Var3.f41580x = c91VarArr3[8];
                            q91Var3.f41582y = c91VarArr3[9];
                            q91Var3.A = c91VarArr3[10];
                            q91Var3.B = c91VarArr3[11];
                            q91Var3.g0(c91VarArr3);
                            break;
                    }
                }
            });
        } else {
            str = "%";
            str2 = "+";
        }
        if (tLObject instanceof TL_stats.TL_megagroupStats) {
            TL_stats.TL_megagroupStats tL_megagroupStats = (TL_stats.TL_megagroupStats) tLObject;
            final c91[] c91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            c91 c91Var2 = c91VarArr2[6];
            if (c91Var2 != null) {
                c91Var2.f37032n = true;
            }
            c91 c91Var3 = c91VarArr2[7];
            if (c91Var3 != null) {
                c91Var3.f37033o = true;
            }
            m91 m91Var = new m91();
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev4 = tL_megagroupStats.members;
            double d15 = tL_statsAbsValueAndPrev4.current;
            double d16 = tL_statsAbsValueAndPrev4.previous;
            int i23 = (int) (d15 - d16);
            float fAbs4 = d16 == 0.0d ? 0.0f : Math.abs((i23 / ((float) d16)) * 100.0f);
            m91Var.f40406a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            m91Var.f40407b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
            if (i23 == 0 || fAbs4 == 0.0f) {
                m91Var.f40408c = "";
            } else {
                int i24 = (int) fAbs4;
                if (fAbs4 == i24) {
                    Locale locale8 = Locale.ENGLISH;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(i23 > 0 ? str2 : "");
                    sb8.append(AndroidUtilities.formatWholeNumber(i23, 0));
                    m91Var.f40408c = sb8.toString() + " (" + i24 + "%)";
                } else {
                    Locale locale9 = Locale.ENGLISH;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i23 > 0 ? str2 : "");
                    sb9.append(AndroidUtilities.formatWholeNumber(i23, 0));
                    m91Var.f40408c = String.format(locale9, "%s (%.1f%s)", sb9.toString(), Float.valueOf(fAbs4), str);
                }
            }
            m91Var.d = i23 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev5 = tL_megagroupStats.viewers;
            double d17 = tL_statsAbsValueAndPrev5.current;
            double d18 = tL_statsAbsValueAndPrev5.previous;
            int i25 = (int) (d17 - d18);
            float fAbs5 = d18 == 0.0d ? 0.0f : Math.abs((i25 / ((float) d18)) * 100.0f);
            m91Var.f40412i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            m91Var.f40413j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
            if (i25 == 0 || fAbs5 == 0.0f) {
                m91Var.f40414k = "";
            } else {
                Locale locale10 = Locale.ENGLISH;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(i25 > 0 ? str2 : "");
                sb10.append(AndroidUtilities.formatWholeNumber(i25, 0));
                m91Var.f40414k = sb10.toString();
            }
            m91Var.f40415l = i25 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i26 = (int) (d19 - d20);
            float fAbs6 = d20 == 0.0d ? 0.0f : Math.abs((i26 / ((float) d20)) * 100.0f);
            m91Var.f40416m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            m91Var.f40417n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
            if (i26 == 0 || fAbs6 == 0.0f) {
                m91Var.f40418o = "";
            } else {
                Locale locale11 = Locale.ENGLISH;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(i26 > 0 ? str2 : "");
                sb11.append(AndroidUtilities.formatWholeNumber(i26, 0));
                m91Var.f40418o = sb11.toString();
            }
            m91Var.f40419p = i26 >= 0;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i27 = (int) (d21 - d22);
            float fAbs7 = d22 == 0.0d ? 0.0f : Math.abs((i27 / ((float) d22)) * 100.0f);
            m91Var.f40409e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            m91Var.f40410f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
            if (i27 == 0 || fAbs7 == 0.0f) {
                m91Var.f40411g = "";
            } else {
                Locale locale12 = Locale.ENGLISH;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(i27 > 0 ? str2 : "");
                sb12.append(AndroidUtilities.formatWholeNumber(i27, 0));
                m91Var.f40411g = sb12.toString();
            }
            m91Var.h = i27 >= 0;
            q91Var.C = m91Var;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            q91Var.f41552b0 = ((long) tL_statsDateRangeDays2.max_date) * 1000;
            q91Var.f41554c0 = ((long) tL_statsDateRangeDays2.min_date) * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList11 = tL_megagroupStats.top_posters;
            if (arrayList11 != null && !arrayList11.isEmpty()) {
                int i28 = 0;
                while (i28 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i28);
                    ArrayList<TLRPC.User> arrayList12 = tL_megagroupStats.users;
                    j91 j91Var = new j91();
                    j91Var.f39311a = j91.a(tL_statsGroupTopPoster.user_id, arrayList12);
                    StringBuilder sb13 = new StringBuilder();
                    int i29 = tL_statsGroupTopPoster.messages;
                    if (i29 > 0) {
                        sb13.append(LocaleController.formatPluralString("messages", i29, new Object[0]));
                    }
                    if (tL_statsGroupTopPoster.avg_chars > 0) {
                        if (sb13.length() > 0) {
                            sb13.append(", ");
                        }
                        sb13.append(LocaleController.formatString("CharactersPerMessage", R.string.CharactersPerMessage, LocaleController.formatPluralString("Characters", tL_statsGroupTopPoster.avg_chars, new Object[0])));
                    }
                    j91Var.f39312b = sb13.toString();
                    if (arrayList4.size() < 10) {
                        arrayList = arrayList4;
                        arrayList.add(j91Var);
                    } else {
                        arrayList = arrayList4;
                    }
                    ArrayList arrayList13 = arrayList3;
                    arrayList13.add(j91Var);
                    i28++;
                    arrayList4 = arrayList;
                    arrayList3 = arrayList13;
                }
                ArrayList arrayList14 = arrayList3;
                ArrayList arrayList15 = arrayList4;
                if (arrayList14.size() - arrayList15.size() < 2) {
                    arrayList15.clear();
                    arrayList15.addAll(arrayList14);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopAdmin> arrayList16 = tL_megagroupStats.top_admins;
            if (arrayList16 != null && !arrayList16.isEmpty()) {
                for (int i30 = 0; i30 < tL_megagroupStats.top_admins.size(); i30++) {
                    ArrayList arrayList17 = q91Var.M;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i30);
                    ArrayList<TLRPC.User> arrayList18 = tL_megagroupStats.users;
                    j91 j91Var2 = new j91();
                    j91Var2.f39311a = j91.a(tL_statsGroupTopAdmin.user_id, arrayList18);
                    StringBuilder sb14 = new StringBuilder();
                    int i31 = tL_statsGroupTopAdmin.deleted;
                    if (i31 > 0) {
                        sb14.append(LocaleController.formatPluralString("Deletions", i31, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.banned > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Bans", tL_statsGroupTopAdmin.banned, new Object[0]));
                    }
                    if (tL_statsGroupTopAdmin.kicked > 0) {
                        if (sb14.length() > 0) {
                            sb14.append(", ");
                        }
                        sb14.append(LocaleController.formatPluralString("Restrictions", tL_statsGroupTopAdmin.kicked, new Object[0]));
                    }
                    j91Var2.f39312b = sb14.toString();
                    arrayList17.add(j91Var2);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList19 = tL_megagroupStats.top_inviters;
            if (arrayList19 != null && !arrayList19.isEmpty()) {
                for (int i32 = 0; i32 < tL_megagroupStats.top_inviters.size(); i32++) {
                    ArrayList arrayList20 = q91Var.L;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i32);
                    ArrayList<TLRPC.User> arrayList21 = tL_megagroupStats.users;
                    j91 j91Var3 = new j91();
                    j91Var3.f39311a = j91.a(tL_statsGroupTopInviter.user_id, arrayList21);
                    int i33 = tL_statsGroupTopInviter.invitations;
                    if (i33 > 0) {
                        j91Var3.f39312b = LocaleController.formatPluralString("Invitations", i33, new Object[0]);
                    } else {
                        j91Var3.f39312b = "";
                    }
                    arrayList20.add(j91Var3);
                }
            }
            final int i34 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(q91Var) {

                public final q91 f39288b;

                {
                    this.f39288b = q91Var;
                }

                @Override
                public final void run() {
                    switch (i34) {
                        case 0:
                            q91 q91Var2 = this.f39288b;
                            q91Var2.getClass();
                            c91[] c91VarArr3 = c91VarArr2;
                            q91Var2.d = c91VarArr3[0];
                            q91Var2.D = c91VarArr3[1];
                            q91Var2.E = c91VarArr3[2];
                            q91Var2.F = c91VarArr3[3];
                            q91Var2.G = c91VarArr3[4];
                            q91Var2.H = c91VarArr3[5];
                            q91Var2.f41556e = c91VarArr3[6];
                            q91Var2.I = c91VarArr3[7];
                            q91Var2.g0(c91VarArr3);
                            break;
                        default:
                            q91 q91Var3 = this.f39288b;
                            q91Var3.getClass();
                            c91[] c91VarArr4 = c91VarArr2;
                            q91Var3.f41571r = c91VarArr4[0];
                            q91Var3.h = c91VarArr4[1];
                            q91Var3.f41556e = c91VarArr4[2];
                            q91Var3.f41566n = c91VarArr4[3];
                            q91Var3.d = c91VarArr4[4];
                            q91Var3.f41573s = c91VarArr4[5];
                            q91Var3.v = c91VarArr4[6];
                            q91Var3.f41578w = c91VarArr4[7];
                            q91Var3.f41580x = c91VarArr4[8];
                            q91Var3.f41582y = c91VarArr4[9];
                            q91Var3.A = c91VarArr4[10];
                            q91Var3.B = c91VarArr4[11];
                            q91Var3.g0(c91VarArr4);
                            break;
                    }
                }
            });
        }
    }

    public static void W(q91 q91Var) {
        RectF rectF = q91Var.F0;
        jg.e eVar = q91Var.f41583y0;
        if (Build.VERSION.SDK_INT < 31 || eVar == null || q91Var.fragmentView == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (q91Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        q91Var.E0.set(0.0f, -iDp, q91Var.fragmentView.getMeasuredWidth(), q91Var.actionBar.getMeasuredHeight() + iDp);
        rectF.set(0.0f, iDp2, q91Var.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(2, q91Var.D0);
        eVar.e(q91Var.C0, q91Var.fragmentView.getMeasuredWidth(), q91Var.fragmentView.getMeasuredHeight());
    }

    public static void Y(q91 q91Var) {
        View currentView = q91Var.f41557e0.getCurrentView();
        yb ybVar = q91Var.f41559f0;
        if (currentView == ybVar) {
            q91Var.actionBar.setAdaptiveBackground(ybVar.B);
            return;
        }
        fe feVar = q91Var.f41560g0;
        if (currentView == feVar) {
            q91Var.actionBar.setAdaptiveBackground(feVar.W0);
        } else {
            q91Var.actionBar.setAdaptiveBackground(q91Var.O);
        }
    }

    public static void Z(q91 q91Var) {
        p91 p91Var = q91Var.V;
        if (p91Var != null) {
            p91Var.f41305b = true;
        }
        int childCount = q91Var.O.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = q91Var.O.getChildAt(i10);
            if (childAt instanceof b91) {
                ((b91) childAt).f36464b.f46978p0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 d0(TLRPC.Chat chat, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f22380id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22380id);
        return (chatFull == null || !(chatFull.can_view_stats || chatFull.can_view_stars_revenue)) ? new v5(-chat.f22380id) : new q91(bundle);
    }

    public static sf.b e0(JSONObject jSONObject, int i10, boolean z10) {
        if (i10 == 0) {
            return new sf.b(jSONObject);
        }
        if (i10 == 1) {
            return new sf.c(jSONObject);
        }
        if (i10 == 2) {
            sf.d dVar = new sf.d(jSONObject);
            int length = ((sf.a) dVar.d.get(0)).f47874a.length;
            int size = dVar.d.size();
            dVar.f47891l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                dVar.f47891l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = dVar.f47891l;
                    jArr[i11] = jArr[i11] + ((sf.a) dVar.d.get(i12)).f47874a[i11];
                }
            }
            dVar.f47892m = new SegmentTree(dVar.f47891l);
            return dVar;
        }
        if (i10 != 4) {
            return null;
        }
        sf.e eVar = new sf.e(jSONObject);
        if (z10) {
            long[] jArr2 = new long[eVar.d.size()];
            int[] iArr = new int[eVar.d.size()];
            long j10 = 0;
            for (int i13 = 0; i13 < eVar.d.size(); i13++) {
                int length2 = eVar.f47881a.length;
                for (int i14 = 0; i14 < length2; i14++) {
                    long j11 = ((sf.a) eVar.d.get(i13)).f47874a[i14];
                    jArr2[i13] = jArr2[i13] + j11;
                    if (j11 == 0) {
                        iArr[i13] = iArr[i13] + 1;
                    }
                }
                j10 += jArr2[i13];
            }
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < eVar.d.size(); i15++) {
                if (jArr2[i15] / j10 < 0.01d && iArr[i15] > eVar.f47881a.length / 2.0f) {
                    arrayList.add((sf.a) eVar.d.get(i15));
                }
            }
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj = arrayList.get(i16);
                i16++;
                eVar.d.remove((sf.a) obj);
            }
        }
        int length3 = ((sf.a) eVar.d.get(0)).f47874a.length;
        int size3 = eVar.d.size();
        eVar.f47893l = new long[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            eVar.f47893l[i17] = 0;
            for (int i18 = 0; i18 < size3; i18++) {
                long[] jArr3 = eVar.f47893l;
                jArr3[i17] = jArr3[i17] + ((sf.a) eVar.d.get(i18)).f47874a[i17];
            }
        }
        new SegmentTree(eVar.f47893l);
        return eVar;
    }

    public static c91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z10) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        c91 c91Var = new c91(str, i10);
        c91Var.f37031m = z10;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                sf.b bVarE0 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z10);
                c91Var.d = bVarE0;
                if (bVarE0 != null) {
                    bVarE0.h = statsGraph.rate;
                }
                c91Var.f37026g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (bVarE0 == null || (jArr2 = bVarE0.f47881a) == null || jArr2.length < 2) {
                    c91Var.f37030l = true;
                }
                if (i10 == 4 && bVarE0 != null && (jArr = bVarE0.f47881a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    c91Var.f37024e = new sf.e(bVarE0, j10);
                    c91Var.f37023c = j10;
                    return c91Var;
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            c91Var.f37025f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return c91Var;
    }

    public static void k0(c91 c91Var, ArrayList arrayList, org.telegram.ui.ActionBar.h6 h6Var) {
        sf.b bVar;
        if (c91Var == null || (bVar = c91Var.d) == null) {
            return;
        }
        ArrayList arrayList2 = bVar.d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            sf.a aVar = (sf.a) obj;
            int i11 = aVar.f47879g;
            if (i11 >= 0) {
                if (!org.telegram.ui.ActionBar.g6.c1(i11)) {
                    org.telegram.ui.ActionBar.g6.u1(aVar.f47879g, org.telegram.ui.ActionBar.g6.I == org.telegram.ui.ActionBar.g6.J ? aVar.f47880i : aVar.h, false);
                    org.telegram.ui.ActionBar.g6.nl[aVar.f47879g] = aVar.h;
                }
                arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, h6Var, aVar.f47879g));
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof b91) {
            ((b91) view).d();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.w6) {
            org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false)), org.telegram.ui.ActionBar.g6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7), 0, 0);
            dqVar.f27828w = true;
            view.setBackground(dqVar);
            return;
        }
        if (view instanceof tf.c) {
            ((tf.c) view).a();
        } else if (view instanceof k91) {
            int i10 = k91.d;
            ((k91) view).b();
        }
    }

    public final void c0() {
        int i10 = AndroidUtilities.navigationBarHeight;
        int i11 = AndroidUtilities.statusBarHeight;
        sg0 sg0Var = this.f41562i0;
        if (sg0Var != null) {
            sg0Var.setTranslationY(-i10);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
        int iDp = (this.f41553c ? AndroidUtilities.dp(72.0f) : 0) + i10;
        r81 r81Var = this.O;
        if (r81Var != null) {
            r81Var.setPadding(0, currentActionBarHeight, 0, iDp);
        }
        yb ybVar = this.f41559f0;
        if (ybVar != null) {
            ybVar.B.setPadding(0, currentActionBarHeight, 0, iDp);
        }
        fe feVar = this.f41560g0;
        if (feVar != null) {
            feVar.W0.setPadding(0, currentActionBarHeight, 0, iDp);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k kVarCreateActionBar = super.createActionBar(context);
        kVarCreateActionBar.setAddToContainer(false);
        return kVarCreateActionBar;
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        q91 q91Var = this;
        q91Var.W = new rf.f(null);
        MessagesController messagesController = MessagesController.getInstance(q91Var.currentAccount);
        long j10 = q91Var.f41551b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(q91Var.currentAccount).getChatFull(j10);
        boolean z10 = chatFull != null && chatFull.can_view_stats;
        boolean zIsBoostSupported = ChatObject.isBoostSupported(chat);
        boolean z11 = chatFull != null && (chatFull.can_view_revenue || chatFull.can_view_stars_revenue);
        ArrayList arrayList = new ArrayList(3);
        if (z10) {
            arrayList.add(xg.b.b(context, q91Var.resourceProvider, xg.a.E, R.string.Statistics));
        }
        arrayList.add(xg.b.b(context, q91Var.resourceProvider, xg.a.BOOSTS, R.string.Boosts));
        if (z11) {
            arrayList.add(xg.b.b(context, q91Var.resourceProvider, xg.a.MONETIZATION, R.string.Monetization));
        }
        q91Var.f41563j0 = (xg.b[]) arrayList.toArray(new xg.b[0]);
        sg0 sg0Var = new sg0(context, q91Var.resourceProvider);
        q91Var.f41562i0 = sg0Var;
        sg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i10 = 0;
        while (true) {
            xg.b[] bVarArr = q91Var.f41563j0;
            if (i10 >= bVarArr.length) {
                break;
            }
            xg.b bVar = bVarArr[i10];
            bVar.setOnClickListener(new hh.z0(q91Var, i10, 24));
            q91Var.f41562i0.addView(q91Var.f41563j0[i10]);
            q91Var.f41562i0.i(bVar, true, false);
            i10++;
        }
        q91Var.f41557e0 = new lh.h1(q91Var, q91Var.getParentActivity(), 7);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (zIsBoostSupported) {
            q91Var.f41559f0 = new yb(q91Var, -j10, q91Var.getResourceProvider());
        }
        if (z11) {
            frameLayout = frameLayout2;
            fe feVar = new fe(q91Var.getParentActivity(), this, q91Var.currentAccount, -j10, getResourceProvider(), ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue, chatFull.can_view_stars_revenue);
            q91Var = this;
            q91Var.f41560g0 = feVar;
            feVar.setActionBar(q91Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z12 = z10;
        FrameLayout frameLayout3 = frameLayout;
        q91Var.f41557e0.setAdapter(new q81(q91Var, z12, zIsBoostSupported, z11, frameLayout3));
        boolean z13 = q91Var.f41561h0;
        boolean z14 = zIsBoostSupported && !z13;
        q91Var.f41553c = z14;
        if (z14 && q91Var.Z) {
            q91Var.f41557e0.setPosition(z12 ? 1 : 0);
        } else if (z14 && q91Var.f41550a0) {
            q91Var.f41557e0.setPosition((z12 ? 1 : 0) + ((z13 || !zIsBoostSupported) ? 0 : 1));
        }
        q91Var.m0(q91Var.f41557e0.getCurrentPosition(), false);
        gh.q4 q4Var = new gh.q4(q91Var, q91Var.getParentActivity(), 9);
        q91Var.actionBar.setDrawBlurBackground(q4Var);
        q4Var.setBackgroundColor(q91Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        qg.j jVar = new qg.j(q4Var);
        jg.a aVar = q91Var.B0;
        aVar.d = jVar;
        aVar.f12943e = q4Var;
        q4Var.addView(q91Var.f41557e0, h7.z5.g());
        q4Var.addView(q91Var.actionBar);
        if (q91Var.f41553c) {
            q4Var.addView(q91Var.f41562i0, h7.z5.e(344, 72, 81));
            q91Var.setBulletinDelegate(new cg.w(16));
        }
        q91Var.fragmentView = q4Var;
        r81 r81Var = new r81(q91Var, context);
        q91Var.O = r81Var;
        r81Var.setSections(true);
        q91Var.O.setClipToPadding(false);
        r81 r81Var2 = q91Var.O;
        Objects.requireNonNull(r81Var2);
        q91Var.P = new jg.k(r81Var2, q4Var, new os(r81Var2, 1));
        yb ybVar = q91Var.f41559f0;
        if (ybVar != null) {
            org.telegram.ui.Components.zk0 zk0Var = ybVar.B;
            Objects.requireNonNull(zk0Var);
            ybVar.C = new jg.k(zk0Var, q4Var, new os(zk0Var, 0));
            q91Var.f41559f0.B.j(new p81(q91Var, 1));
        }
        fe feVar2 = q91Var.f41560g0;
        if (feVar2 != null) {
            org.telegram.ui.Components.k51 k51Var = feVar2.W0;
            Objects.requireNonNull(k51Var);
            feVar2.X0 = new jg.k(k51Var, q4Var, new v8(k51Var, 0));
            q91Var.f41560g0.W0.j(new p81(q91Var, 2));
        }
        q91Var.C0 = new n81(q91Var, q4Var);
        q91Var.O.p1();
        LinearLayout linearLayout = new LinearLayout(context);
        q91Var.X = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        q91Var.S = ri0Var;
        ri0Var.setAutoRepeat(true);
        q91Var.S.f(R.raw.statistic_preload, 120, 120, null);
        q91Var.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        textView2.setTag(Integer.valueOf(i12));
        org.telegram.messenger.rl.i(R.string.LoadingStatsDescription, textView2, 1);
        q91Var.X.addView(q91Var.S, h7.z5.t(120, 120, 1, 0, 0, 0, 20));
        q91Var.X.addView(textView, h7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        q91Var.X.addView(textView2, h7.z5.q(-2, -2, 1));
        frameLayout3.addView(q91Var.X, h7.z5.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (q91Var.T == null) {
            q91Var.T = new v81(q91Var);
        }
        q91Var.O.setAdapter(q91Var.T);
        f2.k0 k0Var = new f2.k0();
        q91Var.Q = k0Var;
        q91Var.O.setLayoutManager(k0Var);
        q91Var.U = new o81();
        q91Var.O.setItemAnimator(null);
        q91Var.O.j(new p81(q91Var, 0));
        q91Var.O.setOnItemClickListener(new b21(q91Var, 5));
        q91Var.O.setOnItemLongClickListener(new dl0(q91Var, 18));
        frameLayout3.addView(q91Var.O);
        org.telegram.ui.Components.rn rnVar = new org.telegram.ui.Components.rn(context, null, false, null);
        q91Var.N = rnVar;
        rnVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        q91Var.N.getAvatarImageView().setScaleX(0.9f);
        q91Var.N.getAvatarImageView().setScaleY(0.9f);
        q91Var.N.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        q91Var.actionBar.addView(q91Var.N, 0, h7.z5.d(-2, -1.0f, 51, !q91Var.inPreviewMode ? 50.0f : 0.0f, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = q91Var.getMessagesController().getChat(Long.valueOf(j10));
        q91Var.N.setChatAvatar(chat2);
        q91Var.N.setTitle(chat2 == null ? "" : chat2.title);
        org.telegram.ui.Components.rn rnVar2 = q91Var.N;
        if (rnVar2.getSubtitleTextView() != null) {
            rnVar2.getSubtitleTextView().setVisibility(8);
        }
        org.telegram.ui.Cells.pa.x(false, q91Var.actionBar);
        q91Var.actionBar.setActionBarMenuOnItemClick(new pb0(q91Var, 27));
        q91Var.N.i(org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        q91Var.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i11, false), false);
        q91Var.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i11, false), true);
        q91Var.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23443z8, false), false);
        q91Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        boolean z15 = q91Var.f41575t0;
        w5 w5Var = q91Var.f41581x0;
        if (z15) {
            q91Var.X.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(w5Var, 500L);
            q91Var.X.setVisibility(0);
            q91Var.O.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            q91Var.X.setVisibility(8);
            q91Var.O.setVisibility(0);
        }
        lg.d dVarC = aVar.c(q91Var.f41562i0, ng.c.f(q91Var.resourceProvider), false);
        dVarC.p(AndroidUtilities.dp(28.0f));
        dVarC.o(AndroidUtilities.dp(7.666f));
        q91Var.f41562i0.setBackground(dVarC);
        q91Var.c0();
        q91Var.f41576u0 = new d91(q91Var.T, q91Var.Q);
        return q91Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((jh.j6) objArr[0]) == this.f41577v0) {
                j0();
                o0();
                if (this.T != null) {
                    this.O.setItemAnimator(null);
                    this.f41576u0.f();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.boostByChannelCreated) {
            if (getParentLayout() == null) {
                return;
            }
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.size() >= 2 ? (org.telegram.ui.ActionBar.n2) i0.a.j(2, fragmentStack) : null;
            if (n2Var instanceof jo) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.size() >= 2 ? (org.telegram.ui.ActionBar.n2) i0.a.j(2, fragmentStack2) : null;
            if (!zBooleanValue) {
                finishFragment();
                if (n2Var2 instanceof ProfileActivity) {
                    cg.r.f(n2Var2, chat, false);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var3 = fragmentStack2.size() >= 3 ? (org.telegram.ui.ActionBar.n2) i0.a.j(3, fragmentStack2) : null;
            if (n2Var2 instanceof ProfileActivity) {
                ((ActionBarLayout) getParentLayout()).a0(n2Var2, false);
            }
            finishFragment();
            if (n2Var3 instanceof rn) {
                cg.r.f(n2Var3, chat, true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.messagesDidLoad) {
            if (i10 == NotificationCenter.chatInfoDidLoad) {
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                if (chatFull.f22381id == this.f41551b && this.f41549a == null) {
                    this.f41549a = chatFull;
                    i0();
                    return;
                }
                return;
            }
            return;
        }
        if (((Integer) objArr[10]).intValue() == this.classGuid) {
            ArrayList arrayList2 = (ArrayList) objArr[2];
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i12 = 0;
            while (true) {
                arrayList = this.f41567n0;
                if (i12 >= size) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList2.get(i12);
                int i13 = this.f41565l0.get(messageObject.getId(), -1);
                if (i13 >= 0 && ((n91) arrayList.get(i13)).b() == messageObject.getId()) {
                    if (messageObject.deleted) {
                        arrayList3.add((n91) arrayList.get(i13));
                    } else {
                        ((n91) arrayList.get(i13)).f40699b = messageObject;
                    }
                }
                i12++;
            }
            arrayList.removeAll(arrayList3);
            ArrayList arrayList4 = this.f41568o0;
            arrayList4.clear();
            int size2 = arrayList.size();
            for (int i14 = 0; i14 < size2; i14++) {
                n91 n91Var = (n91) arrayList.get(i14);
                if (n91Var.f40699b == null) {
                    this.f41564k0 = n91Var.b();
                    break;
                }
                arrayList4.add(n91Var);
            }
            if (arrayList4.size() < 20) {
                h0();
            }
            o0();
            if (this.T != null) {
                this.O.setItemAnimator(null);
                this.f41576u0.f();
            }
        }
    }

    public final void g0(c91[] c91VarArr) {
        v81 v81Var = this.T;
        if (v81Var != null) {
            v81Var.E();
            this.O.setItemAnimator(null);
            this.T.l();
        }
        this.f41575t0 = false;
        LinearLayout linearLayout = this.X;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f41581x0);
        this.X.animate().alpha(0.0f).setDuration(230L).setListener(new f50(this, 29));
        this.O.setVisibility(0);
        this.O.setAlpha(0.0f);
        this.O.animate().alpha(1.0f).setDuration(230L).start();
        for (c91 c91Var : c91VarArr) {
            if (c91Var != null && c91Var.d == null && c91Var.f37025f != null) {
                c91Var.a(this.currentAccount, this.classGuid, this.f41549a.stats_dc, new org.telegram.ui.Components.x41(1, this, c91Var));
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        c91 c91Var;
        c91 c91Var2;
        sx0 sx0Var = new sx0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 0, new Class[]{tf.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23124h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23441z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, -1, sx0Var, org.telegram.ui.ActionBar.g6.f23443z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.f23406x6));
        int i13 = org.telegram.ui.ActionBar.g6.f23269p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, i13));
        org.telegram.ui.Components.rn rnVar = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.i6(rnVar != null ? rnVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.Oi));
        org.telegram.ui.Components.rn rnVar2 = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.i6(rnVar2 != null ? rnVar2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.g6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23215m6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23357u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23373v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.O, 262144, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.Y) {
            int i14 = 0;
            while (i14 < 6) {
                if (i14 == 0) {
                    c91Var2 = this.d;
                } else if (i14 == 1) {
                    c91Var2 = this.D;
                } else if (i14 == 2) {
                    c91Var2 = this.E;
                } else if (i14 == 3) {
                    c91Var2 = this.F;
                } else {
                    c91Var2 = i14 == 4 ? this.G : this.H;
                }
                k0(c91Var2, arrayList, sx0Var);
                i14++;
            }
        } else {
            int i15 = 0;
            while (i15 < 12) {
                if (i15 == 0) {
                    c91Var = this.d;
                } else if (i15 == 1) {
                    c91Var = this.h;
                } else if (i15 == 2) {
                    c91Var = this.f41566n;
                } else if (i15 == 3) {
                    c91Var = this.f41571r;
                } else if (i15 == 4) {
                    c91Var = this.f41573s;
                } else if (i15 == 5) {
                    c91Var = this.v;
                } else if (i15 == 6) {
                    c91Var = this.f41580x;
                } else if (i15 == 7) {
                    c91Var = this.f41556e;
                } else if (i15 == 8) {
                    c91Var = this.f41578w;
                } else if (i15 == 9) {
                    c91Var = this.f41582y;
                } else {
                    c91Var = i15 == 10 ? this.A : this.B;
                }
                k0(c91Var, arrayList, sx0Var);
                i15++;
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f22418id = new ArrayList<>();
        ArrayList arrayList = this.f41567n0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.f41565l0.get(this.f41564k0); i11 < size; i11++) {
            if (((n91) arrayList.get(i11)).f40699b == null) {
                tL_channels_getMessages.f22418id.add(Integer.valueOf(((n91) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f41551b);
        this.f41574s0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new m81(this, 0));
    }

    public final void i0() {
        TLObject tLObject;
        if (this.f41561h0) {
            return;
        }
        boolean z10 = this.Y;
        long j10 = this.f41551b;
        if (z10) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tLObject = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tLObject = tL_getBroadcastStats;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLObject, new m81(this, 1), null, null, 0, this.f41549a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        lh.h1 h1Var = this.f41557e0;
        if (h1Var == null || (h1Var.f31543b == 0 && h1Var.f31544c == 1.0f)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0() {
        ArrayList arrayList = this.f41570q0;
        arrayList.clear();
        ArrayList arrayList2 = this.f41569p0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            n91 n91Var = (n91) obj;
            MessageObject messageObjectF = this.f41577v0.f(n91Var.b());
            if (messageObjectF != null) {
                n91Var.f40699b = messageObjectF;
                arrayList.add(n91Var);
            }
        }
        this.m0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z10) {
        int i11 = 0;
        while (true) {
            xg.b[] bVarArr = this.f41563j0;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11].e(i11 == i10, z10);
            i11++;
        }
    }

    public final void n0(float f10, boolean z10) {
        for (int i10 = 0; i10 < this.f41563j0.length; i10++) {
            float fMax = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            xg.b bVar = this.f41563j0[i10];
            bVar.F = fMax;
            bVar.E = z10;
            bVar.invalidate();
        }
        this.f41562i0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f41572r0;
        arrayList.clear();
        arrayList.addAll(this.f41568o0);
        arrayList.addAll(this.f41570q0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.w0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        jh.s6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f41551b;
        jh.j6 j6VarA = storiesController.A(-j10, 2, -1, true);
        this.f41577v0 = j6VarA;
        if (j6VarA != null) {
            this.f41579w0 = j6VarA.o();
        }
        if (this.f41549a != null) {
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
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.f41555d0;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
            b2VarArr[0] = null;
        }
        jh.j6 j6Var = this.f41577v0;
        if (j6Var != null) {
            j6Var.z(this.f41579w0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
