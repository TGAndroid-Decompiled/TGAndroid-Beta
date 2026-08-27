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

public final class mg0 extends FrameLayout {
    public final n9 A;
    public final TextView B;
    public final TextView C;
    public final lh.d D;
    public final TextView E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public cq N;
    public cq O;
    public vt P;
    public final cq[] Q;
    public final ig0 R;

    public final org.telegram.ui.gy f30675a;

    public final int f30676b;

    public final k51 f30677c;
    public TLRPC.SearchPostsFlood d;

    public final ArrayList f30678e;

    public int f30679f;
    public boolean h;

    public final ArrayList f30680n;

    public int f30681r;

    public boolean f30682s;
    public boolean v;

    public String f30683w;

    public final FrameLayout f30684x;

    public final hh.m f30685y;

    public mg0(Context context, org.telegram.ui.gy gyVar) {
        super(context);
        this.f30678e = new ArrayList();
        this.f30680n = new ArrayList();
        this.G = -1;
        this.H = 0;
        this.K = -1;
        this.Q = new cq[1];
        this.R = new ig0(this, 1);
        this.f30675a = gyVar;
        int currentAccount = gyVar.getCurrentAccount();
        this.f30676b = currentAccount;
        k51 k51Var = new k51(context, currentAccount, 0, false, new d(this, 18), new vu(this, 11), null, null);
        this.f30677c = k51Var;
        k51Var.j(new fh.l(4, this, gyVar));
        addView(k51Var, h7.z5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30684x = frameLayout;
        hh.m mVar = new hh.m(context, 5);
        this.f30685y = mVar;
        mVar.setOrientation(1);
        frameLayout.addView(mVar, h7.z5.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        n9 n9Var = new n9(context);
        this.A = n9Var;
        n9Var.setVisibility(8);
        mVar.addView(n9Var, h7.z5.t(130, 130, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        this.B = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        mVar.addView(textView, h7.z5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.C = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(4);
        textView2.setEllipsize(truncateAt);
        mVar.addView(textView2, h7.z5.t(-2, -2, 1, 0, 9, 0, 0));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, null, true);
        this.D = dVarG;
        mVar.addView(dVarG, h7.z5.t(-1, 44, 7, 0, 19, 0, 0));
        TextView textView3 = new TextView(context);
        this.E = textView3;
        textView3.setTextSize(1, 12.0f);
        textView3.setGravity(17);
        mVar.addView(textView3, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        k51Var.setHideIfEmpty(false);
        k51Var.setEmptyView(frameLayout);
        k51Var.U1 = true;
        k51Var.V1 = 0;
        c();
        d();
    }

    public final void a(boolean z10) {
        long j10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        if (this.v) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f30683w);
        if (zIsEmpty && this.h) {
            return;
        }
        if (zIsEmpty || !this.f30682s) {
            if (zIsEmpty || this.d != null) {
                this.v = true;
                int i10 = this.f30676b;
                MessagesController messagesController = MessagesController.getInstance(i10);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 2;
                tL_channels_searchPosts.query = this.f30683w;
                tL_channels_searchPosts.limit = 30;
                if (zIsEmpty) {
                    ArrayList arrayList = this.f30678e;
                    if (arrayList.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList);
                        tL_channels_searchPosts.offset_rate = this.f30679f;
                        tL_channels_searchPosts.offset_id = messageObject.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject.messageOwner.peer_id);
                    }
                } else {
                    ArrayList arrayList2 = this.f30680n;
                    if (arrayList2.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        MessageObject messageObject2 = (MessageObject) i0.a.i(1, arrayList2);
                        tL_channels_searchPosts.offset_rate = this.f30681r;
                        tL_channels_searchPosts.offset_id = messageObject2.getRealId();
                        tL_channels_searchPosts.offset_peer = messagesController.getInputPeer(messageObject2.messageOwner.peer_id);
                    }
                }
                if (!z10 || (searchPostsFlood = this.d) == null) {
                    j10 = 0;
                } else {
                    tL_channels_searchPosts.flags |= 4;
                    j10 = searchPostsFlood.stars_amount;
                    tL_channels_searchPosts.allow_paid_stars = j10;
                }
                this.G = connectionsManager.sendRequest(tL_channels_searchPosts, new b7(this, messagesController, zIsEmpty, tL_channels_searchPosts, z10, j10, connectionsManager), 1024);
                d();
                this.f30677c.U2.N(true);
            }
        }
    }

    public final void b(String str) {
        int i10 = this.K;
        int i11 = this.f30676b;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i11).cancelRequest(this.K, true);
            this.K = -1;
        }
        if (!this.I) {
            this.J = this.M && !(this.f30680n.isEmpty() && this.f30682s);
        }
        this.I = true;
        TLRPC.TL_channels_checkSearchPostsFlood tL_channels_checkSearchPostsFlood = new TLRPC.TL_channels_checkSearchPostsFlood();
        if (!TextUtils.isEmpty(str)) {
            tL_channels_checkSearchPostsFlood.flags = 1 | tL_channels_checkSearchPostsFlood.flags;
            tL_channels_checkSearchPostsFlood.query = str;
        }
        this.K = ConnectionsManager.getInstance(i11).sendRequest(tL_channels_checkSearchPostsFlood, new w1(this, 9));
    }

