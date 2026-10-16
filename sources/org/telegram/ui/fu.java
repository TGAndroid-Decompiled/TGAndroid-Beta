package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fu extends org.telegram.ui.ActionBar.m2 {
    public org.telegram.ui.Components.mm0 f35953a;
    public org.telegram.ui.Components.yz f35954b;
    public cu f35955c;
    public du d;
    public boolean e;
    public boolean f35956f;
    public final boolean h;
    public boolean f35957n;
    public eu f35958r;
    public final ArrayList f35959s;

    public fu(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f35959s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ca U(Context context) {
        float f7;
        org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context);
        float f10 = 12.0f;
        if (LocaleController.isRTL) {
            f7 = 16.0f;
        } else {
            f7 = 12.0f;
        }
        int dp = AndroidUtilities.dp(f7);
        if (!LocaleController.isRTL) {
            f10 = 16.0f;
        }
        caVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f42418a = new yt(0, caVar);
        caVar.addOnAttachStateChangeListener(obj);
        return caVar;
    }

    public static SpannableStringBuilder V(au auVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(auVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) auVar.f34084a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19918u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 18));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.H(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19988y6, false), true);
        this.actionBar.H(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.f35956f = false;
        this.e = false;
        cu cuVar = new cu(this, context, this.f35959s, this.f35957n);
        this.f35955c = cuVar;
        this.d = new du(this, context, cuVar.f34792s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(context, null);
        this.f35954b = yzVar;
        yzVar.c();
        this.f35954b.setShowAtCenter(true);
        this.f35954b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f35954b, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35953a = mm0Var;
        mm0Var.setSectionsType(3);
        this.f35953a.setEmptyView(this.f35954b);
        this.f35953a.setVerticalScrollBarEnabled(false);
        this.f35953a.setFastScrollEnabled(0);
        this.f35953a.setFastScrollVisible(true);
        this.f35953a.setLayoutManager(new s4.b0(1, false));
        this.f35953a.setAdapter(this.f35955c);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f35953a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        mm0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f35953a, w7.z5.d(-1.0f, -1));
        this.f35953a.setOnItemClickListener(new i(this, 7));
        this.f35953a.setOnScrollListener(new k3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19880s8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19746l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19765m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19785n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35954b, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f19583c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35953a, 524288, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        cu cuVar = this.f35955c;
        if (cuVar != null) {
            cuVar.X(false);
        }
    }
}
