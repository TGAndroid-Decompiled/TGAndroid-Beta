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
public final class jn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final Activity F;
    public final org.telegram.ui.ActionBar.m2 G;
    public boolean H;
    public org.telegram.ui.s10 I;
    public final org.telegram.ui.l10 J;
    public String K;
    public String L;
    public bn0 M;
    public final cl0 N;
    public boolean O;
    public boolean P;
    public final jx0 f25473a;
    public final ai.w0 f25474b;
    public final in0 f25475c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f25476f;
    public final ArrayList h;
    public final ArrayList f25477n;
    public int f25478r;
    public int f25479s;
    public int v;
    public int f25480w;
    public int f25481x;
    public int f25482y;

    public jn0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        super(m2Var.getParentActivity());
        in0 in0Var = new in0(this);
        this.f25475c = in0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f25476f = new ArrayList();
        this.h = new ArrayList();
        this.f25477n = new ArrayList();
        this.f25479s = -1;
        this.v = -1;
        this.f25480w = -1;
        this.f25481x = -1;
        this.f25482y = -1;
        this.E = -1;
        this.J = new org.telegram.ui.l10(0, 0L);
        this.G = m2Var;
        this.F = m2Var.getParentActivity();
        this.d = i10;
        ai.w0 w0Var = new ai.w0(this, getContext(), 19);
        this.f25474b = w0Var;
        new s4.y(new bi.g(this, 3)).e(w0Var);
        addView(w0Var);
        m2Var.getParentActivity();
        w0Var.setLayoutManager(new gg.b0(10));
        w0Var.setAdapter(in0Var);
        w0Var.setOnScrollListener(new vg0(this, 3));
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f42994m = false;
        w0Var.setItemAnimator(jVar);
        w0Var.setOnItemClickListener(new cn0(this, i10, 0));
        w0Var.setOnItemLongClickListener(new nv(this, 17));
        this.N = new cl0(w0Var, true);
        v00 v00Var = new v00(getContext(), null);
        addView(v00Var);
        v00Var.setUseHeaderOffset(true);
        v00Var.setViewType(3);
        v00Var.setVisibility(8);
        jx0 jx0Var = new jx0(getContext(), v00Var, 1, null);
        this.f25473a = jx0Var;
        addView(jx0Var);
        w0Var.setEmptyView(jx0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        ai.w0 w0Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (w0Var = this.f25474b) != null) {
            for (int i11 = 0; i11 < w0Var.getChildCount(); i11++) {
                try {
                    View childAt = w0Var.getChildAt(i11);
                    if ((childAt instanceof fn0) && (message = ((fn0) childAt).f24299a.getMessage()) != null) {
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
        ai.w0 w0Var = this.f25474b;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.G;
        if (m2Var != null && this.f25474b.G) {
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
                    spannableString.setSpan(new t51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!m2Var.hasStoryViewer()) {
                        xc a02 = xc.a0(m2Var);
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
                        qc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new bi.f(28, this, z10)), spannableString), i13);
                        M.f27635j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j3;
        in0 in0Var = this.f25475c;
        in0Var.q(0, in0Var.f25165c.f25478r);
        if (!TextUtils.isEmpty(this.K)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f25473a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.K.toLowerCase();
                boolean equals = lowerCase.equals(this.L);
                this.L = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.M);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                bn0 bn0Var = new bn0(this, arrayList, lowerCase, arrayList2);
                this.M = bn0Var;
                if (equals) {
                    j3 = 0;
                } else {
                    j3 = 300;
                }
                dispatchQueue.postRunnable(bn0Var, j3);
                this.f25477n.clear();
                this.h.clear();
                if (!equals) {
                    this.f25473a.e(true, true);
                    e(this.h, this.f25477n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f25478r == 0) {
            this.N.b(0);
        }
        if (this.O) {
            this.h.clear();
            this.f25477n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f25477n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f25476f.size(); i12++) {
            ((MessageObject) this.f25476f.get(i12)).setQuery(null);
        }
        this.L = null;
        e(this.h, this.f25477n, z10);
        if (this.f25478r == 0) {
            this.f25473a.e(false, false);
            this.f25473a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f25473a.e.setVisibility(8);
        }
        this.f25473a.setStickerType(9);
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
        in0 in0Var = this.f25475c;
        if (z10) {
            int i10 = this.f25479s;
            int i11 = this.v;
            int i12 = this.f25480w;
            int i13 = this.f25481x;
            int i14 = this.f25482y;
            int i15 = this.E;
            int i16 = this.f25478r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f25476f);
            f(arrayList, arrayList2);
            s4.o.c(new en0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(in0Var);
            int i17 = 0;
            while (true) {
                ai.w0 w0Var = this.f25474b;
                if (i17 < w0Var.getChildCount()) {
                    View childAt = w0Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = w0Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.v3) {
                            in0Var.v(T, R);
                        } else if (childAt instanceof fn0) {
                            org.telegram.ui.Cells.k7 k7Var = ((fn0) childAt).f24299a;
                            k7Var.f(true);
                            int id2 = k7Var.getMessage().getId();
                            long dialogId = k7Var.getMessage().getDialogId();
                            org.telegram.ui.l10 l10Var = this.J;
                            l10Var.f35204a = dialogId;
                            l10Var.f35205b = id2;
                            k7Var.b(this.I.c(l10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            in0Var.l();
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
        ArrayList arrayList4 = this.f25476f;
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
        this.f25478r = 0;
        this.f25479s = -1;
        this.v = -1;
        this.f25480w = -1;
        this.f25481x = -1;
        this.f25482y = -1;
        this.E = -1;
        this.H = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f25478r;
            int i14 = i13 + 1;
            this.f25478r = i14;
            this.f25479s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f25478r = size3;
            this.f25480w = size3;
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
            int i15 = this.f25478r;
            int i16 = i15 + 1;
            this.f25478r = i16;
            this.f25481x = i15;
            this.f25482y = i16;
            int size4 = arrayList4.size() + i16;
            this.f25478r = size4;
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
            Utilities.searchQueue.postRunnable(new jc0(this, 21));
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

    public void setUiCallback(org.telegram.ui.s10 s10Var) {
        this.I = s10Var;
    }
}
