package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class ly extends org.telegram.ui.Components.il0 {
    public final Context f40327c;
    public final oy d;

    public ly(oy oyVar, Context context) {
        this.d = oyVar;
        this.f40327c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        oy oyVar = this.d;
        if (i10 == oyVar.h) {
            return 1;
        }
        if (i10 == oyVar.f41244s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = true;
        oy oyVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                    Long l10 = (Long) oyVar.f41240e.get(i10 - oyVar.f41242n);
                    long longValue = l10.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = oyVar.getMessagesController().getUser(l10);
                        if (i10 == oyVar.f41243r - 1) {
                            z10 = false;
                        }
                        e4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = oyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == oyVar.f41243r - 1) {
                        z10 = false;
                    }
                    e4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            Context context = this.f40327c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190k7, false), mode));
            org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (oyVar.f41242n == -1) {
                z10 = false;
            }
            m8Var.n(string, jqVar, z10);
            m8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        if (i10 == oyVar.f41244s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = oyVar.f41245w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            y8Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ny nyVar;
        int i11;
        Context context = this.f40327c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout e4Var = new org.telegram.ui.Cells.e4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    e4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    e4Var.addView(imageView, i7.f6.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new nh.o1(5, this, e4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23030b9, false), PorterDuff.Mode.MULTIPLY));
                    nyVar = e4Var;
                } else {
                    oy oyVar = this.d;
                    ny nyVar2 = new ny(oyVar, context);
                    oyVar.f41241f = nyVar2;
                    nyVar = nyVar2;
                }
            } else {
                FrameLayout m8Var = new org.telegram.ui.Cells.m8(context);
                m8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                nyVar = m8Var;
            }
        } else {
            FrameLayout y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7));
            nyVar = y8Var;
        }
        return new f2.n1(nyVar);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        n1Var.f6432a.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
    }
}
