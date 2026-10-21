package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ot extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.jm0 f39974a;
    public org.telegram.ui.Components.vz f39975b;
    public kt f39976c;
    public mt d;
    public boolean e;
    public boolean f39977f;
    public final boolean h;
    public boolean f39978n;
    public nt f39979r;
    public final ArrayList f39980s;

    public ot(ArrayList arrayList, boolean z10) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f39980s = new ArrayList(arrayList);
        }
        this.h = z10;
    }

    public static org.telegram.ui.Cells.ba U(Context context) {
        float f7;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
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
        baVar.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        ?? obj = new Object();
        obj.f37413a = new ft(0, baVar);
        baVar.addOnAttachStateChangeListener(obj);
        return baVar;
    }

    public static SpannableStringBuilder V(ht htVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(htVar.d);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.uz(1), languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) htVar.f37784a);
        return spannableStringBuilder;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.C(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21308u8, false), false);
        this.actionBar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 19));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.c2(this, 8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        int i11 = 1;
        this.actionBar.G(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21378y6, false), true);
        this.actionBar.G(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.setSearchCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f39977f = false;
        this.e = false;
        kt ktVar = new kt(this, context, this.f39980s, this.f39978n);
        this.f39976c = ktVar;
        this.d = new mt(this, context, ktVar.f38665s);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.f39975b = vzVar;
        vzVar.c();
        this.f39975b.setShowAtCenter(true);
        this.f39975b.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.f39975b, w7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f39974a = jm0Var;
        jm0Var.setSectionsType(3);
        this.f39974a.setEmptyView(this.f39975b);
        this.f39974a.setVerticalScrollBarEnabled(false);
        this.f39974a.setFastScrollEnabled(0);
        this.f39974a.setFastScrollVisible(true);
        this.f39974a.setLayoutManager(new s4.b0(1, false));
        this.f39974a.setAdapter(this.f39976c);
        org.telegram.ui.Components.jm0 jm0Var2 = this.f39974a;
        if (!LocaleController.isRTL) {
            i11 = 2;
        }
        jm0Var2.setVerticalScrollbarPosition(i11);
        frameLayout.addView(this.f39974a, w7.z5.c(-1.0f, -1));
        this.f39974a.setOnItemClickListener(new i(this, 7));
        this.f39974a.setOnScrollListener(new k3(this, 8));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20990d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f21269s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21325v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21288t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.h6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f21079i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f21111k0, null, null, org.telegram.ui.ActionBar.h6.f20991d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21135l7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21154m7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 33554432, null, null, null, null, org.telegram.ui.ActionBar.h6.f21174n7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39975b, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20972c7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f39974a, 524288, new Class[]{org.telegram.ui.Cells.q4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onResume() {
        super.onResume();
        kt ktVar = this.f39976c;
        if (ktVar != null) {
            ktVar.X(false);
        }
    }
}
