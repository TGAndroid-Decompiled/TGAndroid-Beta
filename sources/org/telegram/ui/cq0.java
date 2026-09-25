package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class cq0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final wn F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.m1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.e1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.ku M;
    public k0 N;
    public ImageView O;
    public xp0 P;
    public n50 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public bq0 V;
    public CharSequence f32772a;
    public final HashMap f32773b;
    public final ArrayList f32774c;
    public ArrayList d;
    public boolean e;
    public int f32775f;
    public org.telegram.ui.Components.wl0 h;
    public aq0 f32776n;
    public FrameLayout f32777r;
    public TextView f32778s;
    public boolean v;
    public final int f32779w;
    public boolean f32780x;
    public final boolean f32781y;

    public cq0(int i10, boolean z10, boolean z11, wn wnVar) {
        super(null);
        this.f32773b = new HashMap();
        this.f32774c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f32775f = 2;
        this.f32780x = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = wnVar;
        this.f32779w = i10;
        this.f32781y = z10;
        this.E = z11;
    }

    public static void U(cq0 cq0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            tq0 tq0Var = new tq0(0, albumEntry, cq0Var.f32773b, cq0Var.f32774c, cq0Var.f32779w, cq0Var.E, cq0Var.F, false);
            Editable text = cq0Var.M.getText();
            cq0Var.f32772a = text;
            tq0Var.d = text;
            org.telegram.ui.Components.ku kuVar = tq0Var.f38195d0;
            if (kuVar != null) {
                kuVar.setText(text);
            }
            tq0Var.f38213s0 = new yp0(cq0Var);
            tq0Var.f0(cq0Var.G, cq0Var.H);
            cq0Var.presentFragment(tq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (cq0Var.f32781y) {
            yq0 yq0Var = new yq0(hashMap, arrayList, cq0Var.f32779w, cq0Var.E, cq0Var.F);
            Editable text2 = cq0Var.M.getText();
            cq0Var.f32772a = text2;
            tq0 tq0Var2 = yq0Var.f40226a;
            if (tq0Var2 != null) {
                tq0Var2.d = text2;
                org.telegram.ui.Components.ku kuVar2 = tq0Var2.f38195d0;
                if (kuVar2 != null) {
                    kuVar2.setText(text2);
                }
            }
            zp0 zp0Var = new zp0(cq0Var, hashMap, arrayList);
            tq0 tq0Var3 = yq0Var.f40226a;
            tq0Var3.f38213s0 = zp0Var;
            tq0 tq0Var4 = yq0Var.f40227b;
            tq0Var4.f38213s0 = zp0Var;
            tq0Var3.f38214t0 = new xq0(yq0Var, 0);
            tq0Var4.f38214t0 = new xq0(yq0Var, 1);
            int i10 = cq0Var.G;
            boolean z10 = cq0Var.H;
            tq0Var3.f0(i10, z10);
            yq0Var.f40227b.f0(i10, z10);
            cq0Var.presentFragment(yq0Var);
            return;
        }
        tq0 tq0Var5 = new tq0(0, albumEntry, hashMap, arrayList, cq0Var.f32779w, cq0Var.E, cq0Var.F, false);
        Editable text3 = cq0Var.M.getText();
        cq0Var.f32772a = text3;
        tq0Var5.d = text3;
        org.telegram.ui.Components.ku kuVar3 = tq0Var5.f38195d0;
        if (kuVar3 != null) {
            kuVar3.setText(text3);
        }
        tq0Var5.f38213s0 = new vp0(cq0Var, hashMap, arrayList);
        tq0Var5.f0(cq0Var.G, cq0Var.H);
        cq0Var.presentFragment(tq0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.V != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList2.add(sendingMediaInfo);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
            }
            this.V.a(arrayList2);
        }
    }

    public final void W(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float dp;
        if (this.L.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.L;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.M.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        k0 k0Var = this.N;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.2f;
        }
        k0Var.setScaleX(f7);
        k0 k0Var2 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        k0Var2.setScaleY(f10);
        k0 k0Var3 = this.N;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        k0Var3.setAlpha(f11);
        n50 n50Var = this.Q;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        n50Var.setScaleX(f12);
        n50 n50Var2 = this.Q;
        if (z10) {
            f13 = 1.0f;
        }
        n50Var2.setScaleY(f13);
        n50 n50Var3 = this.Q;
        if (!z10) {
            f14 = 0.0f;
        }
        n50Var3.setAlpha(f14);
        FrameLayout frameLayout2 = this.L;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.R;
        if (!z10) {
            f15 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f15);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19130h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f19166j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i11, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new wp0(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        if (this.f32780x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        xp0 xp0Var = new xp0(this, context);
        this.P = xp0Var;
        xp0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.h = wl0Var;
        wl0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.c0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.y5.e(-1, -1, 51));
        org.telegram.ui.Components.wl0 wl0Var2 = this.h;
        aq0 aq0Var = new aq0(this, context);
        this.f32776n = aq0Var;
        wl0Var2.setAdapter(aq0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.f32778s = textView;
        textView.setTextColor(-8355712);
        this.f32778s.setTextSize(1, 20.0f);
        this.f32778s.setGravity(17);
        this.f32778s.setVisibility(8);
        this.f32778s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.f32778s, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f32778s.setOnTouchListener(new bi.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32777r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f32777r, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f32777r.addView(radialProgressView, w7.y5.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, w7.y5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, w7.y5.e(-1, 48, 83));
        this.L.setOnTouchListener(new bi.d(2));
        org.telegram.ui.Components.ku kuVar = this.M;
        if (kuVar != null) {
            kuVar.o();
        }
        this.M = new org.telegram.ui.Components.ku(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.cu editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.y5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f32772a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        k0 k0Var = new k0(this, context, 16);
        this.N = k0Var;
        k0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.y5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.S5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        this.O.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new ai.k2(19));
        this.N.addView(this.O, w7.y5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new f60(this, 17));
        this.O.setOnLongClickListener(new v(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        n50 n50Var = new n50(this, context, 2);
        this.Q = n50Var;
        n50Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.y5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f32779w != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f32777r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f32777r.setVisibility(8);
            this.h.setEmptyView(this.f32778s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f32779w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f32780x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f32777r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.wl0 wl0Var = this.h;
                if (wl0Var != null && wl0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f32778s);
                }
                aq0 aq0Var = this.f32776n;
                if (aq0Var != null) {
                    aq0Var.l();
                }
                this.e = false;
            }
        } else if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f19130h5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.h6.f19166j5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.R4}, null, org.telegram.ui.ActionBar.h6.f19064da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.h6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ku kuVar = this.M;
        if (kuVar != null && kuVar.e) {
            if (z10) {
                kuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.wl0 wl0Var = this.h;
        if (wl0Var != null) {
            wl0Var.getViewTreeObserver().addOnPreDrawListener(new bi(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f32779w;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f32780x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.e = z10;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.ku kuVar = this.M;
        if (kuVar != null) {
            kuVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        aq0 aq0Var = this.f32776n;
        if (aq0Var != null) {
            aq0Var.l();
        }
        org.telegram.ui.Components.ku kuVar = this.M;
        if (kuVar != null) {
            kuVar.s();
        }
        org.telegram.ui.Components.wl0 wl0Var = this.h;
        if (wl0Var != null) {
            wl0Var.getViewTreeObserver().addOnPreDrawListener(new bi(this, 3));
        }
    }
}
