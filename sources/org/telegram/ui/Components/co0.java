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
public final class co0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.n2 G;
    public boolean H;
    public org.telegram.ui.v10 I;
    public final org.telegram.ui.o10 J;
    public String K;
    public String L;
    public vn0 M;
    public final wl0 N;
    public boolean O;
    public boolean P;
    public final by0 f25341a;
    public final ai.w0 f25342b;
    public final bo0 f25343c;
    public final int d;
    public final ArrayList f25344e;
    public final ArrayList f25345f;
    public final ArrayList h;
    public final ArrayList f25346n;
    public int f25347r;
    public int f25348s;
    public int v;
    public int f25349w;
    public int f25350x;
    public int f25351y;

    public co0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        bo0 bo0Var = new bo0(this);
        this.f25343c = bo0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.f25344e = arrayList;
        this.f25345f = new ArrayList();
        this.h = new ArrayList();
        this.f25346n = new ArrayList();
        this.f25348s = -1;
        this.v = -1;
        this.f25349w = -1;
        this.f25350x = -1;
        this.f25351y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.o10(0, 0L);
        this.G = n2Var;
        this.F = n2Var.getParentActivity();
        this.d = i10;
        ai.w0 w0Var = new ai.w0(this, getContext(), 19);
        this.f25342b = w0Var;
        new s4.z(new bi.g(this, 3)).e(w0Var);
        addView(w0Var);
        n2Var.getParentActivity();
        w0Var.setLayoutManager(new gg.a0(10));
        w0Var.setAdapter(bo0Var);
        w0Var.setOnScrollListener(new nh0(this, 3));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47742m = false;
        w0Var.setItemAnimator(jVar);
        w0Var.setOnItemClickListener(new wn0(this, i10, 0));
        w0Var.setOnItemLongClickListener(new cw(this, 17));
        this.N = new wl0(w0Var, true);
        k10 k10Var = new k10(getContext(), null);
        addView(k10Var);
        k10Var.setUseHeaderOffset(true);
        k10Var.setViewType(3);
        k10Var.setVisibility(8);
        by0 by0Var = new by0(getContext(), k10Var, 1, null);
        this.f25341a = by0Var;
        addView(by0Var);
        w0Var.setEmptyView(by0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        ai.w0 w0Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (w0Var = this.f25342b) != null) {
            for (int i11 = 0; i11 < w0Var.getChildCount(); i11++) {
                try {
                    View childAt = w0Var.getChildAt(i11);
                    if ((childAt instanceof yn0) && (message = ((yn0) childAt).f33384a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z10) {
        setClipToPadding(false);
        this.P = z10;
        setPadding(0, i10, 0, i11);
        ai.w0 w0Var = this.f25342b;
        if (z10) {
            w0Var.o1(0, i10, 0, i11);
        } else {
            w0Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w0Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.P = false;
    }

    public final void c(boolean z10) {
        float f7;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.n2 n2Var = this.G;
        if (n2Var != null && this.f25342b.G) {
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
                    spannableString.setSpan(new n61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!n2Var.hasStoryViewer()) {
                        ad a02 = ad.a0(n2Var);
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
                        tc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new bi.f(29, this, z10)), spannableString), i13);
                        M.f31096j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        bo0 bo0Var = this.f25343c;
        bo0Var.q(0, bo0Var.f25013c.f25347r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f25341a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                vn0 vn0Var = new vn0(this, arrayList, lowerCase, arrayList2);
                this.M = vn0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                dispatchQueue.postRunnable(vn0Var, j3);
                this.f25346n.clear();
                this.h.clear();
                if (!equals) {
                    this.f25341a.e(true, true);
                    e(this.h, this.f25346n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f25347r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f25346n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f25346n);
        for (int i11 = 0; i11 < this.f25344e.size(); i11++) {
            ((MessageObject) this.f25344e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f25345f.size(); i12++) {
            ((MessageObject) this.f25345f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f25346n, z10);
        if (this.f25347r == 0) {
            this.f25341a.e(false, false);
            this.f25341a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f25341a.f25085e.setVisibility(8);
        }
        this.f25341a.setStickerType(9);
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
        s4.d1 T;
        bo0 bo0Var = this.f25343c;
        if (z10) {
            int i10 = this.f25348s;
            int i11 = this.v;
            int i12 = this.f25349w;
            int i13 = this.f25350x;
            int i14 = this.f25351y;
            int i15 = this.E;
            int i16 = this.f25347r;
            ArrayList arrayList3 = new ArrayList(this.f25344e);
            ArrayList arrayList4 = new ArrayList(this.f25345f);
            f(arrayList, arrayList2);
            s4.o.c(new xn0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(bo0Var);
            int i17 = 0;
            while (true) {
                ai.w0 w0Var = this.f25342b;
                if (i17 < w0Var.getChildCount()) {
                    View childAt = w0Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = w0Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.v3) {
                            bo0Var.v(T, R);
                        } else if (childAt instanceof yn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((yn0) childAt).f33384a;
                            k7Var.f(true);
                            int id2 = k7Var.getMessage().getId();
                            long dialogId = k7Var.getMessage().getDialogId();
                            org.telegram.ui.o10 o10Var = this.J;
                            o10Var.f40443a = dialogId;
                            o10Var.f40444b = id2;
                            k7Var.b(this.I.c(o10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            bo0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f25344e;
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
        ArrayList arrayList4 = this.f25345f;
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
        this.f25347r = 0;
        this.f25348s = -1;
        this.v = -1;
        this.f25349w = -1;
        this.f25350x = -1;
        this.f25351y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f25347r;
            int i14 = i13 + 1;
            this.f25347r = i14;
            this.f25348s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f25347r = size3;
            this.f25349w = size3;
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
            int i15 = this.f25347r;
            int i16 = i15 + 1;
            this.f25347r = i16;
            this.f25350x = i15;
            this.f25351y = i16;
            int size4 = arrayList4.size() + i16;
            this.f25347r = size4;
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
            Utilities.searchQueue.postRunnable(new cd0(this, 20));
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

    public void setUiCallback(org.telegram.ui.v10 v10Var) {
        this.I = v10Var;
    }
}
