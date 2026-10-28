package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class xh0 extends FrameLayout {
    public final y9 E;
    public final TextView F;
    public final TextView G;
    public final fi.d H;
    public final TextView I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public zq R;
    public zq S;
    public tu T;
    public final zq[] U;
    public final uh0 V;
    public final org.telegram.ui.ey f34767a;
    public final int f34768b;
    public final s71 f34769c;
    public TLRPC.SearchPostsFlood d;
    public final ArrayList e;
    public int f34770f;
    public boolean h;
    public final ArrayList f34771n;
    public int f34772r;
    public boolean f34773s;
    public boolean v;
    public String f34774w;
    public final FrameLayout f34775x;
    public final bi.r f34776y;

    public xh0(Context context, org.telegram.ui.ey eyVar) {
        super(context);
        this.e = new ArrayList();
        this.f34771n = new ArrayList();
        this.K = -1;
        this.L = 0;
        this.O = -1;
        this.U = new zq[1];
        this.V = new uh0(this, 1);
        this.f34767a = eyVar;
        int currentAccount = eyVar.getCurrentAccount();
        this.f34768b = currentAccount;
        s71 s71Var = new s71(context, currentAccount, 0, false, new d(this, 18), new tv(this, 14), null, null);
        this.f34769c = s71Var;
        s71Var.j(new ai.u0(4, this, eyVar));
        addView(s71Var, kb1.i(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34775x = frameLayout;
        bi.r rVar = new bi.r(context, 5);
        this.f34776y = rVar;
        rVar.setOrientation(1);
        frameLayout.addView(rVar, kb1.h(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        y9 y9Var = new y9(context);
        this.E = y9Var;
        y9Var.setVisibility(8);
        rVar.addView(y9Var, kb1.x(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        rVar.addView(textView, kb1.u(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.G = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        rVar.addView(textView2, kb1.x(-2, -2, 1, 0, 9, 0, 0));
        fi.d f7 = org.telegram.messenger.wh.f(24, context, null, true);
        this.H = f7;
        rVar.addView(f7, kb1.x(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.I = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        rVar.addView(textView3, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, kb1.i(-1, -1, 119));
        s71Var.setHideIfEmpty(false);
        s71Var.setEmptyView(frameLayout);
        s71Var.W1 = true;
        s71Var.X1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (!this.v) {
            boolean isEmpty = TextUtils.isEmpty(this.f34774w);
            if (!isEmpty || !this.h) {
                if (isEmpty || !this.f34773s) {
                    if (!isEmpty && this.d == null) {
                        return;
                    }
                    this.v = true;
                    int i10 = this.f34768b;
                    MessagesController messagesController = MessagesController.getInstance(i10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 2;
                    tL_channels_searchPosts.query = this.f34774w;
                    tL_channels_searchPosts.limit = 30;
                    if (isEmpty) {
                        ArrayList arrayList = this.e;
                        if (!arrayList.isEmpty()) {
                            MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
                            tL_channels_searchPosts.offset_rate = this.f34770f;
                            tL_channels_searchPosts.offset_id = messageObject.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    } else {
                        ArrayList arrayList2 = this.f34771n;
                        if (!arrayList2.isEmpty()) {
                            MessageObject messageObject2 = (MessageObject) ic.a.g(1, arrayList2);
                            tL_channels_searchPosts.offset_rate = this.f34772r;
                            tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                            tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                        } else {
                            tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                        }
                    }
                    if (z10 && (searchPostsFlood = this.d) != null) {
                        tL_channels_searchPosts.flags |= 4;
                        j10 = searchPostsFlood.stars_amount;
                        tL_channels_searchPosts.allow_paid_stars = j10;
                    } else {
                        j10 = 0;
                    }
                    this.K = connectionsManager.sendRequest(tL_channels_searchPosts, new k7(this, messagesController, isEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                    d();
                    this.f34769c.f32504g3.O(true);
                }
            }
        }
    }

    public final void b(String str) {
        boolean z10;
        int i10 = this.O;
        int i11 = this.f34768b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.O, true);
            this.O = -1;
        }
        if (!this.M) {
            if (this.Q && (!this.f34771n.isEmpty() || !this.f34773s)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.N = z10;
        }
        this.M = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.O = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new b2(this, 9));
    }

    public final void c() {
        this.f34775x.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
        this.F.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        int i10 = org.telegram.ui.ActionBar.y6.f23749y6;
        this.I.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.G.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        s71 s71Var = this.f34769c;
        s71Var.setAdapter(null);
        s71Var.setAdapter(s71Var.f32504g3);
        if (this.T != null) {
            this.T = null;
            d();
        }
    }

    public final void d() {
        float f7;
        TLRPC.SearchPostsFlood searchPostsFlood;
        String str;
        Object valueOf;
        Object valueOf2;
        uh0 uh0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(uh0Var);
        int i10 = this.f34768b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        TextView textView = this.G;
        TextView textView2 = this.F;
        y9 y9Var = this.E;
        TextView textView3 = this.I;
        fi.d dVar = this.H;
        if (!isPremium) {
            y9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.i(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final xh0 f33744b;

                {
                    this.f33744b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f33744b.f34767a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            xh0 xh0Var = this.f33744b;
                            xh0Var.H.setLoading(true);
                            xh0Var.a(true);
                            return;
                        default:
                            xh0 xh0Var2 = this.f33744b;
                            xh0Var2.H.setLoading(true);
                            xh0Var2.a(false);
                            return;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f34774w);
        ArrayList arrayList = this.f34771n;
        if (!isEmpty && arrayList.isEmpty() && this.f34773s) {
            if (y9Var.getImageReceiver().getImageDrawable() == null) {
                y9Var.setImageDrawable(new yj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            }
            y9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.f34774w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(this.f34774w) && (searchPostsFlood = this.d) != null) {
            f7 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                y9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i11 = this.d.wait_till - currentTime;
                int i12 = i11 / 3600;
                int i13 = i11 - (i12 * 3600);
                int i14 = i13 / 60;
                int i15 = i13 - (i14 * 60);
                dVar.setVisibility(0);
                dVar.i(bi.dd.Q0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.U), true, true);
                int i16 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                if (i12 > 0) {
                    str = a1.g.m(i12, ":");
                } else {
                    str = "";
                }
                sb2.append(str);
                if (i14 < 10) {
                    valueOf = ic.a.i(i14, "0");
                } else {
                    valueOf = Integer.valueOf(i14);
                }
                sb2.append(valueOf);
                sb2.append(":");
                if (i15 < 10) {
                    valueOf2 = ic.a.i(i15, "0");
                } else {
                    valueOf2 = Integer.valueOf(i15);
                }
                sb2.append(valueOf2);
                dVar.g(LocaleController.formatString(i16, sb2.toString()), true);
                dVar.e.r(false, true);
                dVar.setOnClickListener(new View.OnClickListener(this) {
                    public final xh0 f33744b;

                    {
                        this.f33744b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f33744b.f34767a.presentFragment(new PremiumPreviewFragment(0, "search"));
                                return;
                            case 1:
                                xh0 xh0Var = this.f33744b;
                                xh0Var.H.setLoading(true);
                                xh0Var.a(true);
                                return;
                            default:
                                xh0 xh0Var2 = this.f33744b;
                                xh0Var2.H.setLoading(true);
                                xh0Var2.a(false);
                                return;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(uh0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        } else {
            f7 = 100.0f;
        }
        if (arrayList.isEmpty() && !this.v && !TextUtils.isEmpty(this.f34774w)) {
            y9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
            if (this.R == null) {
                zq zqVar = new zq(R.drawable.smiles_tab_search, 0);
                this.R = zqVar;
                zqVar.setScale(0.79f, 0.79f);
            }
            if (this.T == null) {
                this.T = new tu(org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false), org.telegram.ui.ActionBar.y6.o1(0.75f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false))), 1);
            }
            spannableStringBuilder.setSpan(this.R, 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(TextUtils.ellipsize(this.f34774w, dVar.getTextPaint(), AndroidUtilities.dp(f7), TextUtils.TruncateAt.END));
            spannableStringBuilder.setSpan(this.T, length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " >");
            if (this.S == null) {
                zq zqVar2 = new zq(R.drawable.msg_mini_forumarrow, 0);
                this.S = zqVar2;
                zqVar2.setScale(1.05f, 1.05f);
            }
            spannableStringBuilder.setSpan(this.S, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            dVar.setVisibility(0);
            dVar.i(spannableStringBuilder, true, true);
            dVar.d.r(false, false);
            dVar.g(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {
                public final xh0 f33744b;

                {
                    this.f33744b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f33744b.f34767a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            return;
                        case 1:
                            xh0 xh0Var = this.f33744b;
                            xh0Var.H.setLoading(true);
                            xh0Var.a(true);
                            return;
                        default:
                            xh0 xh0Var2 = this.f33744b;
                            xh0Var2.H.setLoading(true);
                            xh0Var2.a(false);
                            return;
                    }
                }
            });
            if (this.d != null) {
                textView3.setVisibility(0);
                TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
                int i17 = searchPostsFlood2.remains;
                if (i17 < 1) {
                    i17 = searchPostsFlood2.total_daily;
                }
                textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i17));
                return;
            }
            textView3.setVisibility(8);
            return;
        }
        y9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        dVar.setVisibility(8);
        if (this.d != null) {
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
            int i18 = searchPostsFlood3.remains;
            if (i18 < 1) {
                i18 = searchPostsFlood3.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i18));
            return;
        }
        textView3.setVisibility(8);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (!this.P) {
            this.P = true;
            MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
            bi.ca.y(this.f34768b, false).p();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.J) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i10) {
        this.f34776y.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.f22964w).start();
    }
}
