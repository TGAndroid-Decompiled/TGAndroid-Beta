package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class yn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.m2 G;
    public boolean H;
    public org.telegram.ui.b20 I;
    public final org.telegram.ui.u10 J;
    public String K;
    public String L;
    public qn0 M;
    public final rl0 N;
    public boolean O;
    public boolean P;
    public final wx0 f31653a;
    public final bi.o0 f31654b;
    public final xn0 f31655c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f31656f;
    public final ArrayList h;
    public final ArrayList f31657n;
    public int f31658r;
    public int f31659s;
    public int v;
    public int f31660w;
    public int f31661x;
    public int f31662y;

    public yn0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getParentActivity());
        xn0 xn0Var = new xn0(this);
        this.f31655c = xn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f31656f = new ArrayList();
        this.h = new ArrayList();
        this.f31657n = new ArrayList();
        this.f31659s = -1;
        this.v = -1;
        this.f31660w = -1;
        this.f31661x = -1;
        this.f31662y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.u10(0, 0L);
        this.G = m2Var;
        this.F = m2Var.getParentActivity();
        this.d = i10;
        bi.o0 o0Var = new bi.o0(this, getContext(), 19);
        this.f31654b = o0Var;
        new s4.y(new ci.f(this, 3)).d(o0Var);
        addView(o0Var);
        m2Var.getParentActivity();
        o0Var.setLayoutManager(new hg.a0(10));
        o0Var.setAdapter(xn0Var);
        o0Var.setOnScrollListener(new kc0(this, 4));
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f44872m = false;
        o0Var.setItemAnimator(kVar);
        o0Var.setOnItemClickListener(new rn0(this, i10, 0));
        o0Var.setOnItemLongClickListener(new xv(this, 17));
        this.N = new rl0(o0Var, true);
        f10 f10Var = new f10(getContext(), null);
        addView(f10Var);
        f10Var.setUseHeaderOffset(true);
        f10Var.setViewType(3);
        f10Var.setVisibility(8);
        wx0 wx0Var = new wx0(getContext(), f10Var, 1, null);
        this.f31653a = wx0Var;
        addView(wx0Var);
        o0Var.setEmptyView(wx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        bi.o0 o0Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (o0Var = this.f31654b) != null) {
            for (int i11 = 0; i11 < o0Var.getChildCount(); i11++) {
                try {
                    View childAt = o0Var.getChildAt(i11);
                    if ((childAt instanceof un0) && (message = ((un0) childAt).f29739a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        bi.o0 o0Var = this.f31654b;
        if (z10) {
            o0Var.o1(0, i10, 0, i11);
        } else {
            o0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.m2 m2Var = this.G;
        if (m2Var != null && this.f31654b.G) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(i12).uploadPremiumSpeedupNotifyPeriod * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!UserConfig.getInstance(i12).isPremium() && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                    if (z10) {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupUpload;
                    } else {
                        f7 = MessagesController.getInstance(i12).uploadPremiumSpeedupDownload;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new i61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!m2Var.hasStoryViewer()) {
                        zc a02 = zc.a0(m2Var);
                        int i13 = R.raw.speed_limit;
                        if (z10) {
                            i10 = R.string.UploadSpeedLimited;
                        } else {
                            i10 = R.string.DownloadSpeedLimited;
                        }
                        String string = LocaleController.getString(i10);
                        if (z10) {
                            i11 = R.string.UploadSpeedLimitedMessage;
                        } else {
                            i11 = R.string.DownloadSpeedLimitedMessage;
                        }
                        sc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new sn0(0, this, z10)), spannableString), i13);
                        M.f29102j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        xn0 xn0Var = this.f31655c;
        xn0Var.q(0, xn0Var.f31288c.f31658r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f31653a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                qn0 qn0Var = new qn0(this, arrayList, lowerCase, arrayList2);
                this.M = qn0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue.postRunnable(qn0Var, j10);
                this.f31657n.clear();
                this.h.clear();
                if (!equals) {
                    this.f31653a.e(true, true);
                    e(this.h, this.f31657n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f31658r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f31657n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f31657n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f31656f.size(); i12++) {
            ((MessageObject) this.f31656f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f31657n, z10);
        if (this.f31658r == 0) {
            this.f31653a.e(false, false);
            this.f31653a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f31653a.e.setVisibility(8);
        }
        this.f31653a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i10 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        s4.b1 T;
        xn0 xn0Var = this.f31655c;
        if (z10) {
            int i10 = this.f31659s;
            int i11 = this.v;
            int i12 = this.f31660w;
            int i13 = this.f31661x;
            int i14 = this.f31662y;
            int i15 = this.E;
            int i16 = this.f31658r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f31656f);
            f(arrayList, arrayList2);
            s4.o.c(new tn0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(xn0Var);
            int i17 = 0;
            while (true) {
                bi.o0 o0Var = this.f31654b;
                if (i17 < o0Var.getChildCount()) {
                    View childAt = o0Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = o0Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.v3) {
                            xn0Var.v(T, R);
                        } else if (childAt instanceof un0) {
                            org.telegram.ui.Cells.k7 k7Var = ((un0) childAt).f29739a;
                            k7Var.f(true);
                            int id2 = k7Var.getMessage().getId();
                            long dialogId = k7Var.getMessage().getDialogId();
                            org.telegram.ui.u10 u10Var = this.J;
                            u10Var.f40516a = dialogId;
                            u10Var.f40517b = id2;
                            k7Var.b(this.I.b(u10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            xn0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f31656f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.f31658r = 0;
        this.f31659s = -1;
        this.v = -1;
        this.f31660w = -1;
        this.f31661x = -1;
        this.f31662y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f31658r;
            int i14 = i13 + 1;
            this.f31658r = i14;
            this.f31659s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f31658r = size3;
            this.f31660w = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i10)).getFileName())) {
                    this.H = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f31658r;
            int i16 = i15 + 1;
            this.f31658r = i16;
            this.f31661x = i15;
            this.f31662y = i16;
            int size4 = arrayList4.size() + i16;
            this.f31658r = size4;
            this.E = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.O) {
            this.O = true;
            Utilities.searchQueue.postRunnable(new yc0(this, 21));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public final void requestLayout() {
        if (this.P) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.b20 b20Var) {
        this.I = b20Var;
    }
}
