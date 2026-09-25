package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class y90 extends v7.k0 {
    public int f30575a;
    public final TL_iv.PageBlock f30576b;
    public TL_iv.textConcat f30577c = new TL_iv.textConcat();

    public y90(TL_iv.PageBlock pageBlock) {
        this.f30576b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(bf.b bVar) {
        int i10 = this.f30575a;
        if (i10 >= 64) {
            return;
        }
        this.f30575a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f30575a--;
        }
    }

    @Override
    public final void b(bf.c cVar) {
        int i10 = this.f30575a;
        if (i10 >= 64) {
            return;
        }
        this.f30575a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f30575a--;
        }
    }

    @Override
    public final void c(bf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = ba0.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(bf.e eVar) {
        if (eVar instanceof ue.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof zc.d) {
            w(ba0.c(((zc.d) eVar).f49138g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(bf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(bf.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(bf.n nVar) {
        if (nVar instanceof zc.a) {
            if (!this.f30577c.texts.isEmpty()) {
                w(ba0.j("\n"));
            }
            w(ba0.c(((zc.a) nVar).f49134g));
            w(ba0.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(bf.o oVar) {
        int i10 = this.f30575a;
        if (i10 >= 64) {
            return;
        }
        this.f30575a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f30575a--;
        }
    }

    @Override
    public final void m(bf.q qVar) {
        int i10 = this.f30575a;
        if (i10 >= 64) {
            return;
        }
        this.f30575a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f30575a--;
        }
    }

    @Override
    public final void n(bf.r rVar) {
        if (!this.f30577c.texts.isEmpty()) {
            w(ba0.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(bf.s sVar) {
        w(ba0.j(sVar.f3548g));
    }

    @Override
    public final void q(bf.d dVar) {
        w(ba0.j(dVar.h));
    }

    @Override
    public final void r(bf.g gVar) {
        w(ba0.j("\n"));
    }

    @Override
    public final void s(bf.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(bf.g gVar) {
        String str;
        if (this.f30576b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(ba0.j(str));
    }

    @Override
    public final void u(bf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f30577c.texts.add(richText);
    }

    public final TL_iv.RichText y(bf.p pVar) {
        TL_iv.textConcat textconcat = this.f30577c;
        this.f30577c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f30577c);
        this.f30577c = textconcat;
        return x10;
    }
}
