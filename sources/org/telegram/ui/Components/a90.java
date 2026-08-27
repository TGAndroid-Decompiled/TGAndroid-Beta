package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;

public final class a90 extends g7.r8 {

    public int f26685a;

    public final TL_iv.PageBlock f26686b;

    public TL_iv.textConcat f26687c = new TL_iv.textConcat();

    public a90(TL_iv.PageBlock pageBlock) {
        this.f26686b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        return textconcat.texts.size() == 1 ? textconcat.texts.get(0) : textconcat;
    }

    @Override
    public final void a(je.b bVar) {
        int i10 = this.f26685a;
        if (i10 >= 64) {
            return;
        }
        this.f26685a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f26685a--;
        }
    }

    @Override
    public final void b(je.c cVar) {
        int i10 = this.f26685a;
        if (i10 >= 64) {
            return;
        }
        this.f26685a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f26685a--;
        }
    }

    @Override
    public final void c(je.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = d90.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(je.e eVar) {
        if (eVar instanceof ce.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof ic.d) {
            w(d90.c(((ic.d) eVar).f11116g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(je.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(je.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(je.n nVar) {
        if (!(nVar instanceof ic.a)) {
            v(nVar);
            return;
        }
        if (!this.f26687c.texts.isEmpty()) {
            w(d90.j("\n"));
        }
        w(d90.c(((ic.a) nVar).f11111g));
        w(d90.j("\n"));
    }

    @Override
    public final void l(je.o oVar) {
        int i10 = this.f26685a;
        if (i10 >= 64) {
            return;
        }
        this.f26685a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f26685a--;
        }
    }

    @Override
    public final void m(je.q qVar) {
        int i10 = this.f26685a;
        if (i10 >= 64) {
            return;
        }
        this.f26685a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f26685a--;
        }
    }

    @Override
    public final void n(je.r rVar) {
        if (!this.f26687c.texts.isEmpty()) {
            w(d90.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(je.s sVar) {
        w(d90.j(sVar.f12929g));
    }

    @Override
    public final void q(je.d dVar) {
        w(d90.j(dVar.h));
    }

    @Override
    public final void r(je.g gVar) {
        w(d90.j("\n"));
    }

    @Override
    public final void s(je.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = strTrim.substring(7);
            w(textemail);
            return;
        }
        if (strTrim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = strTrim.substring(4);
            w(textphone);
            return;
        }
        TL_iv.RichText texturl = new TL_iv.textUrl();
        texturl.text = y(kVar);
        texturl.url = strTrim;
        w(texturl);
    }

    @Override
    public final void t(je.g gVar) {
        w(d90.j(this.f26686b instanceof TL_iv.pageBlockBlockquote ? "\n" : " "));
    }

    @Override
    public final void u(je.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f26687c.texts.add(richText);
    }

    public final TL_iv.RichText y(je.p pVar) {
        TL_iv.textConcat textconcat = this.f26687c;
        this.f26687c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText richTextX = x(this.f26687c);
        this.f26687c = textconcat;
        return richTextX;
    }
}
