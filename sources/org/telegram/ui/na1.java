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
public final class na1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final tg.d A0;
    public z91 B;
    public final tg.d B0;
    public z91 C;
    public final og.a C0;
    public ja1 D;
    public k91 D0;
    public z91 E;
    public final ArrayList E0;
    public z91 F;
    public final RectF F0;
    public z91 G;
    public final RectF G0;
    public z91 H;
    public z91 I;
    public z91 J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public org.telegram.ui.Components.ao O;
    public o91 P;
    public og.k Q;
    public f2.j0 R;
    public final LruCache S;
    public org.telegram.ui.Components.kj0 T;
    public s91 U;
    public l91 V;
    public ma1 W;
    public wf.f X;
    public LinearLayout Y;
    public final boolean Z;
    public TLRPC.ChatFull f39248a;
    public final boolean f39249a0;
    public final long f39250b;
    public final boolean f39251b0;
    public boolean f39252c;
    public long f39253c0;
    public z91 d;
    public long f39254d0;
    public z91 f39255e;
    public final org.telegram.ui.ActionBar.d2[] f39256e0;
    public ia1 f39257f;
    public ek f39258f0;
    public ac f39259g0;
    public z91 h;
    public ke f39260h0;
    public final boolean f39261i0;
    public yg0 f39262j0;
    public ch.b[] f39263k0;
    public int f39264l0;
    public final SparseIntArray m0;
    public z91 f39265n;
    public final SparseIntArray f39266n0;
    public final ArrayList f39267o0;
    public final ArrayList f39268p0;
    public final ArrayList f39269q0;
    public z91 f39270r;
    public final ArrayList f39271r0;
    public z91 f39272s;
    public final ArrayList f39273s0;
    public boolean f39274t0;
    public boolean f39275u0;
    public z91 v;
    public aa1 f39276v0;
    public z91 f39277w;
    public oh.l6 f39278w0;
    public z91 f39279x;
    public int f39280x0;
    public z91 f39281y;
    public final z5 f39282y0;
    public final og.e f39283z0;

    public na1(Bundle bundle) {
        super(bundle);
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.S = new LruCache(50);
        this.f39256e0 = new org.telegram.ui.ActionBar.d2[1];
        this.f39264l0 = -1;
        this.m0 = new SparseIntArray();
        this.f39266n0 = new SparseIntArray();
        this.f39267o0 = new ArrayList();
        this.f39268p0 = new ArrayList();
        this.f39269q0 = new ArrayList();
        this.f39271r0 = new ArrayList();
        this.f39273s0 = new ArrayList();
        this.f39275u0 = true;
        this.f39282y0 = new z5(this, 13);
        ArrayList arrayList = new ArrayList();
        this.E0 = arrayList;
        RectF rectF = new RectF();
        this.F0 = rectF;
        RectF rectF2 = new RectF();
        this.G0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = bundle.getLong("chat_id");
        this.f39250b = j10;
        this.Z = bundle.getBoolean("is_megagroup", false);
        this.f39249a0 = bundle.getBoolean("start_from_boosts", false);
        this.f39251b0 = bundle.getBoolean("start_from_monetization", false);
        this.f39261i0 = bundle.getBoolean("only_boosts", false);
        this.f39248a = getMessagesController().getChatFull(j10);
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f39283z0 = new og.e(false);
            this.A0 = new tg.d(null);
            tg.d dVar = new tg.d(null);
            this.B0 = dVar;
            og.a aVar = new og.a(dVar);
            this.C0 = aVar;
            aVar.f16757f = LiteMode.isEnabled(262144);
            return;
        }
        this.f39283z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = new og.a(cVar);
    }

    public static void U(na1 na1Var, TLObject tLObject) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                arrayList.add(new MessageObject(na1Var.currentAccount, arrayList2.get(i10), false, true));
            }
            na1Var.getMessagesStorage().putMessages(arrayList2, false, true, true, 0, 0, 0L);
        }
        AndroidUtilities.runOnUIThread(new h91(na1Var, arrayList, 0));
    }

    public static void V(na1 na1Var, TLObject tLObject) {
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
        ArrayList arrayList5 = na1Var.K;
        ArrayList arrayList6 = na1Var.L;
        ArrayList arrayList7 = na1Var.f39267o0;
        String str16 = "%";
        if (tLObject instanceof TL_stats.TL_broadcastStats) {
            TL_stats.TL_broadcastStats tL_broadcastStats = (TL_stats.TL_broadcastStats) tLObject;
            str3 = "+";
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            final z91[] z91VarArr = {f0(tL_broadcastStats.iv_interactions_graph, LocaleController.getString("IVInteractionsChartTitle", R.string.IVInteractionsChartTitle), 1, false), f0(tL_broadcastStats.followers_graph, LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle), 0, false), f0(tL_broadcastStats.top_hours_graph, LocaleController.getString("TopHoursChartTitle", R.string.TopHoursChartTitle), 0, false), f0(tL_broadcastStats.interactions_graph, LocaleController.getString("ViewsAndSharesChartTitle", R.string.ViewsAndSharesChartTitle), 1, false), f0(tL_broadcastStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_broadcastStats.views_by_source_graph, LocaleController.getString("ViewsBySourceChartTitle", R.string.ViewsBySourceChartTitle), 2, false), f0(tL_broadcastStats.new_followers_by_source_graph, LocaleController.getString("NewFollowersBySourceChartTitle", R.string.NewFollowersBySourceChartTitle), 2, false), f0(tL_broadcastStats.languages_graph, LocaleController.getString("LanguagesChartTitle", R.string.LanguagesChartTitle), 4, true), f0(tL_broadcastStats.mute_graph, LocaleController.getString("NotificationsChartTitle", R.string.NotificationsChartTitle), 0, false), f0(tL_broadcastStats.reactions_by_emotion_graph, LocaleController.getString("ReactionsByEmotionChartTitle", R.string.ReactionsByEmotionChartTitle), 2, false), f0(tL_broadcastStats.story_interactions_graph, LocaleController.getString("StoryInteractionsChartTitle", R.string.StoryInteractionsChartTitle), 1, false), f0(tL_broadcastStats.story_reactions_by_emotion_graph, LocaleController.getString("StoryReactionsByEmotionChartTitle", R.string.StoryReactionsByEmotionChartTitle), 2, false)};
            z91 z91Var = z91VarArr[2];
            if (z91Var != null) {
                z91Var.f43870n = true;
            }
            ?? obj = new Object();
            sf.f a2 = ia1.a(tL_broadcastStats.reactions_per_post);
            str2 = "TopHoursChartTitle";
            obj.f37606o = LocaleController.getString("ReactionsPerPost", R.string.ReactionsPerPost);
            obj.f37607p = (String) a2.f47351b;
            obj.f37608q = (String) a2.f47352c;
            obj.f37609r = ((Boolean) a2.d).booleanValue();
            obj.f37610s = ((Boolean) a2.f47353e).booleanValue();
            sf.f a10 = ia1.a(tL_broadcastStats.reactions_per_story);
            obj.f37611t = LocaleController.getString("ReactionsPerStory", R.string.ReactionsPerStory);
            obj.f37612u = (String) a10.f47351b;
            obj.v = (String) a10.f47352c;
            obj.f37613w = ((Boolean) a10.d).booleanValue();
            obj.f37614x = ((Boolean) a10.f47353e).booleanValue();
            sf.f a11 = ia1.a(tL_broadcastStats.views_per_story);
            obj.f37615y = LocaleController.getString("ViewsPerStory", R.string.ViewsPerStory);
            obj.f37616z = (String) a11.f47351b;
            obj.A = (String) a11.f47352c;
            obj.B = ((Boolean) a11.d).booleanValue();
            obj.C = ((Boolean) a11.f47353e).booleanValue();
            sf.f a12 = ia1.a(tL_broadcastStats.shares_per_story);
            obj.D = LocaleController.getString("SharesPerStory", R.string.SharesPerStory);
            obj.E = (String) a12.f47351b;
            obj.F = (String) a12.f47352c;
            obj.G = ((Boolean) a12.d).booleanValue();
            obj.H = ((Boolean) a12.f47353e).booleanValue();
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
            obj.f37594a = LocaleController.getString("FollowersChartTitle", R.string.FollowersChartTitle);
            obj.f37595b = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.followers.current, 0);
            if (i12 == 0 || abs5 == 0.0f) {
                i10 = i12;
                obj.f37596c = "";
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
                    obj.f37596c = sb2 + " (" + i13 + "%)";
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
                    obj.f37596c = String.format(locale2, "%s (%.1f%s)", sb3.toString(), Float.valueOf(abs5), "%");
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
            obj.f37600i = LocaleController.getString("SharesPerPost", R.string.SharesPerPost);
            obj.f37601j = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.shares_per_post.current, 0);
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
                    obj.f37602k = sb5 + " (" + i15 + "%)";
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
                    obj.f37602k = String.format(locale4, "%s (%.1f%s)", sb6.toString(), Float.valueOf(abs6), "%");
                }
            } else {
                obj.f37602k = "";
            }
            if (i14 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            obj.f37603l = z14;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev3 = tL_broadcastStats.views_per_post;
            double d13 = tL_statsAbsValueAndPrev3.current;
            double d14 = tL_statsAbsValueAndPrev3.previous;
            int i16 = (int) (d13 - d14);
            if (d14 == 0.0d) {
                abs7 = 0.0f;
            } else {
                abs7 = Math.abs((i16 / ((float) d14)) * 100.0f);
            }
            obj.f37597e = LocaleController.getString("ViewsPerPost", R.string.ViewsPerPost);
            obj.f37598f = AndroidUtilities.formatWholeNumber((int) tL_broadcastStats.views_per_post.current, 0);
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
                    obj.f37599g = sb8 + " (" + i17 + "%)";
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
                    obj.f37599g = String.format(locale6, "%s (%.1f%s)", sb9.toString(), Float.valueOf(abs7), "%");
                }
            } else {
                obj.f37599g = "";
            }
            if (i16 >= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            obj.h = z15;
            TL_stats.TL_statsPercentValue tL_statsPercentValue = tL_broadcastStats.enabled_notifications;
            float f10 = (float) ((tL_statsPercentValue.part / tL_statsPercentValue.total) * 100.0d);
            obj.f37604m = LocaleController.getString("EnabledNotifications", R.string.EnabledNotifications);
            int i18 = (int) f10;
            if (f10 == i18) {
                Locale locale7 = Locale.ENGLISH;
                obj.f37605n = android.support.v4.media.a.l(i18, "%");
            } else {
                obj.f37605n = String.format(Locale.ENGLISH, "%.2f%s", Float.valueOf(f10), "%");
            }
            na1Var.f39257f = obj;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays = tL_broadcastStats.period;
            na1Var.f39253c0 = tL_statsDateRangeDays.max_date * 1000;
            na1Var.f39254d0 = tL_statsDateRangeDays.min_date * 1000;
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
                obj2.f38241a = postInteractionCounters2;
                int i23 = size;
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersMessage) {
                    arrayList4 = arrayList8;
                    arrayList4.add(obj2);
                    str9 = str16;
                    i11 = i22;
                    na1Var.m0.put(obj2.b(), i19);
                    i19++;
                } else {
                    i11 = i22;
                    arrayList4 = arrayList8;
                    str9 = str16;
                }
                if (postInteractionCounters2 instanceof TL_stats.TL_postInteractionCountersStory) {
                    arrayList9.add(Integer.valueOf(obj2.b()));
                    na1Var.f39269q0.add(obj2);
                    na1Var.f39266n0.put(obj2.b(), i20);
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
            AndroidUtilities.runOnUIThread(new h91(na1Var, arrayList9, 1));
            if (arrayList12.size() > 0) {
                na1Var.getMessagesStorage().getMessages(-na1Var.f39250b, 0L, false, arrayList12.size(), ((ka1) arrayList12.get(0)).b(), 0, 0, na1Var.classGuid, 0, 0, 0L, 0, true, false, null);
            }
            AndroidUtilities.runOnUIThread(new Runnable(na1Var) {
                public final na1 f37043b;

                {
                    this.f37043b = na1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            na1 na1Var2 = this.f37043b;
                            na1Var2.getClass();
                            z91[] z91VarArr2 = z91VarArr;
                            na1Var2.d = z91VarArr2[0];
                            na1Var2.E = z91VarArr2[1];
                            na1Var2.F = z91VarArr2[2];
                            na1Var2.G = z91VarArr2[3];
                            na1Var2.H = z91VarArr2[4];
                            na1Var2.I = z91VarArr2[5];
                            na1Var2.f39255e = z91VarArr2[6];
                            na1Var2.J = z91VarArr2[7];
                            na1Var2.g0(z91VarArr2);
                            return;
                        default:
                            na1 na1Var3 = this.f37043b;
                            na1Var3.getClass();
                            z91[] z91VarArr3 = z91VarArr;
                            na1Var3.f39270r = z91VarArr3[0];
                            na1Var3.h = z91VarArr3[1];
                            na1Var3.f39255e = z91VarArr3[2];
                            na1Var3.f39265n = z91VarArr3[3];
                            na1Var3.d = z91VarArr3[4];
                            na1Var3.f39272s = z91VarArr3[5];
                            na1Var3.v = z91VarArr3[6];
                            na1Var3.f39277w = z91VarArr3[7];
                            na1Var3.f39279x = z91VarArr3[8];
                            na1Var3.f39281y = z91VarArr3[9];
                            na1Var3.B = z91VarArr3[10];
                            na1Var3.C = z91VarArr3[11];
                            na1Var3.g0(z91VarArr3);
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
            final z91[] z91VarArr2 = {f0(tL_megagroupStats.growth_graph, LocaleController.getString("GrowthChartTitle", R.string.GrowthChartTitle), 0, false), f0(tL_megagroupStats.members_graph, LocaleController.getString("GroupMembersChartTitle", R.string.GroupMembersChartTitle), 0, false), f0(tL_megagroupStats.new_members_by_source_graph, LocaleController.getString("NewMembersBySourceChartTitle", R.string.NewMembersBySourceChartTitle), 2, false), f0(tL_megagroupStats.languages_graph, LocaleController.getString("MembersLanguageChartTitle", R.string.MembersLanguageChartTitle), 4, true), f0(tL_megagroupStats.messages_graph, LocaleController.getString("MessagesChartTitle", R.string.MessagesChartTitle), 2, false), f0(tL_megagroupStats.actions_graph, LocaleController.getString("ActionsChartTitle", R.string.ActionsChartTitle), 1, false), f0(tL_megagroupStats.top_hours_graph, LocaleController.getString(str2, R.string.TopHoursChartTitle), 0, false), f0(tL_megagroupStats.weekdays_graph, LocaleController.getString("TopDaysOfWeekChartTitle", R.string.TopDaysOfWeekChartTitle), 4, false)};
            z91 z91Var2 = z91VarArr2[6];
            if (z91Var2 != null) {
                z91Var2.f43870n = true;
            }
            z91 z91Var3 = z91VarArr2[7];
            if (z91Var3 != null) {
                z91Var3.f43871o = true;
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
            obj3.f37923a = LocaleController.getString("MembersOverviewTitle", R.string.MembersOverviewTitle);
            obj3.f37924b = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.members.current, 0);
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
                    obj3.f37925c = sb11 + " (" + i25 + "%)";
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
                    obj3.f37925c = String.format(locale9, "%s (%.1f%s)", sb12.toString(), Float.valueOf(abs), str);
                }
            } else {
                obj3.f37925c = "";
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
            obj3.f37929i = LocaleController.getString("ViewingMembers", R.string.ViewingMembers);
            obj3.f37930j = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.viewers.current, 0);
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
                obj3.f37931k = sb14;
            } else {
                obj3.f37931k = "";
            }
            if (i26 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj3.f37932l = z10;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev6 = tL_megagroupStats.posters;
            double d19 = tL_statsAbsValueAndPrev6.current;
            double d20 = tL_statsAbsValueAndPrev6.previous;
            int i27 = (int) (d19 - d20);
            if (d20 == 0.0d) {
                abs3 = 0.0f;
            } else {
                abs3 = Math.abs((i27 / ((float) d20)) * 100.0f);
            }
            obj3.f37933m = LocaleController.getString("PostingMembers", R.string.PostingMembers);
            obj3.f37934n = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.posters.current, 0);
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
                obj3.f37935o = sb16;
            } else {
                obj3.f37935o = "";
            }
            if (i27 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            obj3.f37936p = z11;
            TL_stats.TL_statsAbsValueAndPrev tL_statsAbsValueAndPrev7 = tL_megagroupStats.messages;
            double d21 = tL_statsAbsValueAndPrev7.current;
            double d22 = tL_statsAbsValueAndPrev7.previous;
            int i28 = (int) (d21 - d22);
            if (d22 == 0.0d) {
                abs4 = 0.0f;
            } else {
                abs4 = Math.abs((i28 / ((float) d22)) * 100.0f);
            }
            obj3.f37926e = LocaleController.getString("MessagesOverview", R.string.MessagesOverview);
            obj3.f37927f = AndroidUtilities.formatWholeNumber((int) tL_megagroupStats.messages.current, 0);
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
                obj3.f37928g = sb18;
            } else {
                obj3.f37928g = "";
            }
            if (i28 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            obj3.h = z12;
            na1Var.D = obj3;
            TL_stats.TL_statsDateRangeDays tL_statsDateRangeDays2 = tL_megagroupStats.period;
            na1Var.f39253c0 = tL_statsDateRangeDays2.max_date * 1000;
            na1Var.f39254d0 = tL_statsDateRangeDays2.min_date * 1000;
            ArrayList<TL_stats.TL_statsGroupTopPoster> arrayList13 = tL_megagroupStats.top_posters;
            if (arrayList13 != null && !arrayList13.isEmpty()) {
                int i29 = 0;
                while (i29 < tL_megagroupStats.top_posters.size()) {
                    TL_stats.TL_statsGroupTopPoster tL_statsGroupTopPoster = tL_megagroupStats.top_posters.get(i29);
                    ArrayList<TLRPC.User> arrayList14 = tL_megagroupStats.users;
                    ?? obj4 = new Object();
                    obj4.f37049a = ga1.a(tL_statsGroupTopPoster.user_id, arrayList14);
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
                    obj4.f37050b = sb19.toString();
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
                    ArrayList arrayList19 = na1Var.N;
                    TL_stats.TL_statsGroupTopAdmin tL_statsGroupTopAdmin = tL_megagroupStats.top_admins.get(i31);
                    ArrayList<TLRPC.User> arrayList20 = tL_megagroupStats.users;
                    ?? obj5 = new Object();
                    obj5.f37049a = ga1.a(tL_statsGroupTopAdmin.user_id, arrayList20);
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
                    obj5.f37050b = sb20.toString();
                    arrayList19.add(obj5);
                }
            }
            ArrayList<TL_stats.TL_statsGroupTopInviter> arrayList21 = tL_megagroupStats.top_inviters;
            if (arrayList21 != null && !arrayList21.isEmpty()) {
                for (int i33 = 0; i33 < tL_megagroupStats.top_inviters.size(); i33++) {
                    ArrayList arrayList22 = na1Var.M;
                    TL_stats.TL_statsGroupTopInviter tL_statsGroupTopInviter = tL_megagroupStats.top_inviters.get(i33);
                    ArrayList<TLRPC.User> arrayList23 = tL_megagroupStats.users;
                    ?? obj6 = new Object();
                    obj6.f37049a = ga1.a(tL_statsGroupTopInviter.user_id, arrayList23);
                    int i34 = tL_statsGroupTopInviter.invitations;
                    if (i34 > 0) {
                        obj6.f37050b = LocaleController.formatPluralString("Invitations", i34, new Object[0]);
                    } else {
                        obj6.f37050b = "";
                    }
                    arrayList22.add(obj6);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable(na1Var) {
                public final na1 f37043b;

                {
                    this.f37043b = na1Var;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            na1 na1Var2 = this.f37043b;
                            na1Var2.getClass();
                            z91[] z91VarArr22 = z91VarArr2;
                            na1Var2.d = z91VarArr22[0];
                            na1Var2.E = z91VarArr22[1];
                            na1Var2.F = z91VarArr22[2];
                            na1Var2.G = z91VarArr22[3];
                            na1Var2.H = z91VarArr22[4];
                            na1Var2.I = z91VarArr22[5];
                            na1Var2.f39255e = z91VarArr22[6];
                            na1Var2.J = z91VarArr22[7];
                            na1Var2.g0(z91VarArr22);
                            return;
                        default:
                            na1 na1Var3 = this.f37043b;
                            na1Var3.getClass();
                            z91[] z91VarArr3 = z91VarArr2;
                            na1Var3.f39270r = z91VarArr3[0];
                            na1Var3.h = z91VarArr3[1];
                            na1Var3.f39255e = z91VarArr3[2];
                            na1Var3.f39265n = z91VarArr3[3];
                            na1Var3.d = z91VarArr3[4];
                            na1Var3.f39272s = z91VarArr3[5];
                            na1Var3.v = z91VarArr3[6];
                            na1Var3.f39277w = z91VarArr3[7];
                            na1Var3.f39279x = z91VarArr3[8];
                            na1Var3.f39281y = z91VarArr3[9];
                            na1Var3.B = z91VarArr3[10];
                            na1Var3.C = z91VarArr3[11];
                            na1Var3.g0(z91VarArr3);
                            return;
                    }
                }
            });
        }
    }

    public static void W(na1 na1Var) {
        float f10;
        RectF rectF = na1Var.G0;
        og.e eVar = na1Var.f39283z0;
        if (Build.VERSION.SDK_INT >= 31 && eVar != null && na1Var.fragmentView != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (na1Var.fragmentView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(8.0f);
            na1Var.F0.set(0.0f, -dp, na1Var.fragmentView.getMeasuredWidth(), na1Var.actionBar.getMeasuredHeight() + dp);
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), na1Var.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            eVar.g(2, na1Var.E0);
            eVar.e(na1Var.D0, na1Var.fragmentView.getMeasuredWidth(), na1Var.fragmentView.getMeasuredHeight());
        }
    }

    public static void Y(na1 na1Var) {
        View currentView = na1Var.f39258f0.getCurrentView();
        ac acVar = na1Var.f39259g0;
        if (currentView == acVar) {
            na1Var.actionBar.setAdaptiveBackground(acVar.C);
            return;
        }
        ke keVar = na1Var.f39260h0;
        if (currentView == keVar) {
            na1Var.actionBar.setAdaptiveBackground(keVar.X0);
        } else {
            na1Var.actionBar.setAdaptiveBackground(na1Var.P);
        }
    }

    public static void Z(na1 na1Var) {
        ma1 ma1Var = na1Var.W;
        if (ma1Var != null) {
            ma1Var.f38940b = true;
        }
        int childCount = na1Var.P.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = na1Var.P.getChildAt(i10);
            if (childAt instanceof y91) {
                ((y91) childAt).f42966b.f49606q0.d(false, true);
            }
        }
    }

    public static org.telegram.ui.ActionBar.p2 d0(TLRPC.Chat chat, boolean z4) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.f20845id);
        bundle.putBoolean("is_megagroup", chat.megagroup);
        bundle.putBoolean("start_from_boosts", z4);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20845id);
        if (chatFull != null && (chatFull.can_view_stats || chatFull.can_view_stars_revenue)) {
            return new na1(bundle);
        }
        return new y5(-chat.f20845id);
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
            int length = ((xf.a) bVar.d.get(0)).f50576a.length;
            int size = bVar.d.size();
            bVar.f50593l = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                bVar.f50593l[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    long[] jArr = bVar.f50593l;
                    jArr[i11] = jArr[i11] + ((xf.a) bVar.d.get(i12)).f50576a[i11];
                }
            }
            bVar.f50594m = new SegmentTree(bVar.f50593l);
            return bVar;
        } else if (i10 == 4) {
            ?? bVar2 = new xf.b(jSONObject);
            if (z4) {
                long[] jArr2 = new long[bVar2.d.size()];
                int[] iArr = new int[bVar2.d.size()];
                long j10 = 0;
                for (int i13 = 0; i13 < bVar2.d.size(); i13++) {
                    int length2 = bVar2.f50583a.length;
                    for (int i14 = 0; i14 < length2; i14++) {
                        long j11 = ((xf.a) bVar2.d.get(i13)).f50576a[i14];
                        jArr2[i13] = jArr2[i13] + j11;
                        if (j11 == 0) {
                            iArr[i13] = iArr[i13] + 1;
                        }
                    }
                    j10 += jArr2[i13];
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < bVar2.d.size(); i15++) {
                    if (jArr2[i15] / j10 < 0.01d && iArr[i15] > bVar2.f50583a.length / 2.0f) {
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
            int length3 = ((xf.a) bVar2.d.get(0)).f50576a.length;
            int size3 = bVar2.d.size();
            bVar2.f50595l = new long[length3];
            for (int i17 = 0; i17 < length3; i17++) {
                bVar2.f50595l[i17] = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    long[] jArr3 = bVar2.f50595l;
                    jArr3[i17] = jArr3[i17] + ((xf.a) bVar2.d.get(i18)).f50576a[i17];
                }
            }
            new SegmentTree(bVar2.f50595l);
            return bVar2;
        } else {
            return null;
        }
    }

    public static z91 f0(TL_stats.StatsGraph statsGraph, String str, int i10, boolean z4) {
        long[] jArr;
        long[] jArr2;
        if (statsGraph == null || (statsGraph instanceof TL_stats.TL_statsGraphError)) {
            return null;
        }
        z91 z91Var = new z91(str, i10);
        z91Var.f43869m = z4;
        if (statsGraph instanceof TL_stats.TL_statsGraph) {
            try {
                xf.b e02 = e0(new JSONObject(((TL_stats.TL_statsGraph) statsGraph).json.data), i10, z4);
                z91Var.d = e02;
                if (e02 != null) {
                    e02.h = statsGraph.rate;
                }
                z91Var.f43864g = ((TL_stats.TL_statsGraph) statsGraph).zoom_token;
                if (e02 == null || (jArr2 = e02.f50583a) == null || jArr2.length < 2) {
                    z91Var.f43868l = true;
                }
                if (i10 == 4 && e02 != null && (jArr = e02.f50583a) != null && jArr.length > 0) {
                    long j10 = jArr[jArr.length - 1];
                    z91Var.f43862e = new xf.e(e02, j10);
                    z91Var.f43861c = j10;
                    return z91Var;
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
                return null;
            }
        } else if (statsGraph instanceof TL_stats.TL_statsGraphAsync) {
            z91Var.f43863f = ((TL_stats.TL_statsGraphAsync) statsGraph).token;
        }
        return z91Var;
    }

    public static void k0(z91 z91Var, ArrayList arrayList, org.telegram.ui.ActionBar.l6 l6Var) {
        xf.b bVar;
        int i10;
        if (z91Var != null && (bVar = z91Var.d) != null) {
            ArrayList arrayList2 = bVar.d;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                xf.a aVar = (xf.a) obj;
                int i12 = aVar.f50581g;
                if (i12 >= 0) {
                    if (!org.telegram.ui.ActionBar.k6.c1(i12)) {
                        int i13 = aVar.f50581g;
                        if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                            i10 = aVar.f50582i;
                        } else {
                            i10 = aVar.h;
                        }
                        org.telegram.ui.ActionBar.k6.u1(i13, i10, false);
                        org.telegram.ui.ActionBar.k6.nl[aVar.f50581g] = aVar.h;
                    }
                    arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, l6Var, aVar.f50581g));
                }
            }
        }
    }

    public static void l0(View view) {
        if (view instanceof y91) {
            ((y91) view).d();
        } else if (view instanceof org.telegram.ui.Cells.z6) {
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false)), org.telegram.ui.ActionBar.k6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21626b7), 0, 0);
            pqVar.f30166w = true;
            view.setBackground(pqVar);
        } else if (view instanceof yf.c) {
            ((yf.c) view).a();
        } else if (view instanceof ha1) {
            int i10 = ha1.d;
            ((ha1) view).b();
        }
    }

    public final void c0() {
        int i10;
        int i11 = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        yg0 yg0Var = this.f39262j0;
        if (yg0Var != null) {
            yg0Var.setTranslationY(-i11);
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
        if (this.f39252c) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        int i13 = i10 + i11;
        o91 o91Var = this.P;
        if (o91Var != null) {
            o91Var.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ac acVar = this.f39259g0;
        if (acVar != null) {
            acVar.C.setPadding(0, currentActionBarHeight, 0, i13);
        }
        ke keVar = this.f39260h0;
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
        na1 na1Var = this;
        na1Var.X = new wf.f(null);
        MessagesController messagesController = MessagesController.getInstance(na1Var.currentAccount);
        long j10 = na1Var.f39250b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(na1Var.currentAccount).getChatFull(j10);
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
            arrayList.add(ch.b.b(context, na1Var.resourceProvider, ch.a.F, R.string.Statistics));
        }
        arrayList.add(ch.b.b(context, na1Var.resourceProvider, ch.a.BOOSTS, R.string.Boosts));
        if (z10) {
            arrayList.add(ch.b.b(context, na1Var.resourceProvider, ch.a.MONETIZATION, R.string.Monetization));
        }
        na1Var.f39263k0 = (ch.b[]) arrayList.toArray(new ch.b[0]);
        yg0 yg0Var = new yg0(context, na1Var.resourceProvider);
        na1Var.f39262j0 = yg0Var;
        yg0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        int i11 = 0;
        while (true) {
            ch.b[] bVarArr = na1Var.f39263k0;
            if (i11 >= bVarArr.length) {
                break;
            }
            ch.b bVar = bVarArr[i11];
            bVar.setOnClickListener(new mh.x0(na1Var, i11, 22));
            na1Var.f39262j0.addView(na1Var.f39263k0[i11]);
            na1Var.f39262j0.i(bVar, true, false);
            i11++;
        }
        na1Var.f39258f0 = new ek(na1Var, na1Var.getParentActivity(), 4);
        FrameLayout frameLayout2 = new FrameLayout(context);
        if (isBoostSupported) {
            na1Var.f39259g0 = new ac(na1Var, -j10, na1Var.getResourceProvider());
        }
        if (z10) {
            Activity parentActivity = na1Var.getParentActivity();
            int i12 = na1Var.currentAccount;
            long j11 = -j10;
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            if (ChatObject.isChannelAndNotMegaGroup(chat) && chatFull.can_view_revenue) {
                z12 = true;
            } else {
                z12 = false;
            }
            frameLayout = frameLayout2;
            ke keVar = new ke(parentActivity, this, i12, j11, resourceProvider, z12, chatFull.can_view_stars_revenue);
            na1Var = this;
            na1Var.f39260h0 = keVar;
            keVar.setActionBar(na1Var.actionBar);
        } else {
            frameLayout = frameLayout2;
        }
        boolean z13 = z4;
        FrameLayout frameLayout3 = frameLayout;
        na1Var.f39258f0.setAdapter(new n91(na1Var, z13, isBoostSupported, z10, frameLayout3));
        boolean z14 = na1Var.f39261i0;
        if (isBoostSupported && !z14) {
            z11 = true;
        } else {
            z11 = false;
        }
        na1Var.f39252c = z11;
        if (z11 && na1Var.f39249a0) {
            na1Var.f39258f0.setPosition(z13 ? 1 : 0);
        } else if (z11 && na1Var.f39251b0) {
            ek ekVar = na1Var.f39258f0;
            if (!z14 && isBoostSupported) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            ekVar.setPosition((z13 ? 1 : 0) + i10);
        }
        na1Var.m0(na1Var.f39258f0.getCurrentPosition(), false);
        lh.j4 j4Var = new lh.j4(na1Var, na1Var.getParentActivity(), 9);
        na1Var.actionBar.setDrawBlurBackground(j4Var);
        j4Var.setBackgroundColor(na1Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7));
        vg.i iVar = new vg.i(j4Var);
        og.a aVar = na1Var.C0;
        aVar.d = iVar;
        aVar.f16756e = j4Var;
        j4Var.addView(na1Var.f39258f0, k7.c6.g());
        j4Var.addView(na1Var.actionBar);
        if (na1Var.f39252c) {
            j4Var.addView(na1Var.f39262j0, k7.c6.e(344, 72, 81));
            na1Var.setBulletinDelegate(new hg.w(11));
        }
        na1Var.fragmentView = j4Var;
        o91 o91Var = new o91(na1Var, context);
        na1Var.P = o91Var;
        o91Var.setSections(true);
        na1Var.P.setClipToPadding(false);
        o91 o91Var2 = na1Var.P;
        Objects.requireNonNull(o91Var2);
        na1Var.Q = new og.k(o91Var2, j4Var, new us(o91Var2, 1));
        ac acVar = na1Var.f39259g0;
        if (acVar != null) {
            org.telegram.ui.Components.sl0 sl0Var = acVar.C;
            Objects.requireNonNull(sl0Var);
            acVar.D = new og.k(sl0Var, j4Var, new us(sl0Var, 0));
            na1Var.f39259g0.C.j(new m91(na1Var, 1));
        }
        ke keVar2 = na1Var.f39260h0;
        if (keVar2 != null) {
            org.telegram.ui.Components.h61 h61Var = keVar2.X0;
            Objects.requireNonNull(h61Var);
            keVar2.Y0 = new og.k(h61Var, j4Var, new x8(h61Var, 0));
            na1Var.f39260h0.X0.j(new m91(na1Var, 2));
        }
        na1Var.D0 = new k91(na1Var, j4Var);
        na1Var.P.o1();
        LinearLayout linearLayout = new LinearLayout(context);
        na1Var.Y = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        na1Var.T = imageView;
        imageView.setAutoRepeat(true);
        na1Var.T.f(R.raw.statistic_preload, 120, 120, null);
        na1Var.T.d();
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
        na1Var.Y.addView(na1Var.T, k7.c6.t(120, 120, 1, 0, 0, 0, 20));
        na1Var.Y.addView(textView, k7.c6.t(-2, -2, 1, 0, 0, 0, 10));
        na1Var.Y.addView(textView2, k7.c6.q(-2, -2, 1));
        frameLayout3.addView(na1Var.Y, k7.c6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        if (na1Var.U == null) {
            na1Var.U = new s91(na1Var);
        }
        na1Var.P.setAdapter(na1Var.U);
        f2.j0 j0Var = new f2.j0();
        na1Var.R = j0Var;
        na1Var.P.setLayoutManager(j0Var);
        na1Var.V = new f2.l();
        na1Var.P.setItemAnimator(null);
        na1Var.P.j(new m91(na1Var, 0));
        na1Var.P.setOnItemClickListener(new p21(na1Var, 6));
        na1Var.P.setOnItemLongClickListener(new kl0(na1Var, 18));
        frameLayout3.addView(na1Var.P);
        org.telegram.ui.Components.ao aoVar = new org.telegram.ui.Components.ao(context, null, false, null);
        na1Var.O = aoVar;
        aoVar.setOccupyStatusBar(!AndroidUtilities.isTablet());
        na1Var.O.getAvatarImageView().setScaleX(0.9f);
        na1Var.O.getAvatarImageView().setScaleY(0.9f);
        na1Var.O.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
        org.telegram.ui.ActionBar.k kVar = na1Var.actionBar;
        org.telegram.ui.Components.ao aoVar2 = na1Var.O;
        if (!na1Var.inPreviewMode) {
            f10 = 50.0f;
        } else {
            f10 = 0.0f;
        }
        kVar.addView(aoVar2, 0, k7.c6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        TLRPC.Chat chat2 = na1Var.getMessagesController().getChat(Long.valueOf(j10));
        na1Var.O.setChatAvatar(chat2);
        org.telegram.ui.Components.ao aoVar3 = na1Var.O;
        if (chat2 == null) {
            str = "";
        } else {
            str = chat2.title;
        }
        aoVar3.setTitle(str);
        org.telegram.ui.Components.ao aoVar4 = na1Var.O;
        if (aoVar4.getSubtitleTextView() != null) {
            aoVar4.getSubtitleTextView().setVisibility(8);
        }
        yh.z(false, na1Var.actionBar);
        na1Var.actionBar.setActionBarMenuOnItemClick(new ll0(na1Var, 18));
        na1Var.O.i(org.telegram.ui.ActionBar.k6.w0(null, i13, false), org.telegram.ui.ActionBar.k6.w0(null, i14, false));
        na1Var.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i13, false), false);
        na1Var.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, i13, false), true);
        na1Var.actionBar.B(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22057z8, false), false);
        na1Var.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        boolean z15 = na1Var.f39275u0;
        z5 z5Var = na1Var.f39282y0;
        if (z15) {
            na1Var.Y.setAlpha(0.0f);
            AndroidUtilities.runOnUIThread(z5Var, 500L);
            na1Var.Y.setVisibility(0);
            na1Var.P.setVisibility(8);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            na1Var.Y.setVisibility(8);
            na1Var.P.setVisibility(0);
        }
        qg.b c3 = aVar.c(na1Var.f39262j0, sg.b.f(na1Var.resourceProvider), false);
        c3.p(AndroidUtilities.dp(28.0f));
        c3.o(AndroidUtilities.dp(7.666f));
        na1Var.f39262j0.setBackground(c3);
        na1Var.c0();
        na1Var.f39276v0 = new aa1(na1Var.U, na1Var.R);
        return na1Var.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.p2 p2Var2;
        org.telegram.ui.ActionBar.p2 p2Var3 = null;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesListUpdated) {
            if (((oh.l6) objArr[0]) == this.f39278w0) {
                j0();
                o0();
                if (this.U != null) {
                    this.P.setItemAnimator(null);
                    this.f39276v0.f();
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
                    arrayList = this.f39267o0;
                    if (i13 >= size) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) arrayList2.get(i13);
                    int i14 = this.m0.get(messageObject.getId(), -1);
                    if (i14 >= 0 && ((ka1) arrayList.get(i14)).b() == messageObject.getId()) {
                        if (messageObject.deleted) {
                            arrayList3.add((ka1) arrayList.get(i14));
                        } else {
                            ((ka1) arrayList.get(i14)).f38242b = messageObject;
                        }
                    }
                    i13++;
                }
                arrayList.removeAll(arrayList3);
                ArrayList arrayList4 = this.f39268p0;
                arrayList4.clear();
                int size2 = arrayList.size();
                while (true) {
                    if (i12 >= size2) {
                        break;
                    }
                    ka1 ka1Var = (ka1) arrayList.get(i12);
                    if (ka1Var.f38242b == null) {
                        this.f39264l0 = ka1Var.b();
                        break;
                    } else {
                        arrayList4.add(ka1Var);
                        i12++;
                    }
                }
                if (arrayList4.size() < 20) {
                    h0();
                }
                o0();
                if (this.U != null) {
                    this.P.setItemAnimator(null);
                    this.f39276v0.f();
                }
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20846id == this.f39250b && this.f39248a == null) {
                this.f39248a = chatFull;
                i0();
            }
        }
    }

    public final void g0(z91[] z91VarArr) {
        s91 s91Var = this.U;
        if (s91Var != null) {
            s91Var.E();
            this.P.setItemAnimator(null);
            this.U.l();
        }
        this.f39275u0 = false;
        LinearLayout linearLayout = this.Y;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            AndroidUtilities.cancelRunOnUIThread(this.f39282y0);
            this.Y.animate().alpha(0.0f).setDuration(230L).setListener(new ss0(this, 20));
            this.P.setVisibility(0);
            this.P.setAlpha(0.0f);
            this.P.animate().alpha(1.0f).setDuration(230L).start();
            for (z91 z91Var : z91VarArr) {
                if (z91Var != null && z91Var.d == null && z91Var.f43863f != null) {
                    z91Var.a(this.currentAccount, this.classGuid, this.f39248a.stats_dc, new org.telegram.ui.Components.s51(1, this, z91Var));
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.l5 l5Var;
        z91 z91Var;
        z91 z91Var2;
        jy0 jy0Var = new jy0(5, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21607a7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 1, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"message"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"views"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"shares"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"likes"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{org.telegram.ui.Cells.a8.class}, new String[]{"date"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 0, new Class[]{yf.c.class}, new String[]{"textView"}, null, null, -1, null, i11));
        View view2 = null;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.Yi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.Zi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.cj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f21733h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f22055z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, -1, jy0Var, org.telegram.ui.ActionBar.k6.f22057z8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.f21626b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.f22019x6));
        int i13 = org.telegram.ui.ActionBar.k6.f21878p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, i13));
        org.telegram.ui.Components.ao aoVar = this.O;
        if (aoVar != null) {
            l5Var = aoVar.getTitleTextView();
        } else {
            l5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(l5Var, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.Oi));
        org.telegram.ui.Components.ao aoVar2 = this.O;
        if (aoVar2 != null) {
            view2 = aoVar2.getSubtitleTextView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(view2, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.k6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, jy0Var, org.telegram.ui.ActionBar.k6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21823m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21963u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21981v6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.P, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        if (this.Z) {
            for (int i14 = 0; i14 < 6; i14++) {
                if (i14 == 0) {
                    z91Var2 = this.d;
                } else if (i14 == 1) {
                    z91Var2 = this.E;
                } else if (i14 == 2) {
                    z91Var2 = this.F;
                } else if (i14 == 3) {
                    z91Var2 = this.G;
                } else if (i14 == 4) {
                    z91Var2 = this.H;
                } else {
                    z91Var2 = this.I;
                }
                k0(z91Var2, arrayList, jy0Var);
            }
        } else {
            for (int i15 = 0; i15 < 12; i15++) {
                if (i15 == 0) {
                    z91Var = this.d;
                } else if (i15 == 1) {
                    z91Var = this.h;
                } else if (i15 == 2) {
                    z91Var = this.f39265n;
                } else if (i15 == 3) {
                    z91Var = this.f39270r;
                } else if (i15 == 4) {
                    z91Var = this.f39272s;
                } else if (i15 == 5) {
                    z91Var = this.v;
                } else if (i15 == 6) {
                    z91Var = this.f39279x;
                } else if (i15 == 7) {
                    z91Var = this.f39255e;
                } else if (i15 == 8) {
                    z91Var = this.f39277w;
                } else if (i15 == 9) {
                    z91Var = this.f39281y;
                } else if (i15 == 10) {
                    z91Var = this.B;
                } else {
                    z91Var = this.C;
                }
                k0(z91Var, arrayList, jy0Var);
            }
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.f20883id = new ArrayList<>();
        ArrayList arrayList = this.f39267o0;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = this.m0.get(this.f39264l0); i11 < size; i11++) {
            if (((ka1) arrayList.get(i11)).f38242b == null) {
                tL_channels_getMessages.f20883id.add(Integer.valueOf(((ka1) arrayList.get(i11)).b()));
                i10++;
                if (i10 > 50) {
                    break;
                }
            }
        }
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(this.f39250b);
        this.f39274t0 = true;
        getConnectionsManager().sendRequest(tL_channels_getMessages, new j91(this, 0));
    }

    public final void i0() {
        TL_stats.TL_getBroadcastStats tL_getBroadcastStats;
        if (this.f39261i0) {
            return;
        }
        boolean z4 = this.Z;
        long j10 = this.f39250b;
        if (z4) {
            TL_stats.TL_getMegagroupStats tL_getMegagroupStats = new TL_stats.TL_getMegagroupStats();
            tL_getMegagroupStats.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getMegagroupStats;
        } else {
            TL_stats.TL_getBroadcastStats tL_getBroadcastStats2 = new TL_stats.TL_getBroadcastStats();
            tL_getBroadcastStats2.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(j10);
            tL_getBroadcastStats = tL_getBroadcastStats2;
        }
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getBroadcastStats, new j91(this, 1), null, null, 0, this.f39248a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false)) <= 0.699999988079071d) {
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
        ek ekVar = this.f39258f0;
        if (ekVar != null && (ekVar.f28685b != 0 || ekVar.f28686c != 1.0f)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void j0() {
        ArrayList arrayList = this.f39271r0;
        arrayList.clear();
        ArrayList arrayList2 = this.f39269q0;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ka1 ka1Var = (ka1) obj;
            MessageObject f10 = this.f39278w0.f(ka1Var.b());
            if (f10 != null) {
                ka1Var.f38242b = f10;
                arrayList.add(ka1Var);
            }
        }
        this.f39266n0.clear();
        arrayList2.clear();
    }

    public final void m0(int i10, boolean z4) {
        boolean z10;
        int i11 = 0;
        while (true) {
            ch.b[] bVarArr = this.f39263k0;
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
        for (int i10 = 0; i10 < this.f39263k0.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            ch.b bVar = this.f39263k0[i10];
            bVar.G = max;
            bVar.F = z4;
            bVar.invalidate();
        }
        this.f39262j0.invalidate();
    }

    public final void o0() {
        ArrayList arrayList = this.f39273s0;
        arrayList.clear();
        arrayList.addAll(this.f39268p0);
        arrayList.addAll(this.f39271r0);
        Collections.sort(arrayList, Collections.reverseOrder(Comparator$CC.comparingLong(new org.telegram.ui.Components.x0(1))));
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesListUpdated);
        oh.t6 storiesController = getMessagesController().getStoriesController();
        long j10 = this.f39250b;
        oh.l6 A = storiesController.A(-j10, 2, -1, true);
        this.f39278w0 = A;
        if (A != null) {
            this.f39280x0 = A.o();
        }
        if (this.f39248a != null) {
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
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.f39256e0;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
            d2VarArr[0] = null;
        }
        oh.l6 l6Var = this.f39278w0;
        if (l6Var != null) {
            l6Var.z(this.f39280x0);
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        c0();
    }
}
