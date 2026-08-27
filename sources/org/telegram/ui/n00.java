package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class n00 extends xf.b {
    public final Context d;

    public final q00 f40618e;

    public n00(q00 q00Var, Context context) {
        this.f40618e = q00Var;
        this.d = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override
    public final int h() {
        return this.f40618e.L.size();
    }

    @Override
    public final int j(int i10) {
        h00 h00Var = (h00) this.f40618e.L.get(i10);
        if (h00Var == null) {
            return 3;
        }
        return h00Var.f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        int i11;
        q00 q00Var = this.f40618e;
        ArrayList arrayList = q00Var.L;
        h00 h00Var = (h00) arrayList.get(i10);
        if (h00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((h00) arrayList.get(i12)).f49413a) == 3 || i11 == 6) ? false : true;
        int i13 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i13 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (h00Var.f38645f) {
                j4Var.setText(q00.x0(0, h00Var.d, false));
                return;
            } else {
                j4Var.setText(h00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            String str = h00Var.f38647i;
            if (str != null) {
                saVar.e(str, h00Var.d, null, z11);
                return;
            }
            long j10 = h00Var.h;
            if (j10 > 0) {
                TLRPC.User user = q00Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    saVar.e(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = q00Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                if (ChatObject.isCommunity(chat)) {
                    string = LocaleController.getString(R.string.Community);
                } else if (chat.participants_count != 0) {
                    string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count);
                } else if (ChatObject.isPublic(chat)) {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic);
                } else {
                    string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate);
                }
                saVar.e(chat, null, string, z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.x8) view).setText(h00Var.d);
                    break;
                case 7:
                    ((j00) view).e(h00Var.f38651m, z11);
                    break;
                case 8:
                    yz yzVar = (yz) view;
                    if (yzVar.f44973c != z11) {
                        yzVar.f44973c = z11;
                        yzVar.setWillNotDraw(!z11);
                    }
                    break;
                case 9:
                    e00 e00Var = (e00) view;
                    q00Var.E = e00Var;
                    e00Var.e(org.telegram.ui.Components.t5.cloneSpans(q00Var.f41479w, -1, e00Var.f37581s.getPaint().getFontMetricsInt(), 0.5f), false);
                    q00Var.E.d(q00Var.getUserConfig().isPremium() ? q00Var.A : -1, false);
                    q00Var.E.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    yo0 yo0Var = (yo0) view;
                    yo0Var.setCloseAsLock(!q00Var.getUserConfig().isPremium());
                    yo0Var.a(q00Var.getUserConfig().isPremium() ? q00Var.A : -1, false);
                    yo0Var.setOnColorClick(new df(28, this, yo0Var));
                    break;
                case 11:
                    f00 f00Var = (f00) view;
                    q00Var.F = f00Var;
                    f00Var.setText(h00Var.d);
                    org.telegram.ui.Cells.r3 r3Var = f00Var.f37890r;
                    r3Var.setText(h00Var.f38644e);
                    r3Var.setOnClickListener(h00Var.f38643c);
                    break;
            }
            return;
        }
        wz wzVar = (wz) view;
        boolean z12 = h00Var.f38650l;
        ImageView imageView = wzVar.f44212a;
        TextView textView = wzVar.f44213b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, z12 ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.f23251o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, z12 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.q6, false));
        int i14 = h00Var.f38649k;
        CharSequence charSequence = h00Var.d;
        ImageView imageView2 = wzVar.f44212a;
        int i15 = LocaleController.isRTL ? -1 : 1;
        if (i14 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i14);
        }
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(i14 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(i14 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i14 != 0) {
            z10 = true;
        }
        Boolean bool = wzVar.f44215e;
        if (bool == null || bool.booleanValue() != z10) {
            wzVar.f44215e = Boolean.valueOf(z10);
            if (wzVar.f44214c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.er.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        wzVar.d = z11;
        wzVar.setWillNotDraw(!z11);
        wzVar.f44214c = i14;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        Context context = this.d;
        q00 q00Var = this.f40618e;
        switch (i10) {
            case 0:
                j4Var = new org.telegram.ui.Cells.j4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                saVar.setSelfAsSavedMessages(true);
                j4Var = saVar;
                break;
            case 2:
                k00 k00Var = new k00(this.d, (org.telegram.ui.Components.zu0) q00Var.fragmentView, LocaleController.getString(R.string.FilterNameHint), false, 12, ((org.telegram.ui.ActionBar.n2) q00Var).resourceProvider);
                q00Var.G = k00Var;
                k00Var.f24200n = false;
                org.telegram.ui.Cells.b3 b3Var = k00Var.f24196b;
                b3Var.getEditText().setEmojiColor(Integer.valueOf(q00Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
                b3Var.setEmojiViewCacheType(25);
                b3Var.setText(q00Var.f41479w);
                org.telegram.ui.Components.k5.s(((org.telegram.ui.ActionBar.n2) q00Var).currentAccount, q00Var.f41480x);
                org.telegram.ui.Components.lt editText = b3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.f3());
                editText.addTextChangedListener(new l00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                b3Var.getEditText().setImeOptions(268435462);
                j4Var = k00Var;
                break;
            case 3:
                j4Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 4:
                wz wzVar = new wz(context);
                wzVar.d = true;
                wzVar.f44215e = null;
                ImageView imageView = new ImageView(context);
                wzVar.f44212a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                wzVar.addView(imageView, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                wzVar.f44213b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                wzVar.addView(textView, h7.z5.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                j4Var = wzVar;
                break;
            case 5:
                g00 g00Var = new g00(context);
                org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
                g00Var.f38251a = ri0Var;
                ri0Var.f(R.raw.filter_new, 100, 100, null);
                ri0Var.setScaleType(ImageView.ScaleType.CENTER);
                ri0Var.d();
                g00Var.addView(ri0Var, h7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                ri0Var.setOnClickListener(new a(g00Var, 24));
                j4Var = g00Var;
                break;
            case 6:
            default:
                j4Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 7:
                j4Var = new m00(this, this.d, q00Var, ((org.telegram.ui.ActionBar.n2) q00Var).currentAccount, q00Var.f41477r.f19622id);
                break;
            case 8:
                j4Var = new yz(context);
                break;
            case 9:
                j4Var = new e00(q00Var, context);
                break;
            case 10:
                j4Var = new yo0(2, ((org.telegram.ui.ActionBar.n2) q00Var).currentAccount, q00Var.getParentActivity(), ((org.telegram.ui.ActionBar.n2) q00Var).resourceProvider);
                break;
            case 11:
                j4Var = new f00(context, ((org.telegram.ui.ActionBar.n2) q00Var).resourceProvider);
                break;
        }
        return new org.telegram.ui.Components.lk0(j4Var);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        if (i10 != 2 && i10 == 9) {
            e00 e00Var = (e00) o1Var.f5789a;
            q00 q00Var = this.f40618e;
            e00Var.e(org.telegram.ui.Components.t5.cloneSpans(q00Var.f41479w, -1, q00Var.E.f37581s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override
    public final void z(f2.o1 o1Var) {
        if (o1Var.f5793f == 2) {
            org.telegram.ui.Cells.d3 d3Var = (org.telegram.ui.Cells.d3) o1Var.f5789a;
            d3Var.f24196b.k(true);
            d3Var.f24196b.d();
        }
    }
}
