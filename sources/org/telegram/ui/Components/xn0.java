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
public final class xn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.o2 G;
    public boolean H;
    public org.telegram.ui.h10 I;
    public final org.telegram.ui.a10 J;
    public String K;
    public String L;
    public qn0 M;
    public final rl0 N;
    public boolean O;
    public boolean P;
    public final wx0 f32606a;
    public final ai.u1 f32607b;
    public final wn0 f32608c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f32609f;
    public final ArrayList h;
    public final ArrayList f32610n;
    public int f32611r;
    public int f32612s;
    public int v;
    public int f32613w;
    public int f32614x;
    public int f32615y;

    public xn0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        wn0 wn0Var = new wn0(this);
        this.f32608c = wn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f32609f = new ArrayList();
        this.h = new ArrayList();
        this.f32610n = new ArrayList();
        this.f32612s = -1;
        this.v = -1;
        this.f32613w = -1;
        this.f32614x = -1;
        this.f32615y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.a10(0, 0L);
        this.G = o2Var;
        this.F = o2Var.getParentActivity();
        this.d = i10;
        ai.u1 u1Var = new ai.u1(this, getContext(), 20);
        this.f32607b = u1Var;
        new s4.y(new di.f(this, 3)).d(u1Var);
        addView(u1Var);
        o2Var.getParentActivity();
        u1Var.setLayoutManager(new hg.a0(10));
        u1Var.setAdapter(wn0Var);
        u1Var.setOnScrollListener(new kv(this, 8));
        s4.k kVar = new s4.k();
        kVar.C = false;
        kVar.f46377m = false;
        u1Var.setItemAnimator(kVar);
        u1Var.setOnItemClickListener(new rn0(this, i10, 0));
        u1Var.setOnItemLongClickListener(new tv(this, 17));
        this.N = new rl0(u1Var, true);
        b10 b10Var = new b10(getContext(), null);
        addView(b10Var);
        b10Var.setUseHeaderOffset(true);
        b10Var.setViewType(3);
        b10Var.setVisibility(8);
        wx0 wx0Var = new wx0(getContext(), b10Var, 1, null);
        this.f32606a = wx0Var;
        addView(wx0Var);
        u1Var.setEmptyView(wx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        ai.u1 u1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (u1Var = this.f32607b) != null) {
            for (int i11 = 0; i11 < u1Var.getChildCount(); i11++) {
                try {
                    View childAt = u1Var.getChildAt(i11);
                    if ((childAt instanceof tn0) && (message = ((tn0) childAt).f30872a.getMessage()) != null) {
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
        ai.u1 u1Var = this.f32607b;
        if (z10) {
            u1Var.s1(0, i10, 0, i11);
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
        org.telegram.ui.ActionBar.o2 o2Var = this.G;
        if (o2Var != null && this.f32607b.G) {
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
                    spannableString.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!o2Var.hasStoryViewer()) {
                        xc a02 = xc.a0(o2Var);
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
                        M.f29832j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        wn0 wn0Var = this.f32608c;
        wn0Var.q(0, wn0Var.f32277c.f32611r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f32606a.setStickerType(1);
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
                this.f32610n.clear();
                this.h.clear();
                if (!equals) {
                    this.f32606a.e(true, true);
                    e(this.h, this.f32610n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f32611r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f32610n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f32610n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f32609f.size(); i12++) {
            ((MessageObject) this.f32609f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f32610n, z10);
        if (this.f32611r == 0) {
            this.f32606a.e(false, false);
            this.f32606a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f32606a.e.setVisibility(8);
        }
        this.f32606a.setStickerType(9);
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
        wn0 wn0Var = this.f32608c;
        if (z10) {
            int i10 = this.f32612s;
            int i11 = this.v;
            int i12 = this.f32613w;
            int i13 = this.f32614x;
            int i14 = this.f32615y;
            int i15 = this.E;
            int i16 = this.f32611r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f32609f);
            f(arrayList, arrayList2);
            s4.o.c(new sn0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).c(wn0Var);
            int i17 = 0;
            while (true) {
                ai.u1 u1Var = this.f32607b;
                if (i17 < u1Var.getChildCount()) {
                    View childAt = u1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = u1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.u3) {
                            wn0Var.v(T, R);
                        } else if (childAt instanceof tn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((tn0) childAt).f30872a;
                            k7Var.f(true);
                            int id2 = k7Var.getMessage().getId();
                            long dialogId = k7Var.getMessage().getDialogId();
                            org.telegram.ui.a10 a10Var = this.J;
                            a10Var.f35546a = dialogId;
                            a10Var.f35547b = id2;
                            k7Var.b(this.I.b(a10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            wn0Var.l();
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
        ArrayList arrayList4 = this.f32609f;
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
        this.f32611r = 0;
        this.f32612s = -1;
        this.v = -1;
        this.f32613w = -1;
        this.f32614x = -1;
        this.f32615y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f32611r;
            int i14 = i13 + 1;
            this.f32611r = i14;
            this.f32612s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f32611r = size3;
            this.f32613w = size3;
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
            int i15 = this.f32611r;
            int i16 = i15 + 1;
            this.f32611r = i16;
            this.f32614x = i15;
            this.f32615y = i16;
            int size4 = arrayList4.size() + i16;
            this.f32611r = size4;
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
            Utilities.searchQueue.postRunnable(new yb0(this, 21));
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

    public void setUiCallback(org.telegram.ui.h10 h10Var) {
        this.I = h10Var;
    }
}
