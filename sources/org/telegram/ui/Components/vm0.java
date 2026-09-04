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
public final class vm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.n2 G;
    public boolean H;
    public org.telegram.ui.w10 I;
    public final org.telegram.ui.p10 J;
    public String K;
    public String L;
    public om0 M;
    public final qk0 N;
    public boolean O;
    public boolean P;
    public final xw0 f31363a;
    public final bi.o0 f31364b;
    public final um0 f31365c;
    public final int d;
    public final ArrayList f31366e;
    public final ArrayList f31367f;
    public final ArrayList h;
    public final ArrayList f31368n;
    public int f31369r;
    public int f31370s;
    public int v;
    public int f31371w;
    public int f31372x;
    public int f31373y;

    public vm0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(n2Var.getParentActivity());
        um0 um0Var = new um0(this);
        this.f31365c = um0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.f31366e = arrayList;
        this.f31367f = new ArrayList();
        this.h = new ArrayList();
        this.f31368n = new ArrayList();
        this.f31370s = -1;
        this.v = -1;
        this.f31371w = -1;
        this.f31372x = -1;
        this.f31373y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.p10(0, 0L);
        this.G = n2Var;
        this.F = n2Var.getParentActivity();
        this.d = i10;
        bi.o0 o0Var = new bi.o0(this, getContext(), 19);
        this.f31364b = o0Var;
        new s4.y(new ci.f(this, 3)).d(o0Var);
        addView(o0Var);
        n2Var.getParentActivity();
        o0Var.setLayoutManager(new hg.b0(10));
        o0Var.setAdapter(um0Var);
        o0Var.setOnScrollListener(new lb0(this, 4));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f45777m = false;
        o0Var.setItemAnimator(jVar);
        o0Var.setOnItemClickListener(new pm0(this, i10, 0));
        o0Var.setOnItemLongClickListener(new kv(this, 16));
        this.N = new qk0(o0Var, true);
        t00 t00Var = new t00(getContext(), null);
        addView(t00Var);
        t00Var.setUseHeaderOffset(true);
        t00Var.setViewType(3);
        t00Var.setVisibility(8);
        xw0 xw0Var = new xw0(getContext(), t00Var, 1, null);
        this.f31363a = xw0Var;
        addView(xw0Var);
        o0Var.setEmptyView(xw0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        bi.o0 o0Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (o0Var = this.f31364b) != null) {
            for (int i11 = 0; i11 < o0Var.getChildCount(); i11++) {
                try {
                    View childAt = o0Var.getChildAt(i11);
                    if ((childAt instanceof rm0) && (message = ((rm0) childAt).f30052a.getMessage()) != null) {
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
        bi.o0 o0Var = this.f31364b;
        if (z10) {
            o0Var.n1(0, i10, 0, i11);
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
        org.telegram.ui.ActionBar.n2 n2Var = this.G;
        if (n2Var != null && this.f31364b.G) {
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
                    spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!n2Var.hasStoryViewer()) {
                        yc a02 = yc.a0(n2Var);
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
                        qc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new ah.u(28, this, z10)), spannableString), i13);
                        M.f29679j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        um0 um0Var = this.f31365c;
        um0Var.q(0, um0Var.f30924c.f31369r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f31363a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                om0 om0Var = new om0(this, arrayList, lowerCase, arrayList2);
                this.M = om0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                dispatchQueue.postRunnable(om0Var, j3);
                this.f31368n.clear();
                this.h.clear();
                if (!equals) {
                    this.f31363a.e(true, true);
                    e(this.h, this.f31368n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f31369r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f31368n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f31368n);
        for (int i11 = 0; i11 < this.f31366e.size(); i11++) {
            ((MessageObject) this.f31366e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f31367f.size(); i12++) {
            ((MessageObject) this.f31367f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f31368n, z10);
        if (this.f31369r == 0) {
            this.f31363a.e(false, false);
            this.f31363a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f31363a.f32755e.setVisibility(8);
        }
        this.f31363a.setStickerType(9);
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
        s4.c1 T;
        um0 um0Var = this.f31365c;
        if (z10) {
            int i10 = this.f31370s;
            int i11 = this.v;
            int i12 = this.f31371w;
            int i13 = this.f31372x;
            int i14 = this.f31373y;
            int i15 = this.E;
            int i16 = this.f31369r;
            ArrayList arrayList3 = new ArrayList(this.f31366e);
            ArrayList arrayList4 = new ArrayList(this.f31367f);
            f(arrayList, arrayList2);
            s4.o.c(new qm0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(um0Var);
            int i17 = 0;
            while (true) {
                bi.o0 o0Var = this.f31364b;
                if (i17 < o0Var.getChildCount()) {
                    View childAt = o0Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = o0Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.u3) {
                            um0Var.v(T, R);
                        } else if (childAt instanceof rm0) {
                            org.telegram.ui.Cells.j7 j7Var = ((rm0) childAt).f30052a;
                            j7Var.f(true);
                            int id2 = j7Var.getMessage().getId();
                            long dialogId = j7Var.getMessage().getDialogId();
                            org.telegram.ui.p10 p10Var = this.J;
                            p10Var.f39381a = dialogId;
                            p10Var.f39382b = id2;
                            j7Var.b(this.I.b(p10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            um0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f31366e;
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
        ArrayList arrayList4 = this.f31367f;
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
        this.f31369r = 0;
        this.f31370s = -1;
        this.v = -1;
        this.f31371w = -1;
        this.f31372x = -1;
        this.f31373y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f31369r;
            int i14 = i13 + 1;
            this.f31369r = i14;
            this.f31370s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f31369r = size3;
            this.f31371w = size3;
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
            int i15 = this.f31369r;
            int i16 = i15 + 1;
            this.f31369r = i16;
            this.f31372x = i15;
            this.f31373y = i16;
            int size4 = arrayList4.size() + i16;
            this.f31369r = size4;
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
            Utilities.searchQueue.postRunnable(new cc0(this, 20));
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

    public void setUiCallback(org.telegram.ui.w10 w10Var) {
        this.I = w10Var;
    }
}