    public final void c() {
        this.f30684x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        int i10 = org.telegram.ui.ActionBar.g6.f23423y6;
        this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.C.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        k51 k51Var = this.f30677c;
        k51Var.setAdapter(null);
        k51Var.setAdapter(k51Var.U2);
        if (this.P != null) {
            this.P = null;
            d();
        }
    }

    public final void d() {
        float f10;
        TLRPC.SearchPostsFlood searchPostsFlood;
        ig0 ig0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(ig0Var);
        int i10 = this.f30676b;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        boolean zIsPremium = UserConfig.getInstance(i10).isPremium();
        TextView textView = this.C;
        TextView textView2 = this.B;
        n9 n9Var = this.A;
        TextView textView3 = this.E;
        final int i11 = 1;
        lh.d dVar = this.D;
        final int i12 = 0;
        if (!zIsPremium) {
            n9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(0);
            dVar.g(LocaleController.getString(R.string.SearchPostsButtonPremium), true, true);
            dVar.f(null, true);
            dVar.setOnClickListener(new View.OnClickListener(this) {

                public final mg0 f29695b;

                {
                    this.f29695b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f29695b.f30675a.presentFragment(new PremiumPreviewFragment(0, "search"));
                            break;
                        case 1:
                            mg0 mg0Var = this.f29695b;
                            mg0Var.D.setLoading(true);
                            mg0Var.a(true);
                            break;
                        default:
                            mg0 mg0Var2 = this.f29695b;
                            mg0Var2.D.setLoading(true);
                            mg0Var2.a(false);
                            break;
                    }
                }
            });
            textView3.setVisibility(0);
            textView3.setText(LocaleController.getString(R.string.SearchPostsPremium));
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f30683w);
        ArrayList arrayList = this.f30680n;
        if (!zIsEmpty && arrayList.isEmpty() && this.f30682s) {
            if (n9Var.getImageReceiver().getImageDrawable() == null) {
                n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
            }
            n9Var.setVisibility(0);
            textView2.setText(LocaleController.getString(R.string.SearchPostsNotFound));
            textView.setText(LocaleController.formatString(R.string.SearchPostsNotFoundText, TextUtils.ellipsize(this.f30683w, textView.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END)));
            dVar.setVisibility(8);
            textView3.setVisibility(8);
            return;
        }
        final int i13 = 2;
        if (TextUtils.isEmpty(this.f30683w) || (searchPostsFlood = this.d) == null) {
            f10 = 100.0f;
        } else {
            f10 = 100.0f;
            if ((searchPostsFlood.flags & 2) != 0 && currentTime < searchPostsFlood.wait_till) {
                n9Var.setVisibility(8);
                textView2.setText(LocaleController.getString(R.string.SearchPostsLimitReached));
                textView.setText(LocaleController.formatPluralStringComma("SearchPostsLimitReachedText", this.d.total_daily));
                int i14 = this.d.wait_till - currentTime;
                int i15 = i14 / 3600;
                int i16 = i14 - (i15 * 3600);
                int i17 = i16 / 60;
                int i18 = i16 - (i17 * 60);
                dVar.setVisibility(0);
                dVar.g(hh.oa.R0(LocaleController.formatPluralStringComma("SearchPostsButtonPay", (int) this.d.stars_amount), 1.13f, this.Q), true, true);
                int i19 = R.string.SearchPostsFreeSearchUnlocksIn;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i15 > 0 ? s3.c.d(i15, ":") : "");
                sb2.append(i17 < 10 ? i0.a.k(i17, "0") : Integer.valueOf(i17));
                sb2.append(":");
                sb2.append(i18 < 10 ? i0.a.k(i18, "0") : Integer.valueOf(i18));
                dVar.f(LocaleController.formatString(i19, sb2.toString()), true);
                dVar.f15827e.o(false, true, false);
                dVar.setOnClickListener(new View.OnClickListener(this) {

                    public final mg0 f29695b;

                    {
                        this.f29695b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.f29695b.f30675a.presentFragment(new PremiumPreviewFragment(0, "search"));
                                break;
                            case 1:
                                mg0 mg0Var = this.f29695b;
                                mg0Var.D.setLoading(true);
                                mg0Var.a(true);
                                break;
                            default:
                                mg0 mg0Var2 = this.f29695b;
                                mg0Var2.D.setLoading(true);
                                mg0Var2.a(false);
                                break;
                        }
                    }
                });
                AndroidUtilities.runOnUIThread(ig0Var, 1000L);
                textView3.setVisibility(8);
                return;
            }
        }
        if (!arrayList.isEmpty() || this.v || TextUtils.isEmpty(this.f30683w)) {
            n9Var.setVisibility(8);
            textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
            textView.setText(LocaleController.getString(R.string.SearchPostsText));
            dVar.setVisibility(8);
            if (this.d == null) {
                textView3.setVisibility(8);
                return;
            }
            textView3.setVisibility(0);
            TLRPC.SearchPostsFlood searchPostsFlood2 = this.d;
            int i20 = searchPostsFlood2.remains;
            if (i20 < 1) {
                i20 = searchPostsFlood2.total_daily;
            }
            textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i20));
            return;
        }
        n9Var.setVisibility(8);
        textView2.setText(LocaleController.getString(R.string.SearchPostsTitle));
        textView.setText(LocaleController.getString(R.string.SearchPostsText));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("s ");
        if (this.N == null) {
            cq cqVar = new cq(R.drawable.smiles_tab_search, 0);
            this.N = cqVar;
            cqVar.setScale(0.79f, 0.79f);
        }
        if (this.P == null) {
            this.P = new vt(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false), org.telegram.ui.ActionBar.g6.l1(0.75f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false))), i11);
        }
        spannableStringBuilder.setSpan(this.N, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SearchPostsButton));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(TextUtils.ellipsize(this.f30683w, dVar.getTextPaint(), AndroidUtilities.dp(f10), TextUtils.TruncateAt.END));
        spannableStringBuilder.setSpan(this.P, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " >");
        if (this.O == null) {
            cq cqVar2 = new cq(R.drawable.msg_mini_forumarrow, 0);
            this.O = cqVar2;
            cqVar2.setScale(1.05f, 1.05f);
        }
        spannableStringBuilder.setSpan(this.O, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        dVar.setVisibility(0);
        dVar.g(spannableStringBuilder, true, true);
        dVar.d.o(false, false, false);
        dVar.f(null, true);
        dVar.setOnClickListener(new View.OnClickListener(this) {

            public final mg0 f29695b;

            {
                this.f29695b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f29695b.f30675a.presentFragment(new PremiumPreviewFragment(0, "search"));
                        break;
                    case 1:
                        mg0 mg0Var = this.f29695b;
                        mg0Var.D.setLoading(true);
                        mg0Var.a(true);
                        break;
                    default:
                        mg0 mg0Var2 = this.f29695b;
                        mg0Var2.D.setLoading(true);
                        mg0Var2.a(false);
                        break;
                }
            }
        });
        if (this.d == null) {
            textView3.setVisibility(8);
            return;
        }
        textView3.setVisibility(0);
        TLRPC.SearchPostsFlood searchPostsFlood3 = this.d;
        int i21 = searchPostsFlood3.remains;
        if (i21 < 1) {
            i21 = searchPostsFlood3.total_daily;
        }
        textView3.setText(LocaleController.formatPluralStringComma("SearchPostsFreeSearches", i21));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d == null) {
            b(null);
        }
        if (this.L) {
            return;
        }
        this.L = true;
        MessagesController.getGlobalMainSettings().edit().putInt("searchpostsnew", MessagesController.getGlobalMainSettings().getInt("searchpostsnew", 0) + 1).apply();
        hh.u7.y(this.f30676b, false).p();
    }

    @Override
    public final void requestLayout() {
        if (this.F) {
            return;
        }
        super.requestLayout();
    }

    public void setKeyboardHeight(int i10) {
        this.f30685y.animate().translationY((-i10) / 2.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.f23706w).start();
    }
}
