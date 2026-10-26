package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ta0 extends org.telegram.ui.ActionBar.r2 implements tv0, og.b, NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public int F;
    public org.telegram.ui.ActionBar.g1 G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.g1 I;
    public org.telegram.ui.rg0 J;
    public final qh.b[] K;
    public int L;
    public FrameLayout M;
    public fi.d N;
    public oe.b O;
    public View P;
    public bi.u7 Q;
    public sa0 R;
    public int S;
    public String T;
    public int U;
    public int f32950a;
    public sv0 f32951b;
    public TLRPC.ChatFull f32952c;
    public TLRPC.UserFull d;
    public long e;
    public long f32953f;
    public String h;
    public String f32954n;
    public int f32955r;
    public org.telegram.ui.ActionBar.y5 f32956s;
    public SparseArray v;
    public org.telegram.ui.ActionBar.g1 f32957w;
    public org.telegram.ui.ActionBar.g1 f32958x;
    public boolean f32959y;

    public ta0(Bundle bundle, sv0 sv0Var) {
        super(bundle);
        this.f32959y = true;
        this.E = true;
        this.F = -12;
        this.K = new qh.b[2];
        this.L = -1;
        this.f32951b = sv0Var;
    }

    public static int W(ta0 ta0Var) {
        return ta0Var.classGuid;
    }

    @Override
    public final List B() {
        String str;
        Activity parentActivity = getParentActivity();
        DispatchQueue dispatchQueue = rg.k1.f47449m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new og.a(str.concat(" shape detector learning debug"), new bq(this, 29)));
    }

    @Override
    public final void N() {
        sv0 sv0Var;
        sa0 sa0Var = this.R;
        if (sa0Var != null && (sv0Var = this.f32951b) != null) {
            sa0Var.setNewMediaCounts(sv0Var.f32691c);
        }
        c0();
    }

    public final void X() {
        int i10;
        if (this.R == null) {
            return;
        }
        int i11 = 0;
        if (this.J != null) {
            i10 = AndroidUtilities.dp(72.0f);
        } else {
            i10 = 0;
        }
        this.R.h1((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f13451b) - AndroidUtilities.dp(6.0f), oi.a.c(this.mSystemInsets.f13451b), oi.a.c(this.mSystemInsets.d + i10), this.mSystemInsets.d + i10);
        if (this.P != null) {
            int dp = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.f13451b;
            if (this.P.getLayoutParams().height != dp) {
                this.P.getLayoutParams().height = dp;
                this.P.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i12 = this.mSystemInsets.d;
            layoutParams.height = i12 + i10;
            View view2 = this.navigationBarFadeView;
            if (i12 < AndroidUtilities.dp(40.0f) && i10 <= 0) {
                i11 = 8;
            }
            view2.setVisibility(i11);
            this.navigationBarFadeView.requestLayout();
        }
        Y();
    }

    public final void Y() {
        int i10;
        int i11;
        if (this.J == null) {
            return;
        }
        float f7 = this.O.e;
        float dp = AndroidUtilities.dp(72.0f) + this.mSystemInsets.d;
        this.J.setTranslationY((dp * f7) + (-i10));
        float f10 = 1.0f - f7;
        this.J.setAlpha(f10);
        org.telegram.ui.rg0 rg0Var = this.J;
        int i12 = 4;
        if (f7 < 1.0f) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        rg0Var.setVisibility(i11);
        this.M.setTranslationY((dp * f10) + (-this.mSystemInsets.d));
        this.M.setAlpha(f7);
        FrameLayout frameLayout = this.M;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        frameLayout.setVisibility(i12);
    }

    public final boolean Z() {
        int i10 = this.f32950a;
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final void a0(TLRPC.ChatFull chatFull) {
        this.f32952c = chatFull;
    }

    public final void b0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    public final void c0() {
        boolean z10;
        int size;
        boolean z11;
        float f7;
        float f10;
        int size2;
        int i10;
        sa0 sa0Var = this.R;
        if (sa0Var != null && this.simpleActionBar != null) {
            int closestTab = sa0Var.getClosestTab();
            if (this.f32950a != 3 || closestTab == 8) {
                int[] iArr = this.f32951b.f32691c;
                boolean z12 = LocaleController.isRTL;
                boolean z13 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        b0(LocaleController.formatPluralString("SavedDialogsTabCount", getMessagesController().getSavedMessagesController().getAllCount(), new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.R.getPhotosVideosTypeFilter() == 1) {
                                    b0(LocaleController.formatPluralString("Photos", iArr[6], new Object[0]));
                                    return;
                                } else if (this.R.getPhotosVideosTypeFilter() == 2) {
                                    b0(LocaleController.formatPluralString("Videos", iArr[7], new Object[0]));
                                    return;
                                } else {
                                    b0(LocaleController.formatPluralString("Media", iArr[0], new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                b0(LocaleController.formatPluralString("Files", iArr[1], new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                b0(LocaleController.formatPluralString("Voice", iArr[2], new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                b0(LocaleController.formatPluralString("Links", iArr[3], new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                b0(LocaleController.formatPluralString("MusicFiles", iArr[4], new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                b0(LocaleController.formatPluralString("GIFs", iArr[5], new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i10 = iArr[8]) >= 0) {
                                b0(LocaleController.formatPluralString("ProfilePollsCount", i10, new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.e);
                                if (channelRecommendations == null) {
                                    size2 = 0;
                                } else {
                                    size2 = channelRecommendations.chats.size() + channelRecommendations.more;
                                }
                                b0(LocaleController.formatPluralString("Channels", size2, new Object[0]));
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.g1 g1Var = this.I;
                float f11 = 0.5f;
                if (g1Var != null) {
                    g1Var.setEnabled(this.R.I());
                    org.telegram.ui.ActionBar.g1 g1Var2 = this.I;
                    if (g1Var2.isEnabled()) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.5f;
                    }
                    g1Var2.setAlpha(f10);
                }
                org.telegram.ui.ActionBar.g1 g1Var3 = this.H;
                if (g1Var3 != null) {
                    g1Var3.setEnabled(this.R.H());
                    org.telegram.ui.ActionBar.g1 g1Var4 = this.H;
                    if (g1Var4.isEnabled()) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.5f;
                    }
                    g1Var4.setAlpha(f7);
                }
                int j02 = this.R.j0(closestTab);
                if (this.f32950a == 3) {
                    if (j02 > 0) {
                        b0(LocaleController.formatPluralStringSpaced("FoundStories", j02));
                    }
                } else {
                    String str = null;
                    if (closestTab == 8) {
                        if (j02 > 0) {
                            str = LocaleController.formatPluralString("ProfileMyStoriesCount", j02, new Object[0]);
                        }
                        b0(str);
                    } else {
                        if (j02 > 0) {
                            str = LocaleController.formatPluralString("ProfileStoriesArchiveCount", j02, new Object[0]);
                        }
                        b0(str);
                    }
                }
                d0(true);
                org.telegram.ui.ActionBar.y5 y5Var = this.f32956s;
                if (y5Var != null) {
                    if (j02 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y5Var.Y(z11, true);
                }
                fi.d dVar = this.N;
                if (dVar != null) {
                    if (!z12 && this.U == closestTab) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.v;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        dVar.i(LocaleController.formatPluralString("ArchiveStories", size, new Object[0]), z10, true);
                    } else {
                        dVar.i(LocaleController.getString(R.string.SaveToProfile), z10, true);
                    }
                    this.U = closestTab;
                }
                org.telegram.ui.ActionBar.g1 g1Var5 = this.G;
                if (g1Var5 != null) {
                    if (j02 <= 0) {
                        z13 = false;
                    }
                    g1Var5.setEnabled(z13);
                    org.telegram.ui.ActionBar.g1 g1Var6 = this.G;
                    if (z13) {
                        f11 = 1.0f;
                    }
                    g1Var6.setAlpha(f11);
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.R.F0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final View createView(Context context) {
        oi.a aVar;
        int childCount;
        int i10;
        int i11 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new org.telegram.ui.ga(this, 13));
        bh.r rVar = new bh.r(this, context, 19);
        this.fragmentView = rVar;
        if (this.f32950a == 0 && this.e == getUserConfig().getClientUserId() && this.f32953f == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().hasDialogs()) {
            this.S = 11;
        }
        oi.a baseSimpleGlass = getBaseSimpleGlass();
        sa0 sa0Var = new sa0(this, context, this.e, this.f32951b, this.f32952c, this.d, this.S, this, new ra0(this), getResourceProvider(), baseSimpleGlass.f19421c);
        this.R = sa0Var;
        sa0Var.K0.setOpen(true);
        this.R.setPinnedToTop(true);
        rVar.addView(this.R, gb1.g(-1.0f, -1));
        if (Z()) {
            org.telegram.ui.ActionBar.y5 a2 = this.simpleActionBar.j().a(0, R.drawable.ic_ab_other);
            this.f32956s = a2;
            a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            this.f32956s.Y(false, false);
            org.telegram.ui.ActionBar.g1 e = this.f32956s.e(8, R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn));
            this.H = e;
            e.setOnClickListener(new View.OnClickListener(this) {
                public final ta0 f31872b;

                {
                    this.f31872b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    boolean z10;
                    int i12;
                    qc j10;
                    int i13 = r2;
                    ta0 ta0Var = this.f31872b;
                    switch (i13) {
                        case 0:
                            Boolean K1 = ta0Var.R.K1(null, null);
                            if (K1 != null) {
                                ta0Var.e0(true, K1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean L1 = ta0Var.R.L1(null, null);
                            if (L1 != null) {
                                ta0Var.e0(L1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = ta0Var.f32959y;
                            if (z11 && !ta0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ta0Var.f32957w;
                                int i14 = -ta0Var.F;
                                ta0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = ta0Var.f32957w;
                            boolean z12 = !z11;
                            ta0Var.f32959y = z12;
                            g1Var2.setChecked(z12);
                            sa0 sa0Var2 = ta0Var.R;
                            boolean z13 = ta0Var.f32959y;
                            boolean z14 = ta0Var.E;
                            hu0 hu0Var = sa0Var2.f26650e0;
                            if (hu0Var != null && (z6Var2 = hu0Var.f34833s) != null) {
                                z6Var2.f9498n = z13;
                                z6Var2.f9499o = z14;
                                z6Var2.d(true);
                            }
                            ts0 ts0Var = sa0Var2.f26657g0;
                            if (ts0Var != null && (z6Var = ts0Var.f34833s) != null) {
                                z6Var.f9498n = z13;
                                z6Var.f9499o = z14;
                                z6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = ta0Var.E;
                            if (z15 && !ta0Var.f32959y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ta0Var.f32958x;
                                int i15 = -ta0Var.F;
                                ta0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var4 = ta0Var.f32958x;
                            boolean z16 = !z15;
                            ta0Var.E = z16;
                            g1Var4.setChecked(z16);
                            sa0 sa0Var3 = ta0Var.R;
                            boolean z17 = ta0Var.f32959y;
                            boolean z18 = ta0Var.E;
                            hu0 hu0Var2 = sa0Var3.f26650e0;
                            if (hu0Var2 != null && (z6Var4 = hu0Var2.f34833s) != null) {
                                z6Var4.f9498n = z17;
                                z6Var4.f9499o = z18;
                                z6Var4.d(true);
                            }
                            ts0 ts0Var2 = sa0Var3.f26657g0;
                            if (ts0Var2 != null && (z6Var3 = ts0Var2.f34833s) != null) {
                                z6Var3.f9498n = z17;
                                z6Var3.f9499o = z18;
                                z6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            ta0 ta0Var2 = this.f31872b;
                            bi.u7 u7Var = ta0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ta0Var2.Q = null;
                            }
                            qc.e();
                            if (ta0Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (ta0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ta0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ta0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            ta0Var2.R.S(false);
                            if (z10) {
                                ta0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                ta0Var2.getMessagesController().getStoriesController().n0(ta0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ta0Var2.Q = new bi.u7(ta0Var2, arrayList, z10, 21);
                                e10 e10Var = new e10(ta0Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j10 = wc.b0(ta0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i12, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j();
                                } else {
                                    j10 = wc.b0(ta0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i12, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j();
                                }
                                j10.f31901w = new t90(2, ta0Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e10 = this.f32956s.e(9, R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut));
            this.I = e10;
            e10.setOnClickListener(new View.OnClickListener(this) {
                public final ta0 f31872b;

                {
                    this.f31872b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    boolean z10;
                    int i12;
                    qc j10;
                    int i13 = r2;
                    ta0 ta0Var = this.f31872b;
                    switch (i13) {
                        case 0:
                            Boolean K1 = ta0Var.R.K1(null, null);
                            if (K1 != null) {
                                ta0Var.e0(true, K1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean L1 = ta0Var.R.L1(null, null);
                            if (L1 != null) {
                                ta0Var.e0(L1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = ta0Var.f32959y;
                            if (z11 && !ta0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ta0Var.f32957w;
                                int i14 = -ta0Var.F;
                                ta0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = ta0Var.f32957w;
                            boolean z12 = !z11;
                            ta0Var.f32959y = z12;
                            g1Var2.setChecked(z12);
                            sa0 sa0Var2 = ta0Var.R;
                            boolean z13 = ta0Var.f32959y;
                            boolean z14 = ta0Var.E;
                            hu0 hu0Var = sa0Var2.f26650e0;
                            if (hu0Var != null && (z6Var2 = hu0Var.f34833s) != null) {
                                z6Var2.f9498n = z13;
                                z6Var2.f9499o = z14;
                                z6Var2.d(true);
                            }
                            ts0 ts0Var = sa0Var2.f26657g0;
                            if (ts0Var != null && (z6Var = ts0Var.f34833s) != null) {
                                z6Var.f9498n = z13;
                                z6Var.f9499o = z14;
                                z6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = ta0Var.E;
                            if (z15 && !ta0Var.f32959y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ta0Var.f32958x;
                                int i15 = -ta0Var.F;
                                ta0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var4 = ta0Var.f32958x;
                            boolean z16 = !z15;
                            ta0Var.E = z16;
                            g1Var4.setChecked(z16);
                            sa0 sa0Var3 = ta0Var.R;
                            boolean z17 = ta0Var.f32959y;
                            boolean z18 = ta0Var.E;
                            hu0 hu0Var2 = sa0Var3.f26650e0;
                            if (hu0Var2 != null && (z6Var4 = hu0Var2.f34833s) != null) {
                                z6Var4.f9498n = z17;
                                z6Var4.f9499o = z18;
                                z6Var4.d(true);
                            }
                            ts0 ts0Var2 = sa0Var3.f26657g0;
                            if (ts0Var2 != null && (z6Var3 = ts0Var2.f34833s) != null) {
                                z6Var3.f9498n = z17;
                                z6Var3.f9499o = z18;
                                z6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            ta0 ta0Var2 = this.f31872b;
                            bi.u7 u7Var = ta0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ta0Var2.Q = null;
                            }
                            qc.e();
                            if (ta0Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (ta0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ta0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ta0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            ta0Var2.R.S(false);
                            if (z10) {
                                ta0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                ta0Var2.getMessagesController().getStoriesController().n0(ta0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ta0Var2.Q = new bi.u7(ta0Var2, arrayList, z10, 21);
                                e10 e10Var = new e10(ta0Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j10 = wc.b0(ta0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i12, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j();
                                } else {
                                    j10 = wc.b0(ta0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i12, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j();
                                }
                                j10.f31901w = new t90(2, ta0Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.g1 e11 = this.f32956s.e(10, R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar));
            this.G = e11;
            e11.setEnabled(false);
            this.G.setAlpha(0.5f);
            this.f32956s.a(-1);
            org.telegram.ui.ActionBar.y5 y5Var = this.f32956s;
            org.telegram.ui.ActionBar.g1 d = y5Var.d(6, 0, null, LocaleController.getString(R.string.MediaShowPhotos), true, true, y5Var.m0);
            this.f32957w = d;
            d.setChecked(this.f32959y);
            this.f32957w.setOnClickListener(new View.OnClickListener(this) {
                public final ta0 f31872b;

                {
                    this.f31872b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    boolean z10;
                    int i12;
                    qc j10;
                    int i13 = r2;
                    ta0 ta0Var = this.f31872b;
                    switch (i13) {
                        case 0:
                            Boolean K1 = ta0Var.R.K1(null, null);
                            if (K1 != null) {
                                ta0Var.e0(true, K1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean L1 = ta0Var.R.L1(null, null);
                            if (L1 != null) {
                                ta0Var.e0(L1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = ta0Var.f32959y;
                            if (z11 && !ta0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ta0Var.f32957w;
                                int i14 = -ta0Var.F;
                                ta0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = ta0Var.f32957w;
                            boolean z12 = !z11;
                            ta0Var.f32959y = z12;
                            g1Var2.setChecked(z12);
                            sa0 sa0Var2 = ta0Var.R;
                            boolean z13 = ta0Var.f32959y;
                            boolean z14 = ta0Var.E;
                            hu0 hu0Var = sa0Var2.f26650e0;
                            if (hu0Var != null && (z6Var2 = hu0Var.f34833s) != null) {
                                z6Var2.f9498n = z13;
                                z6Var2.f9499o = z14;
                                z6Var2.d(true);
                            }
                            ts0 ts0Var = sa0Var2.f26657g0;
                            if (ts0Var != null && (z6Var = ts0Var.f34833s) != null) {
                                z6Var.f9498n = z13;
                                z6Var.f9499o = z14;
                                z6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = ta0Var.E;
                            if (z15 && !ta0Var.f32959y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ta0Var.f32958x;
                                int i15 = -ta0Var.F;
                                ta0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var4 = ta0Var.f32958x;
                            boolean z16 = !z15;
                            ta0Var.E = z16;
                            g1Var4.setChecked(z16);
                            sa0 sa0Var3 = ta0Var.R;
                            boolean z17 = ta0Var.f32959y;
                            boolean z18 = ta0Var.E;
                            hu0 hu0Var2 = sa0Var3.f26650e0;
                            if (hu0Var2 != null && (z6Var4 = hu0Var2.f34833s) != null) {
                                z6Var4.f9498n = z17;
                                z6Var4.f9499o = z18;
                                z6Var4.d(true);
                            }
                            ts0 ts0Var2 = sa0Var3.f26657g0;
                            if (ts0Var2 != null && (z6Var3 = ts0Var2.f34833s) != null) {
                                z6Var3.f9498n = z17;
                                z6Var3.f9499o = z18;
                                z6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            ta0 ta0Var2 = this.f31872b;
                            bi.u7 u7Var = ta0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ta0Var2.Q = null;
                            }
                            qc.e();
                            if (ta0Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (ta0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ta0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ta0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            ta0Var2.R.S(false);
                            if (z10) {
                                ta0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                ta0Var2.getMessagesController().getStoriesController().n0(ta0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ta0Var2.Q = new bi.u7(ta0Var2, arrayList, z10, 21);
                                e10 e10Var = new e10(ta0Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j10 = wc.b0(ta0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i12, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j();
                                } else {
                                    j10 = wc.b0(ta0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i12, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j();
                                }
                                j10.f31901w = new t90(2, ta0Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            org.telegram.ui.ActionBar.y5 y5Var2 = this.f32956s;
            org.telegram.ui.ActionBar.g1 d10 = y5Var2.d(7, 0, null, LocaleController.getString(R.string.MediaShowVideos), true, true, y5Var2.m0);
            this.f32958x = d10;
            d10.setChecked(this.E);
            this.f32958x.setOnClickListener(new View.OnClickListener(this) {
                public final ta0 f31872b;

                {
                    this.f31872b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    boolean z10;
                    int i12;
                    qc j10;
                    int i13 = r2;
                    ta0 ta0Var = this.f31872b;
                    switch (i13) {
                        case 0:
                            Boolean K1 = ta0Var.R.K1(null, null);
                            if (K1 != null) {
                                ta0Var.e0(true, K1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean L1 = ta0Var.R.L1(null, null);
                            if (L1 != null) {
                                ta0Var.e0(L1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = ta0Var.f32959y;
                            if (z11 && !ta0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ta0Var.f32957w;
                                int i14 = -ta0Var.F;
                                ta0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = ta0Var.f32957w;
                            boolean z12 = !z11;
                            ta0Var.f32959y = z12;
                            g1Var2.setChecked(z12);
                            sa0 sa0Var2 = ta0Var.R;
                            boolean z13 = ta0Var.f32959y;
                            boolean z14 = ta0Var.E;
                            hu0 hu0Var = sa0Var2.f26650e0;
                            if (hu0Var != null && (z6Var2 = hu0Var.f34833s) != null) {
                                z6Var2.f9498n = z13;
                                z6Var2.f9499o = z14;
                                z6Var2.d(true);
                            }
                            ts0 ts0Var = sa0Var2.f26657g0;
                            if (ts0Var != null && (z6Var = ts0Var.f34833s) != null) {
                                z6Var.f9498n = z13;
                                z6Var.f9499o = z14;
                                z6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = ta0Var.E;
                            if (z15 && !ta0Var.f32959y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ta0Var.f32958x;
                                int i15 = -ta0Var.F;
                                ta0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var4 = ta0Var.f32958x;
                            boolean z16 = !z15;
                            ta0Var.E = z16;
                            g1Var4.setChecked(z16);
                            sa0 sa0Var3 = ta0Var.R;
                            boolean z17 = ta0Var.f32959y;
                            boolean z18 = ta0Var.E;
                            hu0 hu0Var2 = sa0Var3.f26650e0;
                            if (hu0Var2 != null && (z6Var4 = hu0Var2.f34833s) != null) {
                                z6Var4.f9498n = z17;
                                z6Var4.f9499o = z18;
                                z6Var4.d(true);
                            }
                            ts0 ts0Var2 = sa0Var3.f26657g0;
                            if (ts0Var2 != null && (z6Var3 = ts0Var2.f34833s) != null) {
                                z6Var3.f9498n = z17;
                                z6Var3.f9499o = z18;
                                z6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            ta0 ta0Var2 = this.f31872b;
                            bi.u7 u7Var = ta0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ta0Var2.Q = null;
                            }
                            qc.e();
                            if (ta0Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (ta0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ta0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ta0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i12 = i16;
                            } else {
                                i12 = 0;
                            }
                            ta0Var2.R.S(false);
                            if (z10) {
                                ta0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                ta0Var2.getMessagesController().getStoriesController().n0(ta0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ta0Var2.Q = new bi.u7(ta0Var2, arrayList, z10, 21);
                                e10 e10Var = new e10(ta0Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j10 = wc.b0(ta0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i12, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j();
                                } else {
                                    j10 = wc.b0(ta0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i12, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j();
                                }
                                j10.f31901w = new t90(2, ta0Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i12 = this.f32950a;
        qh.b[] bVarArr = this.K;
        if (i12 == 1) {
            org.telegram.ui.rg0 rg0Var = new org.telegram.ui.rg0(context, getResourceProvider());
            this.J = rg0Var;
            rg0Var.setClipChildren(false);
            this.J.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            bVarArr[0] = qh.b.c(context, getResourceProvider(), qh.a.STORIES_SAVED, R.string.ProfileMyStoriesTab);
            bVarArr[1] = qh.b.c(context, getResourceProvider(), qh.a.STORIES_ARCHIVE, R.string.ProfileStoriesArchiveTab);
            for (int i13 = 0; i13 < bVarArr.length; i13++) {
                bVarArr[i13].setOnClickListener(new ai.w(this, i13, 15));
                this.J.addView(bVarArr[i13]);
                this.J.i(bVarArr[i13], true, false);
            }
            aVar = baseSimpleGlass;
            eh.d c10 = aVar.f19421c.c(this.J, gh.c.f(getResourceProvider()), false);
            org.telegram.messenger.vh.s(c10, AndroidUtilities.dp(28.0f), 7.666f);
            this.J.setBackground(c10);
            rVar.addView(this.J, gb1.i(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.M = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            fi.d dVar = new fi.d(context, getResourceProvider(), true);
            this.N = dVar;
            dVar.i(LocaleController.getString(R.string.SaveToProfile), false, true);
            this.N.setShowZero(true);
            this.N.b(0, false);
            this.N.setEnabled(false);
            this.N.setOnClickListener(new View.OnClickListener(this) {
                public final ta0 f31872b;

                {
                    this.f31872b = this;
                }

                @Override
                public final void onClick(View view) {
                    di.z6 z6Var;
                    di.z6 z6Var2;
                    di.z6 z6Var3;
                    di.z6 z6Var4;
                    boolean z10;
                    int i122;
                    qc j10;
                    int i132 = r2;
                    ta0 ta0Var = this.f31872b;
                    switch (i132) {
                        case 0:
                            Boolean K1 = ta0Var.R.K1(null, null);
                            if (K1 != null) {
                                ta0Var.e0(true, K1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean L1 = ta0Var.R.L1(null, null);
                            if (L1 != null) {
                                ta0Var.e0(L1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z11 = ta0Var.f32959y;
                            if (z11 && !ta0Var.E) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var = ta0Var.f32957w;
                                int i14 = -ta0Var.F;
                                ta0Var.F = i14;
                                AndroidUtilities.shakeViewSpring(g1Var, i14);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = ta0Var.f32957w;
                            boolean z12 = !z11;
                            ta0Var.f32959y = z12;
                            g1Var2.setChecked(z12);
                            sa0 sa0Var2 = ta0Var.R;
                            boolean z13 = ta0Var.f32959y;
                            boolean z14 = ta0Var.E;
                            hu0 hu0Var = sa0Var2.f26650e0;
                            if (hu0Var != null && (z6Var2 = hu0Var.f34833s) != null) {
                                z6Var2.f9498n = z13;
                                z6Var2.f9499o = z14;
                                z6Var2.d(true);
                            }
                            ts0 ts0Var = sa0Var2.f26657g0;
                            if (ts0Var != null && (z6Var = ts0Var.f34833s) != null) {
                                z6Var.f9498n = z13;
                                z6Var.f9499o = z14;
                                z6Var.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z15 = ta0Var.E;
                            if (z15 && !ta0Var.f32959y) {
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                org.telegram.ui.ActionBar.g1 g1Var3 = ta0Var.f32958x;
                                int i15 = -ta0Var.F;
                                ta0Var.F = i15;
                                AndroidUtilities.shakeViewSpring(g1Var3, i15);
                                return;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var4 = ta0Var.f32958x;
                            boolean z16 = !z15;
                            ta0Var.E = z16;
                            g1Var4.setChecked(z16);
                            sa0 sa0Var3 = ta0Var.R;
                            boolean z17 = ta0Var.f32959y;
                            boolean z18 = ta0Var.E;
                            hu0 hu0Var2 = sa0Var3.f26650e0;
                            if (hu0Var2 != null && (z6Var4 = hu0Var2.f34833s) != null) {
                                z6Var4.f9498n = z17;
                                z6Var4.f9499o = z18;
                                z6Var4.d(true);
                            }
                            ts0 ts0Var2 = sa0Var3.f26657g0;
                            if (ts0Var2 != null && (z6Var3 = ts0Var2.f34833s) != null) {
                                z6Var3.f9498n = z17;
                                z6Var3.f9499o = z18;
                                z6Var3.d(true);
                                return;
                            }
                            return;
                        default:
                            ta0 ta0Var2 = this.f31872b;
                            bi.u7 u7Var = ta0Var2.Q;
                            if (u7Var != null) {
                                u7Var.run();
                                ta0Var2.Q = null;
                            }
                            qc.e();
                            if (ta0Var2.R.getClosestTab() == 9) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (ta0Var2.v != null) {
                                int i16 = 0;
                                for (int i17 = 0; i17 < ta0Var2.v.size(); i17++) {
                                    TL_stories.StoryItem storyItem = ((MessageObject) ta0Var2.v.valueAt(i17)).storyItem;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i16++;
                                    }
                                }
                                i122 = i16;
                            } else {
                                i122 = 0;
                            }
                            ta0Var2.R.S(false);
                            if (z10) {
                                ta0Var2.R.e1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i18);
                                    zArr[i18] = storyItem2.pinned;
                                    storyItem2.pinned = z10;
                                }
                                ta0Var2.getMessagesController().getStoriesController().n0(ta0Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                ta0Var2.Q = new bi.u7(ta0Var2, arrayList, z10, 21);
                                e10 e10Var = new e10(ta0Var2, zArr2, arrayList, zArr, 4);
                                if (z10) {
                                    j10 = wc.b0(ta0Var2).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i122, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), e10Var).j();
                                } else {
                                    j10 = wc.b0(ta0Var2).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i122, new Object[0]), LocaleController.getString(R.string.Undo), 5000, false, e10Var).j();
                                }
                                j10.f31901w = new t90(2, ta0Var2, zArr2);
                                return;
                            }
                            return;
                    }
                }
            });
            this.M.addView(this.N, gb1.g(56.0f, -1));
            this.M.setVisibility(4);
            rVar.addView(this.M, gb1.i(-1, 72, 80));
            this.O = new oe.b(0, new tv(this, 9), ds.h, 320L, false);
            setBulletinDelegate(new bh.c0(this, 9));
        } else {
            aVar = baseSimpleGlass;
        }
        View view = new View(context);
        this.P = view;
        this.R.y(view);
        View view2 = this.P;
        view2.setBackground(aVar.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(aVar.b(view3));
        View view4 = this.navigationBarFadeView;
        org.telegram.ui.rg0 rg0Var2 = this.J;
        if (rg0Var2 != null) {
            childCount = rVar.indexOfChild(rg0Var2);
        } else {
            childCount = rVar.getChildCount();
        }
        rVar.addView(view4, childCount, gb1.i(-1, 0, 80));
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        aVar.f19423g = rVar;
        aVar.h = null;
        aVar.f(rVar, r5Var, resourceProvider);
        aVar.f19424i = new bi.g(7, this, rVar);
        this.R.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        d0(false);
        if (this.f32950a == 3 && (i10 = this.f32955r) != -1) {
            this.simpleActionBar.setSubtitle(LocaleController.formatPluralStringSpaced("FoundStories", i10));
        }
        X();
        c0();
        if (this.f32950a == 1) {
            if (this.S != 9) {
                i11 = 0;
            }
            org.telegram.ui.rg0 rg0Var3 = this.J;
            if (rg0Var3 != null && this.L != i11) {
                this.L = i11;
                rg0Var3.q(bVarArr[i11], false);
            }
        }
        return rVar;
    }

    public final void d0(boolean z10) {
        long j10;
        String str;
        TLRPC.User user;
        int i10;
        int i11 = this.f32950a;
        boolean z11 = true;
        if (i11 == 3) {
            str = this.h;
        } else if (i11 == 2) {
            str = LocaleController.getString(R.string.ProfileStoriesArchive);
        } else if (i11 == 1) {
            sa0 sa0Var = this.R;
            if (sa0Var != null && sa0Var.getClosestTab() != 9) {
                z11 = false;
            }
            if (z11) {
                i10 = R.string.ProfileStoriesArchive;
            } else {
                i10 = R.string.ProfileMyStories;
            }
            str = LocaleController.getString(i10);
        } else {
            if (this.f32953f != 0 && this.e == getUserConfig().getClientUserId()) {
                j10 = this.f32953f;
            } else {
                j10 = this.e;
            }
            if (j10 == 2666000) {
                str = LocaleController.getString(R.string.AnonymousForward);
            } else if (this.f32953f != 0 && j10 == getUserConfig().getClientUserId()) {
                str = LocaleController.getString(R.string.MyNotes);
            } else if (DialogObject.isEncryptedDialog(j10)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(getMessagesController(), j10);
                if (m10 != null) {
                    user = getMessagesController().getUser(Long.valueOf(m10.user_id));
                } else {
                    user = null;
                }
                if (user != null) {
                    str = ContactsController.formatName(user.first_name, user.last_name);
                }
                str = null;
            } else if (DialogObject.isUserDialog(j10)) {
                TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j10));
                if (user2 != null) {
                    if (user2.self) {
                        str = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        str = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                str = null;
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
                if (chat != null) {
                    str = chat.title;
                }
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = LocaleController.getString(R.string.SharedContentTitle);
            }
        }
        String str2 = str;
        boolean z12 = z11;
        if (TextUtils.equals(this.T, str2)) {
            return;
        }
        this.T = str2;
        if (z10) {
            org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
            r5Var.getClass();
            r5Var.w(str2, z12, 320L, ds.h);
            return;
        }
        this.simpleActionBar.setTitle(str2);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.userInfoDidLoad && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            sa0 sa0Var = this.R;
            if (sa0Var != null) {
                sa0Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(boolean z10, boolean z11) {
        float f7;
        this.I.setEnabled(z10);
        ViewPropertyAnimator animate = this.I.animate();
        float f10 = 0.5f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        animate.alpha(f7).start();
        this.H.setEnabled(z11);
        ViewPropertyAnimator animate2 = this.H.animate();
        if (z11) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).start();
    }

    @Override
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        if (getLastStoryViewer() != null && getLastStoryViewer().attachedToParent()) {
            return getLastStoryViewer().getNavigationBarColor(navigationBarColor);
        }
        return navigationBarColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.R.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.R.F0()) {
            return false;
        }
        sa0 sa0Var = this.R;
        if (sa0Var.getSelectedTab() != sa0Var.K0.getFirstTabId()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            sa0 sa0Var = this.R;
            if (sa0Var.E1) {
                if (z10) {
                    sa0Var.S(false);
                }
            } else {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10;
        this.f32950a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f32953f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.f32954n = getArguments().getString("username", "");
        this.f32955r = getArguments().getInt("storiesCount", -1);
        int i11 = this.f32950a;
        if (i11 == 2) {
            i10 = 9;
        } else if (i11 == 1) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.S = getArguments().getInt("start_from", i10);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesEnabledUpdate);
        if (DialogObject.isUserDialog(this.e) && this.f32953f == 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.e));
            if (UserObject.isUserSelf(user)) {
                getMessagesController().loadUserInfo(user, false, this.classGuid);
                this.d = getMessagesController().getUserFull(this.e);
            }
        }
        if (this.f32951b == null) {
            this.f32951b = new sv0(this);
        }
        this.f32951b.f32697x.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesEnabledUpdate);
        bi.u7 u7Var = this.Q;
        if (u7Var != null) {
            this.Q = null;
            AndroidUtilities.runOnUIThread(u7Var);
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        X();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
