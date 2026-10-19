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
public final class tn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.n2 G;
    public boolean H;
    public org.telegram.ui.d10 I;
    public final org.telegram.ui.w00 J;
    public String K;
    public String L;
    public mn0 M;
    public final nl0 N;
    public boolean O;
    public boolean P;
    public final sx0 f30628a;
    public final ai.u1 f30629b;
    public final sn0 f30630c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f30631f;
    public final ArrayList h;
    public final ArrayList f30632n;
    public int f30633r;
    public int f30634s;
    public int v;
    public int f30635w;
    public int f30636x;
    public int f30637y;

    public tn0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        sn0 sn0Var = new sn0(this);
        this.f30630c = sn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f30631f = new ArrayList();
        this.h = new ArrayList();
        this.f30632n = new ArrayList();
        this.f30634s = -1;
        this.v = -1;
        this.f30635w = -1;
        this.f30636x = -1;
        this.f30637y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.w00(0, 0L);
        this.G = n2Var;
        this.F = n2Var.getParentActivity();
        this.d = i10;
        ai.u1 u1Var = new ai.u1(this, getContext(), 20);
        this.f30629b = u1Var;
        new s4.y(new di.f(this, 3)).d(u1Var);
        addView(u1Var);
        n2Var.getParentActivity();
        u1Var.setLayoutManager(new hg.a0(10));
        u1Var.setAdapter(sn0Var);
        u1Var.setOnScrollListener(new kv(this, 8));
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f45946m = false;
        u1Var.setItemAnimator(kVar);
        u1Var.setOnItemClickListener(new nn0(this, i10, 0));
        u1Var.setOnItemLongClickListener(new tv(this, 17));
        this.N = new nl0(u1Var, true);
        b10 b10Var = new b10(getContext(), null);
        addView(b10Var);
        b10Var.setUseHeaderOffset(true);
        b10Var.setViewType(3);
        b10Var.setVisibility(8);
        sx0 sx0Var = new sx0(getContext(), b10Var, 1, null);
        this.f30628a = sx0Var;
        addView(sx0Var);
        u1Var.setEmptyView(sx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        ai.u1 u1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (u1Var = this.f30629b) != null) {
            for (int i11 = 0; i11 < u1Var.getChildCount(); i11++) {
                try {
                    View childAt = u1Var.getChildAt(i11);
                    if ((childAt instanceof pn0) && (message = ((pn0) childAt).f29356a.getMessage()) != null) {
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
        ai.u1 u1Var = this.f30629b;
        if (z10) {
            u1Var.o1(0, i10, 0, i11);
        } else {
            u1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.n2 n2Var = this.G;
        if (n2Var != null && this.f30629b.G) {
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
                    spannableString.setSpan(new d61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!n2Var.hasStoryViewer()) {
                        xc a02 = xc.a0(n2Var);
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
                        qc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new b60(2, this, z10)), spannableString), i13);
                        M.f29594j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        sn0 sn0Var = this.f30630c;
        sn0Var.q(0, sn0Var.f30291c.f30633r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f30628a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                mn0 mn0Var = new mn0(this, arrayList, lowerCase, arrayList2);
                this.M = mn0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue.postRunnable(mn0Var, j10);
                this.f30632n.clear();
                this.h.clear();
                if (!equals) {
                    this.f30628a.e(true, true);
                    e(this.h, this.f30632n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f30633r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f30632n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f30632n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f30631f.size(); i12++) {
            ((MessageObject) this.f30631f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f30632n, z10);
        if (this.f30633r == 0) {
            this.f30628a.e(false, false);
            this.f30628a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f30628a.e.setVisibility(8);
        }
        this.f30628a.setStickerType(9);
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
        sn0 sn0Var = this.f30630c;
        if (z10) {
            int i10 = this.f30634s;
            int i11 = this.v;
            int i12 = this.f30635w;
            int i13 = this.f30636x;
            int i14 = this.f30637y;
            int i15 = this.E;
            int i16 = this.f30633r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f30631f);
            f(arrayList, arrayList2);
            s4.o.c(new on0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(sn0Var);
            int i17 = 0;
            while (true) {
                ai.u1 u1Var = this.f30629b;
                if (i17 < u1Var.getChildCount()) {
                    View childAt = u1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = u1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.u3) {
                            sn0Var.v(T, R);
                        } else if (childAt instanceof pn0) {
                            org.telegram.ui.Cells.i7 i7Var = ((pn0) childAt).f29356a;
                            i7Var.f(true);
                            int id2 = i7Var.getMessage().getId();
                            long dialogId = i7Var.getMessage().getDialogId();
                            org.telegram.ui.w00 w00Var = this.J;
                            w00Var.f42419a = dialogId;
                            w00Var.f42420b = id2;
                            i7Var.b(this.I.b(w00Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            sn0Var.l();
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
        ArrayList arrayList4 = this.f30631f;
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
        this.f30633r = 0;
        this.f30634s = -1;
        this.v = -1;
        this.f30635w = -1;
        this.f30636x = -1;
        this.f30637y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f30633r;
            int i14 = i13 + 1;
            this.f30633r = i14;
            this.f30634s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f30633r = size3;
            this.f30635w = size3;
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
            int i15 = this.f30633r;
            int i16 = i15 + 1;
            this.f30633r = i16;
            this.f30636x = i15;
            this.f30637y = i16;
            int size4 = arrayList4.size() + i16;
            this.f30633r = size4;
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
            Utilities.searchQueue.postRunnable(new rc0(this, 20));
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

    public void setUiCallback(org.telegram.ui.d10 d10Var) {
        this.I = d10Var;
    }
}
