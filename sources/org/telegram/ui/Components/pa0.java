package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class pa0 extends v7.e5 {
    public int f29823a;
    public final TL_iv.PageBlock f29824b;
    public TL_iv.textConcat f29825c = new TL_iv.textConcat();

    public pa0(TL_iv.PageBlock pageBlock) {
        this.f29824b = pageBlock;
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
    public final void a(cf.b bVar) {
        int i10 = this.f29823a;
        if (i10 >= 64) {
            return;
        }
        this.f29823a = i10 + 1;
        try {
            v(bVar);
        } finally {
            this.f29823a--;
        }
    }

    @Override
    public final void b(cf.c cVar) {
        int i10 = this.f29823a;
        if (i10 >= 64) {
            return;
        }
        this.f29823a = i10 + 1;
        try {
            v(cVar);
        } finally {
            this.f29823a--;
        }
    }

    @Override
    public final void c(cf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = sa0.j(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(cf.e eVar) {
        if (eVar instanceof ve.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof ad.e) {
            w(sa0.c(((ad.e) eVar).f421g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(cf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(cf.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(cf.n nVar) {
        if (nVar instanceof ad.a) {
            if (!this.f29825c.texts.isEmpty()) {
                w(sa0.j("\n"));
            }
            w(sa0.c(((ad.a) nVar).f415g));
            w(sa0.j("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(cf.o oVar) {
        int i10 = this.f29823a;
        if (i10 >= 64) {
            return;
        }
        this.f29823a = i10 + 1;
        try {
            v(oVar);
        } finally {
            this.f29823a--;
        }
    }

    @Override
    public final void m(cf.q qVar) {
        int i10 = this.f29823a;
        if (i10 >= 64) {
            return;
        }
        this.f29823a = i10 + 1;
        try {
            v(qVar);
        } finally {
            this.f29823a--;
        }
    }

    @Override
    public final void n(cf.r rVar) {
        if (!this.f29825c.texts.isEmpty()) {
            w(sa0.j("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(cf.s sVar) {
        w(sa0.j(sVar.f4657g));
    }

    @Override
    public final void q(cf.d dVar) {
        w(sa0.j(dVar.h));
    }

    @Override
    public final void r(cf.g gVar) {
        w(sa0.j("\n"));
    }

    @Override
    public final void s(cf.k kVar) {
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
    public final void t(cf.g gVar) {
        String str;
        if (this.f29824b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(sa0.j(str));
    }

    @Override
    public final void u(cf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f29825c.texts.add(richText);
    }

    public final TL_iv.RichText y(cf.p pVar) {
        TL_iv.textConcat textconcat = this.f29825c;
        this.f29825c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f29825c);
        this.f29825c = textconcat;
        return x10;
    }
}
